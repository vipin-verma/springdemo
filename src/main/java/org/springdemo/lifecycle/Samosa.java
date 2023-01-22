package org.springdemo.lifecycle;

public class Samosa {
   private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Samosa(int price) {
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }


    public void init ()
    {
        System.out.println("inside init method");
    }

    public void destroy()
    {
        System.out.println("inside the destroy method");
    }



    
}
