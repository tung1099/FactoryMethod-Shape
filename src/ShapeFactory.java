public class ShapeFactory {
    public Shape getShape(double a, double b){
        if (a == b){
            return new Square(a);
        } else {
            return new Rectangle(a, b);
        }
    }
    public Shape getShape(double a){
        return new Circle(a);
    }
}