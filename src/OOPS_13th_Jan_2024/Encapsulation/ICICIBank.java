package OOPS_13th_Jan_2024.Encapsulation;

public class ICICIBank {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    String name;

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal>0){
            this.bal = bal;
        }
        else {
            System.out.println("Don't allow");
        }
    }

    long bal;

}
