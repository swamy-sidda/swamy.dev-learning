package designpatterns.abstractfactory;


public class DiffrentTypes {
     static void main(String[] args) {
        GUIFactory factory = new LightFactory();

        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();

        button.paint();
        textBox.display();

        System.out.println("------------------------");
        factory=new DarkFactory();
        button = factory.createButton();
        textBox = factory.createTextBox();
        button.paint();
        textBox.display();
     }
}
interface Button{
    void paint();
}
interface TextBox {
    void display();
}
interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}

class LightFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton() ;
    }
    @Override
    public TextBox createTextBox() {
        return new LightTextBox() ;
    }
}

class DarkFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton() ;
    }
    @Override
    public TextBox createTextBox() {
        return new DarkTextBox() ;
    }
}

class LightButton implements Button{
    public void paint() {
        System.out.println("LightThemeButton ");
    }
}
class LightTextBox implements TextBox {
    public void display() {
        System.out.println("LightTheme TextBox ");
    }
}
class DarkButton implements Button{
    public void paint() {
        System.out.println("DarkThemeButton ");
    }
}
class DarkTextBox implements TextBox {
    public void display() {
        System.out.println("DarkTheme Text Box ");
    }
}

