public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double Newwidth,double Newlength){
        super("Rectangle");
        width = Newwidth;
        length = Newlength;
    }

    @Override
    public double area(){
        return width * length;
    }

    public String toString(){
        return super.toString() + " of width: " + width + " and length: " + length;
    }

}
