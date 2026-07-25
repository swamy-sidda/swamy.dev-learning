package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write2 {
     static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("D:\\java1\\first\\src\\a1\\Write2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("kumar swamy\n");
        bw.write("kumar swamy\n");
        bw.write("kumar swamy\n");
        bw.write("kumar swamy\n");
        bw.newLine();

        fw.close();
    }
}
