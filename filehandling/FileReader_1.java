package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_1 {
     static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\java1\\first\\src\\a1\\first.txt");
        int ch=fr.read();
        int count=0;
        while (ch!=-1){
            System.out.print((char)ch);
            ch=fr.read();
            count++;
            if(count==40){
                System.out.println();
                count=0;
            }
        }
        fr.close();
    }
}
