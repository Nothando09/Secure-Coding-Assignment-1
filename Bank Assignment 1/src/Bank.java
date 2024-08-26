public class Bank {
    //1.Creating a class Bank with fields accountType and accountBalance

    private final String accountType;
    private double accountBalance;

    //#4.Constructor that sets the accountType and accountBalance
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;

    }

    //#2.Creating a method deposit that adds to the accountBalance and returns the value

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    //#3.Creating a method withdrawal that subtracts from the accountBalance and returns the value
    public void withdrawal(double amount) {
        this.accountBalance -= amount;
    }

    //#5.Creating a method display to print...
    public void display() {
        System.out.println("The account type is" +" " + this.accountType + " " + "the balance is"+" " + this.accountBalance);
    }
}
//6.Creating a class that inherits from the Bank class
class Insurance extends Bank{
    public Insurance(String accountType,double accountBalance){

        super(accountType,accountBalance);
    }




    //#7.Creating a method cover
    public void  cover(){
        System.out.println("You are covered");
    }

}
