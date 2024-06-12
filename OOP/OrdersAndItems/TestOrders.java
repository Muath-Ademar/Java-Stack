import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

    //items

    Item item1= new Item("coffee", 3.00);
    Item item2= new Item("latte", 4.5);
    Item item3= new Item("capuchino", 5.00);

    // orderes

    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order("Muath", true);
    Order order4 = new Order("Mark" ,true);
    Order order5 = new Order("Rodrigo",false);

    // addItem method

    order3.additem(item1);
    order3.additem(item1);
    order4.additem(item2);
    order4.additem(item2);
    order5.additem(item3);
    order5.additem(item3);

    //get status message method

    System.out.println(order5.getStatusMessage());
    System.out.println(order3.getStatusMessage());
    System.out.println(order4.getStatusMessage());

    //get order total method

    System.out.println(order3.getOrderTotal());

    // DISPLAY method
    order4.display();
    order5.display();



        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
