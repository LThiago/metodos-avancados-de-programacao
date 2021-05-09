package BurgerShop.Model.Order;

public class Hamburger implements Item {

    private String name;
    private float price;

    public Hamburger(int choice) {
        switch (choice) {
            case 1:
                this.name = "Vegan";
                this.price = 20.0f;
                break;

            case 2:
                this.name = "Chicken";
                this.price = 30.0f;
                break;

            case 3:
                this.name = "Buffalo";
                this.price = 40.0f;
                break;

            case 4:
                this.name = "Original";
                this.price = 25.0f;
                break;

            default:
                break;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
