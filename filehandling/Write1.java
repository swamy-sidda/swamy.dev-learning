package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write1 {
     static void main(String[] args) throws IOException {
        File file=new File("D:\\java1\\first\\src\\a1\\Write1.txt");
        FileWriter fw=new FileWriter(file);
        if(file.canWrite()){
            fw.write(100);
            fw.write("durgasoftwaresolutions\n");
            char[] cb={'a','b','c','d','e','f','g','h','i'};
             for(int i=0;i<cb.length;i++) {
                 fw.write(cb[i]);
                 fw.write("\n");
             }
             fw.write("kumar swamy");
            fw.flush();
            fw.close();
        }
        else
            System.out.println("Can't write to file");
    }
}
