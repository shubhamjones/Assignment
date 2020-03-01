public class Q10 {
    public int a;
    public int b;

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public void concat(String a, String b) {
        System.out.println(a + b);
    }

    public void concat(String a, String b, String c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Q10 op = new Q10();
        op.add(5, 6);
        op.add(2.4, 2.7);
        op.multiply(5, 6);
        op.multiply(7.3, 8.6);
        op.concat("hello ",  "sir");
        op.concat("this ", "is ", "world");
    }
}