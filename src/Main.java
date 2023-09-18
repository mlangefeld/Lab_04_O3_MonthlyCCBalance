public class Main {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double interestRate = 1.17;

        creditCardBalance = creditCardBalance * interestRate;

        System.out.println("The balance after one month is " + creditCardBalance);
        creditCardBalance = creditCardBalance * interestRate;
        System.out.println("The balance after two months is " + creditCardBalance);
    }
}