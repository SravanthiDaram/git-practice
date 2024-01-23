package OOPs_14th_Jan_2024.Innerclass;

public class Lab155 {
    public static void main(String[] args) {
        Student s1 = new Student() {// Anonymous class
            @Override
            public void setId() {

            }
        };
        s1.setId();

    }


}

abstract class B{
    int b = 12;
}

interface Student{
    int id = 11;
    void setId();

}