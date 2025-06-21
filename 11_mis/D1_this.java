class Book{
    private String title;
    private String author;
    private int price;

    Book(String title, String author, int price){
        System.out.println("in book construnctor");
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }   
}

public class D1_this {
    public static void main(String[] args) {
        Book b = new Book("Superman", "Clark", 99);
        System.out.println(b.toString());
    }
}
