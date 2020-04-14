public class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(2,"green");
        System.out.println("Hình tròn được tạo với bán kính: "+cir2.getRadius()+" và có diện tích là: "+cir2.getArea());
    }
}
