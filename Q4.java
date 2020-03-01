public class Q4 {
    private static Q4 Single_Instance = null;

    int i;

    private Q4() {
        i = 10;
    }

    public static Q4 getInstance() {
        if (Single_Instance == null)
            Single_Instance = new Q4();
        return Single_Instance;
    }
}

class Main {
    public static void main(String[] args) {
        Q4 Singles = Q4.getInstance();

        System.out.println("Singles is : " + Singles.i);
    }
}
