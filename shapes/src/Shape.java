public abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();

    public String toString() {
        return "Perimeter: " + getPerimeter() + " Area: " + getArea();
    }
}
