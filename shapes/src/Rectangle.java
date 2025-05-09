public class Rectangle extends Shape {
    double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double width;

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
