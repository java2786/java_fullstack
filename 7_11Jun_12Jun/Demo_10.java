public class Demo_10 {
    public static void main(String[] args) {
        // power of a number
        // 3 ^ 4 = 81

        int num = 3;
        int power = 4;
        int result = 1;

        for(int i=0;i<4;i++){
            result = result * num;
        }
        System.out.println(result);
    }
}
