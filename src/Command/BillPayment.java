package Command;

public class BillPayment implements PaymentCommand {

    @Override
    public void processPurchase(Purchase purchase) {
        System.out.println("Bill created.\n" + purchase.getInvoiceInfo());
    }

}
