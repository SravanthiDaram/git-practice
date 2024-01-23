package OOPs_14th_Jan_2024.Innerclass;

public class Lab153 {

    public static void main(String[] args) {

        car c = new car("Lamboo");
        c.drive();
        car.Engine engine = c.new Engine("400CC");
        engine.start();

    }
}

class car{

    String make;

    public car(String make){//parametrized constructor
        this.make = make;
    }
    //method

    void drive(){
        System.out.println("you can drive a car");
    }
    //Below all are inner classes
    public class Engine{
        String housepower;//Instance variable

        Engine (String housepower){
            this.housepower = housepower;
        }
        void start(){
            System.out.println("Engine is started" +make);
        }

    }

    //public class Break{}

    //public class Accmchanisam{}
}
