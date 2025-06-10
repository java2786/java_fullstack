import java.util.Scanner;

public class Demo_1{
    public static void main(String[] args) {
        // C -> F
        // C = F - 32 / 1.8

        Scanner scanner = new Scanner(System.in);
        // double f = 100;
        System.out.print("Enter Fahrenheit value to convert into Celsius:");
        double f = Double.parseDouble(scanner.nextLine());
        double c = (f-32)/1.8;

        System.out.println(f+"°F equals "+c+"°C");
    }
}