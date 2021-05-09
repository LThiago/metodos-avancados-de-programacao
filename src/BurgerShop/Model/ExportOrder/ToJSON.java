package BurgerShop.Model.ExportOrder;

import BurgerShop.Model.Order.OrderedItems;

public class ToJSON implements Converter {

    StringBuilder json;
    float total;

    @Override
    public String getOrder(OrderedItems orderedItems) {
        json = new StringBuilder();

        json.append("{\n");

        for (int i = 0; i < orderedItems.items.size(); i++) {
            json.append("   \"" + orderedItems.items.get(i).getName() + "\": \"" + orderedItems.items.get(i).getPrice()
                    + "\",\n");
            total += orderedItems.items.get(i).getPrice();
        }

        json.append("   \"Total\": \"" + total + "\"\n}");

        return json.toString();
    }
}

// {
// "firstName": "Duke",
// "lastName": "Java",
// "age": 18,
// "streetAddress": "100 Internet Dr",
// "city": "JavaTown",
// "state": "JA",
// "postalCode": "12345",
// "phoneNumbers": [
// { "Mobile": "111-111-1111" },
// { "Home": "222-222-2222" }
// ]
// }
