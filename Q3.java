public class Q3 {
    public static void main(String[] args)
    {
        String str = "I thought I thought of thinking of thanking you";
        int count = str.length() - str.replace("t", "").length();
        System.out.println("Number of occurances of 't' in str = "+count);
    }
}
