package BurgerShop.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {

    public List<Item> items = new ArrayList<Item>();

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
}