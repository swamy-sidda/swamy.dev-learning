package basics;

public class ClassDemo {
    int i=0;
    int j=0;
    ClassDemo(int i) {
      this.i=i;
    }
    ClassDemo(int i,int j) {
       System.out.print( new ClassDemo(i).i);
        this.j=j;
        System.out.println(j);
    }
//    public void display()
//    {
//       System.out.println(i+" "+j);
//    }
     static void main(String[] args) {
        new ClassDemo(0,1);
    }

}
