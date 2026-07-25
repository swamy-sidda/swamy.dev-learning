package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_1 {
     static void main(String[] args) throws IOException {
        FileReader fw = new FileReader("D:\\java1\\first\\src\\a1\\first.txt");
        BufferedReader bf=new BufferedReader(fw);
        String line=bf.readLine();
        String[] arr=line.split(" ");
        int count=0;
       while(line!=null){
           count+=arr.length;
           line=bf.readLine();
       }
        System.out.println(count);
    }
}
