public class BookTest {
    public static void main(String[] args) {
        Book programmingBook1 = new ProgrammingBook(100,"Sức mạnh của thói quen","ABC",70000,"English","Thói quen");
        Book programmingBook2 = new ProgrammingBook(101,"Đắc nhân tâm","AAA",50000,"Vietnamese","Kỹ năng");
        Book programmingBook3 = new ProgrammingBook(102,"Javascript cơ bản","Mrs.KieuAnh",95000,"Vietnamese","Js");
        Book programmingBook4 = new ProgrammingBook(103,"Java cơ bản","Mr.Hoa",100000,"Vietnamese","Java");
        Book programmingBook5 = new ProgrammingBook(104,"C++ cơ bản","Tim",90000,"Vietnamese","C++");
        Book fictionBook1 = new FictionBook(201,"Từ điển tiếng việt","Giáo dục",150000,"Việt");
        Book fictionBook2 = new FictionBook(202,"Từ điển tiếng anh","Giáo dục",145000,"Anh");
        Book fictionBook3 = new FictionBook(203,"Từ điển tiếng pháp","Giáo dục",130000,"Pháp");
        Book fictionBook4 = new FictionBook(204,"Từ điển tiếng nhật","Giáo dục",120000,"Nhật");
        Book fictionBook5 = new FictionBook(205,"Từ điển tiếng hàn","Giáo dục",115000,"Hàn");
        Book[] books = {programmingBook1,programmingBook2,programmingBook3,programmingBook4,programmingBook5,
        fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5};
        int money =0;
        int count =0;
        for (int i=0;i<books.length;i++) {
            money += books[i].getPrice();
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook)books[i];
                if (programmingBook.getFramework().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println(money+","+count);
    }
}
