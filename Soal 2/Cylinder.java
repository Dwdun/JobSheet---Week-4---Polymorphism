public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double NewRadius,double NewHeight){
        super("Cylinder");
        radius = NewRadius;
        height = NewHeight;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        return super.toString() + " of radius: " + radius + " and height: " + height;
    }
}
