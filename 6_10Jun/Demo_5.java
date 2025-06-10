public class Demo_5 {
    public static void main(String[] args) {
        int num = 123456789;
        int copy = num;
        int rev = 0;

        while(num>0){
            rev = (rev*10)+(num%10);
            num = num/10;
        }

        System.out.println("Reverse of "+copy+" is "+rev);
    }
}
