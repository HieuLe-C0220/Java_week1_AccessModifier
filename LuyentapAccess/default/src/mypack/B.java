package mypack;

import pack.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();//không thể truy cập do phương thức msg ở lớp A đặt mức độ truy cập là default
    }
}
