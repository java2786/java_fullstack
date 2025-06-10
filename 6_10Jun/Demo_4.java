public class Demo_4 {
    public static void main(String[] args) {
        int num = 123;
        int copy = num;
        int rev = 0;

        rev = (rev*10)+(num%10);
        num = num/10;

        rev = (rev*10)+(num%10); // 85
        num = num/10;

        rev = (rev*10)+(num%10); // 854
        num = num/10;

        System.out.println("Reverse of "+copy+" is "+rev);
    }
}
