public class Demo_7 {
    // armstrong number
    public static void main(String[] args) {
        for(int i=0;i<100000;i++){
            int num = i;
            int copy = num;
            int digits = 0;
            while(num>0){
                num = num / 10;
                digits = digits+1;
            }
            num = copy;
            double sum = 0;
            while(num>0){
                int lastDigit = num%10;
                sum = sum + Math.pow(lastDigit, digits);
                num = num/10;
            }
            if(copy == sum){
                System.out.println(copy+" is armstrong number");
            }
        }
    }
}
