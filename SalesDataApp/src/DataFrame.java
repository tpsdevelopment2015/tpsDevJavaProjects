//imports the libraries needed 

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Tim
 */
public class DataFrame extends JFrame {

    // declaration of class variables

    private JLabel lblRepID, lblFirstName, lblLastName, lblTotalSupplies, lblTotalBooks, lblTotalPaper;
    private JTextField txtFRepID, txtFFirstName, txtFLastName, txtFTotalSupplies, txtFTotalBooks, txtFTotalPaper;
    private JRadioButton rBtnNorth, rBtnSouth, rBtnEast, rBtnWest, rBtnPhone, rBtnEmail, rBtnVisit;
    private JTextArea tADisplayArea;
    private ButtonGroup radioBtnGroup1, radioBtnGroup2;
    private JButton enterBtn, quitBtn, evaluateBtn, displayBtn;
    private String repID, firstName, lastName, totalSupplies, totalBooks, totalPaper, salesDistrict, meansOfContact;
    private String myFile = "salesrep.txt";
    // the following set of variables are used to read into and output to the stars.txt file
    private int id;
    private String fName, lName, district, contact, supplyLabel, booksLabel, paperLabel, starsFile = "stars.txt";
    private double supplies, books, paper;

    //class DataFrame constructor
    public DataFrame() {
        //calls the super constructor
        super("Sales Data Application");
        setLayout(new FlowLayout());//setsthe layout 

        //the following creates and adds the label and text field to the JFrame
        lblRepID = new JLabel("Sales Rep ID");
        add(lblRepID);
        txtFRepID = new JTextField(10);
        add(txtFRepID);

        //the following creates and adds the label and text field to the JFrame
        lblFirstName = new JLabel("First Name");
        add(lblFirstName);
        txtFFirstName = new JTextField(10);
        add(txtFFirstName);

        //the following creates and adds the label and text field to the JFrame
        lblLastName = new JLabel("Last Name");
        add(lblLastName);
        txtFLastName = new JTextField(10);
        add(txtFLastName);

        //the following creates and adds the label and text field to the JFrame
        lblTotalSupplies = new JLabel("Total Supplies");
        add(lblTotalSupplies);
        txtFTotalSupplies = new JTextField(10);
        add(txtFTotalSupplies);

        //the following creates and adds the label and text field to the JFrame
        lblTotalBooks = new JLabel("Total Books");
        add(lblTotalBooks);
        txtFTotalBooks = new JTextField(10);
        add(txtFTotalBooks);

        //the following creates and adds the label and text field to the JFrame
        lblTotalPaper = new JLabel("Total Paper");
        add(lblTotalPaper);
        txtFTotalPaper = new JTextField(10);
        add(txtFTotalPaper);

        //the following creates and adds radio buttons to the JFrame
        rBtnNorth = new JRadioButton("North", true);
        rBtnSouth = new JRadioButton("South", false);
        rBtnEast = new JRadioButton("East", false);
        rBtnWest = new JRadioButton("West", false);
        add(rBtnNorth);
        add(rBtnSouth);
        add(rBtnEast);
        add(rBtnWest);

        // the following creates and adds the radio buttons to a button group
        radioBtnGroup1 = new ButtonGroup();
        radioBtnGroup1.add(rBtnNorth);
        radioBtnGroup1.add(rBtnSouth);
        radioBtnGroup1.add(rBtnEast);
        radioBtnGroup1.add(rBtnWest);

        //the following creates and adds radio buttons to the JFrame
        rBtnPhone = new JRadioButton("Phone", true);
        rBtnEmail = new JRadioButton("Email", false);
        rBtnVisit = new JRadioButton("Visit", false);
        add(rBtnPhone);
        add(rBtnEmail);
        add(rBtnVisit);

        // the following creates and adds the radio buttons to a button group
        radioBtnGroup2 = new ButtonGroup();
        radioBtnGroup2.add(rBtnPhone);
        radioBtnGroup2.add(rBtnEmail);
        radioBtnGroup2.add(rBtnVisit);

        // the following create and adds a text area and scroll pane to the JFrame           
        tADisplayArea = new JTextArea(23, 21);
        JScrollPane sp = new JScrollPane(tADisplayArea);
        add(sp);

        // the following creates and adds command buttons/Jbuttons to the JFrame
        displayBtn = new JButton("Display");
        quitBtn = new JButton("Quit");
        enterBtn = new JButton("Enter");
        evaluateBtn = new JButton("Evaluate");
        add(displayBtn);
        add(evaluateBtn);
        add(quitBtn);
        add(enterBtn);

        //creates an object of the QuitButtonHandler inner class
        DisplayButtonHandler displayBtnObj = new DisplayButtonHandler();
        //adds an action listener to the quit command button
        displayBtn.addActionListener(displayBtnObj);

        //creates an object of the EvaluateButtonHandler inner class
        EvaluateButtonHandler evaluateBtnObj = new EvaluateButtonHandler();
        //adds an action listener to the evaluate command button
        evaluateBtn.addActionListener(evaluateBtnObj);

        //creates an object of the QuitButtonHandler inner class
        QuitButtonHandler quitBtnObj = new QuitButtonHandler();
        //adds an action listener to the quit command button
        quitBtn.addActionListener(quitBtnObj);

        //creates and object of the EnterButtonHandler inner class
        EnterButtonHandler enterBtnObj = new EnterButtonHandler();
        //adds an action listener to the enter command button
        enterBtn.addActionListener(enterBtnObj);

    }//end constructor DataFrame

