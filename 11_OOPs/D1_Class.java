class Student{
    private int roll = 123;
    private String name = "Ramesh";
    private int marks = 99;

    public int accessRollNo(){
        return roll;
    }
    public String showName(){
        return name;
    }

    public int readMarks(){
        return marks;
    }
    public void updateMarks(int newVal){
        if(newVal<0 || newVal>100){
            System.out.println("Not possible to update marks with #"+newVal);
        } else {
            marks = newVal;
        }
    }

    public void updateName(String newName){
        if(newName == null || newName.length()<3){
            System.out.println("cannot update name with #"+newName);
        } else {
            name = newName;
        }
    }
}

public class D1_Class{
    public static void main(String[] args) {
        // String name = "Ramesh";
        // Scanner scanner = new Scanner(System.in);

        Student std1 = new Student();

        // System.out.println("Name: "+std1.name);
        // System.out.println("Roll: "+std1.roll);
        // System.out.println(std1.marks);
        System.out.println("Name: "+std1.showName());
        System.out.println("Roll: "+std1.accessRollNo());
        System.out.println("Marks: "+std1.readMarks());

        // std1.name = "Ramesh Kapoor";
        std1.updateName("Ramesh Kapoor");
        std1.updateName(null);
        std1.updateName("ab");

        // std1.marks = 105;
        // std1.marks = 68;
        std1.updateMarks(-100);

        System.out.println("++++++++++++++++");

        // System.out.println("Name: "+std1.name);
        // System.out.println("Roll: "+std1.roll);
        System.out.println("Name: "+std1.showName());
        System.out.println("Roll: "+std1.accessRollNo());
        System.out.println("Marks: "+std1.readMarks());

    }
}

