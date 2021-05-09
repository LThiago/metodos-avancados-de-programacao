package BurgerShop.Model.Order;

public class Dessert implements Item {

    private String name;
    private float price;

    public Dessert(int choice) {
        switch (choice) {
            case 1:
                this.name = "Milkshake";
                this.price = 20.0f;
                break;

            case 2:
                this.name = "Lemon Mousse";
                this.price = 15.0f;
                break;

            case 3:
                this.name = "Chocolate Ice Cream";
                this.price = 15.0f;
                break;

            case 4:
                this.name = "Açaí";
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
