package learn.conf;

public class Address {
   private String street;
    private String city;
    private String country;


    // using setter injection
    // just need to make constructor and use thsi keyword on constructor injection.
   public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


     /*

    // Using constructor injection:


    public Address(String street, String city, String country) {
        super();
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Address() {
        super();
    }

      */

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
