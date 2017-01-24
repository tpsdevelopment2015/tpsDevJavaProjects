//  Coded by tpaulson

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class DirPrinter
{

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args)
        {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a file path then press ENTER:  ");
                String input = scan.nextLine();
                System.out.println("\n\n\nLIST PRINTED FROM THE FOLLOWING DIRECTORY:  " + input + "\n\n");
//************************************************************************************************
//PROGRAM #1
//THIS PROGRAM PRINTS ONLY THE DIRECTORIES AND FILES CONTAINED IN THE ROOT PATH ENTERED

//                
//                System.out.println("\n\nTHE FOLLOWING IS A LIST OF ALL DIRECTORIES AND FILES\nCONTAINED IN THE ROOT OF THE FILE PATH YOU ENTERED.\n");
//                File folder = new File(input);
//                File[] listOfFiles = folder.listFiles();
//
//                for (int i = 0; i < listOfFiles.length; i++)
//                {
//                        if (listOfFiles[i].isFile())
//                        {
//                                System.out.println("File " + listOfFiles[i].getName());
//                        } else if (listOfFiles[i].isDirectory())
//                        {
//                                System.out.println("Directory " + listOfFiles[i].getName());
//                        }
//                }//end for loop
//*************************************************************************************************
//PROGRAMN #2   MUST USE   displayDirectoryContents static METHOD            
//THIS PROGRAM PRINTS ALL DIRECTORIES, SUBFOLDERS, AND FILES CONTAINED IN THE STARTING PATH ENTERED
                File currentDir = new File(input); // current directory
                displayDirectoryContents(currentDir);

//*************************************************************************************************
        }// end main
//*************************************************************************************************
//THIS MUST BE USED WITH PROGRAM #2

        public static void displayDirectoryContents(File dir)
        {
                try
                {
                        File[] files = dir.listFiles();
                        for (File file : files)
                        {
                                if (file.isDirectory())
                                {
                                        System.out.println("\nDIRECTORY:" + file.getCanonicalPath());
                                        displayDirectoryContents(file);
                                } else
                                {
                                        System.out.println("     File:  " + file.getName());
                                }
                        }
                } catch (IOException e)
                {

                        e.printStackTrace();
                }
        }//end method isplayDirectoryContents
//*************************************************************************************************

}//end class
