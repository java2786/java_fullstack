public class P2_zero {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 4;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                // System.out.print("* ");
                // System.out.print((i+""+j)+" ");
                if(i==1 || i == rows || j==1 || j==cols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }    
}
