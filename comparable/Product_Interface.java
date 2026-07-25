package comparable;

interface Product_Details extends Comparable<Product_Details>
{
    String getName();
    String getColor();
    int getPrice();
}


class Cycle implements Product_Details
{
    private String name;
    private String color;
    private int price;

    Cycle(String n,int p,String c)
    {
        this.name=n;
        this.color=c;
        this.price=p;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getPrice()
    {
        return price;
    }
    public int compareTo(Product_Details p)
    {
        return this.price-p.getPrice();
    }
    public String toString()
    {
        return "Cycle[name="+name+"pricer="+price+"color="+color+"]";
    }

}




class Car implements Product_Details
{
    private String name;
    private String color;
    private int price;

    Car(String n,int p,String c)
    {
        this.name=n;
        this.color=c;
        this.price=p;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "Car[name="+name+"pricer="+price+"color="+color+"]";
    }
    public int compareTo(Product_Details p)
    {
        return this.price-p.getPrice();
    }

}





class Bicycle implements Product_Details
{

    private String name;
    private String color;
    int price;

    Bicycle(String n,int p,String c)
    {
        this.name=n;
        this.color=c;
        this.price=p;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "Bicycle[name="+name+"pricer="+price+"color="+color+"]";
    }
    public int compareTo(Product_Details p)
    {
        return this.price-p.getPrice();
    }

}

