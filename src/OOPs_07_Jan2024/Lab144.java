package OOPs_07_Jan2024;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.print_details();

        BankAccount hdfc = new BankAccount("HDFC","HDFC00123");
        hdfc.print_details();

        BankAccount icici = new BankAccount( "ICICI", "ICICI01234");
        icici.print_details();


    }
}
