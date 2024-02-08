package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.Comparator;

class sortbyidAsc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class sortbyidDec implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class sortbynameAec implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class sortbynameDec implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}


public class Student implements Comparable<Student> {
    // with comparable method we can only sort id or name. we cannot do both. So they introduced to comparator.

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    String name;

    //@Override
    //public int compareTo(Student Student2){
      //  return Integer.compare(this.id, Student2.id);
    //}


    @Override
    public int compareTo(Student Student2) {
        return CharSequence.compare(this.name, Student2.name);
    }

}