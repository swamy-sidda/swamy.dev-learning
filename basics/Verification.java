package basics;

public class Verification {
     static void main(String[] args) {

    }
    public void verify(){
        System.out.println("Verification done successfully ");
    }
    public int verify(int i){
        System.out.println("Verification done successfully this is parameterised ");
        return 0;
    }
}
class VerificationDemo{
    public int  verify(){
        System.out.println(" parent Verification done successfully ");
        return 0;
    }
    public void verify(int i){
        System.out.println(" parent Verification done successfully this is parameterised ");
    }
}
