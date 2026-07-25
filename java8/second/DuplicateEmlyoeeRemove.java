package java8.second;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class DuplicateEmployeeRemove {

     static void main(String[] args) {

        Set<Emp> emp = new HashSet<>();

        emp.add(new Emp(101, "kumar"));
        emp.add(new Emp(102, "mayank"));
        emp.add(new Emp(103, "Komal"));
        emp.add(new Emp(104, "kamal"));
        emp.add(new Emp(105, "tharun"));
        emp.add(new Emp(106, "reddy"));
        emp.add(new Emp(107, "mohit"));
        emp.add(new Emp(101, "umar"));
        emp.add(new Emp(102, "samay"));
        emp.add(new Emp(103, "sagar"));
        emp.add(new Emp(104, "prabha"));

        System.out.println(emp);
        Map<Integer, Emp> map = new HashMap<>();
        Map<Integer, Emp> map1 ;
       map1= emp.stream().filter(e->map.put(e.id, e) != null).collect(Collectors.toMap(e->e.id, e->e));
        System.out.println(map);
        System.out.println(map1);
    }
}

class Emp {

    int id;
    String name;
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Emp obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return this.id == obj.id;
    }
    public int hashCode() {
        return id;
    }
    public String toString() {
        return "Emp{id=" + id + ", name='" + name + "'}\n";
    }
}