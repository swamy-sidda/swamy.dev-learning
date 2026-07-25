package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
     static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\java1\\first\\src\\a1\\Write2.txt");
        BufferedReader br=new BufferedReader(fr);
        String str=br.readLine();
        int count=0;
        int count1=0;
        Pattern p= Pattern.compile("[6-9]{1}[0-9]{9}");
        while(str!=null){
            count++;
           // Pattern p= Pattern.compile("[6-9]{1}[0-9]{9}");
            Matcher m=p.matcher(str);
            if(m.matches()){
                System.out.println(str);
                count1=count1+1;
            }
            str=br.readLine();
        }
        System.out.println(count1);
        System.out.println(count);
        fr.close();
    }
}
