package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_1 {
     static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("D:\\java1\\first\\src\\a1\\Write2.txt",true);
        f.write("true\n");
        f.write("madanapalli\n");
        f.write("bengalore\n");
        f.write("srikalahasti\n");
        f.write("palamaneru\n");
        f.write("9865434321\n");
        f.write("8865434321\n");
        f.write("7865434321\n");
        f.write("6865434321\n");
        f.write("5865434321\n");
        f.write("9865434321\n");
        f.write("98654343216\n");
        f.write("88654343215\n");
        f.write("78654343214\n");
        f.write("68654343213\n");
        f.write("58654343212\n");
        f.write("98654343211\n");
        f.write("7765434321\n");
        f.write("4465434321\n");
        f.write("786543\n");
        f.write("6865434\n");
        f.write("5865434323\n");
        f.write("9965434321\n");
        f.close();

    }
}
