
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * The program compares two sets of data against each other displaying item not present in the opposing set. 
 */
/**
 *
 * @author tpaulson
 */
public class compareForm extends javax.swing.JFrame
{

    /**
     * Creates new form compareForm
     */
    public compareForm()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        list1Lbl = new javax.swing.JLabel();
        shortCutLbl = new javax.swing.JLabel();
        compareBtn = new javax.swing.JButton();
        jScrollPaneResults = new javax.swing.JScrollPane();
        resultsTxtArea = new javax.swing.JTextArea();
        resetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        resultsLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        jScrollPaneList1 = new javax.swing.JScrollPane();
        list1TxtArea = new javax.swing.JTextArea();
        jScrollPaneList2 = new javax.swing.JScrollPane();
        list2TxtArea = new javax.swing.JTextArea();
        list2Lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPARE TWO SETS");
        setResizable(false);

        list1Lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        list1Lbl.setText("LIST 1");

        shortCutLbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        shortCutLbl.setText("Ctrl A = SELECT ALL | Ctrl C = COPY  |  Ctrl X = CUT  |  Ctrl V = PASTE");

        compareBtn.setText("Compare");
        compareBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                compareBtnActionPerformed(evt);
            }
        });

        jScrollPaneResults.setBackground(new java.awt.Color(255, 255, 255));

        resultsTxtArea.setEditable(false);
        resultsTxtArea.setColumns(20);
        resultsTxtArea.setRows(5);
        jScrollPaneResults.setViewportView(resultsTxtArea);

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitBtnActionPerformed(evt);
            }
        });

        resultsLbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resultsLbl.setText("Results:");

        descriptionLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descriptionLbl.setText("Compare Two Sets of Data.  Results will compare two lists and display items NOT present in the opposing list.");

        list1TxtArea.setColumns(20);
        list1TxtArea.setRows(5);
        list1TxtArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPaneList1.setViewportView(list1TxtArea);

        list2TxtArea.setColumns(20);
        list2TxtArea.setRows(5);
        jScrollPaneList2.setViewportView(list2TxtArea);

        list2Lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        list2Lbl.setText("LIST 2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(shortCutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn))
                    .addComponent(jScrollPaneResults, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneList1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compareBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(resetBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPaneList2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(list1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(311, 311, 311)
                                .addComponent(list2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(compareBtn)
                        .addGap(62, 62, 62)
                        .addComponent(resetBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(list1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneList1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(list2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneList2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(resultsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneResults, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn)
                    .addComponent(shortCutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compareBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_compareBtnActionPerformed
    {//GEN-HEADEREND:event_compareBtnActionPerformed
        //clears any text displayed before another comparison
        resultsTxtArea.setText(null);
        //initialized and declares new ArrayLists
        Collection<String> listOne = new ArrayList();
        Collection<String> listTwo = new ArrayList();

        //takes list 1 line by line and adds it to listOne var
        for (String line : list1TxtArea.getText().split("\\n"))
        {

            listOne.add(line.toLowerCase().trim());

        }//end for

        //takes list 2 line by line and adds it to listTwo
        for (String line : list2TxtArea.getText().split("\\n"))
        {

            listTwo.add(line.toLowerCase().trim());

        }//end for

        //creates new list for listOne and listTwo for comparison
        List<String> sourceList = new ArrayList<>(listOne);
        List<String> destinationList = new ArrayList<>(listTwo);

        //removes all duplicate itmes from each list
        sourceList.removeAll(listTwo);
        destinationList.removeAll(listOne);

        //displays nothing if both lists match
        if (destinationList.isEmpty() && sourceList.isEmpty())
        {
            resultsTxtArea.append("Nothing to display. Both Lists MATCH \n\n");
        } else
        {

            //displays the results of the comparison
            resultsTxtArea.append("Items contained in List 1 that are NOT in List 2: \n");
            for (String element : sourceList)
            {
                resultsTxtArea.append(element + "\n");
            }
            if (sourceList.isEmpty())
            {
                resultsTxtArea.append("Nothing to display \n\n");
            }

            resultsTxtArea.append("\nItems contained in List 2 that are NOT in List 1: \n");
            for (String element : destinationList)
            {
                resultsTxtArea.append(element + "\n");
            }
            if (destinationList.isEmpty())
            {
                resultsTxtArea.append("Nothing to display \n\n");
            }
        }//end else main

//http://stackoverflow.com/questions/19155283/simple-way-to-compare-2-arraylists

    }//GEN-LAST:event_compareBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetBtnActionPerformed
    {//GEN-HEADEREND:event_resetBtnActionPerformed
        //clears all text fields
        list1TxtArea.setText(null);
        list2TxtArea.setText(null);
        resultsTxtArea.setText(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitBtnActionPerformed
    {//GEN-HEADEREND:event_exitBtnActionPerformed
        //exits program
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(compareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(compareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(compareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(compareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new compareForm().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compareBtn;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPaneList1;
    private javax.swing.JScrollPane jScrollPaneList2;
    private javax.swing.JScrollPane jScrollPaneResults;
    private javax.swing.JLabel list1Lbl;
    private javax.swing.JTextArea list1TxtArea;
    private javax.swing.JLabel list2Lbl;
    private javax.swing.JTextArea list2TxtArea;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JTextArea resultsTxtArea;
    private javax.swing.JLabel shortCutLbl;
    // End of variables declaration//GEN-END:variables

}
