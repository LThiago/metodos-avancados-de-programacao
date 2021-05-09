package BurgerShop.Model.Order;

public abstract class ItemDecorator implements Item {

    private Item newItem;

    public ItemDecorator(Item newItem) {
        this.newItem = newItem;
    }

    @Override
    public String getName() {
        return newItem.getName();
    }

    @Override
    public float getPrice() {
        return newItem.getPrice();
    }

}
