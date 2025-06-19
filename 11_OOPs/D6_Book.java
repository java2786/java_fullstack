import java.time.LocalDate;

class Address{
    private String line1;
    private String city;
    private String state;
    private String zip;

    public Address() {
    }

    public Address(String line1, String city, String state, String zip) {
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "Address [line1=" + line1 + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }

    
}

class Author{
    private String name;
    private LocalDate dob;
    private Address address;

    

    public Author(String name, LocalDate dob, Address address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Author [name=" + name + ", dob=" + dob + ", address=" + address + "]";
    }

    
}

class Book{
    private String title;
    private Author author;
    private int price;
    private LocalDate publishDate;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
    public Book(String title, Author author, int price, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishDate = publishDate;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publishDate=" + publishDate
                + "]";
    }

    
}
public class D6_Book {
    public static void main(String[] args) {
        Address address = new Address("123, new building, near petrol pump", "delhi", "delhi", "887766");

        Author author = new Author("Ramesh", LocalDate.now(), address);

        Book book = new Book("Superman is back", author, 105, LocalDate.now());

        System.out.println(book);

        Book book2 = new Book(
            "Halk is Blue now", 
            new Author("Mahesh", LocalDate.now(), new Address("3212", "Pune", "Maharastra", "667788")), 
            129, 
            LocalDate.of(2024, 4, 23)
        );

        System.out.println(book2);
    }
}
