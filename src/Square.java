public class Square implements Shape{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình vuông có cạnh = " + edge);
    }
}
