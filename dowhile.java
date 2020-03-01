import java.util.Scanner;

public class dowhile {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String word=input.next();
        do{
            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.println("First and last words are equal");
            }
            else {
                System.out.println("first and last words are not equal");
            }
            word=input.next();
        } while (!word.equals("done"));
    }
}
