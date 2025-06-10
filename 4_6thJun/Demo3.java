public class Demo3 {
    public static void main(String[] args) {
        //     - Declare a constant to store the value of Pi and use it to calculate the circumference and area of a circle given its radius.

        // constant = unchangable
        final double pi = 3.14;
        int radius = 15;
        // pi = 44;

        System.out.println(pi);
        // area circle 
        double area = pi * radius * radius;
        double circumference = 2 * radius * pi;

        System.out.println("Area of circle is "+area);
        System.out.println("Circumference of circle is "+circumference);
    }
}
