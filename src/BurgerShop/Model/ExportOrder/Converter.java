package BurgerShop.Model.ExportOrder;

import BurgerShop.Model.Order.OrderedItems;

public interface Converter {
    public String getOrder(OrderedItems orderedItems);
}
