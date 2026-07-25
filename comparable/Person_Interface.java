package comparable;

interface Person extends Comparable<Person> {
    String getName();

    int getAge();

    String getProfession();
}

class Employee34 implements Person {
    private String name;
    private int age;
    private String prof;

    Employee34(String n, int a, String p) {
        this.name = n;
        this.age = a;
        this.prof = p;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return prof;
    }

    public int compareTo(Person p) {
        return this.prof.compareTo(p.getProfession());
    }

    public String toString() {
        return "Employee[name=" + name + " age=" + age + " profession=" + prof + "]";
    }
}


class Student34 implements Person {
    private String name;
    private int age;
    private String prof;

    Student34(String n, int a, String p) {
        this.name = n;
        this.age = a;
        this.prof = p;
    }

    public String getName() {
        return this.name;
    }

    public String getProfession() {
        return this.prof;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(Person p) {
        return this.prof.compareTo(p.getProfession());
    }

    public String toString() {
        return "Student[name=" + name + " age=" + age + " profession=" + prof + "]";
    }

}

