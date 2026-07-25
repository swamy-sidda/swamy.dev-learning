package innerclasses;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window {
     static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                for(int i=1;i<=5;i++){
                    System.out.println("I am closing window"+i);
                    System.exit(0);
                }
            }
        });
        f.add(new Label("i can create executable jar file"));
        f.setSize(400,400);
        f.setVisible(true);
    }
}
