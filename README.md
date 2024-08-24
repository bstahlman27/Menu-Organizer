Restaurant Menu Creator
This is a Java-based console application that allows users to create and manage a restaurant menu. The application adds food and drink items with various attributes like name, description, calories, and price. The menu is then saved to a text file (menu.txt).

Features
Item Categories: Supports adding food items categorized as entrees, sides, desserts, appetizers, and kids' menu. Drinks can also be added with customizable sizes.
Validation: Ensures valid input for all fields (e.g., name cannot be empty, calories must be an integer, and price must be a decimal number).
File Output: Automatically generates a formatted text file (menu.txt) containing the full menu organized by category.
Table of Contents
- Installation
- Usage
- Example Menu
- File Structure
- Contributing
- License
- Installation
- Clone the repository:

bash
Copy code
git clone https://github.com/bstahlman27/Menu-Organizer.git
cd Menu-Organizer
Compile the Java files:

bash
Copy code
javac Main.java Drink.java Food.java Item.java
Run the application:

bash
Copy code
java Main
Usage
Upon running the application, you'll be prompted to enter the restaurant's name and then add menu items (either food or drinks). Each item requires specific attributes:

Food: Name, type (entree, side, dessert, appetizer, kids menu), description, calories, and price.
Drink: Name, size (in oz.), description, calories, and price.
After adding items, you can choose to save the menu, which will be written to a file named menu.txt.

Example Menu
An example of what the generated menu file might look like:

Awesome's Restaurant

Appetizers:

Mozzarella Sticks
Crispy fried mozzarella cheese sticks.
Calories: 800
$5.99

Entrees:

Grilled Chicken Sandwich
A tender grilled chicken sandwich with lettuce, tomato, and mayo.
Calories: 600
$9.99

Drinks:

Lemonade, 12oz.
Freshly squeezed lemonade.
Calories: 120
$2.50

File Structure
Main.java: Contains the main method and the logic for user interaction.
Item.java: An abstract class representing a menu item (food or drink).
Food.java: Extends Item, represents a food item.
Drink.java: Extends Item, represents a drink item.
menu.txt: The output file where the generated menu is saved.

Contributing
Contributions and ideas are always welcome, especially if it's to help resolve some of those issues.

License
This project is licensed under the MIT License. See the LICENSE file for more details.
