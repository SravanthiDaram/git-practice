package OOPs_07_Jan2024;

public class BankAccount {

    String bank_name;
    int balance;
    String bank_code;

    BankAccount(){
      bank_name = "SBI";
      bank_code = "SBI001";
      System.out.println("Default C");
    }

    BankAccount(String bname, String bcode){
        bank_name = bname;
        bank_code = bcode;
        System.out.println("Param C");
    }


    void print_details(){
        System.out.println( "Bank name is" + bank_name);
        System.out.println("Bank code is" + bank_code);
        System.out.println("Bank Balance is " + balance);
    }

}
