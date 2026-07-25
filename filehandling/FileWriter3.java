package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {
     static void main(String[] args) throws IOException {
       File f=new File("D:\\java1\\first\\src\\a1\\filewriter1.txt");
//       System.out.println(f.getAbsolutePath());
//       System.out.println(f.mkdir());
         System.out.println(f.createNewFile());
//       System.out.println(f.isFile());
//       System.out.println(f.canRead());
//       System.out.println(f.canWrite());
        FileWriter fw=new FileWriter(f,true);
        fw.write("Hello World\n");
        fw.write("Kumarswamy\n");
        fw.write("is giong to tirupati\n");
        fw.write("on this 25 january\n");
        fw.write("for attempting his first\n");
        fw.write("semester exams in mca\n");
        fw.close();
    }
}
