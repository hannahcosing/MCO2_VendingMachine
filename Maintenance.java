package machine.regular;

import java.util.Scanner;

public class Maintenance {

    MainVendingMachine mvm = new MainVendingMachine();
    Transaction transactions = new Transaction();

    /*
     * This method allows the items to be restocked by the user. The items to be
     * restocked depends on the user.
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void chooseRestock(Inventory inventory) {

        Scanner sc1 = new Scanner(System.in);
        int nChoice = 0;

        while (nChoice != 10) {

            System.out.println("\n\t\tWhat Item/s will you restock?\n");
            System.out.println("\t\t[1] Fish Cake");
            System.out.println("\t\t[2] Aji");
            System.out.println("\t\t[3] Tamago");
            System.out.println("\t\t[4] Fried Tofu");
            System.out.println("\t\t[5] Coffee");
            System.out.println("\t\t[6] Water");
            System.out.println("\t\t[7] Juice");
            System.out.println("\t\t[8] Candies");
            System.out.println("\t\t[9] Collect Vending Machine Money");
            System.out.println("\t\t[10] EXIT");
            System.out.print("\t\t[OPTION]: ");

            nChoice = sc1.nextInt();

            if (nChoice >= 1 && nChoice <= 8)
                restockItem(inventory, nChoice);
            else if (nChoice == 9) {
                System.out.println("You have collected: " + transactions.getTotalProfit());
                transactions.collectTotalProfit(mvm);
            } else if (nChoice == 10)
                break;
            else
                System.out.println("\t\t[INVALID INPUT TRY AGAIN]");
        }
    }

    /*
     * This method sets the availablecount of an item to 10
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    private void restockItem(Inventory inventory, int choice) {

        String strItemName;

        switch (choice) {
            case 1:
                strItemName = "FISH CAKE";
                break;
            case 2:
                strItemName = "AJI";
                break;
            case 3:
                strItemName = "TAMAGO";
                break;
            case 4:
                strItemName = "FRIED TOFU";
                break;
            case 5:
                strItemName = "COFFEE";
                break;
            case 6:
                strItemName = "WATER";
                break;
            case 7:
                strItemName = "JUICE";
                break;
            case 8:
                strItemName = "CANDIES";
                break;
            default:
                System.out.println("\t\t[INVALID INPUT TRY AGAIN]");
                return;
        }

        for (Item item : inventory.getItems()) {
            if (item.getName().equalsIgnoreCase(strItemName)) {
                item.setAvailableCount(10);
                System.out.println("\n\t\t" + item.getName() + " have been restocked!");
                return;
            }
        }

        System.out.println("Item not found in inventory.");
    }
}
