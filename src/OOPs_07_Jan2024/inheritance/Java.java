package OOPs_07_Jan2024.inheritance;

public class Java extends Programming{
    String newFeature;

    Java(){
        System.out.println("Java DC");
    }
    Java(String feature){
        this.newFeature=feature;

    }
    void printInfo1(){
        System.out.println("Feature is" + this.newFeature);
    }
}
