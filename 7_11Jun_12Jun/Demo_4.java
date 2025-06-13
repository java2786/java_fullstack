public class Demo_4 {
    public static void main(String[] args) {
        char c = 'U';

        // if(c=='a'){
        //     System.out.println("Vowel");
        // } else if(c=='e'){
        //     System.out.println("Vowel");
        // } else if(c=='i'){
        //     System.out.println("Vowel");
        // } else if(c=='o'){
        //     System.out.println("Vowel");
        // } else if(c=='u'){
        //     System.out.println("Vowel");
        // } else {
        //     System.out.println("Consonent");
        // }

        if(c==97 || c=='e' || c=='i' || c=='o' || c=='u' || c==65 || c=='E' || c=='I' || c=='O' || c=='U' ){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
    }
}
