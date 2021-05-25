package ChainOfResponsibility;

public class BankD extends BankChain {

    public BankD() {
        super(BanksID.bankD);
    }

    @Override
    protected void pay() {
        System.out.println("Payment made to bank D");
    }
}
