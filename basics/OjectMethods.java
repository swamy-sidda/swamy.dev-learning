package basics;

public class OjectMethods {
    static void main() {

    }
}

class Person {
    String name;
    int age;
    String address;
    int code;

    public Person(String name, int age, String address, int code) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return code;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address + "Identity code" + code + " \n";
    }

    @Override
    public int hashCode() {
        return code;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj==this) return true;
        if(obj.getClass()!=this.getClass()) return false;
        Person other = (Person)obj;
        return this.code == other.code;
    }
}
