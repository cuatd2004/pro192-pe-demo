
public class SpecCoffee extends Coffee {

    private int price;

    public SpecCoffee() {
    }

    public SpecCoffee(int price, String name, int size) {
        super(name, size);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + "," + getSize()+ "," + price;
    }

    public void setData() {
        StringBuilder StringBuilder = new StringBuilder(getName());
        StringBuilder.insert(0, "CF");
        setName(StringBuilder.toString());
    }

    public int getValue() {
        if (super.getSize() > 10) {
            return price;
        } else {
            return price + 5;
        }
    }

}
