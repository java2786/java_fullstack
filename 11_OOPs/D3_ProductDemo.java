class Product{
    private String name;
    private int price;
    private int quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

//    public String toString(){
//     return "Product[Name: "+name+", Price: "+price+", Quantity: "+quantity+"]";
//    }

}
public class D3_ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Shrit");
        p1.setPrice(800);
        p1.setQuantity(15);

        Product p2 = new Product();
        p2.setName("Iron");
        p2.setPrice(1200);
        p2.setQuantity(5);
        
        Product p3 = new Product();
        p3.setName("Book");
        p3.setPrice(250);
        p3.setQuantity(20);

        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
    }
}
