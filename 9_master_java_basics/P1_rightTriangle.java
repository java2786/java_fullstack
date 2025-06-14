public class P1_rightTriangle{
/*
num = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


*/
    public static void main(String[] args) {
        int num = 8;
        for(int i=1;i<=num;i++){
            // i = 3
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

/*
1 
1 2 
1 2 3 
*/