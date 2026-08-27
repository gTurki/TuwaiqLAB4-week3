public class Circle extends Shape{

    private double radius;
    private final double BI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (BI * getRadius() * getRadius());
    }

    @Override
    public double calculateCircumference() {
        return (2 * BI * getRadius());
    }

    @Override
    public String toString() {
        return "A circle with radius: " + getRadius();
    }

}
