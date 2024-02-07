package OOPs_20th_Jan_2024;

public class Lab174 {
    public static void main(String[] args) throws customexception {

        Bank hdfc = new Bank("INR", 1000);
        Bank Chase = new Bank("USD", 1000);
        Bank icici = new Bank("INR", 200);

        System.out.println(hdfc.add(icici));
        //System.out.println(hdfc.add(Chase));
        //INR adding to USD is wrong and there is no exception written. we need to create a custom exception in this case


    }
}
