public abstract class Item{

    String name;
    String description;
    int calories;
    double price;

    public Item(String name, String description, int calories, double price){
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }
    public int getCalories(){
        return calories;
    }
    public void setCalories(){
        this.calories = calories;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }

    public abstract String toString();
}
