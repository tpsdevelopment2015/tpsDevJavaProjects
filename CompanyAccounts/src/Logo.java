/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.NumberFormat;
import javax.swing.JPanel;


public class Logo extends JPanel
{
        
        /**
         *
         * @param g
         */
        @Override
        public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass's paintComponent
      //set background of the frame
      this.setBackground( Color.WHITE );

      // create a yelow rectangle
      g.setColor( Color.YELLOW );
      g.fillRect( 90, 65, 200, 20 );
      // creates a blue rounded rectangle
      g.setColor(Color.BLUE);
      g.fillRoundRect(115, 10, 150, 50, 150, 50);
     
      
      
      // creates the yellow logo text
      g.setColor(Color.YELLOW);
      g.setFont(new Font ("Serif",Font.BOLD, 40));
      g.drawString( "S & S" ,142, 49 );

      // creates and displays the yearly total text
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      double yearlyTotal = Supplies.gettotalSuppliesSold() + Services.gettotalServices() + Paper.gettotalPaperSold();
      g.setColor(Color.BLACK);
      g.setFont(new Font ("Serif",Font.BOLD, 16));
      g.drawString( "Yearly Sales Total: " + formatter.format(yearlyTotal), 108, 81 );
      
 
     
   }//end paintComponent()

    
        
}//end Logo class
