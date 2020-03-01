import static java.lang.Character.*;

public class Q4 {
    public static void main(String[] args) {
        String str = "Shivam@DuFFer1234";
        int upper = 0, lower = 0, digit = 0, special = 0, count = 0;
        for (int i = 0; i< str.length(); i++) {
            if (isUpperCase(str.charAt(i))) {
                upper++;
            } else if (isLowerCase(str.charAt(i))) {
                lower++;
            } else if (isDigit(str.charAt(i))) {
                digit++;
            } else {
                special++;
            }

        }
        int upper1= (upper * 100) / str.length();
        int lower2= (lower * 100) / str.length();
        int digit2= (digit * 100) / str.length();
        int special2= (special * 100) / str.length();

        System.out.println(upper+ " "+upper1);
        System.out.println(lower+ " "+lower2);
        System.out.println(digit+ " "+digit2);
        System.out.println(special+ " " +special2);
    }

}