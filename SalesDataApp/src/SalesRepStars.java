
import java.text.NumberFormat;

/**
 *
 * @author tpaulson
 */
public class SalesRepStars {

    //declaration of class variables

    private int id;
    private String fName, lName, district, contact, supplyLabel, booksLabel, paperLabel;
    private double supplies, books, paper;

        //constructor for this class
    /**
     *
     * @param Id
     * @param FName
     * @param LName
     * @param supply
     * @param book
     * @param Paper
     * @param District
     * @param Contact
     */
    public SalesRepStars(int Id, String FName, String LName, double supply, double book, double Paper, String District, String Contact) {

        id = Id;
        fName = FName;
        lName = LName;
        supplies = supply;
        books = book;
        paper = Paper;
        district = District;
        contact = Contact;

    }//end constructor

    public SalesRepStars() {
    }

        //*********The following set and get methods set and return the variables set in the constructor
    // the setters may not be used but are written for future use
    public void setID(int i) {
        id = i;
    }//end setID

    public int getID() {
        return id;
    }

    public void setFName(String f) {
        fName = f;
    }//end setFName

    public String getFName() {
        return fName;
    }

    public void setLName(String l) {
        lName = l;
    }//end setLName

    public String getLName() {
        return lName;
    }

    public void setSupplies(double s) {
        supplies = s;
    }//end setSupplies

    public double getSupplies() {
        return supplies;
    }

    public void setBooks(double b) {
        books = b;
    }//end setBooks

    public double getBooks() {
        return books;
    }

    public void setPaper(double p) {
        paper = p;
    }//end setPaper

    public double getPaper() {
        return paper;
    }

    public void setDistrict(String d) {
        district = d;
    }//end setFName

    public String getDistrict() {
        return district;
    }

    public void setContact(String c) {
        contact = c;
    }//end setFName

    public String getContact() {
        return contact;
    }

         //toString() overrides the Object class toString() to print the object as a string for display
    @Override
    public String toString() {
        //formatter converts double to currency output
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return String.format("%s %s %s \n%s: %s\n%s: %s\n%s: %s\n%s\n%s\n\n", id, fName, lName, "Supplies", formatter.format(supplies),
                "Books", formatter.format(books), "Paper", formatter.format(paper), district, contact);
    }//end toString()

        //formatter.format(totalServices)
}//end class
