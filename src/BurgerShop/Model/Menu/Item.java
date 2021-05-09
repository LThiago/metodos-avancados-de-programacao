package BurgerShop.Model.Menu;

import java.util.ArrayList;
import java.util.List;

public class Item implements MenuItem {

    List<String> items = new ArrayList<String>();

    public Item() {

        items.add("Vegan ------------------------------- R$ 20,00");
        items.add("Chicken ----------------------------- R$ 30,00");
        items.add("Buffalo ----------------------------- R$ 40,00");
        items.add("Original ---------------------------- R$ 25,00");

        items.add("Coke -------------------------------- R$ 10,00");
        items.add("Guaraná ----------------------------- R$ 10,00");
        items.add("Lemon Juice -------------------------- R$ 7,00");
        items.add("Orange Juice ------------------------- R$ 7,00");

        items.add("Fries with Bacon -------------------- R$ 20,00");
        items.add("Fries with Cheddar ------------------ R$ 15,00");
        items.add("Fitness Fries ----------------------- R$ 12,00");
        items.add("Original Fries ---------------------- R$ 30,00");

        items.add("Milkshake --------------------------- R$ 20,00");
        items.add("Lemon Mousse ------------------------ R$ 15,00");
        items.add("Chocolate Ice Cream ----------------- R$ 15,00");
        items.add("Açaí -------------------------------- R$ 25,00");
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public void print() {

    }

}
