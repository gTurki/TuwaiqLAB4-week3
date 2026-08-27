public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("<====================================>");

        Circle c1 = new Circle(2);
        System.out.println(c1.toString());
        System.out.println("Area = " + c1.calculateArea());
        System.out.println("Circumference = " + c1.calculateCircumference());

        System.out.println("-----------------");

        Circle c2 = new Circle(3);
        System.out.println(c2.toString());
        System.out.println("Area = " + c2.calculateArea());
        System.out.println("Circumference = " + c2.calculateCircumference());

        System.out.println("-----------------");

        Circle c3 = new Circle(1.4);
        System.out.println(c3.toString());
        System.out.println("Area = " + c3.calculateArea());
        System.out.println("Circumference = " + c3.calculateCircumference());


        System.out.println("<====================================>");

        Rectangle r1 = new Rectangle(10, 20);
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculateCircumference());

        System.out.println("-----------------");

        Rectangle r2 = new Rectangle(13.5, 10.27);
        System.out.println(r2.toString());
        System.out.println("Area = " + r2.calculateArea());
        System.out.println("Perimeter = " + r2.calculateCircumference());

        System.out.println("-----------------");

        Rectangle r3 = new Rectangle(25, 37);
        System.out.println(r3.toString());
        System.out.println("Area = " + r3.calculateArea());
        System.out.println("Perimeter = " + r3.calculateCircumference());


        System.out.println("<====================================>");

        Trinagle t1 = new Trinagle(10, 8);
        System.out.println(t1.toString());
        System.out.println("Area = " + t1.calculateArea());
        System.out.println("Perimeter = " + t1.calculateCircumference());

        System.out.println("-----------------");

        Trinagle t2 = new Trinagle(5.23, 8.19);
        System.out.println(t2.toString());
        System.out.println("Area = " + t2.calculateArea());
        System.out.println("Perimeter = " + t2.calculateCircumference());

        System.out.println("-----------------");

        Trinagle t3 = new Trinagle(20, 27);
        System.out.println(t3.toString());
        System.out.println("Area = " + t3.calculateArea());
        System.out.println("Perimeter = " + t3.calculateCircumference());

    }

}
