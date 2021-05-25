package Command;

public class DebitCardPayment implements PaymentCommand {

    @Override
    public void processPurchase(Purchase purchase) {
        System.out.println("Debit Card purchase done.\n" + purchase.getInvoiceInfo());
    }

}
