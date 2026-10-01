package reflections;

import strings.Anagram;

public class ClassInformation {
    static void main() {
        Anagram anagram = new Anagram();
        Class<?> clazz = anagram.getClass();
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Only Class package: " + clazz.getPackage().getName());
        System.out.println("Only Class Name: " + clazz.getSimpleName());
        System.out.println("Class path: " + clazz.getProtectionDomain().getCodeSource().getLocation().getPath());


        Class[]  classes = clazz.getDeclaredClasses();
        int count=0;
        for (Class c : classes) {
            System.out.println("Class name: " + ++count);
            System.out.println("Class name: " + c.getName());
            System.out.println("Class version: " + c.getPackage().getName());
        }
    }
}
