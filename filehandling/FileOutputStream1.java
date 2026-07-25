package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Scanner;

public class FileOutputStream1 {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\a1\\fileoutputstreame.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.isFile());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        FileOutputStream fos=new FileOutputStream(f,true);
        fos.write("Hello World\n".getBytes());
        fos.write("kumarswamy\n".getBytes());
        fos.close();
        System.out.println("File written Successfully");
    }
}
