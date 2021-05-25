package Command;

public class App {
    public static void main(String[] args) {
        Store lojasAfricanas = new Store("FloorMart");
        lojasAfricanas.buy(999.00, new CreditCardPayment());
        lojasAfricanas.buy(49.00, new BillPayment());
        lojasAfricanas.buy(99.00, new DebitCardPayment());

        Store exorbitante = new Store("Forest");
        exorbitante.buy(19.00, new CreditCardPayment());

    }
}
