package BurgerShop.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {

    List<Item> items = new ArrayList<Item>();

    public void addItems(Item item) {

        items.add(item);
    }

    public float getCost() {

        float cost = 0.0f;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.println("Item is: " + item.getName());
            System.out.println("Price is: " + item.getPrice());

        }
    }
}