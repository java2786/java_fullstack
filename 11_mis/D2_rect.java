class Rectangle{
    private int width;
    private int height;

    Rectangle(){
        // width = 0;
        // height = 0;
        this(1);
    }

    Rectangle(int a){
        // width = a;
        // height = a;
        this(a, a);
    }
    Rectangle(int a, int b){
        width = a;
        height = b;
    }
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
public class D2_rect {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4);
        Rectangle rect3 = new Rectangle(4, 2);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
    }
}
