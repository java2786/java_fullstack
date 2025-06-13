import java.util.Scanner;

public class ElectricityBill{
    public static void main(String[] args){
        /*
Electricity Bill Calculation
    For the first 100 units: 1.5 per unit
    For the next 100 units: 2.5 per unit
    Beyond 200 units: 3.5 per unit
Example:
    Input: Units = 250
    Output: Bill = 150 + 250 + 175 = 575
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit consumed: ");
        int units = Integer.parseInt(scanner.nextLine());
        // int units = 250;

        int units_consumed = units;
        double billAmount = 0;

        if(units>200){
            int afterTwoHundred = units - 200;
            billAmount = (100 * 1.5) + (100 * 2.5) + (afterTwoHundred * 3.5);
        } else if(units>100){
            int afterHundred = units - 100;
            billAmount = (100 * 1.5) + (afterHundred * 2.5);
        } else {
            billAmount = units * 1.5;
        }



System.out.println("*********************");
        System.out.println("Units: "+ units_consumed);
        System.out.println("Electricity bill: "+billAmount);
System.out.println("*********************");

    }
}