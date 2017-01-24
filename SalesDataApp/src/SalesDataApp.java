//PURPOSE:  The purpose of this application is to gather sales rep sales data and display and evaluate it.

//imports the JFrame library
import javax.swing.JFrame;

/**
 *
 * @author Tim Paulson
 */
public class SalesDataApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates and instance of class DataFrame
        DataFrame dataFrame = new DataFrame();
        //allows the user to close the app when clicking the red X
        dataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the size of the JFrame
        dataFrame.setSize(260, 690);
        //sets the visibility of the JFrame
        dataFrame.setVisible(true);

    }//end main()

}//end class SalesDataApp
