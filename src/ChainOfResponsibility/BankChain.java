package ChainOfResponsibility;

public abstract class BankChain {
    protected BankChain next;
    protected BanksID BankID;

    public BankChain(BanksID id) {
        next = null;
        BankID = id;
    }

    public void setNext(BankChain form) {
        if (next == null) {
            next = form;
        } else {
            next.setNext(form);
        }
    }

    public void makePayment(BanksID id) throws Exception {
        if (canPay(id)) {
            pay();
        } else {
            if (next == null) {
                throw new Exception("unregistered bank");
            }
            next.makePayment(id);
        }
    }

    private boolean canPay(BanksID id) {
        if (BankID == id) {
            return true;
        }
        return false;
    }

    protected abstract void pay();
}
