import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Food> foodsList = new ArrayList<>();
        ArrayList<Food> entreesList = new ArrayList<>();
        ArrayList<Food> sidesList = new ArrayList<>();
        ArrayList<Food> dessertsList = new ArrayList<>();
        ArrayList<Food> appetizersList = new ArrayList<>();
        ArrayList<Food> kidsMenuList = new ArrayList<>();
        ArrayList<Drink> drinksList = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);
        boolean enterNewItems = true;

        System.out.println("Enter restaurant name: ");
        String restaurantName = scnr.nextLine();

        while (enterNewItems == true){
            System.out.println("New menu item entry for " + restaurantName +". Food or drink? ");
            try{
                String item = scnr.nextLine();
                if (item.equalsIgnoreCase("food")){
                    boolean validName = false;
                    boolean validType = false;
                    boolean validDescription = false;
                    boolean validCalories = false;
                    boolean validPrice = false;
                    String name = "";
                    String type = "";
                    String description = "";
                    int calories = 0;
                    double price = 0.00;

                    while (validName == false){
                        System.out.println("Enter food name: ");
                        name = scnr.nextLine();
                        if (name.isEmpty()){
                            throw new IllegalArgumentException("Entry can't be empty.");                           
                        }
                        else{
                            validName = true;
                        }
                    }
                    while (validType == false){
                        System.out.println("What type is it? (Enter entree, side, dessert, appetizer, or kids menu) ");
                        type = scnr.nextLine();
                        if (type.equalsIgnoreCase("entree") || type.equalsIgnoreCase("side") || type.equalsIgnoreCase("dessert") || type.equalsIgnoreCase("appetizer") || type.equalsIgnoreCase("kids menu")){
                            validType = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you enter entree, side, dessert, appetizer, or kids menu.");                            
                        }
                    }
                    while (validDescription == false){
                        System.out.println("Enter Description: ");
                        description = scnr.nextLine();
                        if (description.isEmpty()){
                            throw new IllegalArgumentException("Description can't be empty.");
                            
                        }
                        else{
                            validDescription = true;
                        }
                    }
                    while (validCalories == false){
                        System.out.println("How many calories? ");
                        if (scnr.hasNextInt()){
                            calories = scnr.nextInt();
                            validCalories = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you enter a number.");                           
                        }
                    }
                    scnr.nextLine();
                    while (validPrice == false){
                        System.out.println("Enter price: ");
                        if (scnr.hasNextDouble()){
                            price = scnr.nextDouble();
                            validPrice = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you enter a number with two decimals.");                            
                        }
                    }
                    Food f = new Food(name, type, description, calories, price);
                    foodsList.add(f);
                }
                else if (item.equalsIgnoreCase("drink")){
                    boolean validName = false;
                    boolean validSize = false;
                    boolean validDescription = false;
                    boolean validCalories = false;
                    boolean validPrice = false;
                    String name = "";
                    int size = 0;
                    String description = "";
                    int calories = 0;
                    double price = 0.00;

                    while (validName == false){
                        System.out.println("Enter drink name: ");
                        name = scnr.nextLine();
                        if (name.isEmpty()){
                            throw new IllegalArgumentException("Name can't be empty");
                        }
                        else{
                            validName = true;
                        }
                    }
                    while (validSize == false){
                        System.out.println("Enter size in oz.: ");
                        if (scnr.hasNextInt()){
                            size = scnr.nextInt();
                            scnr.nextLine();
                            validSize = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you're entering a number.");
                        }
                    }
                    while (validDescription == false){
                        System.out.println("Enter Description: ");
                        description = scnr.nextLine();
                        if (description.isEmpty()){
                            throw new IllegalArgumentException("Description can't be empty.");
                        }
                        else{
                            validDescription = true;
                        }
                    }
                    while (validCalories == false){
                        System.out.println("How many calories? ");
                        if (scnr.hasNextInt()){
                            calories = scnr.nextInt();
                            validCalories = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you're entering a number.");
                        }
                    }
                    while (validPrice == false){
                        System.out.println("Enter price: ");
                        if (scnr.hasNextDouble()){
                            price = scnr.nextDouble();
                            validPrice = true;
                        }
                        else{
                            throw new IllegalArgumentException("Make sure you're entering a number with two decimals.");
                        }
                    }
                    Drink d = new Drink(name, size, description, calories, price);
                    drinksList.add(d);
                }
                else{
                    System.out.println("Invalid Entry. Please enter food or drink.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Add another item? (Yes or no) ");
            scnr.nextLine();
            String addMoreorNot = scnr.nextLine();
            if (addMoreorNot.equalsIgnoreCase("no")){
                System.out.println("Creating menu...\n");
                enterNewItems = false;
            }
        }
        for (Food food : foodsList){
            if (food.getType().equals("entree")){
                entreesList.add(food);
            }
            if (food.getType().equals("side")){
                sidesList.add(food);
            }
            if (food.getType().equals("appetizer")){
                appetizersList.add(food);
            }
            if (food.getType().equals("dessert")){
                dessertsList.add(food);
            }
            if (food.getType().equals("kids menu")){
                kidsMenuList.add(food);
            }
        }
        /*for (Food food : foodsList){
            System.out.println(food);
        }
        for (Drink drink : drinksList){
            System.out.println(drink);
        }*/

        try{
            FileOutputStream fs = new FileOutputStream("menu.txt");
            PrintWriter pw = new PrintWriter(fs);

            pw.write(restaurantName + "\n\n");
            if (!appetizersList.isEmpty()){
                pw.write("\nAppetizers:  \n\n");
                for (Food food : appetizersList){
                    pw.write(food.toString());
                }
            }
            if (!entreesList.isEmpty()){
                pw.write("\nEntrees:  \n\n");
                for (Food food : entreesList){
                    pw.write(food.toString());
                }
            }
            if (!sidesList.isEmpty()){
                pw.write("\nSides:  \n\n");
                for (Food food : sidesList){
                    pw.write(food.toString());
                }
            }
            if (!dessertsList.isEmpty()){
                pw.write("\nDesserts:  \n\n");
                for (Food food : dessertsList){
                    pw.write(food.toString());
                }
            }
            if (!kidsMenuList.isEmpty()){
                pw.write("\nKids Menu:  \n\n");
                for (Food food : kidsMenuList){
                    pw.write(food.toString());
                }
            }
            if (!drinksList.isEmpty()){
                pw.write("\nDrinks:  \n\n");
                for(Drink drink : drinksList){
                    pw.write(drink.toString());
                }
            }
            pw.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        System.out.println("Menu created.");
    }
}