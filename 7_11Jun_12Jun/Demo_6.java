public class Demo_6{
    public static void main(String[] args) {
        // Sum of Odd Numbers
        // array, 1-100, file, database

        int[] array = {2,3,5,7,3,9,5,8}; 
        // sum of even - 10
        // sum of odd - 32

        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for(int i=0;i<array.length;i++){
            // System.out.println(array[i]);
            if(array[i]%2==0){
                // calculation for evens
                sumOfEvens = sumOfEvens + array[i];
            } else {
                // calculation for odds
                sumOfOdds = sumOfOdds + array[i];
            }
        }
        System.out.println(sumOfEvens);
        System.out.println(sumOfOdds);
    }
}