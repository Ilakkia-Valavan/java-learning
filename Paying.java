public class Paying {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        GPay gPay = new GPay();
        creditCardPayment.pay(100.0);
        gPay.pay(50.0);

    }
}

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class GPay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using GPay.");
    }
}