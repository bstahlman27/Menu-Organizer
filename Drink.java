import java.text.DecimalFormat;
public class Drink extends Item{

    int size;

    public Drink(String name, int size, String description, int calories, double price){
        super(name, description, calories, price);
        this.size = size;
    }

    public int getSize(){
        return size;
    }
    public void setSize(){
        this.size = size;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return name + ", " + size + "oz.\n" + description + "\nCalories: " + calories + "\n$" + df.format(price) + "\n\n";
    }
}