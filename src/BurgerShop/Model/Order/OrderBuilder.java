package BurgerShop.Model.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrderBuilder {

    public OrderedItems prepareOrder() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        OrderedItems itemsOrder = new OrderedItems();

        System.out.println("==================================================\n"
                + "|          Enter the type of Hamburger           |\n"
                + "==================================================\n"
                + "| 1 - Vegan                           (R$ 20,00) |\n"
                + "| 2 - Chicken                         (R$ 30,00) |\n"
                + "| 3 - Buffalo                         (R$ 40,00) |\n"
                + "| 4 - Original                        (R$ 25,00) |\n"
                + "==================================================");

        int choice = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("\nYou ordered a Vegan Burger\n");
                itemsOrder.addItems(new Hamburger(choice));
                System.out.println("Do you want to order double with discount? (y/n)");
                char answer = sc.next().charAt(0);
                if (answer == 'y') {
                    itemsOrder.addItems(new DoubleItem(new Hamburger(choice)));
                }
                break;

            case 2:
                System.out.println("\nYou ordered a Chicken Burger\n");
                itemsOrder.addItems(new Hamburger(choice));
                System.out.println("Do you want to order double with discount? (y/n)");
                answer = sc.next().charAt(0);
                if (answer == 'y') {
                    itemsOrder.addItems(new DoubleItem(new Hamburger(choice)));
                }

                break;

            case 3:
                System.out.println("\nYou ordered a Buffalo Burger\n");
                itemsOrder.addItems(new Hamburger(choice));
                System.out.println("Do you want to order double with discount? (y/n)");
                answer = sc.next().charAt(0);
                if (answer == 'y') {
                    itemsOrder.addItems(new DoubleItem(new Hamburger(choice)));
                }
                break;

            case 4:
                System.out.println("\nYou ordered a Original Burger\n");
                itemsOrder.addItems(new Hamburger(choice));
                System.out.println("Do you want to order double with discount? (y/n)");
                answer = sc.next().charAt(0);
                if (answer == 'y') {
                    itemsOrder.addItems(new DoubleItem(new Hamburger(choice)));
                }
                break;

            default:
                break;
        }

        System.out.println("==================================================\n"
                + "|             Enter the type of Drink            |\n"
                + "==================================================\n"
                + "| 1 - Coke                            (R$ 10,00) |\n"
                + "| 2 - Guaraná                         (R$ 10,00) |\n"
                + "| 3 - Lemon Juice                      (R$ 7,00) |\n"
                + "| 4 - Orange Juice                     (R$ 7,00) |\n"
                + "|                                                |\n"
                + "| 0 - None                                       |\n"
                + "==================================================");

        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("\nYou ordered a Coke\n");
                itemsOrder.addItems(new Drink(choice));
                break;

            case 2:
                System.out.println("\nYou ordered a Guaraná\n");
                itemsOrder.addItems(new Drink(choice));
                break;

            case 3:
                System.out.println("\nYou ordered a Lemon Juice\n");
                itemsOrder.addItems(new Drink(choice));
                break;

            case 4:
                System.out.println("\nYou ordered a Orange Juice\n");
                itemsOrder.addItems(new Drink(choice));
                break;

            case 0:
                System.out.println("You didn't ordered a Drink");
                break;

            default:
                break;
        }

        System.out.println("==================================================\n"
                + "|             Enter the type of Fries            |\n"
                + "==================================================\n"
                + "| 1 - Fries with Bacon                (R$ 20,00) |\n"
                + "| 2 - Fries with Cheddar              (R$ 15,00) |\n"
                + "| 3 - Fitness Fries                   (R$ 12,00) |\n"
                + "| 4 - Original Fries                  (R$ 30,00) |\n"
                + "|                                                |\n"
                + "| 0 - None                                       |\n"
                + "==================================================");

        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("\nYou ordered Fries with Bacon\n");
                itemsOrder.addItems(new Fries(choice));
                break;

            case 2:
                System.out.println("\nYou ordered Fries with Cheddar\n");
                itemsOrder.addItems(new Fries(choice));
                break;

            case 3:
                System.out.println("\nYou ordered Fitness Fries\n");
                itemsOrder.addItems(new Fries(choice));
                break;

            case 4:
                System.out.println("\nYou ordered Original Fries\n");
                itemsOrder.addItems(new Fries(choice));
                break;

            case 0:
                System.out.println("You didn't ordered Fries");
                break;

            default:
                break;
        }

        System.out.println("==================================================\n"
                + "|           Enter the type of Dessert            |\n"
                + "==================================================\n"
                + "| 1 - Milkshake                       (R$ 20,00) |\n"
                + "| 2 - Lemon Mousse                    (R$ 15,00) |\n"
                + "| 3 - Chocolate Ice Cream             (R$ 15,00) |\n"
                + "| 4 - Açaí                            (R$ 25,00) |\n"
                + "|                                                |\n"
                + "| 0 - None                                       |\n"
                + "==================================================");

        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("\nYou ordered a Milkshake\n");
                itemsOrder.addItems(new Dessert(choice));
                break;

            case 2:
                System.out.println("\nYou ordered a Lemon Mousse\n");
                itemsOrder.addItems(new Dessert(choice));
                break;

            case 3:
                System.out.println("\nYou ordered a Chocolate Ice Cream\n");
                itemsOrder.addItems(new Dessert(choice));
                break;

            case 4:
                System.out.println("\nYou ordered a Açaí\n");
                itemsOrder.addItems(new Dessert(choice));
                break;

            case 0:
                System.out.println("You didn't ordered a Dessert");
                break;

            default:
                break;
        }

        return itemsOrder;
    }

}
