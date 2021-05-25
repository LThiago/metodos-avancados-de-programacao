package Command;

public class Store {
    protected String storeName;

    public Store(String name) {
        storeName = name;
    }

    public void buy(double amount, PaymentCommand paymentMethod) {
        Purchase purchase = new Purchase(storeName);
        purchase.setAmount(amount);
        paymentMethod.processPurchase(purchase);
    }
}
