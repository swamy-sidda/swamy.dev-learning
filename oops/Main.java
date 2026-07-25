package oops;

class Parent{
    String name = "Kumar swami";
    int i = 10;

    public void m1(){
        System.out.println("Hello");
    }
    public void m2(){
        System.out.println("world");
    }
}

class Child extends Parent{
    @Override
    public void m1(){
        System.out.println("Good");
    }
    @Override
    public void m2(){
        System.out.println("Morning");
    }

     static void main(String[] args) {
        Child child = new Child();
        
    }
}
