package has_a_relation.composition;

class Student {
    int id ;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;






    }
}
public class College1 {
    private Student student ;
    College1(Student std){
        student = std;
    }
    public void details(){
        System.out.println("student id : "+student.id);
        System.out.println("student name : "+student.name);
    }
}
class Test{
     static void main(String[] args) {
        Student student = new Student(1,"Kumar");
        College1 college = new College1(student);
        college.details();
    }
}