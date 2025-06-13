public class Student{
    public static void main(String[] args) {
        String name1 = "Ramesh";
        int marks1 = 92;
        double attendance1 = 69;

        String name2 = "Mukesh";
        int marks2 = 78;
        double attendance2 = 89;

        // check if student is valid to appear in college placement
        // attendance > 75 and marks > 70

        if(marks1>70 && attendance1 > 75){
            System.out.println(name1+" can sit in placement");
        } else {
            System.out.println(name1+" can not sit in placement");
        }
        if(marks2>70 && attendance2 > 75){
            System.out.println(name2+" can sit in placement");
        } else {
            System.out.println(name2+" can not sit in placement");
        }
    }
}