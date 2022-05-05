public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Retangle("red", 4, 5 );
        System.out.println(s1);
        System.out.println(" Arena is " + s1.getArena());
        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArena());
        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is " + s3.getArena());

    }
}
