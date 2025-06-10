public class Demo_1{
    public static void main(String[] args) {
        // variables
        // decision making
        // loops

        String name = "Mahesh";
        int marks = 75;
        char grade = 'Z';

        // Grade A, Grade B, Grade C, Grade D
        // 85 - A
        // 60 - B
        // 40 - C
        // D

        // if(marks >= 85){
        //     grade = 'A';
        // }
        // if(marks >=60 && marks<85){
        //     grade = 'B';
        // }
        // if(marks >=40 && marks<60){
        //     grade = 'C';
        // }
        // if(marks < 40){
        //     grade = 'D';
        // }
        if(marks >= 85){
            grade = 'A';
        } else if(marks >=60){
            grade = 'B';
        } else if(marks >=40){
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(name+" has grade "+grade);
    }
}