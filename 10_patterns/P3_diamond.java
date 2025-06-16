public class P3_diamond {
    public static void main(String[] args) {
        int rows = 5;
        int cols = rows;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                // j - 1, i - 4
                // cols - j > i => space
                if(cols-j >= i){
                System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            for(int m = 1;m<=i-1;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int m=1;m<=cols-i;m++){
                System.out.print("* ");
            }
            for(int k=1;k<=cols-i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
