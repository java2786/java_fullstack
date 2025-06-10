// Currency Conversion
public class Demo_4 {
    public static void main(String[] args) {
        double dollar = 85.64;
    
        // double myrs = 5; // rs -> dollar => rs / dollar
        // double mydollars = 50; // dollar -> rs => mydollars * dollar
    
        // task1 rs -> dollar
        double givenRsValue = 171.28;
        System.out.println(givenRsValue+"Rs = $"+(givenRsValue/dollar));
    
        // task2 dollar -> rs
        double giveDollarValue = 100;
        System.out.println("$"+giveDollarValue+" = "+(giveDollarValue*dollar)+"Rs");

        
    }
}
