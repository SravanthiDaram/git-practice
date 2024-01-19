package OOPS_13th_Jan_2024.Encapsulation;

public class Lab148 {

    public static void main(String[] args) {

        vwologinfixed vl = new vwologinfixed("admin", "admin");


        boolean check = vl.isloggedin("admin","password");
        String u = vl.getUsername();
        String p = vl.getPassword();
        System.out.println(u + p);

        System.out.println(check);


    }

}

class vwologinfixed {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    private String password;

    vwologinfixed(String u, String p) {
        this.username = u;
        this.password = p;
    }


    boolean isloggedin(String username, String password){

        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)){
            System.out.println("logged in");
            return true;
        }
        else{
            System.out.println("wrong");
            return false;
        }
    }
}

