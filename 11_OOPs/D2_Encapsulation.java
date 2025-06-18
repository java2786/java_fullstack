class Item{
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        if(price>=0){
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void showDetails(){
        System.out.println("Item[Name: "+getName()+", Price: "+getPrice()+"]");

    }}
public class D2_Encapsulation {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setName("Shirt");
        item1.setPrice(555);

        // System.out.println("Item name: "+item1.getName()+", Item price: "+item1.getPrice());
        item1.showDetails();

        Item item2 = new Item();
        item2.setName("Pen");
        item2.setPrice(15);

        // System.out.println("Item name: "+item2.getName()+", Item price: "+item2.getPrice());
        item2.showDetails();

        Item item3 = new Item();
        item3.setName("Comic");
        item3.setPrice(150);

        // System.out.println("Item[Name: "+item3.getName()+", Price: "+item3.getPrice()+"]");
        item3.showDetails();
    }
}
