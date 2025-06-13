public class Demo_8 {
    public static void main(String[] args) {
        // Palindrome String - naman, nitin, racecar
        String name = "racecar";
        int len = name.length();

        // System.out.println("FirstChar: "+name.charAt(0));
        // System.out.println("LastChar: "+name.charAt(len-1));

        int i = 0;
        int j = len - 1;
        while(j>i){
            if(name.charAt(i) == name.charAt(j)){
                i = i+1;
                j = j-1;
            } else {
                System.out.println(name+" is not palindrome");
                break;
            }
        }
        if(j<i || j==i){
            System.out.println(name+" is palindrome");
        }
    }
}
