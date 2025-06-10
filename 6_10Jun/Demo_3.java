import java.util.Scanner;

public class Demo_3 {
    public static void main(String[] args) {
        // 869 = 23
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.parseInt(scanner.nextLine());
        int copy = num;

        int sum = 0;
        while(num>0){   // 9685
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println("Sum of all digit of "+copy+" is "+sum);
    }
}
