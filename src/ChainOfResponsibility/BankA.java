package ChainOfResponsibility;

public class BankA extends BankChain {

    public BankA() {
        super(BanksID.bankA);
    }

    @Override
    protected void pay() {
        System.out.println("Payment made to bank A");
    }
}
