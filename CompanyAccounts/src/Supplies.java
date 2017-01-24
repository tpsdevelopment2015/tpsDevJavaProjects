
import java.text.NumberFormat;



/**
 *
 * @author Tim
 */
public class Supplies extends Account
{

        //declaration of class variables
        private static double totalSold;
        private static double totalOfficeSuppliesSold;
        private static double totalBooksSold;
        private static double totalApparelSold;

        //Supplies class constructor.  accountID inherited from superclass
        public Supplies(int accountID, double totalOfficeSuppliesSold, double totalBooksSold,
                double totalApparelSold)
        {

                super(accountID);
                settotalOfficeSuppliesSold(totalOfficeSuppliesSold);
                settotalBooksSold(totalBooksSold);
                settotalApparelSold(totalApparelSold);
        }//end constructor
        //set and get methods for class variables

        public static void settotalOfficeSuppliesSold(double totalOfficeSuppliesSold)
        {
                Supplies.totalOfficeSuppliesSold = Supplies.totalOfficeSuppliesSold + totalOfficeSuppliesSold;
        }

        public static double gettotalOfficeSuppliesSold()
        {
                return totalOfficeSuppliesSold;
        }

        public static void settotalBooksSold(double totalBooksSold)
        {
                Supplies.totalBooksSold = Supplies.totalBooksSold + totalBooksSold;
        }

        public static double gettotalBooksSold()
        {
                return totalBooksSold;
        }

        public static void settotalApparelSold(double totalApparelSold)
        {
                Supplies.totalApparelSold = Supplies.totalApparelSold + totalApparelSold;
        }

        public static double gettotalApparelSold()
        {
                return totalApparelSold;
        }

        // calculates the total supplies sold
        @Override
        public double computeSales()
        {
                
                totalSold = gettotalOfficeSuppliesSold() + gettotalBooksSold() + gettotalApparelSold();
                return totalSold;
        }

        public static double gettotalSuppliesSold()
        {
                totalSold = gettotalOfficeSuppliesSold() + gettotalBooksSold() + gettotalApparelSold();
                return totalSold;
        }

        /**
         *
         * @return
         */
        // //toString() overrides the Object class toString()
        @Override
        public String toString()
        {
                //formatter converts double to currency output
                NumberFormat formatter = NumberFormat.getCurrencyInstance();                
                return super.toString()
                        + String.format("%s: %s", "Current Supplies account sales total", formatter.format(totalSold));

        }

}//end class Supplies

