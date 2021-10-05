package restaurant;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem item){
        if (menuItems.contains(item)) {
            System.out.println("there can only be one");
        } else {
            this.menuItems.add(item);
        }
    }

    public MenuItem removeMenuItem(int indexOfRemovalItem) {
       return this.menuItems.remove(indexOfRemovalItem);
    }
}


//