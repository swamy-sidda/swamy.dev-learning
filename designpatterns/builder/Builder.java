package designpatterns.builder;
//prototype helps in costly object creation that ,
//it neglects the unused fields tgo initialize
//also through constructors we need tpo maintain the order that parameters specified.
//but it is not possible to remember the parameter order in large scale number.
//by creating getters we can initialize the variables in that


public class Builder {
    static void main() {
     StudentDetails sd = new StudentDetails();
     sd.setAge(30);
     sd.setDistrict("Madanapalli");
     sd.setEmail("kumar12345@gmail.com");
     sd.setId(101);
     sd.setMandal("madanapalli");
     System.out.println(sd);

        StudentDetails sd1 = new StudentDetails();
        sd1.setName("KumarSwami");
        sd1.setId(101);
        sd1.setAge(30);
        sd1.setSurname("Siddarapu");
        sd1.setFatherName("Munuswamy");
        sd1.setMotherName("Mogilamma");
        sd1.setEmail("kumar12345@gmail.com");
        sd1.setMandal("madanapalli");
        sd1.setDistrict("Madanapalli");
        sd1.setNationality("Hindu");


        System.out.println(sd1);
    }
}
class StudentDetails{
    private String name;
    private Integer  id;
    private Integer age;
    private String surname;
    private String fatherName;
    private String motherName;
    private String email;
    private String mandal;
    private String district;
    private String nationality;

    public StudentDetails() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public void setMandal(String mandal) {
        this.mandal = mandal;
    }
    public void setAge(Integer age) {
    this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "StudentDetails "+"\n" );

        if(name!=null)sb.append("1.name='" + name+"\n" );
        if(id!=null) sb.append(   "2.id=" + id+"\n" );
        if(age!=null)sb.append("3.age=" + age+"\n" );
        if(surname!=null)sb.append("4.surname='" + surname+"\n" ) ;
        if(fatherName!=null) sb.append("5.fatherName='" + fatherName+"\n" );
        if(motherName!=null) sb.append("6.motherName='" + motherName );
        if(email!=null)sb.append( "7.email='" + email+"\n") ;
        if(mandal!=null)sb.append("8.mandal='" + mandal+"\n" ) ;
        if(district!=null)sb.append("9.district='" + district+"\n" );
        if(nationality!=null)sb.append("10.nationality='" + nationality+"\n");

        return sb.toString();
    }

}