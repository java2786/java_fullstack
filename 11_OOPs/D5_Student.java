import java.time.LocalDate;

class Student{
    private String name;
    private int marks;
    private String email;
    private LocalDate dob;
    private String address;

    public Student(){
        System.out.println("in student contructor");
    }
    public Student(String newName, int m, String e, LocalDate date, String ad){
        name = newName;
        email = e;
        marks = m;
        dob = date;
        address = ad;
    }

    // setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        if(marks>0){
            this.marks = marks;
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + ", email=" + email + ", dob=" + dob + ", address="
                + address + "]";
    }
    
}
public class D5_Student {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Ramesh");
        std1.setEmail("ramesh@gmail.com");
        std1.setMarks(76);
        std1.setDob(LocalDate.of(2003, 8, 12));
        std1.setAddress("234, purani gali, naya shahar, UP");
        System.out.println(std1);
        System.out.println("Name: "+std1.getName());

        Student std2 = new Student();
        std2.setName("Mahesh");
        std2.setEmail("mahesh@gmail.com");
        std2.setMarks(87);
        std2.setDob(LocalDate.of(2004, 1, 25));
        std2.setAddress("234, gol building, naya park, delhi");
        System.out.println(std2);

        Student std3 = new Student("Suresh", 68, "suresh@ymail.com", LocalDate.of(2005, 11, 13), "pune");
        System.out.println(std3);

        Student std4 = new Student("Dinesh", 81, "dinesh@ymail.com", LocalDate.of(2005, 9, 13), "haryana");
        System.out.println(std4);

        Student std5 = new Student("Kamlesh", 84, "kamal@redif.com", LocalDate.now(),"234, gol building, naya park, delhi");
        System.out.println(std5);
    }
}
