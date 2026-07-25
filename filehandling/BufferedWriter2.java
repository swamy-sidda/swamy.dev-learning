package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\a1\\buffer2.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.getAbsolutePath());

        FileWriter fw = new FileWriter(f,true);
        //System.out.println(fw.isFile());
        BufferedWriter bw = new BufferedWriter(fw,10);
        bw.write("munu swamy\n");
        bw.write("munu swamy\n");
        bw.write("munu swamy\n");
        bw.write("munu swamy\n");
        bw.write("munu swamy\n");
        bw.write("munu swamy\n");
        bw.close();
        System.out.println("File written Successfully");
    }

}
