package OOPs_07_Jan2024;

public class Dog {

        String name;

        Dog(){

            System.out.println("Dog name is Sam");
        }
        Dog(String name_ref){
            this.name = name_ref;
            System.out.println("Dog name is " + name_ref);
        }
        void Bark(){
            int age = 10;
            System.out.println("Age is " +age);
        }


    }

