import java.time.LocalDate;

class Employee{
    private String name;
    private int salary;
    private LocalDate dob;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if(salary<15000){
            return;
        }
        this.salary = salary;
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
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", dob=" + dob + ", address=" + address + "]";
    }

    
}
public class D4_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Ramesh");
        e1.setSalary(56000);
        e1.setAddress("Pune");
        e1.setDob(LocalDate.of(2005, 5, 24));

        System.out.println(e1);
    }
}
