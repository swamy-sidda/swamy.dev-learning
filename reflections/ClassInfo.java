package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassInformation {
    static void main() throws ClassNotFoundException {

        Employee e = new Employee();
        Class c = Employee.class;
        System.out.println("->++++++++++++++++++++++++++++++++++++++++++Only Class Information<-+++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
        System.out.println("Class path: " + c.getProtectionDomain().getCodeSource().getLocation().getPath());

        System.out.println("Class Name: " + c.getName());

        System.out.println("Class Package: " + c.getPackage().getName());

        System.out.println("Constructors Information is : ");

        Constructor<?>[] constructors = c.getConstructors();

        for (Constructor ctor : constructors) {
            System.out.println(ctor.getName());
        }
        System.out.println("Constructors Information is : "+ Arrays.toString(constructors));

        Method[] methods=c.getMethods();

        System.out.println("Methods Information is : ------------------> ");
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("Methods Information is : "+ Arrays.toString(methods));

        System.out.println("Fields Information is : ---------------> ");
        Field[] f= c.getDeclaredFields();
        for (Field f1 : f) {
            System.out.println(f1.getName());
        }

        System.out.println();
        System.out.println("Fields Information is : "+ Arrays.toString(f));


        Field[] fields=c.getFields();
        System.out.println("Fields Information is : "+ Arrays.toString(fields));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
    }
}