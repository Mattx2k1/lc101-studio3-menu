package restaurant;

import java.util.Locale;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;



    public MenuItem(double price, String description, String category, boolean isNew, String name) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.name = name;
    }

    public MenuItem(double price, String description, String category, String name) {
        this(price, description, category, true, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    @Override
    public String toString() {
        return  name +
                "\nprice=" + price +
                "\ndescription='" + description + '\'' +
                "\n category='" + category + '\'' +
                "\n isNew=" + isNew + '\'';
    }

    public void printItem() {
         System.out.println(this);
    }

    @Override
    public boolean equals(Object menuItemOneToBeComparedWith) {

        if (this == menuItemOneToBeComparedWith) {
            return true;
        }

        if (null == menuItemOneToBeComparedWith) {
            return false;
        }

        if (menuItemOneToBeComparedWith.getClass() != getClass()) {
            return false;
        }

        MenuItem exMenuItem = (MenuItem) menuItemOneToBeComparedWith;
        return exMenuItem.getName().toLowerCase(Locale.ROOT) == name.toLowerCase(Locale.ROOT)
                && exMenuItem.getCategory().toLowerCase(Locale.ROOT) == category.toLowerCase(Locale.ROOT)
                && exMenuItem.getDescription().toLowerCase(Locale.ROOT) == description.toLowerCase(Locale.ROOT);
    }
}