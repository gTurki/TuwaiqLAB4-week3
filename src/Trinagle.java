public class Trinagle extends Shape{

    private double height;
    private double base;

    public Trinagle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (0.5 * base * height);
    }

    @Override
    public double calculateCircumference() {
        return (3 * base);
    }

    @Override
    public String toString() {
        return "A triangle with height: " + getHeight() +
                ", base: " + getBase();
    }
}
