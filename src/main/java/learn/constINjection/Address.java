package learn.constINjection;

public class Address {
    private String city;
    private String street;
    private String country;

    public Address(String city, String street, String country) {
        this.city = city;
        this.street = street;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
