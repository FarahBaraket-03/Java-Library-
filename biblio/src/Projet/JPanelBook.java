/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Projet;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;



public class JPanelBook extends javax.swing.JPanel {

    public JPanelBook(JFrame f) {
        myinitComponents(f);
    }

    /**
     * @param f the value of f
     */
      
    
    
     private void myinitComponents(JFrame f) {

       jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField4.setBackground(new java.awt.Color(67, 91, 123));
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" Write Book ID");
        jTextField4.setToolTipText("");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField4.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(67, 91, 123));
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" Write Book ID");
        jTextField5.setToolTipText("");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField5.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(67, 91, 123));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" Write Book ID");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField1.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(28, 38, 61));
        setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        setName(""); // NOI18N
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(67, 91, 123));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(28,38,61));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Rewind_48px.png")); // NOI18N
        jLabel3.setText("BACK");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 50);

        jTextField3.setBackground(new java.awt.Color(67, 91, 123));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" Write Book ID");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField3.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(80, 110, 160, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter  Book ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 70, 130, 30);

        jLabel7.setBackground(new java.awt.Color(67, 91, 123));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel7.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel7.setIconTextGap(0);
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 90, 30, 50);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter  Book Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 160, 130, 30);

        jTextField6.setBackground(new java.awt.Color(67, 91, 123));
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" Write Book Name");
        jTextField6.setToolTipText("");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField6.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(80, 200, 160, 30);

        jLabel13.setBackground(new java.awt.Color(67, 91, 123));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Moleskine_26px.png")); // NOI18N
        jLabel13.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel13.setIconTextGap(0);
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 180, 30, 50);

        jTextField9.setBackground(new java.awt.Color(67, 91, 123));
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" Write Book Author");
        jTextField9.setToolTipText("");
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField9.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(80, 300, 160, 30);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter  Book Author");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(70, 250, 130, 30);

        jLabel19.setBackground(new java.awt.Color(67, 91, 123));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Collaborator_Male_26px.png")); // NOI18N
        jLabel19.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel19.setIconTextGap(0);
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(40, 280, 30, 50);

        jTextField12.setBackground(new java.awt.Color(67, 91, 123));
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" Write Book URL");
        jTextField12.setToolTipText("");
        jTextField12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField12.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(80, 470, 160, 30);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Enter  URL");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 440, 130, 30);

        jLabel25.setBackground(new java.awt.Color(67, 91, 123));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-image-file-26.png")); // NOI18N
        jLabel25.setText("url");
        jLabel25.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel25.setIconTextGap(0);
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(40, 450, 30, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-add-48.png")); // NOI18N
        jLabel1.setText("add");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 530, 50, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\delete.png")); // NOI18N
        jLabel2.setText("delete");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 530, 50, 48);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\edit.png")); // NOI18N
        jLabel9.setText("edit");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 530, 50, 48);

        jLabel26.setBackground(new java.awt.Color(67, 91, 123));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Unit_26px.png")); // NOI18N
        jLabel26.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel26.setIconTextGap(0);
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(40, 370, 30, 50);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Enter  Quantity");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(70, 350, 130, 30);

        jTextField13.setBackground(new java.awt.Color(67, 91, 123));
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText(" Write Book Quantity");
        jTextField13.setToolTipText("");
        jTextField13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField13.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField13);
        jTextField13.setBounds(80, 390, 160, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 590);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID Book", "Book Name", "Author", "Quantity"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jTable1.setRowHeight(35);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(400, 260, 700, 290);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Search by Name of Book");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(800, 160, 260, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\airy-magnifier-with-a-book-search-for-information-learning (2).png")); // NOI18N
        jLabel11.setText("MANAGE BOOKS");
        jLabel11.setIconTextGap(15);
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 200));
        add(jLabel11);
        jLabel11.setBounds(450, 10, 490, 140);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(28, 38, 61));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-search-50.png")); // NOI18N
        jLabel12.setText("search");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setIconTextGap(15);
        add(jLabel12);
        jLabel12.setBounds(1070, 140, 60, 80);

        getAccessibleContext().setAccessibleParent(this);
        
        
  //-------------------------------ADDITION---------------------------------------------------------
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3.setBackground(new java.awt.Color(153, 153, 255));
                f.dispose();
                try {
                    Frame2 f2=new Frame2();
                } catch (IOException ex) {
                    Logger.getLogger(JPanelEmprunt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ///----------------------------- INTERACTION AVEC DATABASE ------------------------------------------------------------
        DefaultTableModel model = new DefaultTableModel(new Object [][] {},
            new String [] {"ID Book", "Book NAME", "AUTHOR", "QUANTITY"});
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_bib", "root", "love2PMandGOT7")) 
        {
            
            String query = "select * from book";
            try (Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(query)) {
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
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
                        jTextField3.setText(jTable1.getValueAt(selrow, 0).toString());
                        jTextField6.setText(jTable1.getValueAt(selrow, 1).toString());
                        jTextField9.setText(jTable1.getValueAt(selrow, 2).toString());
                        jTextField13.setText(jTable1.getValueAt(selrow, 3).toString());
        }
                    }
                });
        //------------------------ADDITION---------------------------------------------------------------------------
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_bib", "root", "love2PMandGOT7")) 
               {
                   String id=jTextField3.getText();
                   String name=jTextField6.getText();
                   String a=jTextField9.getText();
                   String q=jTextField13.getText();
                   String url=jTextField12.getText();
                   if(isValide(id,name,a,q)== false){
                    JOptionPane.showMessageDialog(null, "warning CHECK INPUTS!", "Warning", JOptionPane.WARNING_MESSAGE);
               }
                   else
                   try (Statement statement = connection.createStatement()) 
                   {
                       String query1 ="select * from book where isbn="+id;
                       ResultSet rs1 = statement.executeQuery(query1);
                       if(rs1.next()){
                           JOptionPane.showMessageDialog(null, "warning ID WRONG!", "Warning", JOptionPane.WARNING_MESSAGE);
                           
                       }
                       else{
                           String query2 ="select * from book where autheur='"+a+"' and nom='"+name+"'";
                           ResultSet rs2 = statement.executeQuery(query2);
                           if(rs2.next()){
                               JOptionPane.showMessageDialog(null, "warning ! "+name+" with "+a+" alerady exist", "Warning", JOptionPane.WARNING_MESSAGE);
                           }
                           else{
                             String query3 = "INSERT INTO book VALUES (" + id + ", '" + name + "', '" + a + "', " + q + ", '" + url + "')";
                             int rowsAffected = statement.executeUpdate(query3);
                             if (rowsAffected > 0) {model.addRow(new Object[]{id, name, a, q, url});}
                           }
                       };
                   };
               } 
               catch (SQLException e) {
                   e.printStackTrace();
               }
                
            }
        });
        //--------------------------SUPPRESSION---------------------------------------------------------------------
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_bib", "root", "love2PMandGOT7")) 
               {
                   String id=jTextField3.getText();
                   String name=jTextField6.getText();
                   String a=jTextField9.getText();
                   String q=jTextField13.getText();
                   String url=jTextField12.getText();
                   if(isValide(id,name,a,q)== false){
                    JOptionPane.showMessageDialog(null, "warning CHECK INPUTS!", "Warning", JOptionPane.WARNING_MESSAGE);
               }
                   else
                   try (Statement statement = connection.createStatement()) 
                   {
                       String query1 ="select * from book where isbn="+id;
                       ResultSet rs1 = statement.executeQuery(query1);
                       if(rs1.next()==false){
                           JOptionPane.showMessageDialog(null, "warning ID WRONG!", "Warning", JOptionPane.WARNING_MESSAGE);
                           
                       }
                       else{
                           String query2 ="select * from book where isbn="+id+" and autheur='"+a+"' and nom='"+name+"'";
                           ResultSet rs2 = statement.executeQuery(query2);
                           if(rs2.next()==false){
                               JOptionPane.showMessageDialog(null, "warning you enter ID of book ! "+name+" with author "+a+" WRONG ", "Warning", JOptionPane.WARNING_MESSAGE);
                           }
                           else{
                             String query3 = "delete from book where isbn="+id;
                             deleteRowFromTable(Integer.parseInt(id),model);
                             statement.executeUpdate(query3);
                             
                           }
                       };
                   };
               } 
               catch (SQLException e) {
                   e.printStackTrace();
               }
                
            }
        });
        //--------------------------- EDITION -------------------------------------------------------------
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
               try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_bib", "root", "love2PMandGOT7")) 
               {
                   String id=jTextField3.getText();
                   String name=jTextField6.getText();
                   String a=jTextField9.getText();
                   String q=jTextField13.getText();
                   String url=jTextField12.getText();
                   if(isValide(id,name,a,q)== false){
                    JOptionPane.showMessageDialog(null, "warning CHECK INPUTS!", "Warning", JOptionPane.WARNING_MESSAGE);
               }
                   else
                   try (Statement statement = connection.createStatement()) 
                   {
                       String query1 ="select * from book where isbn="+id;
                       ResultSet rs1 = statement.executeQuery(query1);
                       if(rs1.next()==false){
                           JOptionPane.showMessageDialog(null, "warning ID WRONG!", "Warning", JOptionPane.WARNING_MESSAGE);
                           
                       }
                       else{
                             String query = "UPDATE book SET autheur = ?, nom = ?, qu = ?, url = ? WHERE isbn = ?";
                             try (PreparedStatement statement1 = connection.prepareStatement(query)) {
                                 statement1.setString(1, a);
                                 statement1.setString(2, name);
                                 statement1.setInt(3, Integer.parseInt(q));
                                 statement1.setString(4, url);
                                 statement1.setInt(5, Integer.parseInt(id));
                                 statement1.executeUpdate();
}
                             updateRowInTable(Integer.parseInt(id),name,a,Integer.parseInt(q),url,model);
                             
                       };
                   };
               } 
               catch (SQLException e) {
                   e.printStackTrace();
               }
                
            }
        });

        //----------------------------------- RECHERCHE -------------------------------------------------------------------
        
        jLabel12.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent evt){
                    model.setRowCount(0);
                    String rech =jTextField2.getText();
                    String query = "select * from book";
                    if(rech.equals("Search by Name of Book")==false && rech.equals("")==false){
                      query = "select * from book where nom='"+rech+"'";
                        }
                    else{
                    JOptionPane.showMessageDialog(null, "warning ! ENTER NAME OF BOOK", "Warning", JOptionPane.WARNING_MESSAGE);
                    };
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_bib", "root", "love2PMandGOT7")) 
                    {
                        
                        try (Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery(query)) {
                            if(rs.next()==false){
                            JOptionPane.showMessageDialog(null, "warning ! BOOK Doesn't exist", "Warning", JOptionPane.WARNING_MESSAGE);}
                            else{
                                do{
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
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
        

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>   
    
    private static void deleteRowFromTable(int idToDelete, DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            int id = Integer.parseInt(model.getValueAt(i, 0).toString()); // Assuming the ID is in the first column
            if (id == idToDelete) {
                model.removeRow(i);
                break; // Stop searching after deleting the row
            }
        }
    }
    private static void updateRowInTable(int idToUpdate, String name, String author, int quantity, String url, DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            int id = Integer.parseInt(model.getValueAt(i, 0).toString()); // Assuming the ID is in the first column
            if (id == idToUpdate) {
                int rowToUpdate=i;
                 model.setValueAt(name, rowToUpdate, 1); // Update name in the second column
                 model.setValueAt(author, rowToUpdate, 2); // Update author in the third column
                 model.setValueAt(quantity, rowToUpdate, 3); // Update quantity in the fourth column
                break; // Stop searching after deleting the row
            }
        }
    }
    
    public static boolean isNumeric(String str) {
        try {
            double d = Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
     
     
    public boolean isValide(String id ,String name,String au,String q){
    if(isNumeric(id)==false ||isNumeric(q)==false ||name.equals("")||au.equals("")||id.equals("")||q.equals("") ){
        return false;
    }
    return true;
    } 
    
     
     
     
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField4.setBackground(new java.awt.Color(67, 91, 123));
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" Write Book ID");
        jTextField4.setToolTipText("");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField4.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(67, 91, 123));
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" Write Book ID");
        jTextField5.setToolTipText("");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField5.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(67, 91, 123));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" Write Book ID");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField1.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(28, 38, 61));
        setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        setName(""); // NOI18N
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(67, 91, 123));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Rewind_48px.png")); // NOI18N
        jLabel3.setText("BACK");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 50);

        jTextField3.setBackground(new java.awt.Color(67, 91, 123));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" Write Book ID");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField3.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(80, 110, 160, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter  Book ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 70, 130, 30);

        jLabel7.setBackground(new java.awt.Color(67, 91, 123));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel7.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel7.setIconTextGap(0);
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 90, 30, 50);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter  Book Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 160, 130, 30);

        jTextField6.setBackground(new java.awt.Color(67, 91, 123));
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" Write Book Name");
        jTextField6.setToolTipText("");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField6.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(80, 200, 160, 30);

        jLabel13.setBackground(new java.awt.Color(67, 91, 123));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Moleskine_26px.png")); // NOI18N
        jLabel13.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel13.setIconTextGap(0);
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 180, 30, 50);

        jTextField9.setBackground(new java.awt.Color(67, 91, 123));
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" Write Book Author");
        jTextField9.setToolTipText("");
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField9.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(80, 300, 160, 30);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter  Book Author");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(70, 250, 130, 30);

        jLabel19.setBackground(new java.awt.Color(67, 91, 123));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Collaborator_Male_26px.png")); // NOI18N
        jLabel19.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel19.setIconTextGap(0);
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(40, 280, 30, 50);

        jTextField12.setBackground(new java.awt.Color(67, 91, 123));
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" Write Book URL");
        jTextField12.setToolTipText("");
        jTextField12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField12.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(80, 470, 160, 30);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Enter  URL");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 440, 130, 30);

        jLabel25.setBackground(new java.awt.Color(67, 91, 123));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-image-file-26.png")); // NOI18N
        jLabel25.setText("url");
        jLabel25.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel25.setIconTextGap(0);
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(40, 450, 30, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-add-48.png")); // NOI18N
        jLabel1.setText("add");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 530, 50, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\delete.png")); // NOI18N
        jLabel2.setText("delete");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 530, 50, 48);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\edit.png")); // NOI18N
        jLabel9.setText("edit");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 530, 50, 48);

        jLabel26.setBackground(new java.awt.Color(67, 91, 123));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Unit_26px.png")); // NOI18N
        jLabel26.setDisabledIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8_Contact_26px.png")); // NOI18N
        jLabel26.setIconTextGap(0);
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(40, 370, 30, 50);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Enter  Quantity");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(70, 350, 130, 30);

        jTextField13.setBackground(new java.awt.Color(67, 91, 123));
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText(" Write Book Quantity");
        jTextField13.setToolTipText("");
        jTextField13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField13.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jPanel1.add(jTextField13);
        jTextField13.setBounds(80, 390, 160, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 590);

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID Book", "Book Name", "Author", "Quantity"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(400, 260, 700, 290);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Search by Name of Book");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(800, 160, 260, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\airy-magnifier-with-a-book-search-for-information-learning (2).png")); // NOI18N
        jLabel11.setText("MANGE BOOKS");
        jLabel11.setIconTextGap(15);
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 200));
        add(jLabel11);
        jLabel11.setBounds(450, 10, 490, 140);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(28, 38, 61));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-search-50.png")); // NOI18N
        jLabel12.setText("search");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setIconTextGap(15);
        add(jLabel12);
        jLabel12.setBounds(1070, 140, 60, 80);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