    //class to handle the quit button event
    public class DisplayButtonHandler implements ActionListener {

        /**
         *
         * @param event
         */
        @Override
        //event handler for the quit button
        public void actionPerformed(ActionEvent event) {
            //declare variables and ArrayList
            //count will keep track of how many star rep objects are added to the ArrayList
            int count = 0;
            ArrayList myStarsArrayList = new ArrayList();
            //************READ FROM FILE, ASSIGN TOKENS TO VARIABLES, CREATES AND ADDS OBJECTS TO ARRAYlIST**************
            try {
                //creates the file reader and opens the previous file
                FileReader fileReader = new FileReader(starsFile);
                //creates the bufferedReader object and uses fileReader object to read from
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                //this will clear the text area everytime Evaluate is clicked. only the exact file contents will be displayed
                tADisplayArea.setText("");

                //the following creates the variable nextLine
                String nextLine;

                //as long as the nextLine is not null then the bufferedReader will print out the next line
                while ((nextLine = bufferedReader.readLine()) != null) {

                    //creates the tokenizer to seperate incoming data from stars.txt in order to evaluate 
                    StringTokenizer tokenizer = new StringTokenizer(nextLine);
                    while (tokenizer.hasMoreTokens()) {
                        //the following separates the incoming string and assigns and parses them to variables
                        id = Integer.parseInt(tokenizer.nextToken());
                        fName = tokenizer.nextToken();
                        lName = tokenizer.nextToken();
                        supplyLabel = tokenizer.nextToken();
                        supplies = Double.parseDouble(tokenizer.nextToken());
                        booksLabel = tokenizer.nextToken();
                        books = Double.parseDouble(tokenizer.nextToken());
                        paperLabel = tokenizer.nextToken();
                        paper = Double.parseDouble(tokenizer.nextToken());
                        district = tokenizer.nextToken();
                        contact = tokenizer.nextToken();
                        //instantiate the SalesRepStars object and pass variables to constructor
                        SalesRepStars starRepObj = new SalesRepStars(id, fName, lName, supplies, books, paper, district, contact);
                        //add the constructed object to the ArrayList
                        myStarsArrayList.add(starRepObj);
                        // increment the count variable to keep track of how many Star Reps are added to the ArrayList
                        count++;
                    }//end inner while 

                }//end while loop
                
                // displays the total number of star sales reps in the stars.txt file in the text area
                tADisplayArea.append("TOTAL SALES REPRESENTATIVES: " + count + "\n\n");
                //iterate throught the ArrayList and display they object in the text area
                for (int i = 0; i < myStarsArrayList.size(); i++) {
                    tADisplayArea.append(myStarsArrayList.get(i).toString());
                }//end for loop

                //close the buffer and file readers
                bufferedReader.close();
                fileReader.close();
            }//end try
            //catches the exception
            catch (IOException ex) {
                //closes the application
                System.exit(0);
            }//end catch
            //catches the number format exception
            catch (NumberFormatException exception) {
                System.out.println("Error");
            }//end catch

        }//end actionPerformed

    }//end class DisplayButtonHandler       

    //class to handle the evaluate button event
    public class EvaluateButtonHandler implements ActionListener {

