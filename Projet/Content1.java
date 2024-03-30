/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dongm
 */
public class Content1 extends javax.swing.JPanel {

    /**
     * Creates new form Content1
     */
    public Content1() throws IOException {
        myinitComponents();
    }
    
    
       
    
      private void myinitComponents() throws IOException {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setAutoscrolls(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 40, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-complaint-50.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 70, 60);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 150, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 40, 50, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-books-50.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 70, 60);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 40, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-people-working-together-50.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 20, 70, 60);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 150, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(100, 40, 30, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-borrow-book-50.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 20, 70, 60);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 150, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NB OF PUNSHED");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-reader-64.png"))); // NOI18N
        jLabel10.setText("READERS");
        jLabel10.setIconTextGap(10);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, 270, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("NB OF READER");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 100, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("NB OF BOOKS BORROWED");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 180, 30));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setShowGrid(true);
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 410, 190));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DefaultTableModel model= new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID BOOK", "NAME OF BOOK", "AUTHOR"
            }
        );
        DefaultTableModel model1=new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID BOOK", "NAME OF BOOK", "AUTHOR"
            }
        );;
        jTable1.setModel(createtable_dispo(model1,"select * from books where isbn in (select isbn from emprunt where status=0)"));
        
        jTable2.setModel(createtable_dispo(model,"select * from books where quantity>0"));
        
        jTable2.setRowHeight(35);
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 410, 190));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("NB OF BOOKS");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText(" BOOKS DISPO");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText(" BOOKS BORROW");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 120, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("name of book3");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(10, 170, 140, 16);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 195, 43));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("3");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(70, 200, 10, 25);

        jLabel18.setText("img3");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(20, 20, 120, 140);

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 160, 230));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("name of book1");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(10, 170, 140, 16);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 195, 43));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("1");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(70, 200, 10, 25);

        jLabel22.setText("img1");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(20, 20, 120, 140);

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 160, 230));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("name of book2");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 170, 140, 16);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 195, 43));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("2");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(70, 200, 10, 25);

        jLabel24.setText("img2");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(20, 20, 120, 140);

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 160, 230));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet/design/icons8-story-book-64.png"))); // NOI18N
        jLabel25.setText(" POPULAR BOOKS");
        jLabel25.setIconTextGap(10);
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 270, 60));

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DefaultTableModel model2= new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "CIN", "NAME", "LAST NAME", "tel","email"
            }
        );
        jTable3.setRowHeight(35);
        jTable3.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            String query = "select CIN,nom,prenom,phonenumber,email from lecteur";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    Object[] row = new Object[5]; 
                    row[0] = resultSet.getObject(1); 
                    row[1] = resultSet.getObject(2);
                    row[2] = resultSet.getObject(3);
                    row[3] = resultSet.getObject(4);
                    row[4] = resultSet.getObject(5);
                    model2.addRow(row);
                }
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        jTable3.setModel(model2);
        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 830, 630, 230));
        
    //--------------------------------- ADDITION ----------------------------------------------------------------    
        change_status_lec();
        jLabel3.setText(createCount("select sum(quantity) from books"));
        jLabel5.setText(createCount("select count(*) from lecteur"));
        jLabel7.setText(createCount("select count(*) from emprunt where status=0 "));
        jLabel1.setText(createCount("select count(*) from lecteur where cin in (select cin from emprunt where date_retour<Now())"));
        setTop(jLabel20,jLabel22,jLabel19,jLabel24,jLabel16,jLabel18);
      
      }// </editor-fold>                        

    
    
     public String createCount(String req){
        String nb="0";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            
            String query = req;
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    nb=resultSet.getString(1);
                }
            };
            
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return nb;
    }
    
    public void setTop(JLabel name1,JLabel img1,JLabel name2,JLabel img2,JLabel name3,JLabel img3) throws IOException{
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            String query = "select titre,url from books b , emprunt e where b.ISBN=e.isbn group by e.ISBN order by (count(cin)) desc";
            try (Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(query)) {
                if(rs.next()){
                    name1.setText(rs.getString(1));
                    ImageIcon i = new ImageIcon(getClass().getResource("/Projet/design/hr.png"));
                    Image newimg=i.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
                    img1.setIcon(new ImageIcon(newimg)); 
                    img1.setText("");
                }
                 if(rs.next()){
                    name2.setText(rs.getString(1));
                    ImageIcon i = new ImageIcon(getClass().getResource("/Projet/design/bookd.png"));
                    Image newimg=i.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    img2.setIcon(new ImageIcon(newimg));  
                    img2.setText("");
                }
                  if(rs.next()){
                    name3.setText("");
                    name3.setText(rs.getString(1));
                    ImageIcon i = new ImageIcon(getClass().getResource("/Projet/design/mean.png"));
                    Image newimg=i.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
                    img3.setIcon(new ImageIcon(newimg)); 
                    img3.setText("");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
     public DefaultTableModel createtable_dispo(DefaultTableModel model,String req){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            String query = req;
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    Object[] row = new Object[3]; 
                    row[0] = resultSet.getObject(1); 
                    row[1] = resultSet.getObject(2);
                    row[2] = resultSet.getObject(3);
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return(model);
        
        
    }
    
    
    
    
    
    public void change_status_lec(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "password")) 
        {
            String query = "UPDATE lecteur SET status = 0 WHERE cin in (select cin from emprunt e where date_retour<Now() and e.status=0)";
                             try (PreparedStatement statement1 = connection.prepareStatement(query)) {
                                 statement1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }   catch (SQLException ex) {
            Logger.getLogger(Content1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setAutoscrolls(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 40, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-complaint-50.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 70, 60);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 150, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 40, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-books-50.png")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 20, 70, 60);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 40, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-people-working-together-50.png")); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 20, 70, 60);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 150, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(100, 40, 30, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-borrow-book-50.png")); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 20, 70, 60);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 150, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NB OF PUNSHED");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-reader-64.png")); // NOI18N
        jLabel10.setText("READERS");
        jLabel10.setIconTextGap(10);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, 270, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("NB OF READER");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 100, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("NB OF BOOKS BORROWED");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 180, 30));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID BOOK", "NAME OF BOOK", "AUTHOR"
            }
        ));
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setShowGrid(true);
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 410, 190));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID BOOK", "NAME OF BOOK", "AUTHOR"
            }
        ));
        jTable2.setRowHeight(35);
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 410, 190));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("NB OF BOOKS");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText(" BOOKS DISPO");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText(" BOOKS BORROW");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 120, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("name of book3");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(10, 170, 140, 16);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 195, 43));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("3");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(70, 200, 10, 25);

        jLabel18.setText("img3");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(20, 20, 120, 140);

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 160, 230));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("name of book1");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(10, 170, 140, 16);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 195, 43));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("1");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(70, 200, 10, 25);

        jLabel22.setText("img1");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(20, 20, 120, 140);

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 160, 230));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("name of book2");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 170, 140, 16);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 195, 43));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("2");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(70, 200, 10, 25);

        jLabel24.setText("img2");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(20, 20, 120, 140);

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 160, 230));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\dongm\\OneDrive\\Bureau\\design\\icons8-story-book-64.png")); // NOI18N
        jLabel25.setText(" POPULAR BOOKS");
        jLabel25.setIconTextGap(10);
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 270, 60));

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CIN", "NAME", "LAST NAME", "BRANCH"
            }
        ));
        jTable3.setRowHeight(35);
        jTable3.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 830, 630, 240));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
