package filehandling;

import java.io.*;

public class BufferedWriter_1 {
     static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\java1\\first\\src\\a1\\Write2.txt");
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("munu swamy\n");

        bf.write("munu swamy\n");

        bf.write("munu swamy\n");

        bf.write("munu swamy\n");

        bf.close();
    }
}
