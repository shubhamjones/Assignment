public class Bank {
    public String branchName;
    public String IFSC;
    public double RoI;

    public void getDetails(String branchName, String IFSC, double RoI) {
        this.branchName = branchName;
        this.IFSC = IFSC;
        this.RoI = RoI;
        System.out.println("Branch Name is " + branchName + "\n" + "IFSC code is " + IFSC + "\n" + "Rate of Intrest is" + RoI);

    }
}
    class SBI extends Bank{
    }
    class BOI extends Bank{
    }
    class ICICI extends Bank{
        public static void main(String[] args)
        {
            SBI account= new SBI();
            account.getDetails(  "TTN Branch","SBIN0007654",6.5);
            BOI account2= new BOI();
            account.getDetails( "Noida Sector 143 Branch","BOIN000874",9.5);
            ICICI account3= new ICICI();
            account.getDetails( "Noida Sector 144 Branch","ICICI000344",6.5);

        }
    }
