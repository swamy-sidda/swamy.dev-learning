package designpatterns.abstractfactory;

public class Representation {
     static void main(String[] args) {
        Abstractfactory abs=new Abstractfactory();
        RedShirt red=(RedShirt) abs.getProduct("red");
        BlueShirt blue=(BlueShirt) abs.getProduct("blue");
        GreenShirt green=(GreenShirt) abs.getProduct("green");
        Uniform uniform=(Uniform) abs.getProduct("uniform");


        red.nativeMethod();
        red.productDetails();
        System.out.println("------------------------------");
        blue.nativeMethod();
        blue.productDetails();
        System.out.println("-----------------------------");
        green.nativeMethod();
        green.productDetails();
        System.out.println("------------------------------");
        uniform.nativeMethod();
        uniform.productDetails();

            }
}
interface Product {
    public void productDetails();
}
class RedShirt implements Product {
    public void productDetails() {
        System.out.println("RedShirt details are posted successfully");
    }
    public void nativeMethod() {
        System.out.println("RedShirt Native method");
    }
}
class BlueShirt implements Product {
    @Override
    public void productDetails() {
        System.out.println("BlueShirt details are posted successfully");
    }
    public void nativeMethod() {
        System.out.println("BlueShirt Native method");
    }
}
class GreenShirt implements Product {
    @Override
    public void productDetails() {
        System.out.println("GreenShirt details are posted successfully");
    }
    public void nativeMethod() {
        System.out.println("GreenShirt Native method");
    }
}
class Uniform implements Product {
    @Override
    public void productDetails() {
        System.out.println("Uniform details are posted successfully");
    }
    public void nativeMethod() {
        System.out.println("Uniform Native method");
    }
}
class Abstractfactory{
    String product;
    public  Product getProduct(String product){
        this.product = product;
        if(product.equalsIgnoreCase("Red")){
            return new RedShirt();
        }
        else if(product.equalsIgnoreCase("Blue")){
            return new BlueShirt();
        }
        else if(product.equalsIgnoreCase("Green")){
            return new GreenShirt();
        }
        else if(product.equalsIgnoreCase("Uniform")){
            return new Uniform();
        }
        return null;
    }
}
