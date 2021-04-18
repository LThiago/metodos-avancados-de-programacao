package Builder;

public class BurgerShopBuilder {
    private String hamburger;
    private String drink;
    private String fries;
    private String dessert;

    public BurgerShopBuilder(String hamburger) {
        this.hamburger = hamburger;
    }

    public void orderDrink(String drink) {
        this.drink = drink;
    }

    public void orderFries(String fries) {
        this.fries = fries;
    }
    public void orderDessert(String dessert) {
        this.dessert = dessert;
    }

    public BurgerShop finishOrder(){
        return new BurgerShop(hamburger, drink, fries, dessert);
    } 
}
