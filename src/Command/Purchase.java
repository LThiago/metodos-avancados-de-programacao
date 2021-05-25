package Command;

public class Purchase {
    private static int COUNTER_ID;
    protected int invoiceID;
    protected String storeName;
    protected double totalAmount;

    public Purchase(String storeName) {
        this.storeName = storeName;
        this.invoiceID = ++COUNTER_ID;
    }

    public void setAmount(double amount) {
        this.totalAmount = amount;
    }

    public String getInvoiceInfo() {
        return new String(
                "Invoice number: " + invoiceID + "\nStore: " + storeName + "\nAmount: $ " + totalAmount + "\n");
    }
}
