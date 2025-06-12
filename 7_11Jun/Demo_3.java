public class Demo_3 {
    public static void main(String[] args) {
        int a = 550;
        int b = 1354;
        int c = 66;
        // System.out.println(a+" is greater than "+b);
        
        if(a>b){
            if(a>c){
                System.out.println(a+" is Greatest");
            } else {
                System.out.println(c+" is Greatest");
            }
        } else {
            if(b>c){
                System.out.println(b+" is Greatest");
            } else {
                System.out.println(c+" is Greatest");
            }
        }

        System.out.println("Bye bye");
    }
}
