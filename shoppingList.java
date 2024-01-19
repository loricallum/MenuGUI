import java.util.ArrayList;

public class shoppingList {

    private ArrayList<String> shoppingList;

    // Constructor to initialise the shoppingList as a new ArrayList. Add a ArrayList class called shoppingList (a collection of Strings) as an attribute of the Shopping class.
    public shoppingList() {
        shoppingList = new ArrayList<>();
    }

    // Method to add an item to the shopping list
    public void addItem(String item) {
        shoppingList.add(item);
        System.out.println(item + " added to the shopping list.");
    }

    // Method to return the number of items on the list
    public int numberOfItems() {
        return shoppingList.size();
    }

    // Method to display an item at a given index
    public void showItem(int index) {
        if (index >= 0 && index < shoppingList.size()) {
            System.out.println("Item at index " + index + ": " + shoppingList.get(index));
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (shoppingList.size() - 1));
        }
    }

    // Method to display all items in the shopping list
    public void listItems() {
        System.out.println("Shopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    public static void main(String[] args) {
        // Create a Shopping object
        shoppingList myShopping = new shoppingList();

        // Add some items to the shopping list
        myShopping.addItem("Oat Milk");
        myShopping.addItem("Bread");
        myShopping.addItem("Eggs");
        myShopping.addItem("Foil");
        myShopping.addItem("Duck Breast");
        myShopping.addItem("Onion");

        // Test the methods
        System.out.println("Number of items: " + myShopping.numberOfItems());
        myShopping.listItems();
        myShopping.showItem(1);
    }
}