package BurgerShop.Model.Order;

public class Fries implements Item {

    private String name;
    private float price;

    public Fries(int choice) {
        switch (choice) {
            case 1:
                this.name = "Fries with Bacon";
                this.price = 20.0f;
                break;

            case 2:
                this.name = "Fries with Cheddar";
                this.price = 15.0f;
                break;

            case 3:
                this.name = "Fitness Fries";
                this.price = 12.0f;
                break;

            case 4:
                this.name = "Original Fries";
                this.price = 30.0f;
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
