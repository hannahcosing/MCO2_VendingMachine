package machine.regular;

import java.util.ArrayList;

public class Transaction {
    private ArrayList<Double> aMachineChange; // This array variable holds the change of the Vending Machine in
                                              // denominations
    private Double dMoney; // Variable to store the amount of money inserted
    private Double dtotalProfit; // Variable to store the total profit of the vending machine

    /*
     * This constructor initializes the nMachineChange array list, aMachineChange,
     * and dTotalProfit
     * Precondition: none
     * 
     * @return: none
     */
    public Transaction() {
        this.aMachineChange = new ArrayList<>();
        this.dtotalProfit = 0.0;
        insertDenomination(500.0, 2); // 2x 500
        insertDenomination(200.0, 5); // 5x 200
        insertDenomination(100.0, 10); // 10x 100
        insertDenomination(50.0, 10); // 10x 50
        insertDenomination(20.0, 10); // 10x 20
        insertDenomination(10.0, 10); // 10x 10
        insertDenomination(5.0, 10); // 10x 5
        insertDenomination(1.0, 15); // 15x 1
    }

    /*
     * This method processes the transaction, deducts the item price from the money,
     * and gives change in denominations.
     * Precondition: The item with the given price is available and there is enough
     * money inserted.
     * 
     * @param: Double itemPrice: The price of the item being purchased
     * 
     * @return: none
     */
    public void processTransaction(Double itemPrice, MainVendingMachine mvm) {
        Double remainingMoney = mvm.getMoney() - itemPrice;
        Double totalChange = 0.0; // Initialize totalChange to 0.0

        if (remainingMoney >= 0) {
            System.out.println("\n\t\tPrice of the item: " + itemPrice);
            System.out.println("\t\tChange in denominations:");

            for (int i = 0; i < aMachineChange.size(); i += 2) {
                Double denomination = aMachineChange.get(i);
                Double availableQuantity = aMachineChange.get(i + 1);
                int changeCount = 0;

                while (remainingMoney >= denomination && availableQuantity > 0) {
                    remainingMoney -= denomination;
                    availableQuantity--;
                    changeCount++;
                    totalChange += denomination; // Accumulates the totalChange with the current denomination
                }

                if (changeCount > 0) {
                    System.out.println("\t\t" + changeCount + "x " + denomination);
                }
            }
            System.out.println("\t\tTotal Change: " + totalChange); // Print the totalChange
            // Update total profit
            dtotalProfit = dtotalProfit + itemPrice;
            dMoney = totalChange;
        } else {
            System.out.println("\t\tInsufficient money to make the purchase.");
        }
    }

    /*
     * This method inserts a denomination with the specified quantity into the
     * nMachineChange array
     * Precondition: none
     * 
     * @param: (Double denomination, int quantity)
     * 
     * @return: none
     */
    private void insertDenomination(Double denomination, int quantity) {
        for (int i = 0; i < quantity; i++) {
            aMachineChange.add(denomination);
            aMachineChange.add(1.0); // Quantity for the denomination (always 1)
        }
    }

    /*
     * This method checks if the money inserted can be given change by checking the
     * nMachineChange array
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: true/false
     */
    public boolean canGiveChange(MainVendingMachine mvm) {

        Double remainingChange = mvm.getMoney();

        for (int i = 0; i < aMachineChange.size(); i += 2) {
            Double denomination = aMachineChange.get(i);
            Double availableQuantity = aMachineChange.get(i + 1);

            while (remainingChange >= denomination && availableQuantity > 0) {
                remainingChange -= denomination;
                availableQuantity--;
            }

            if (remainingChange == 0.0) {
                return true;
            }
        }

        return false;
    }

    /*
     * This method is a Getter and it gets nMachineChange
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public ArrayList<Double> getMachineChange() {
        return aMachineChange;
    }

    /*
     * This method is a Getter and it gets the total profit of the vending machine
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: the total profit of the vending machine
     */
    public Double getTotalProfit() {
        return dtotalProfit;
    }

    /*
     * This method collects the total profit from the vending machine and resets the
     * profit back to zero.
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void collectTotalProfit(MainVendingMachine mvm) {
        System.out.println("You have collected: " + dtotalProfit);
        dtotalProfit = 0.0; // Reset the total profit to zero
    }
}
