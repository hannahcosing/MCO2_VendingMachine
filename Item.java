package machine.regular;

public class Item {

    private String strItemName; // holds the name of the item
    private double dPrice; // holds the price of the item
    private int nAvailableCount; // holds how many of these types of items are available

    public Item(String strItemName, double dPrice, int nAvailableCount) {
        this.strItemName = strItemName;
        this.dPrice = dPrice;
        this.nAvailableCount = nAvailableCount;
    }

    /*
     * This method is a Getter and it gets strItemName
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public String getName() {
        return strItemName;
    }

    /*
     * This method is a Getter and it gets dPrice
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public double getPrice() {
        return dPrice;
    }

    /*
     * This method is a Getter and it gets nAvailableCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getAvailableCount() {
        return nAvailableCount;
    }

    /*
     * This method is a Setter and it sets nAvailableCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void setAvailableCount(int nAvailableCount) {
        this.nAvailableCount = nAvailableCount;
    }
}
