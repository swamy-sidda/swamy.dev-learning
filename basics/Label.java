package basics;

import java.io.IOException;

public class Label {
     static void main(String[] args) {
    labelExample();
    }
    public static void labelExample()
    {
        gadida:
        for(int a=0;a<10;a++) {
            for (int b = 0; b < 10; b++) {
             if(a==4) continue gadida;
             System.out.println(a+" "+b);
            }
        }
    }
}
