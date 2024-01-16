package OOPs_07_Jan2024;

public class ATBPerson {
        // these are called instance variables
        String name;

        double phone_num; // These are called attributes
        String address;

        String email_id;
        int age;

        boolean is_married;

        String course_name;


        //default constructor
        ATBPerson(){
            course_name = "ATB";
            System.out.println("I am default");

        }
        //Param constructor
        ATBPerson(String valueofobjectref){
            this.name = valueofobjectref;

        }

        void talkseep() {
            System.out.println("TalkandSleep"); // this is called behaviour
        }
        void printdetails(){
            System.out.println(this.name);
            System.out.println(course_name);

        }


    }

