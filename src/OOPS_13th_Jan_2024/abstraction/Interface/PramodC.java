package OOPS_13th_Jan_2024.abstraction.Interface;

public class PramodC implements FatherI{
    @Override
    public void loan1k() {
        FatherI.print2();
        System.out.println("I will pay 1k loan");
    }
}
