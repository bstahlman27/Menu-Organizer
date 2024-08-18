import java.text.DecimalFormat;
public class Food extends Item{
   
    String type;

    public Food(String name, String type, String description, int calories, double price){
        super(name, description, calories, price);
        this.type = type;
    }

    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return name + "\n" + description + "\nCalories: " + calories + "\n$" + df.format(price) + "\n\n";
    }

    
}