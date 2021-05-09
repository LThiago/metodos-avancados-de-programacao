package BurgerShop.Model.Order;

public class DoubleItem extends ItemDecorator {

    public DoubleItem(Item newItem) {
        super(newItem);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return super.getPrice() - (super.getPrice() * 15) / 100;
    }

}
