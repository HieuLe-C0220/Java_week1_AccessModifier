public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    double getRadius() {
        return this.radius;
    }
    protected double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
