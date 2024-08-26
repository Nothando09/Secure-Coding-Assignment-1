//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //#8Creating an instance Nothando

        Bank PersonalBank = new Bank("NM", 230487.0);

        PersonalBank.deposit(500.0);
        PersonalBank.withdrawal(200.0);

        //#9.Invoking the display method/.
        PersonalBank.display();

        //testing the insurance
        Insurance PersonalInsurance = new Insurance("Life", 5000.0);

        PersonalInsurance.cover();
    }
}