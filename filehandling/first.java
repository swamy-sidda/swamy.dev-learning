package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class first {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\b");
        //System.out.println(f.mkdir());
        FileWriter file=new FileWriter("D:\\java1\\first\\src\\b\\first.txt");
        if(f.canWrite())
        {
            file.write("kumarswamy\n");
            file.write("munuswamy\n");
            file.write("madanapalli\n");
            file.write("tirupati\n");
            file.write("sri kalahasti\n");
            file.write("bengalore\n");
        }
         file.close();

    }
}
