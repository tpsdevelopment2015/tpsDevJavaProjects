
import java.text.NumberFormat;



/**
 *
 * @author tpaulson
 */
public class Services extends Account
{

        //declaration of class variables
        private static double hours;
        private static double rate;
        private static double totalServices;

        //class constructor
        public Services(int accountID, double hours, double rate)
        {
                super(accountID);
                sethours(hours);
                setrate(rate);
        }//end constructor
        //get and set methods for all variables
        public static void sethours(double hours)
        {
                Services.hours = hours;
        }//end sethours()

        public static double gethours()
        {
                return hours;
        }//end gethours()

        public static void setrate(double rate)
        {
                Services.rate = rate;
        }//end sethours()

        public static double getrate()
        {
                return rate;
        }//end gethours()

        public static void settotalServices()
        {
                totalServices = totalServices + (getrate() * gethours());
        }

        public static double gettotalServices()
        {
                return totalServices;
        }

        //calculates the total services
        @Override
        public double computeSales()
        {

                return totalServices;
        }//end overridden computeSales()

        //toString() overrides the Object class toString()
        @Override
        public String toString()
        {
                //formatter converts double to currency output
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                return super.toString()
                        + String.format("%s: %s", "Current Services account sales total", formatter.format(totalServices));
        }//end toString()

}//end class Services
