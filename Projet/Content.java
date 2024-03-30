/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projet;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author dongm
 */
public class Content  extends JPanel{
    public Content() throws IOException{
        this.setLayout(new BorderLayout(10,30));
        this.setSize(new Dimension(900,520));
        Content1 p =new Content1();
        this.add(p,BorderLayout.CENTER);
        
    }
   
    public JLabel createJLabel(String text){
        JLabel label=new JLabel();
        label.setText(text);
        label.setHorizontalAlignment(CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        return label;
    }
    
    public JScrollPane createtable_dispo(String req){
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Code");
        model.addColumn("name of BOOK");
        model.addColumn("AUTHEUR");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsm", "root", "password")) 
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
        
         table.setFont(new Font("Arial", Font.PLAIN, 15));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setBackground(new Color(240, 240, 240));
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(new Color(214, 213, 210));
        table.setSelectionForeground(Color.black);
        table.setRowHeight(30);
        
       
        
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(new Dimension(300,200));
        return(scrollPane);
        
        
    }
    
}
