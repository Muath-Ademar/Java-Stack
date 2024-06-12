import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
      
            Item item1= new Item();
            item1.name="Mocha";
            item1.price=3.99;
            Item item2=new Item();
            item2.name="Drip Coffee";
            item2.price=3.50;
            Item item3=new Item();
            item3.name="Latte";
            item3.price=4.55;
            Item item4=new Item();
            item4.name="Cappucino";
            item4.price=3.60;

            Order order1 = new Order();
            order1.name = "Cindhuri";
            order1.ready= true;
            Order order2 = new Order();
            order2.name = "Jimmy";
            order2.items.add(item1);
            order2.total += item1.price; 
            order2.ready=true;
            Order order3 = new Order();
            order3.name = "Noah";
            order3.items.add(item4);
            order3.total+=item4.price;
            Order order4 = new Order();
            order4.name = "Sam";
            order4.items.add(item3);
            order4.total += item3.price;
            order4.items.add(item3);
            order4.total += item3.price;
   
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
