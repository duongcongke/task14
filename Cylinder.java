public class Cylinder extends Circle {
   private double height;
   public Cylinder(double height, double radius) {
       super(radius);
       this.height = height;
   }
   public double getHeight() {
       return this.height;
   }
   public double getVolume(){
       return super.getArena() * height;
   }
   @Override
    public double getArena() {
       return 2.0 * Math.PI * getRadius() * height;
   }
   @Override
    public String toString() {
       return "Cylinder[height=" + height + "," + super.toString() + "]";
   }
}
