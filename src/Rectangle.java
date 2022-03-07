public class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật có chiều dài = " + length + ", chiều rộng = " + width);
    }
}
