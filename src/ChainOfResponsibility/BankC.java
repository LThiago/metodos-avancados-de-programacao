package ChainOfResponsibility;

public class BankC extends BankChain {

    public BankC() {
        super(BanksID.bankC);
    }

    @Override
    protected void pay() {
        System.out.println("Payment made to bank C");
    }
}
