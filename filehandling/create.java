package filehandling;

import java.io.File;
import java.io.IOException;

public class create {
     static void main(String[] args) throws IOException {
        File file=new File("D:\\java1\\first\\src\\c\\second.txt");
       // System.out.println(file.mkdir());
        //System.out.println(file.createNewFile());
        System.out.println("write "+file.canWrite());
        System.out.println("read "+file.canRead());
        System.out.println("execute "+file.canExecute());
        System.out.println("path "+file.getAbsolutePath());
        File f1=new File("D:\\java1\\first\\src\\c\\first.txt");
        System.out.println(file.renameTo(f1));


    }
}
