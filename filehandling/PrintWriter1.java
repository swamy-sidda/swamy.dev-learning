package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\a1\\printwriter1.txt");
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.createNewFile());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        PrintWriter pw=new PrintWriter(f);
        pw.println("Hello World");
        pw.println("kumarswamy");
        pw.print("munuswamy");
        pw.println("Hello World");
        pw.println("kumarswamy");
        pw.print("munuswamy");
        pw.println("Hello World");
        pw.println("kumarswamy");
        pw.print("munuswamy");
        pw.println("Hello World");
        pw.println("kumarswamy");
        pw.print("munuswamy");
        pw.close();
        System.out.println("Successfully wrote to the file.");
    }
}
