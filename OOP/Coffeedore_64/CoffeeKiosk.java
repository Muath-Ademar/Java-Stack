import java.util.ArrayList;

import javax.print.DocFlavor.STRING;


public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
public CoffeeKiosk() {
    this.menu = new ArrayList<Item> ();
    this.orders = new ArrayList<Order>();
    }

    public void addMenuItem (String name, Double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }

    public void displayMenu(){
        for (Item item : menu)
            System.out.println(item.getIndex()+" "+item.getName()+" -- $"+String.format("%.2f",item.getPrice()));
        }

        public void newOrder() {
            
            // Shows the user a message prompt and then sets their input to a variable, name
            System.out.println("Please enter customer name for new order:");
            String name = System.console().readLine();
            
        
            // Your code:
            // Create a new order with the given input string
            Order order = new Order(name);
            displayMenu();
            // Show the user the menu, so they can choose items to add.
            
            // Prompts the user to enter an item number
            System.out.println("Please enter a menu item index or q to quit:");
            String itemNumber = System.console().readLine();
            
            // Write a while loop to collect all user's order items
            while(!itemNumber.equals("q")) {
                
                // Get the item object from the menu, and add the item to the order
                try{
                order.additem(menu.get(Integer.parseInt(itemNumber)));
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Please pick an Item from the menu: ");
                    
                }
                catch(NumberFormatException i){
                    System.out.println("Please enter the number of th Item that you want");
                }
                System.out.println("Please enter a menu item index or q to quit:");
                itemNumber = System.console().readLine();

                // Ask them to enter a new item index or q again, and take their input
                
            }
            order.display();
            // After you have collected their order, print the order details 
    
        }
    
      public void addMenuItemByInput( ArrayList<String> items){
        System.out.println("Add new Item:");
        String name = System.console().readLine();
        String price = System.console().readLine();
        items.add(name);
        items.add(price);
        System.out.println(items);

      }
    public ArrayList<Item> getMenu(){
        return menu;
    }
    public ArrayList<Order> getOrder(){
        return orders;
    }



}
