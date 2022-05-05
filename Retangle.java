public class Retangle extends Shape {
    private int length, width;
    public Retangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArena() {
        return length*width;
    }
}
