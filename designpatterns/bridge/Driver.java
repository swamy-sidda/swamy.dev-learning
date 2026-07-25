package designpatterns.bridge;

public class Driver {
    static void main() {
      Shape circle=new Circle(new Green());
      circle.draw();
      Shape rectangle=new Rectangle(new Red());
      rectangle.draw();
      Shape square=new Square(new Orange());
      square.draw();
    }
}
interface Color{
   void paint();
}
class Red implements Color{
    public void paint(){
        System.out.println("Red color is painted");
    }
}
class  Green implements Color{
    public void paint(){
        System.out.println("Green color is painted");
    }
}
class Orange implements Color{
    public void paint(){
        System.out.println("Orange color is painted");
    }
}
abstract class Shape {
   protected Color c;
    Shape(Color c){
        this.c=c;
    }
    abstract void draw();
}
class Rectangle extends Shape {
    public Rectangle(Color c){
        super(c);
    }
    public void draw(){
        System.out.println("Rectangle is drawn");
        c.paint();
    }
}
class Circle extends Shape {
    public Circle(Color c){
        super(c);
    }
    public void draw(){
        System.out.println("Circle is drawn");
        c.paint();
    }
}
class Square extends Shape {
    public Square(Color c){
        super(c);
    }
    public void draw(){
        System.out.println("Square is drawn");
        c.paint();
    }
}

