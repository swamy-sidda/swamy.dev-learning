package filehandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class BefferedReader_2 {
     static void main(String[] args) throws IOException {
      FileReader fr=new FileReader("D:\\java1\\first\\src\\a\\BufferedReader_1.java");
      BufferedReader br=new BufferedReader(fr);
      String line=br.readLine();
      while(line!=null){
          System.out.println(line);
          line=br.readLine();
      }
      fr.close();
    }
}
