package org.springdemo.autowiriing;

public class EmployeeAutowiring{
    private AutowireAddress autowireAddress;

    public EmployeeAutowiring() {
        super();
    }

    public EmployeeAutowiring(AutowireAddress autowireAddress) {
        super();
        this.autowireAddress = autowireAddress;
        System.out.println("calling constructor");
    }

    public AutowireAddress getAutowireAddress() {
        return autowireAddress;
    }

    public void setAutowireAddress(AutowireAddress autowireAddress) {
        this.autowireAddress = autowireAddress;
        System.out.println("calling setter method");
    }

    @Override
    public String toString() {
        return "EmployeeAutowiring{" +
                "autowireAddress=" + autowireAddress +
                '}';
    }
}
