package learn.constINjection;

public class ConstrDepend {
    String name;
    String level;
    Address address;

    public ConstrDepend(String name, String level, Address address) {
        this.name = name;
        this.level = level;
        this.address=address;
    }

    @Override
    public String toString() {
        return "ConstrDepend{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", address=" + address +
                '}';
    }
}
