package Command;

public class CreditCardPayment implements PaymentCommand {

    @Override
    public void processPurchase(Purchase purchase) {
        System.out.println("Credit Card purchase done.\n" + purchase.getInvoiceInfo());
    }

}
