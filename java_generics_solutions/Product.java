public class Product<C> {
    private final String name;
    private double price;
    private final C category;
    public Product(String name, double price, C category){
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice(){ return price; }
    public String getName(){ return name; }
    public C getCategory(){ return category; }
    public void applyDiscount(double percentage){
        price = price * (1 - percentage/100.0);
    }
    @Override public String toString(){ return name+" ("+price+")"; }
}
