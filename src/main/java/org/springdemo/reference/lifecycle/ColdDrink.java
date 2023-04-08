package org.springdemo.reference.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean , DisposableBean {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ColdDrink(int price) {
        this.price = price;
    }

    public ColdDrink() {
        super();
    }

    @Override
    public String toString() {
        return "ColdDrink{" +
                "price=" + price +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pespsi : init");
    }

    /**
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("pepsi pe liya ab bottle ko fek do ");

    }
}
