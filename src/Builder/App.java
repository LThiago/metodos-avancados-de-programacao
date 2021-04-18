package Builder;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        orderLoopMenu();
    }

    public static void printMenu(int menu){
        if(menu == 1){
            System.out.println(
                  "==================================================\n"
                + "                    Hamburger                     \n"
                + "==================================================\n"
                + " 1 - Vegan                                        \n"
                + " 2 - Chicken                                      \n"
                + " 3 - Buffalo                                      \n"
                + " 4 - Original                                     \n"
                + "=================================================="
            );
        }
        else if(menu == 2){
            System.out.println(
                  "==================================================\n"
                + "                      Drinks                      \n"
                + "==================================================\n"
                + " 1 - Coke                                         \n"
                + " 2 - Guaraná                                      \n"
                + " 3 - Lemon Juice                                  \n"
                + " 4 - Orange Juice                                 \n"
                + " 0 - None                                         \n"
                + "=================================================="
            );
        }
        else if(menu == 3){
            System.out.println(
                  "==================================================\n"
                + "                      Fries                       \n"
                + "==================================================\n"
                + " 1 - Fries with Bacon                             \n"
                + " 2 - Fries with Cheddar                           \n"
                + " 3 - Fitness Fries                                \n"
                + " 4 - Original Fries                               \n"
                + " 0 - None                                         \n"
                + "=================================================="
            );
        }
        else if(menu == 4){
            System.out.println(
                  "==================================================\n"
                + "                     Desserts                     \n"
                + "==================================================\n"
                + " 1 - Milkshake                                    \n"
                + " 2 - Lemon Mousse                                 \n"
                + " 3 - Chocolate Ice Cream                          \n"
                + " 4 - Açaí                                         \n"
                + " 0 - None                                         \n"
                + "=================================================="
            );
        }
        else if(menu == 5){
            System.out.println(
                  "==================================================\n"
                + "                      Answers                     \n"
                + "==================================================\n"
                + " 1 - Yes                                          \n"
                + " 0 - No                                           \n"
                + "=================================================="
            );
        }
    }

    
    public static void orderLoopMenu() throws InterruptedException{
        
        int choice;
        int orderNumber = 1;
        String[] hamburgers = {"Vegan", "Chicken", "Buffalo", "Original"};
        String[] drinks = {"Coke", "Guaraná", "Lemon Juice", "Orange Juice"};
        String[] fries = {"Fries with Bacon", "Fries with Cheddar", "Fitness Fries", "Original Fries"};
        String[] desserts = {"Milkshake", "Lemon Mousse", "Chocolate Ice Cream", "Açaí"};
        BurgerShop order;
        
        Scanner input = new Scanner(System.in);

        printMenu(1);
        
        System.out.printf("Select your Burger: ");
        choice = input.nextInt();

        BurgerShopBuilder burgerShopBuilder = new BurgerShopBuilder(hamburgers[choice - 1]);

        while(true){
            if(orderNumber != 1){
                printMenu(1);

                System.out.printf("Select a Hamburger: ");
                choice = input.nextInt();

                burgerShopBuilder = new BurgerShopBuilder(hamburgers[choice -1]);
            }

            printMenu(2);

            System.out.printf("Select a Drink: ");
            choice = input.nextInt();

            if(choice != 0){
                burgerShopBuilder.orderDrink(drinks[choice - 1]);
            }

            printMenu(3);

            System.out.printf("Select a type of Fries: ");
            choice = input.nextInt();

            if(choice != 0){
                burgerShopBuilder.orderFries(fries[choice - 1]);
            }

            printMenu(4);

            System.out.printf("Select a type of Dessert: ");
            choice = input.nextInt();

            if(choice != 0){
                burgerShopBuilder.orderDessert(desserts[choice - 1]);
            }

            order = burgerShopBuilder.finishOrder();

            System.out.println(
                  "\n==================================================\n"
                + "Order " + orderNumber + ": " + order.toString() + "\n"
                + "==================================================\n"
            );
            Thread.sleep(1000);

            printMenu(5);

            System.out.printf("Do you want to make another order? ");

            choice = input.nextInt();
            if( choice == 0 ){
                break;
            }
            orderNumber++;
        }
        input.close();
    }
}