        /**
         *
         * @param event
         */
        @Override
        //event handler for the evaluate button
        public void actionPerformed(ActionEvent event) {
            //************READ FROM FILE, PRINT TO TEXT AREA, AND EVALUETES FOR OUTPUT TO THE STARS FILE**************
            try {
                //creates the file reader and opens the previous file
                FileReader fileReader = new FileReader(myFile);
                //creates the bufferedReader object and uses fileReader object to read from
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                //this will clear the text area everytime Evaluate is clicked. only the exact file contents will be displayed
                tADisplayArea.setText("");
                //the following creates the variable nextLine
                String nextLine;

                //the following creates the stars.txt file and the Writers to write to it
                File starsFile = new File("stars.txt");
                FileWriter fileWriter2 = new FileWriter(starsFile);
                BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                //as long as the nextLine is not null then the bufferedReader will print out the next line
                while ((nextLine = bufferedReader.readLine()) != null) {
                    tADisplayArea.append(nextLine + "\n");

                    //creates the tokenizer to seperate incoming data from salesrep.txt in order to evaluate 
                    StringTokenizer tokenizer = new StringTokenizer(nextLine);

                    //the following separates the incoming string and assigns and parses them to variables
                    id = Integer.parseInt(tokenizer.nextToken());
                    fName = tokenizer.nextToken();
                    lName = tokenizer.nextToken();
                    supplyLabel = tokenizer.nextToken();
                    supplies = Double.parseDouble(tokenizer.nextToken());
                    booksLabel = tokenizer.nextToken();
                    books = Double.parseDouble(tokenizer.nextToken());
                    paperLabel = tokenizer.nextToken();
                    paper = Double.parseDouble(tokenizer.nextToken());
                    district = tokenizer.nextToken();
                    contact = tokenizer.nextToken();
                    //calculates the sum and assigns value to total
                    double total = supplies + books + paper;
                    //tests if total is greater than or equal to 8000; if so writes data to stars.txt
                    if (total >= 8000) {

                        bufferedWriter2.write(id + " " + fName + " " + lName + " " + supplyLabel + " "
                                + supplies + " " + booksLabel + " " + books + " "
                                + paperLabel + " " + paper + " " + district + " " + contact + "\n\n");

                    }//end if

                }//end while loop

                //closes the buffered writers for stars.txt
                bufferedWriter2.close();
                fileWriter2.close();
                //close the buffer and file readers
                bufferedReader.close();
                fileReader.close();
            }//end try
            //catches the exception
            catch (IOException ex) {
                //closes the application
                System.exit(0);
            }//end catch
            //catches the number format exception
            catch (NumberFormatException exception) {
                System.out.println("Error");
            }//end catch

        }//end actionPerformed

    }//end class QuitButtonHandler       

    //class to handle the quit button event
    public class QuitButtonHandler implements ActionListener {

        /**
         *
         * @param event
         */
        @Override
        //event handler for the quit button
        public void actionPerformed(ActionEvent event) {

            System.exit(0);
        }//end actionPerformed

    }//end class QuitButtonHandler       

    //class to handle the enter button
    public class EnterButtonHandler implements ActionListener {

        /**
         *
         * @param event
         */
        @Override
        // event handler for the enter button
        public void actionPerformed(ActionEvent event) {
            //the following gets the text field values and stores them in variables
            repID = txtFRepID.getText();
            firstName = txtFFirstName.getText();
            lastName = txtFLastName.getText();
            totalSupplies = txtFTotalSupplies.getText();
            totalBooks = txtFTotalBooks.getText();
            totalPaper = txtFTotalPaper.getText();

            // the following test if a group radio button is selected; if selected sets the value of salesDistrict 
            if (rBtnNorth.isSelected()) {
                salesDistrict = "NORTH";
            } else if (rBtnSouth.isSelected()) {
                salesDistrict = "SOUTH";
            } else if (rBtnEast.isSelected()) {
                salesDistrict = "EAST";
            } else if (rBtnWest.isSelected()) {
                salesDistrict = "WEST";
            }

            // the following test if a group radio button is selected; if selected sets the value of meansOfContact 
            if (rBtnPhone.isSelected()) {
                meansOfContact = "Phone";
            } else if (rBtnEmail.isSelected()) {
                meansOfContact = "Email";
            } else if (rBtnVisit.isSelected()) {
                meansOfContact = "Visit";
            }

            //***********Print user entered data to salesrep.txt file************
            try {
                     //create the FileWriter and BufferedWriter objects and name the file to be written to.
                //opens the file                     
                File myFile = new File("salesrep.txt");
                FileWriter fileWriter = new FileWriter(myFile, true);//true allows for appending
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                //concatenates variables into one line of data input to file
                bufferedWriter.write(repID + " " + firstName + " " + lastName + " SUPPLIES " + totalSupplies + " BOOKS " + totalBooks + " PAPER " + totalPaper
                        + " " + salesDistrict + " " + meansOfContact + "\n");
                //closes the buffered and file writers
                bufferedWriter.close();
                fileWriter.close();

            }//end try
            // catches the exception
            catch (IOException ex) {
                //closed the application
                System.exit(0);
            }//end catch

        }//end actionPerformed

    }//end class ButtonHandler   

}//end class DataFrame

