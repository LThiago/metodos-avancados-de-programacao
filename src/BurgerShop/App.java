package BurgerShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import BurgerShop.Model.ExportOrder.Converter;
import BurgerShop.Model.ExportOrder.ToCSV;
import BurgerShop.Model.ExportOrder.ToJSON;
import BurgerShop.Model.Menu.MenuItem;
import BurgerShop.Model.Menu.ShowMenu;
import BurgerShop.Model.Order.OrderBuilder;
import BurgerShop.Model.Order.OrderedItems;

public class App {
    public static void main(String[] args) throws IOException {
        loop();
    }

    public static void loop() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MenuItem showMenu = new ShowMenu();
        ;
        OrderBuilder builder = new OrderBuilder();
        OrderedItems orderedItems = null;

        boolean orderStatus = false;
        int choice;

        while (true) {

            if (orderStatus == false) {

                System.out.println("==================================================\n"
                        + "|                Select a Option                 |\n"
                        + "==================================================\n"
                        + "| 1 - Show Menu                                  |\n"
                        + "| 2 - Order                                      |\n"
                        + "|                                                |\n"
                        + "| 0 - Exit                                       |\n"
                        + "==================================================\n");

                choice = Integer.parseInt(br.readLine());

                if (choice == 0) {
                    break;
                }

                switch (choice) {
                    case 1:
                        showMenu.print();

                        break;

                    case 2:
                        orderedItems = builder.prepareOrder();
                        orderStatus = true;

                        break;

                    case 0:
                        break;

                    default:
                        break;
                }
            } else if (orderStatus == true) {

                System.out.println("==================================================\n"
                        + "|                Select a Option                 |\n"
                        + "==================================================\n"
                        + "| 1 - Show Menu                                  |\n"
                        + "| 2 - Show Order                                 |\n"
                        + "|                                                |\n"
                        + "| 0 - Exit                                       |\n"
                        + "==================================================\n");

                choice = Integer.parseInt(br.readLine());

                if (choice == 0) {
                    break;
                }

                switch (choice) {
                    case 1:
                        showMenu.print();

                        break;

                    case 2:
                        System.out.println("==================================================\n"
                                + "|                Select a Option                 |\n"
                                + "==================================================\n"
                                + "| 1 - Show in CSV                                |\n"
                                + "| 2 - Show in JSON                               |\n"
                                + "|                                                |\n"
                                + "| 0 - Exit                                       |\n"
                                + "==================================================\n");

                        choice = Integer.parseInt(br.readLine());

                        switch (choice) {
                            case 1:
                                Converter csv = new ToCSV();
                                System.out.println(csv.getOrder(orderedItems));

                                break;
                            case 2:
                                Converter json = new ToJSON();
                                System.out.println(json.getOrder(orderedItems));

                                break;
                            case 0:
                                break;

                            default:
                                break;
                        }

                        break;

                    case 0:
                        break;

                    default:
                        break;
                }
            }
        }
    }
}
