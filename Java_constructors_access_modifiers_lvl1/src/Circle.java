public class Circle {

    double radius;

    public Circle()
    {
        this(1.0);
    }

    public Circle(double radius)
    {
        this.radius =radius;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }

    public void displayArea()
    {
        System.out.println(area());
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle1 = new Circle(10);

        circle.displayArea();
        circle1.displayArea();

    }

}
