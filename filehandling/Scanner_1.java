package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_1 {
     static void main(String[] args) throws IOException {
        File f=new File("D:\\java1\\first\\src\\a\\BufferedReader_1.java");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
