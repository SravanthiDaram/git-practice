package OOPs_14th_Jan_2024.Innerclass;

public class Lab156 {
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println(" I am a Thread");
            }
        };
        t.run();
    }
}


