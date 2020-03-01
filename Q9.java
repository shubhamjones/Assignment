enum House {
    A(300), B(400), C(3000);

    House(int Price) {
        this.price = Price;
    }

    private int price;

    int getPrice() {
        return this.price;
    }

}

class Q9 {
    public static void main(String[] args) {
        System.out.println("House A:" + House.A.getPrice());
        System.out.println("House B:" + House.B.getPrice());
        System.out.println("House C:" + House.C.getPrice());

    }
}

