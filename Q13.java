import java.util.Scanner;

public class Q13 {
    public static void main(String [] args) throws HandMadeException {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("press enter to throw exception");
            sc.nextLine();
            throw new HandMadeException("this is a custom exception");
        }
        catch (HandMadeException hme){
            System.out.println(hme.getMessage());
            System.out.println(hme.getStackTrace());
        }
    }
}
class HandMadeException extends Exception{
    public HandMadeException(String message){
        super(message);
    }
}
