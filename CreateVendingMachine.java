package machine.regular;

import java.util.Scanner;

public class CreateVendingMachine {

    private int nChoice;

    MainVendingMachine mvm = new MainVendingMachine();
    Scanner sc = new Scanner(System.in);

    /*
     * This constructor initializes nChoice
     * Precondition: none
     * 
     * @return: none
     */
    public CreateVendingMachine() {
        this.nChoice = 0;
    }

    /*
     * This method creates a text interface that allows the user to create a regular
     * or special vending machine
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public void run() {

        boolean bRunning = true;

        while (bRunning) {
            System.out.println("\n\t\tWELCOME TO THE VENDING MACHINE!\n");

            System.out.println("\t\t[1] Create Regular Vending Machine");
            System.out.println("\t\t[2] Create Special Vending Machine");
            System.out.println("\t\t[3] Exit");
            System.out.print("\t\t[OPTION]: ");

            nChoice = sc.nextInt();

            if (nChoice == 1)
                mvm.main(new String[0]);
            else if (nChoice == 2)
                System.out.println("Special Vending Machine option not implemented yet.");
            else if (nChoice == 3) {
                System.out.println("\t\tTHANK YOU FOR USING THE VENDING MACHINE!");
                bRunning = false;
            } else
                System.out.println("[INVALID OUTPUT! TRY AGAIN!]");
        }
        sc.close();
    }

    /*
     * This method is a getter and it gets nChoice
     * Precondition: none
     * 
     * @param: none
     * 
     * @return: none
     */
    public int getChoice() {
        return nChoice;
    }
}
