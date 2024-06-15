import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk menu = new CoffeeKiosk();
        ArrayList<String> items= new ArrayList<String>();
        // CoffeeKiosk order = new CoffeeKiosk();
        menu.addMenuItem("Cheese cake", 15.00);
        menu.addMenuItem("Pankaces", 7.50);
        menu.addMenuItem("Chocolate cake", 25.00);
        menu.addMenuItem("Browmies", 10.00);
        // menu.displayMenu();

        // menu.newOrder();
        for(int i = 0; i<20; i++){
            menu.addMenuItemByInput(items);
        }
        



}
}