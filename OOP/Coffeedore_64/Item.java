import java.io.PrintStream;

public class Item {
    private String name="";
    private Double price=0.0;
    private int index= 0;
    
    public Item(String name, Double price, int index){
    this.name = name;
    this.price = price;
    this.index = index;
    }
    public Item(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    

}
