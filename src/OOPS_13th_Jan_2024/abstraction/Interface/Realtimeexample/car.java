package OOPS_13th_Jan_2024.abstraction.Interface.Realtimeexample;

public class car implements Engine{

    void start() {
        System.out.println("Starting the car");
        startengine();

    }

    @Override
    public void startengine() {
        System.out.println("Started Engine");
    }
}
