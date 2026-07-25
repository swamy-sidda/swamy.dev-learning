package basics;

public class Labelq2 {
     static void main(String[] args) {
        iterator();
    }
    public static void iterator(){
        for(int i=0;i<10;i++){
            label:
            for(int j=0;j<10;j++){
              if(i==5) continue label;
              System.out.println(i+"---");
            }
        }
    }
}
