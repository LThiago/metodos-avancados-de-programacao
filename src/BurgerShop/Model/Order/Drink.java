package BurgerShop.Model.Order;

public class Drink implements Item {

    private String name;
    private float price;

    public Drink(int choice) {
        switch (choice) {
            case 1:
                this.name = "Coke";
                this.price = 10.0f;
                break;

            case 2:
                this.name = "Guaraná";
                this.price = 10.0f;
                break;

            case 3:
                this.name = "Lemon Juice";
                this.price = 7.0f;
                break;

            case 4:
                this.name = "Orange Juice";
                this.price = 7.0f;
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
