public class Item {
    private String name;
    private int price;

    public Item(String name1, int price1) {
        name = name1;
        price = price1;
    }

    public String getName() {
        return name;
    }

    public int totalPrice(){
        return price;
    }

    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
}
