package BurgerShop;

import java.io.IOException;

import BurgerShop.Model.ExportOrder.Converter;
import BurgerShop.Model.ExportOrder.ToCSV;
import BurgerShop.Model.ExportOrder.ToJSON;
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

        // Show Order
        System.out.println("Pedido em CSV:\n");

        Converter csv = new ToCSV();
        System.out.println(csv.getOrder(orderedItems));

        System.out.println("\nPedido em JSON:\n");

        Converter json = new ToJSON();
        System.out.println(json.getOrder(orderedItems));
    }
}
