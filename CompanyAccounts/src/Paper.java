
import java.text.NumberFormat;


/**
 *
 * @author tpaulson
 */
public class Paper extends Account
{

        //declaration of variables
        private static double lbsOfPaper;
        private static double pricePerLbs;
        private static double totalPaperSold;

        //constructor 
        public Paper(int accountID, double lbsOfPaper, double pricePerLbs)
        {
                super(accountID);
                setlbsOfPaper(lbsOfPaper);
                setpricePerLbs(pricePerLbs);
                
        }//end constructor
        //set and get methods for class variables
        public static void setlbsOfPaper(double lbsOfPaper)
        {
                Paper.lbsOfPaper = lbsOfPaper;
        }

        public static double getlbsOfPaper()
        {
                return lbsOfPaper;
        }

        public static void setpricePerLbs(double pricePerLbs)
        {
                Paper.pricePerLbs = pricePerLbs;
        }

        public static double getpricePerLbs()
        {
                return pricePerLbs;
        }

        public static void settotalPaperSold()
        {
                totalPaperSold = totalPaperSold + (getpricePerLbs() * getlbsOfPaper());
        }

        public static double gettotalPaperSold()
        {
                return totalPaperSold;
        }

        //calculates the total paper sold. overrrides the super class method
        @Override
        public double computeSales()
        {

                return totalPaperSold;
        }//end overridden computeSales()
        //toString() overrides the Object class toString()
        @Override
        public String toString()
        {
                //formatter converts double to currency output
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                return super.toString()
                        + String.format("%s: %s", "Current Paper account sales total", formatter.format(totalPaperSold));

        }//end toString()

} //end class Paper

