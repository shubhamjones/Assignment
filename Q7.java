import java.util.Scanner;

public class Q7 {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the seconds");
        double sec=scn.nextDouble();
        double min=sec/60;
        System.out.println("minutes are:" + min );
        double hr=min/60;
        System.out.println("hours are:" + hr);

    }
}
