import java.util.ArrayList;

public class Order {
    private String name= "";
    private Boolean ready=false;
    private ArrayList<Item> items;

public Order (){
    this.name = "Guest";
    this.items = new ArrayList<Item>();
}
public Order(String name, Boolean ready){
    this.name = name;
    this.items = new ArrayList<Item>();
    this.ready = ready;

}

public void additem(Item item){
    items.add(item);
}
public String getStatusMessage(){
    if (this.ready){
        return "your order is ready";
    }
    else{
        return "thank you for waiting. Your order will be ready soon.";
    }
}
public Double getOrderTotal() {
    Double total = 0.0;
    for (Item item : items){
        total+= item.getPrice();
        
    }
return total;
}
public void display(){
    System.out.println("Customer: " + this.name);
    for (Item item : items){
    System.out.println(item.getName() + "-" + item.getPrice());
    }
    System.out.println("Total: " + this.getOrderTotal());
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public Boolean isReady(){
    return ready;
}
public void setReady(Boolean ready){
    this.ready = ready;
}
public ArrayList getItems(){
    return items;
}
// public void setItems(Item item){
//     this.items = item
// }
}
