public class Private {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data); //Trường data đặt mức độ truy cập private nên không cho truy cập ở lớp khác
        obj.msg;//phương thức msg() cũng vậy
    }
}
class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello java");
    }
}
