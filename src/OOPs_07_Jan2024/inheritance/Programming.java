package OOPs_07_Jan2024.inheritance;

public class Programming {

    String author;

    int version;

    Programming(){
        System.out.println("Program DC");
    }
    Programming(String author, int version){
        this.author = author;
        this.version = version;
    }
    void printInfo(){
        System.out.println("Author is " + this.author+ "Version is" + this.version);
    }
    void car(){
        System.out.println("Lambo");
    }
    void bhk3(){
        System.out.println("3 BHK Apartment");
    }
}
