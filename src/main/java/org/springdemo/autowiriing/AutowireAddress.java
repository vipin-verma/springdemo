package org.springdemo.autowiriing;

public class AutowireAddress {
    private String city ;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("setting city");
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("setting country");
        this.country = country;
    }

    public AutowireAddress(String city, String country) {
        super();
        this.city = city;
        this.country = country;
        System.out.println("calling address constructor");
    }

    public AutowireAddress() {
        super();
    }

    @Override
    public String toString() {
        return "AutowireAddress{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
