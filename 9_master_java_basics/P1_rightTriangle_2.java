public class P1_rightTriangle_2{
/*
num = 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5


*/
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
