package designpatterns.abstractfactory;

public class StudentInformstion {
    static void main() {

    }
}
interface Education{
    Education typeOfEducation();
}
interface Parental{
    void typeOfParental();
}
abstract class EduSystem implements Education{

}
class School extends EduSystem{

    @Override
    public Education typeOfEducation() {
        return new School();
    }
}
class College extends EduSystem{
    @Override
    public Education typeOfEducation() {
        return new College();
    }
}
class University extends EduSystem{
    @Override
    public Education typeOfEducation() {
        return new University();
    }
}
abstract class ParentalType implements Parental{

}
