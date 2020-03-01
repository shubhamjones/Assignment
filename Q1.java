public class Q1 {
    public static void main(String[] args)
    {
        System.out.println("Library management");
        book_number obj=new book_number();
        for(int i=0;i<3;i++){
            String book=obj.books[i];
            String auth=obj.book_auth[i];
            int price=obj.book_pr[i];
            int num=obj.book_num[i];
            System.out.println("Book name: "+book+" , Author Name: "+auth+" ,Book Price: "+price+" ,Book Number: "+num);

        }
    }
}
class Book{
    public String[] books={"the three musketeers","the argumentative indian","river of smoke"};
}
class book_Author extends Book
{
    String[] book_auth={"alexander dumas","amartya sen","anitav ghose"};
}
class book_Price extends book_Author{
    int[] book_pr={1000,2000,3000};
}
class book_number extends book_Price{
    int[] book_num={1000,1001,1002};
}