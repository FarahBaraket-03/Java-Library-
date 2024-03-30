/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author dongm
 */
public class Navbar extends JPanel {
    public Navbar(JFrame f,String name_lib){
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBackground(new Color(40, 44, 51));
        this.setBounds(0, 80, 300, 600);
        JPanel home=createBtn(f,"HOME","home_24px.png",name_lib);
        this.add(home);
        JPanel MangeBooks=createBtn(f,"ManageBooks","icons8_Book_26px.png",name_lib);
        this.add(MangeBooks);
        JPanel MangeLecteur=createBtn(f,"ManageLecteur","icons8_Conference_26px.png",name_lib);
        this.add(MangeLecteur);
        JPanel emprunt=createBtn(f,"Emprunt","icons8_Sell_26px.png",name_lib);
        this.add(emprunt);
        JPanel retourner=createBtn(f,"Return Books","icons8_Return_Purchase_26px.png",name_lib);
        this.add(retourner);
        JPanel record=createBtn(f,"Record","icons8_View_Details_26px.png",name_lib);
        this.add(record);
        JPanel logout=createBtn(f,"logout","icons8_Exit_26px.png",name_lib);
        this.add(logout);
        
    
    }
    public JPanel createBtn(JFrame f,String text,String img,String name_lib){
        JPanel button= new JPanel();
        button.setLayout(null);
        button.setPreferredSize(new Dimension(300,180));
        JButton btn=new JButton();
        btn.setText(text);
        btn.setIcon(new ImageIcon(getClass().getResource("/Projet/design/"+img)));
        btn.setBorder(BorderFactory.createEmptyBorder());
        btn.setContentAreaFilled(false);
        btn.setFocusable(false);
        btn.setForeground(Color.white);
        btn.setHorizontalTextPosition(JButton.RIGHT);
        btn.setIconTextGap(10);
        button.setBackground(new Color(40, 44, 51));
        //btn.setHorizontalAlignment(CENTER);
        btn.setFont(new Font("Arial", Font.PLAIN, 18));
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change cursor to hand pointer when mouse enters the button area
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btn.setContentAreaFilled(true);
                btn.setBackground(new Color(230,231,228));
                btn.setForeground(Color.BLACK);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restore default cursor when mouse exits the button area
                setCursor(Cursor.getDefaultCursor());
                 btn.setContentAreaFilled(false);
                 btn.setForeground(Color.white);
            }
        });
        btn.setBounds(0,1,300,60);
        button.add(btn);
        if(text.equals("ManageBooks")){
        btn.addActionListener((ActionEvent e) -> {
            FrameMB f1=new FrameMB(name_lib);
            f.dispose();
        });
        };
        if(text.equals("Record")){
        btn.addActionListener((ActionEvent e) -> {
            FrameEmprunt f2=new FrameEmprunt(name_lib);
            f.dispose();
        });
        };
        if(text.equals("ManageLecteur")){
        btn.addActionListener((ActionEvent e) -> {
            // add frame ManageLecteur fl=new ManageLecteur();
            f.dispose();
        });
        };
        if(text.equals("Emprunt")){
        btn.addActionListener((ActionEvent e) -> {
            // add frame Emprunt fl=new Emprunt();
            f.dispose();
        });
        };
        if(text.equals("Return Books")){
        btn.addActionListener((ActionEvent e) -> {
            // add myFrame4=new myFrame4();
            f.dispose();
        });
        };
        if(text.equals("logout")){
        btn.addActionListener((ActionEvent e) -> {
            //add myFrame3=new myFrame3();
            f.dispose();
        });
        };
        return(button);
    }
        

}
