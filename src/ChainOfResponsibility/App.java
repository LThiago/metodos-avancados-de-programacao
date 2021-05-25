package ChainOfResponsibility;

public class App {
    public static void main(String[] args) {
        BankChain banks = new BankA();
        banks.setNext(new BankB());
        banks.setNext(new BankC());
        banks.setNext(new BankD());

        try {
            banks.makePayment(BanksID.bankA);
            banks.makePayment(BanksID.bankB);
            banks.makePayment(BanksID.bankC);
            banks.makePayment(BanksID.bankD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
