/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Projet;

import java.awt.event.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongm
 */
public class JPanelEmprunt extends javax.swing.JPanel {

    /**
     * Creates new form JPanelEmprunt
     */
    public JPanelEmprunt(JFrame f,String name_lib) {
        myinitComponents(f,name_lib);
    }
    
    
     private void myinitComponents(JFrame f,String name_lib) {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(230, 231, 228));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(13, 27, 43));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/airy-hr-looking-through-candidates-cvs.png"))); // NOI18N
        jLabel1.setText("DETAIL EMPRUNT ");
        jLabel1.setIconTextGap(15);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 490, 140);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 18));
        jTextField1.setText(" Search By CIN");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(650, 140, 230, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-search-50.png"))); // NOI18N
        jLabel2.setText("search");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(890, 140, 50, 50);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"choisir" ,"Returned", "Still" }));
        jComboBox1.setOpaque(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(500, 150, 120, 30);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8_Rewind_48px.png"))); // NOI18N
        jLabel3.setText("BACK");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 130, 50);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 230);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        add(jScrollPane1);
        jScrollPane1.setBounds(120, 270, 740, 250);
        
        
        //-------------------------------ADDITION---------------------------------------------------------
        jLabel3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3.setBackground(new java.awt.Color(153, 153, 255));
                f.dispose();
                try {
                    Frame2 f2=new Frame2(name_lib);
                } catch (IOException ex) {
                    Logger.getLogger(JPanelEmprunt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        //-------------------------------- INTRACTION DATA BASE -----------------------------------------------------------------
        DefaultTableModel model = new DefaultTableModel(new Object [][] {},
            new String [] {"CIN", "ID Book", "ISSUE DATE", "RETURN DATE","STATUS"});
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            String query = "select * from emprunt";
            try (Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(query)) {
                while (rs.next()) {
                    String re;
                   if(rs.getString(6).equals("0")){
                       re="Still";
                   } 
                   else{  re="Returned";}
                    model.addRow(new Object[]{rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),re});
                }
            };
            
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        jTable1.setModel(model);
         jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int selrow=jTable1.getSelectedRow();
                    if(selrow != -1){
                        jTextField1.setText(jTable1.getValueAt(selrow, 0).toString());
        }
                    }
                });
        
         jLabel2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent evt){
                    model.setRowCount(0);
                    String rech =jTextField1.getText();
                    String op=jComboBox1.getSelectedItem().toString();
                    String query = "select * from emprunt";
                    int n;
                    if(op.equals("Still")){
                        n=0;
                   } 
                   else{
                        if(op.equals("choisir")) {n=-1;} 
                        else {n=1;}};
                    if(rech.equals(" Search By CIN")==false && rech.equals("")==false && isNumeric(rech)){
                        if (n!=-1){
                            query = "select * from emprunt where cin="+Integer.parseInt(rech)+" and status="+n;
                        }
                        else{
                            query = "select * from emprunt where cin="+Integer.parseInt(rech) ;
                        }
                          
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "warning ! CIN WRONG", "Warning", JOptionPane.WARNING_MESSAGE);
                    };
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
                    {
                        
                        try (Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery(query)) {
                            if(rs.next()==false){
                            JOptionPane.showMessageDialog(null, "warning ! CIN Doesn't exist", "Warning", JOptionPane.WARNING_MESSAGE);}
                            else{
                                do{
                                    String re;
                                if(rs.getString(6).equals("0")){
                                    re="Still";
                                } 
                                else{  re="Returned";}
                                model.addRow(new Object[]{rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),re});
                                }
                                while(rs.next());
                            }
                            jTable1.setModel(model);
                            
                        };
                    } 
        catch (SQLException e) {
            e.printStackTrace();
        }
                }
            });
        
        
        
    }// </editor-fold>       
     public static boolean isNumeric(String str) {
        try {
            double d = Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
    
    

    
    
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(230, 231, 228));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(13, 27, 43));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\airy-hr-looking-through-candidates-cvs.png")); // NOI18N
        jLabel1.setText("DETAIL EMPRUNT ");
        jLabel1.setIconTextGap(15);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 490, 140);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField1.setText(" Search By CIN");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(650, 140, 230, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-search-50.png")); // NOI18N
        jLabel2.setText("search");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(890, 140, 50, 50);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Returned", "Still" }));
        jComboBox1.setOpaque(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(500, 150, 120, 30);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Rewind_48px.png")); // NOI18N
        jLabel3.setText("BACK");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 130, 50);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 230);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIN", "ISBN", "DATE ISSUE", "RETURN DATE", "STATUS"
            }
        ));
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 270, 740, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
