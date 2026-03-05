abstract public class Shape {
    protected String shapeName;

    public Shape(String NewName){
        shapeName = NewName;
    }

    public abstract double area();

    public String toString(){
        return shapeName;
    }

}
