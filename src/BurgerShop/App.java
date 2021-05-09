package BurgerShop;

import java.io.IOException;

import BurgerShop.Model.Menu.MenuItem;
import BurgerShop.Model.Menu.ShowMenu;
import BurgerShop.Model.Order.OrderBuilder;
import BurgerShop.Model.Order.OrderedItems;

public class App {
    public static void main(String[] args) throws IOException {

        // Show Menu
        MenuItem showMenu = new ShowMenu();
        showMenu.print();

        // Get Order
        OrderBuilder builder = new OrderBuilder();

        OrderedItems orderedItems = builder.prepareOrder();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : " + orderedItems.getCost());

        // TODO “Imprimir o pedido” em .csv e .JSON com base no padrão Bridge;
        // TODO Para imprimir o pedido, crie uma interface Converter com um get
        // FormatoPedido. Em seguida, cria as duas classes de conversão para csv e
        // JSON.

    }
}
