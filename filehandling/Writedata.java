package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writedata {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\a\\first.java");
        FileInputStream f1=new FileInputStream(f);
        FileWriter bf=new FileWriter("D:\\java1\\first\\src\\a1\\first.txt");
        if(f.canRead())
        {
            int n=f1.read();
            while(n!=-1)
            {
                bf.write((char)n);
                n=f1.read();
            }
        }
        else
        {
            System.out.println("File Not Found");
        }
        f1.close();
        bf.close();
    }
}
