package machine.regular;

import java.util.Scanner;

public class MainVendingMachine {

    private Double dMoney;
    private int nChoice;

    private Inventory inventory;
    private Summary summary;
    private Transaction transactions;
    private Maintenance maintenance;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MainVendingMachine mvm = new MainVendingMachine();
        mvm.summary = new Summary(); // Initializes the Summary object
        mvm.transactions = new Transaction(); // Initializes Transactions
        mvm.maintenance = new Maintenance();

        do {
            System.out.print("\n\t\t[INSERT MONEY] : ");
            mvm.dMoney = sc.nextDouble();

            if (mvm.transactions.canGiveChange(mvm)) {

                mvm.displayItems();
                mvm.nChoice = sc.nextInt();

                if (mvm.nChoice >= 1 && mvm.nChoice <= mvm.inventory.getItems().size()) {

                    Item selectedItem = mvm.inventory.getItems().get(mvm.nChoice - 1);

                    if (selectedItem.getAvailableCount() > 0) {

                        if (mvm.dMoney >= selectedItem.getPrice()) {

                            mvm.transactions.processTransaction(selectedItem.getPrice(), mvm);
                            selectedItem.setAvailableCount(selectedItem.getAvailableCount() - 1);
                            mvm.summary.updateItemCount(selectedItem.getName());

                        } else {
                            System.out.println("Insufficient money to make the purchase.");
                        }
                    } else {
                        System.out.println("Sorry, " + selectedItem.getName() + " is out of stock.");
                    }
                } else if (mvm.nChoice == mvm.inventory.getItems().size() + 1) {
                    mvm.summary.summaryList();
                } else if (mvm.nChoice == mvm.inventory.getItems().size() + 2) {
                    mvm.maintenance.chooseRestock(mvm.inventory);
                } else if (mvm.nChoice == mvm.inventory.getItems().size() + 3) {
                    mvm.inventory.calorieCheck();
                } else if (mvm.nChoice == mvm.inventory.getItems().size() + 4) {
                    System.out.println("\n\n\t\tThank you for using the vending machine. Have a great day!");
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } else {
                System.out.println("Sorry, the vending machine cannot give change for the amount inserted.");
            }
        } while (true);

        sc.close();
    }

    /*
     * This constructor initializes the nChoice variable and the inventory
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public MainVendingMachine() {
        nChoice = 0;
        inventory = new Inventory();
    }

    /*
     * Displays the items in the vending machine
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void displayItems() {
        System.out.println("\n\n\t\tWelcome to the Vending Machine! Please choose an item: \n");
        int i = 1;
        for (Item item : inventory.getItems()) {
            System.out.println("\t\t[" + i + "] " + item.getName() + " (" + item.getPrice() + ") "
                    + "\n\t\tAvailable: " + item.getAvailableCount() + "\n");
            i++;
        }
        System.out.println("\t\t[9] Generate Sales Summary");
        System.out.println("\t\t[10] Enter Maintenance Mode");
        System.out.println("\t\t[11] Show Calories");
        System.out.println("\t\t[12] Exit");
        System.out.print("\t\tEnter your choice: ");
    }

    /*
     * This is a Getter method for nMoney
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: The amount of money inserted (nMoney)
     */
    public Double getMoney() {
        return dMoney;
    }
}
