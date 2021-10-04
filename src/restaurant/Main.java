package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        MenuItem caesarSalad = new MenuItem(7.99, "A Classic Caesar Salad", "Appetizer");
        MenuItem avocadoToast = new MenuItem(18.99, "Avocado Toast with the perfect ratio of nutritional yeast to garlic powder", "Entree", false);
        MenuItem tiramisu = new MenuItem(13.25, "Succulent yet delectable, espresso and stuff, it's good", "Dessert");
        System.out.println(caesarSalad.getCategory());
        System.out.println(avocadoToast.getPrice());
        System.out.println(tiramisu.getDescription());
        System.out.println(tiramisu.isNew());

        menuItems.add(caesarSalad);

        Date date = new Date();
        Menu ourMenu = new Menu(date, menuItems);

        System.out.println(ourMenu.getLastUpdated());

        ourMenu.addMenuItem(avocadoToast);

        System.out.println(ourMenu.getMenuItems());



    }
}
