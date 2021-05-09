package BurgerShop.Model.ExportOrder;

import BurgerShop.Model.Order.OrderedItems;

public class ToCSV implements Converter {

    StringBuilder csv;
    float total;

    @Override
    public String getOrder(OrderedItems orderedItems) {

        csv = new StringBuilder();

        csv.append("Item,Price\n");

        for (int i = 0; i < orderedItems.items.size(); i++) {
            csv.append(orderedItems.items.get(i).getName() + "," + orderedItems.items.get(i).getPrice() + "\n");
            total += orderedItems.items.get(i).getPrice();
        }

        csv.append("Total," + total);

        return csv.toString();
    }

}
