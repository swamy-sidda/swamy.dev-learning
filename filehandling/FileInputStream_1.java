package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_1 {
     static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java1\\first\\src\\a\\BufferedReader_1.java");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        fis.close();
    }
}
