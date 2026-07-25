package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {
     static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\java1\\first\\src\\a1\\filewriter1.txt");
        int ch=fr.read();
        while (ch!=-1) {
            System.out.print((char)ch);
            ch=fr.read();
        }
        fr.close();
    }
}
