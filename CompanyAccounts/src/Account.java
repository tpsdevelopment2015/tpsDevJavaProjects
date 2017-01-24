

/**
 *
 * @author tpaulson
 */

//an abstract super class to be extended by subclasses 
public abstract class Account
{

        //declaration of class variables 
        protected int accountID;

        //no-arg constructor
        public Account()
        {

        }

        //Constructor
        public Account(int accountID)
        {
                this.accountID = accountID;
        }//end constructor

        //sets the accountID
        public void setaccountID(int accountID)
        {
                this.accountID = accountID;
        }//end setaccountID()

        //gets the accountID
        public int getaccountID()
        {
                return accountID;
        }//end getaccountID()
        // and abstract method that is defined in all classes that extend class Account
        public abstract double computeSales();

        //overrides the object class toString()
        @Override
        public String toString()
        {
                return String.format("%s%s\n", "Account ID: ", accountID);
        }//end toString()

}//end class Account

