import java.sql.SQLOutput;

public class Q8 {
    public static void main(String[] args)
    {
      StringBuffer str= new StringBuffer("theworld-beautiful");
      str.reverse();
        System.out.println(str);
        str.delete(4,9);
        System.out.println(str);
    }
}
