package learn.lifeCycle;

public class Beer {
    private int price;
    public int getPrice() {
        System.out.println("getting price");
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setting price");
        this.price = price;
    }

    public Beer() {
        super();
    }

    @Override
    public String toString() {
        return "1 Bootle Beer{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("life cycle initialized...");
    }
    public void destroy(){
        System.out.println("life cycle destroyed...");
    }


}
