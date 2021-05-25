package ChainOfResponsibility;

public class BankB extends BankChain {

    public BankB() {
        super(BanksID.bankB);
    }

    @Override
    protected void pay() {
        System.out.println("Payment made to bank B");
    }
}
