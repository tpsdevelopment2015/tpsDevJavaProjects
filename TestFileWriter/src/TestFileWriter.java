/*
 Testing the FileWriter/Reader and BufferedWriter/Reader class

Purpose:  this program will create a text file, write two strings of data to the file and then read
          line by line from the file back to the command line. 
 */

/**
 *
 * @author tpaulson
 */
//import needed classes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TestFileWriter
{

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args)
        {
                int id;
                String fName, lName, district, contact,file2="stars.txt", line;
                double supplies, books, paper;
                StringTokenizer tokenizer;
                
                //********* THIS WILL BE UNDER THE ENTER BUTTON***************
                
                try//surround with try catch block to catch IOExeption ex
                {
                        //create the FileWriter object and name the file to be written to.
                        //opens the file
                        
                        File myFile = new File("testFile.txt");
                        FileWriter fileWriter = new FileWriter(myFile,true);//true allows for appending
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        
                        //the following adds each string of data to the file created
                        //notice the new line at the end of each string. \n
                        bufferedWriter.write("1001 Jennifer Ward 3140.20 5200.10 455.23 NORTH Phone\n");
                        bufferedWriter.write("1002 James Thomas 140.20 5200.10 455.23 NORTH Phone\n");
                        bufferedWriter.write("1002 George Thomas 3140.20 5200.10 455.23 NORTH Phone\n");
                        
                        bufferedWriter.close();
                        
                        //************   tokenizer   ***************************************
                        // make sure to declare incoming tokens as variables
                        //parse the incoming data
                        FileReader fileReader = new FileReader(myFile);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        
                        
                        while((line = bufferedReader.readLine()) != null){
                                
                                tokenizer = new StringTokenizer(line);
                                try{
                                        id = Integer.parseInt(tokenizer.nextToken());
                                        fName = tokenizer.nextToken();
                                        lName = tokenizer.nextToken();
                                        supplies = Double.parseDouble(tokenizer.nextToken());
                                        books = Double.parseDouble(tokenizer.nextToken());
                                        paper = Double.parseDouble(tokenizer.nextToken());
                                        district = tokenizer.nextToken();
                                        contact = tokenizer.nextToken();
                                        
                                        double total = supplies + books + paper;
                                        //********create and open the stars.txt file with File and BufferedWriters
                                        if (total >= 8000){
                                        
                                        //change the following to write to stars.txt not to cmd line       
                                        System.out.println(id);
                                        System.out.println(fName);
                                        System.out.println(lName);
                                        System.out.println(supplies);
                                        System.out.println(books);
                                        System.out.println(paper);
                                        System.out.println(district);
                                        System.out.println(contact);
                                        System.out.println("");
                                        
                                        
                                        
                                        }//end if
                                        
                                        
                                }//end try
                                catch(NumberFormatException exception){
                                        System.out.println("Error");
                                }//end catch
                                
                                
                        
                        }//end while loop
                       
                        //******* close the stars.txt file 
                         
                        //closing the file
                        
                        bufferedReader.close();
                        
                        
                         
                        
//                        //creates the file reader and opens the previous file
//                        FileReader fileReader = new FileReader(myFile);
//                        //creates the bufferedReader object and uses fileReader object to read from
//                        BufferedReader bufferedReader = new BufferedReader(fileReader);
//  
//                        //the following creates the variable nextLine 
//                        String nextLine;
//                        //as long as the nextLine is not null then the bufferedReader will print out the next line                  
//                        while((nextLine = bufferedReader.readLine()) !=null){
//                        System.out.println(nextLine);
//                        }//end while loop
//                        
//                        bufferedReader.close();
                        

                }//end try
                catch (IOException ex)
                {
                        System.out.println("ERROR");
                        System.exit(0);
                }//end catch

        }//end main()

}//end class TestFileWriter
