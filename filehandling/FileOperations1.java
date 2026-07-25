package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperations1 {
     static void main(String[] args) throws IOException {
        File file=new File("D:\\java1\\first\\src\\a");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        String[] str=file.list();
        for(String s:str){
            System.out.println(s);
        }
        File f=new File("D:\\java1\\first\\src\\a1\\Write1.txt");
        System.out.println(f.length());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.getAbsolutePath());
        FileWriter fw=new  FileWriter(f,true);
        fw.write("kumarswamy\n");
        fw.write("kumar swamy\n");
        fw.write("kumar swamy\n");
        fw.write("kumar swamy\n");
        fw.write("kumar swamy\n");
        fw.write("kumar swamy\n");
        PrintWriter  pw=new PrintWriter(f);
        pw.println("munu swamy\n");
        pw.println("munu swamy\n");
        pw.println("munu swamy\n");
        pw.println("munu swamy\n");
        pw.println("munu swamy\n");
        //fw.flush();
        fw.close();
    }
}
