package OOPS_13th_Jan_2024.Encapsulation;

public class Bad_example {

    public static void main(String[] args) {

        vwologin vl = new vwologin("admin", "admin");

        boolean check = vl.islogedin("admin", "password");
        vl.setUsername("sravz");
        System.out.println(vl.getUsername());
        System.out.println(vl.getPassword());
        //vl.password = "password";// if it is private you cann't change the password using like this. we can only change
        //by getter setter functions
        boolean check2 = vl.islogedin("admin", "password");
        System.out.println(check2);
    }
}

    class vwologin{

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

        public vwologin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        boolean islogedin(String username, String password){

            if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)){
                System.out.println("Logged In");
                return true;
            }
            else{
                System.out.println("Wrong");
                return false;

            }

        }
    }

