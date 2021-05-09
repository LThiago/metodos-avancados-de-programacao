package BurgerShop.Model.Menu;

public class ShowMenu implements MenuItem {

    Category categories;
    Item items;

    public ShowMenu() {
        this.categories = new Category();
        this.items = new Item();
    }

    @Override
    public void print() {
        System.out.println("==================================================\n"
                + "|                      MENU                      |");
        int itemCount = 0;
        for (int i = 0; i < categories.categories.size(); i++) {
            System.out.println("==================================================\n" + "| "
                    + categories.categories.get(i) + " |\n" + "==================================================");
            for (int j = 0; j < 4; j++) {
                System.out.println("| " + items.items.get(itemCount) + " |");
                itemCount++;
            }
        }
        System.out.println("==================================================\n");
    }

}
