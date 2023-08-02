package machine.regular;

public class Summary {

    private int nFCCount; // This variable holds the number of times Fish Cakes were bought
    private int nAjiCount; // This variable holds the number of times Aji was bought
    private int nFTCount; // This variable holds the number of times Fried Tofu was bought
    private int nTCount; // This variable holds the number of times Tamago was bought
    private int nCoffeeCount; // This variable holds the number of times Coffee was bought
    private int nWCount; // This variable holds the number of times Water was bought
    private int nJCount; // This variable holds the number of times Juice was bought
    private int nCandyCount; // This variable holds the number of times Candies were bought

    /*
     * This constructor initializes the variables in the Summary class
     * Precondition: none
     * 
     * @return: none
     */
    public Summary() {
        this.nFCCount = nFCCount;
        this.nAjiCount = nAjiCount;
        this.nFTCount = nFTCount;
        this.nTCount = nTCount;
        this.nCoffeeCount = nCoffeeCount;
        this.nWCount = nWCount;
        this.nJCount = nJCount;
        this.nCandyCount = nCandyCount;
    }

    /*
     * This method prints out the summary of what the user bought in the Vending
     * Machine
     * Precondition: none
     * 
     * @param: (Double nMoney)
     * 
     * @return: none
     */
    public void summaryList() {

        System.out.println("\n\n\t\tYOU HAVE BOUGHT\n");

        if (getFCCount() > 0)
            System.out.println("\t\tFish Cake " + getFCCount() + "x");

        if (getAjiCount() > 0)
            System.out.println("\t\tAji " + getAjiCount() + "x");

        if (getFTCount() > 0)
            System.out.println("\t\tFried Tofu " + getFTCount() + "x");

        if (getTCount() > 0)
            System.out.println("\t\tTamago " + getTCount() + "x");

        if (getCoffeeCount() > 0)
            System.out.println("\t\tCoffee " + getCoffeeCount() + "x");

        if (getWCount() > 0)
            System.out.println("\t\tWater " + getWCount() + "x");

        if (getJCount() > 0)
            System.out.println("\t\tJuice " + getJCount() + "x");

        if (getCandyCount() > 0)
            System.out.println("\t\tCandies " + getCandyCount() + "x");

    }

    /*
     * This method allows the vending machine to update the item count after every
     * purchase
     * Precondition: none
     * 
     * @param: (String itemName) - The name of the item bought
     * 
     * @return: none
     */
    public void updateItemCount(String itemName) {
        switch (itemName.toUpperCase()) {
            case "FISH CAKE":
                nFCCount++;
                break;
            case "AJI":
                nAjiCount++;
                break;
            case "FRIED TOFU":
                nFTCount++;
                break;
            case "TAMAGO":
                nTCount++;
                break;
            case "COFFEE":
                nCoffeeCount++;
                break;
            case "WATER":
                nWCount++;
                break;
            case "JUICE":
                nJCount++;
                break;
            case "CANDIES":
                nCandyCount++;
                break;
            default:
                break;
        }
    }

    /*
     * This method is a Getter and it gets nFCCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getFCCount() {
        return nFCCount;
    }

    /*
     * This method is a Setter and it initializes nFCCount
     * Precondition: none
     * 
     * @param: (int nFCCount)
     * 
     * @return: none
     */
    public void setFCCount(int nFCCount) {
        this.nFCCount = nFCCount;
    }

    /*
     * This method is a Getter and it gets nAjiCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getAjiCount() {
        return nAjiCount;
    }

    /*
     * This method is a Setter and it initializes nAjiCount
     * Precondition: none
     * 
     * @param: (int nAjiCount)
     * 
     * @return: none
     */
    public void setAjiCount(int nAjiCount) {
        this.nAjiCount = nAjiCount;
    }

    /*
     * This method is a Getter and it gets nFCCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getFTCount() {
        return nFTCount;
    }

    /*
     * This method is a Setter and it initializes nFCCount
     * Precondition: none
     * 
     * @param: (int nFCCount)
     * 
     * @return: none
     */
    public void setFTCount(int nFTCount) {
        this.nFTCount = nFTCount;
    }

    /*
     * This method is a Getter and it gets nTCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getTCount() {
        return nTCount;
    }

    /*
     * This method is a Setter and it initializes nTCount
     * Precondition: none
     * 
     * @param: (int nTCount)
     * 
     * @return: none
     */
    public void setTCount(int nTCount) {
        this.nTCount = nTCount;
    }

    /*
     * This method is a Getter and it gets nCoffeeCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getCoffeeCount() {
        return nCoffeeCount;
    }

    /*
     * This method is a Setter and it initializes nCoffeeCount
     * Precondition: none
     * 
     * @param: (int nCoffeeCount)
     * 
     * @return: none
     */
    public void setCoffeeCount(int nCoffeeCount) {
        this.nCoffeeCount = nCoffeeCount;
    }

    /*
     * This method is a Getter and it gets nWCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getWCount() {
        return nWCount;
    }

    /*
     * This method is a Setter and it initializes nWCount
     * Precondition: none
     * 
     * @param: (int nWCount)
     * 
     * @return: none
     */
    public void setWCount(int nWCount) {
        this.nWCount = nWCount;
    }

    /*
     * This method is a Getter and it gets nJCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getJCount() {
        return nJCount;
    }

    /*
     * This method is a Setter and it initializes nJCount
     * Precondition: none
     * 
     * @param: (int nJCount)
     * 
     * @return: none
     */
    public void setJCount(int nJCount) {
        this.nJCount = nJCount;
    }

    /*
     * This method is a Getter and it gets nCandyCount
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getCandyCount() {
        return nCandyCount;
    }

    /*
     * This method is a Setter and it initializes nCandyCount
     * Precondition: none
     * 
     * @param: (int nCandyCount)
     * 
     * @return: none
     */
    public void setCandyCount(int nCandyCount) {
        this.nCandyCount = nCandyCount;
    }
}