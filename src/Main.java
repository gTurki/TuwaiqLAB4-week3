public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("<====================================>");

        Circle c1 = new Circle(2);
        System.out.println(c1.toString());
        System.out.println("Area = " + c1.calculateArea());
        System.out.println("Circumference = " + c1.calculateCircumference());

        System.out.println("<====================================>");

        Rectangle r1 = new Rectangle(10, 20);
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculateCircumference());

        System.out.println("<====================================>");

        Trinagle t1 = new Trinagle(10, 8);
        System.out.println(t1.toString());
        System.out.println("Area = " + t1.calculateArea());
        System.out.println("Perimeter = " + t1.calculateCircumference());



    }

}
