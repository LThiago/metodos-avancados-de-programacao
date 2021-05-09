package BurgerShop.Model.Menu;

import java.util.ArrayList;
import java.util.List;

public class Category implements MenuItem {

    List<String> categories = new ArrayList<String>();

    public Category() {
        categories.add("                  Hamburgers                  ");
        categories.add("                    Drinks                    ");
        categories.add("                    Fries                     ");
        categories.add("                   Desserts                   ");
    }

    public List<String> getCategories() {
        return categories;
    }

    @Override
    public void print() {

    }

}
