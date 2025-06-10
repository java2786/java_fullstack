import java.util.Scanner;

public class Demo_5 {
    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println("press 1 to convert Rs into Dollar");
        System.out.println("press 2 to convert Dollar into Rs");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter amount");
        double amount = Double.parseDouble(scanner.nextLine());

        if(choice==1){
            System.out.println("$"+amount/85.64);
        } else if(choice==2){
            System.out.println(amount*85.64+"Rs");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
