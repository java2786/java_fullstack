public class Demo_9 {
    public static void main(String[] args) {
        // Reverse a String
        String name = "java is a great language";

        int len = name.length();
        int lastIndex = len - 1;
        String reverseName = "";
        while(lastIndex>=0){
            reverseName = reverseName + name.charAt(lastIndex);
            lastIndex = lastIndex - 1;
        }
        System.out.println(reverseName);

    }
}
