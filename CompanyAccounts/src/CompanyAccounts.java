//Author:  Tim Paulson
//Class:  IT251  CTU online
//Program Purpose:  Allow user to enter sales data so that the company can keep a running total of 
//                      the current sales totals by account. the program also allow the user to 
//                      calculate and display current account totals as well as a yearly sales total
//                      for all accounts combined.

/**
 *
 * @author tpaulson
 */
//imports for exeption handeling and user input
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Tim
 */
public class CompanyAccounts {

    //declaration of class variables
    static int supAccountID = 1111, servAccountID = 2222, paperAccountID = 3333, choice;
    static double supplies, books, apparel, hours, rate, lbsOfPaper, pricePerLbs, yearlyTotal;
    static boolean answer = true;

    /**
     * @param args the command line arguments
     *
     */
    // the main method runs the program    
    public static void main(String[] args) {

        //IP4
        Scanner scan = new Scanner(System.in);

        //instantiates a Supplies object based on user input above
        Supplies suppliesAcct1 = new Supplies(supAccountID, supplies, books, apparel);
        //instantiates a Services object based on user input above     
        Services servicesAcct1 = new Services(servAccountID, hours, rate);
        //instantiates a Paper object based on user input above
        Paper paperAcct1 = new Paper(paperAccountID, lbsOfPaper, pricePerLbs);

        //welcomes user
        System.out.println("****WELCOME TO THE SALES DATA ENTRY PROGRAM****");

        System.out.println("");

        try// try block for exeption handeling
        {
            //while loop to keep displaying program menu
            while (answer) {

                //displays the program menu
                programMenu();

                choice = scan.nextInt();
                //switch statement for program menu choices
                switch (choice) {

                    case 1:     //gets supplies account sales data from user
                        getSuppliesAcctSalesData();
                        System.out.println("");
                        break;

                    case 2:     //gets Services account sales data from user
                        getServicesAcctSalesData();
                        System.out.println("");
                        break;

                    case 3:     //gets Paper account sales data from user
                        getPaperAcctSalesData();
                        System.out.println("");
                        break;

                    case 4:     //creates an array object accountArray of type Account
                        Account[] accountArray = new Account[3];
                        //assigns the suppliesAcct1 object created to index 0 of accountArray
                        accountArray[0] = suppliesAcct1;
                        //assigns the servicesAcct1 object created to index 1 of accountArray
                        accountArray[1] = servicesAcct1;
                        //assigns the paperAcct1 object created to index 2 of accountArray
                        accountArray[2] = paperAcct1;

                        System.out.println("****THE FOLLOWING DATA ARE THE CURRENT SALES TOTALS FOR EACH ACCOUNT TYPE****");
                        //the for loop calls the computeSales() method for i and prints the object contained in the i index.
                        for (int i = 0; i < 3; i++) {
                            accountArray[i].computeSales();
                            System.out.println(accountArray[i] + "\n");

                        }//end for loop
                        //the following calculates and displays the yearly total based on the current accoutn sales totals
                        yearlyTotal = Supplies.gettotalSuppliesSold() + Services.gettotalServices() + Paper.gettotalPaperSold();
                        //the formatter displays the yearlyTotal as Currency
                        NumberFormat formatter = NumberFormat.getCurrencyInstance();
                        System.out.println("****************************************");
                        System.out.println("****THE YEARLY SALES TOTAL IS:  " + formatter.format(yearlyTotal) + "****");
                        System.out.println("****************************************");
                        System.out.println("");

                        // create frame for Logo
                        JFrame frame = new JFrame("    ****YEARLY SALES****");
                     
                        Logo companyLogo = new Logo(); // create Logo
                        frame.add(companyLogo); // add companyLogo to frame
                        frame.setSize(400, 150); // set frame size
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true); // display frame
                        
                        

                        break;

                    case 5://exits the program
                        
                        answer = false;
                        System.out.println("****THE PROGRAM HAS NOW BEEN TERMINATED****");
                        System.out.println("");
                        System.exit(0);
                        break;

                    default:// this will dispaly if the user enters a number < 0 or > 5
                        System.out.println("");
                        System.out.println("*************************************");
                        System.out.println("****You must enter an number 1-5:****");
                        System.out.println("*************************************");
                        System.out.println("");
                        break;
                }//end switch

            }//end while

        }//end try 
        // the catch block catches the inputMismatchException and display the following.  program terminates
        catch (InputMismatchException e) {
            System.out.println("***********PROGRAM TERMINATED*************");
            System.out.println("****You must Enter a numeric value 1-5****");
            System.out.println("******************************************");

        }//end catch       

    }//end main()

        //****************This comment just breaks up the code so it can be read more easily***************************
    //*************************************************************************************************************
    //gets Supplies sales data from user
    public static void getSuppliesAcctSalesData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("****ENTER SUPPLIES ACCOUNT SALES DATA****");
        System.out.println("Please enter sales data for Supplies AccountID:  " + supAccountID);
        System.out.println("");
        System.out.println("Please enter the dollar amount of supplies sold: ");
        supplies = scan.nextDouble();
        System.out.println("Please enter the dollar amount of books sold: ");
        books = scan.nextDouble();
        System.out.println("Please enter the dollar amount of apparel sold: ");
        apparel = scan.nextDouble();

        Supplies.settotalOfficeSuppliesSold(supplies);
        Supplies.settotalBooksSold(books);
        Supplies.settotalApparelSold(apparel);

    }//end getSuppliesAcctSalesData()

    //gets Services sales data from user
    public static void getServicesAcctSalesData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("****ENTER SERVICES ACCOUNT SALES DATA****");
        System.out.println("Please enter sales data for Services AccountID:  " + servAccountID);
        System.out.println("");
        System.out.println("Please enter the number of service hours sold: ");
        hours = scan.nextDouble();
        System.out.println("Please enter the rate per hour: ");
        rate = scan.nextDouble();

        Services.sethours(hours);
        Services.setrate(rate);
        Services.settotalServices();
    }//end getServicesAcctSalesData()

    //gets paper account sales data from user
    public static void getPaperAcctSalesData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("****ENTER PAPER ACCOUNT SALES DATA****");
        System.out.println("Please enter sales data for Paper AccountID:  " + paperAccountID);
        System.out.println("");
        System.out.println("Please enter the lbs of paper sold: ");
        lbsOfPaper = scan.nextDouble();
        System.out.println("Please enter the price per lbs: ");
        pricePerLbs = scan.nextDouble();

        Paper.setlbsOfPaper(lbsOfPaper);
        Paper.setpricePerLbs(pricePerLbs);
        Paper.settotalPaperSold();
    }//end getPaperAcctSalesData()

    public static void programMenu() {
        System.out.println("****YOU MUST ENTER A NUMERIC VAULE");
        System.out.println("****Please choose an option below 1-5:");
        System.out.println("");
        System.out.println("         ****PROGRAM MENU****");
        System.out.println("1:  Enter Supplies Account sales data");
        System.out.println("2:  Enter Services Account sales data");
        System.out.println("3:  Enter Paper Account sales data");
        System.out.println("4:  Calculate & Display Account sales data summary");
        System.out.println("5:  EXIT Program");
        System.out.println("");
    }//end programMenu()

}//end class
