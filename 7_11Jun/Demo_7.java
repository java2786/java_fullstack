public class Demo_7 {
    public static void main(String[] args) {
        // Palindrome Number
        int num = 1213;
        int copy = num;
        int reverse = 0;

        while(num>0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        }

        System.out.println("Original: "+copy);
        System.out.println("Reverse: "+reverse);
        System.out.println("isPalindrome: "+(copy == reverse));
    }
}
