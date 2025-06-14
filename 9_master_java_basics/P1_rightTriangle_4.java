public class P1_rightTriangle_4{
/*
num = 5

9 9 9 9 *
9 9 9 * *
9 9 * * *
9 * * * *
* * * * *

        *
      * *
    * * *
  * * * *
* * * * *

*/
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=num;i++){

            for(int m=1;m<=num-i;m++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
