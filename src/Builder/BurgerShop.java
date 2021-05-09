package Builder;

public class BurgerShop {
    private String hamburger;
    private String drink;
    private String fries;
    private String dessert;

    public BurgerShop(String hamburger, String drink, String fries, String dessert) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.fries = fries;
        this.dessert = dessert;
    }

    public String getHamburger() {
        return hamburger;
    }

    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFries() {
        return fries;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        if (drink == null) {
            if (fries == null) {
                if (dessert == null) {
                    return hamburger;
                } else {
                    return hamburger + " + " + dessert;
                }

            } else {
                if (dessert == null) {
                    return hamburger + " + " + fries;
                } else {
                    return hamburger + " + " + fries + " + " + dessert;
                }
            }
        } else {
            if (fries == null) {
                if (dessert == null) {
                    return hamburger + " + " + drink;
                } else {
                    return hamburger + " + " + drink + " + " + dessert;
                }

            } else {
                if (dessert == null) {
                    return hamburger + " + " + drink + " + " + fries;
                } else {
                    return hamburger + " + " + drink + " + " + fries + " + " + dessert;
                }
            }
        }
    }

}
