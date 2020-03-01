class Q5 implements Cloneable{
    int rollno;
    String name;
    Q5(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Q5 s1 = new Q5(12,"shubham verma");
            Q5 s2=(Q5)s1.clone();
            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
