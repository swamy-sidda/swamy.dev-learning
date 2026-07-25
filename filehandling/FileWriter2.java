package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
     static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\java1\\first\\src\\a1\\FileWriter.txt",true);
        fw.write("Hello World");
        fw.write("helloworld");
        fw.write("kumaswamy");
        fw.write("munuswamy\n");
        fw.write("Hello World");
        fw.write("helloworld");
        fw.write("kumaswamy");
        fw.write("munuswamy\n");
        fw.close();
        System.out.println("File written Successfully");
    }
}