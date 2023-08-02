package machine.regular;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> aItems;

    /*
     * This constructor initializes the aItems array
     * Precondition: none
     * 
     * @return: none
     */
    public Inventory() {
        this.aItems = new ArrayList<Item>();
        initializeItems(); // Call a method to initialize items in the inventory
    }

    /*
     * This method can add items to the vending machine
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    private void initializeItems() {
        aItems.add(new Item("FISH CAKE", 150.0, 10));
        aItems.add(new Item("AJI", 125.0, 10));
        aItems.add(new Item("FRIED TOFU", 100.0, 10));
        aItems.add(new Item("TAMAGO", 75.0, 10));
        aItems.add(new Item("COFFEE", 50.0, 10));
        aItems.add(new Item("WATER", 25.0, 10));
        aItems.add(new Item("JUICE", 30.0, 10));
        aItems.add(new Item("CANDIES", 15.0, 10));
    }

    /*
     * This method is a Getter. It gets the array of getItems
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public ArrayList<Item> getItems() {
        return aItems;
    }

    /*
     * This shows the Calorie Count of the Items
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void calorieCheck() {
        System.out.println("\n\t\t\t\t\tCALORIES\n");
        System.out.println("\t\t[1]FISH CAKE (250 Kcal)" + "\t\t[2]AJI (179 Kcal)");
        System.out.println("\t\t[3]TAMAGO (120 Kcal)" + "\t\t[4]FRIED TOFU (110 Kcal)");
        System.out.println("\t\t[5]COFFEE (40 Kcal)" + "\t\t[6]WATER (0 Kcal)");
        System.out.println("\t\t[7]JUICE (210 Kcal)" + "\t\t[8]CANDIES (65 Kcal)\n\n");
    }
}
