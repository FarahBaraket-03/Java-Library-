/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author dongm
 */
public  class Frame2 extends JFrame{
    public Frame2() throws IOException 
    {
 
        Border blackline = BorderFactory.createLineBorder(Color.gray);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/dongm/OneDrive/Bureau/design/logo1.png");
        this.setIconImage(icon); 
        this.setTitle("L I B R A R Y");
        this.setSize(1300,700);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //--------------------------------------------------------------------------------------------
        JPanel panel_admin=new JPanel();
        panel_admin.setLayout(new GridLayout(0,2,650,0));
        panel_admin.setBackground(new Color(124,144,173));
        panel_admin.setBounds(0, 0, 1300, 82);
        JLabel logo=createJLabel("Liberary Mangement System");
        JLabel admin=createJLabel("Welcome ....");
        panel_admin.add(logo);
        admin.setIcon(new ImageIcon("C:/Users/dongm/OneDrive/Bureau/design/male_user_50px.png"));
        logo.setIcon(new ImageIcon("C:/Users/dongm/OneDrive/Bureau/design/icons8_Library_32px.png"));
        panel_admin.add(admin);
        this.add(panel_admin);
        
        //----------------------------------------------------------------------------------------------
        Navbar panel_bar;
        panel_bar = new Navbar(this);
        this.add(panel_bar);
        Content main=new Content();
        JScrollPane scrollPane_HOME = new JScrollPane(main);
        scrollPane_HOME.setBounds(330,90,930,560);
        scrollPane_HOME.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane_HOME);
        
        
        
        
        
        
        
        
        
        
        
   
 
   /*/---------------------------ACTION OF BUTTON 3--------------------------------------------------------------
      b3.addActionListener((ActionEvent e) -> {
          changePanel(scrollPane_HOME,p1_HOME,scrollPane_TOP,p2_TOP,p3_CART);
          this.add(p_CART);
          this.revalidate();
          this.repaint();
        });
  //------------------------------------------------------------------------------------
  
  validate();*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
    };
    public  JButton createJButton(String img,int x,int y, int w ,int h){
        JButton button=new JButton();
        button.setBounds(x,y,w,h);
        button.setIcon(new ImageIcon(img));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        button.setFocusable(false);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change cursor to hand pointer when mouse enters the button area
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restore default cursor when mouse exits the button area
                setCursor(Cursor.getDefaultCursor());
            }
        });
        return(button);
    }
   
 public JLabel createJLabel(String text){
        JLabel label=new JLabel();
        label.setText(text);
        label.setForeground(Color.WHITE);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setFont(new Font("Arial", Font.BOLD, 18));
       label.setIconTextGap(10);
        return label;
    }
    
}
