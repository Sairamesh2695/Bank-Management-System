package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Pin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1550,830);
        add(img);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,20));
        l1.setBounds(430,180,400,35);
        l1.setForeground(Color.WHITE);
        img.add(l1);

        JLabel l2 = new JLabel("ENTER NEW PIN");
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(430,220,400,35);
        l2.setForeground(Color.WHITE);
        img.add(l2);

        p1 = new JPasswordField();
        p1.setBounds(615,220,200,35);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(197, 197, 197));
        img.add(p1);

        JLabel l3 = new JLabel("RE-ENTER NEW PIN");
        l3.setFont(new Font("System",Font.BOLD,18));
        l3.setBounds(430,280,400,35);
        l3.setForeground(Color.WHITE);
        img.add(l3);

        p2 = new JPasswordField();
        p2.setBounds(615,280,200,35);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(197, 197, 197));
        img.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(74, 158, 158));
        b1.addActionListener(this);
        img.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(407,362,150,35);
        b2.setBackground(new Color(74, 158, 158));
        b2.addActionListener(this);
        img.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pin("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pin1 = p1.getText();
        String pin2 = p2.getText();
        try{
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(e.getSource() == b1){
            if(p1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Please Enter new PIN");
                return;
            }
            if(p2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Please Re-Enter new PIN");
            }
            else{
                Conn c = new Conn();
                String q1 = "UPDATE bank SET pin = '"+pin1+"' WHERE pin = '"+pin+"'";
                String q2 = "UPDATE login SET pin = '"+pin1+"' WHERE pin = '"+pin+"'";
                String q3 = "UPDATE signup3 SET pin = '"+pin1+"' WHERE pin = '"+pin+"'";

                try {
                    c.statement.executeUpdate(q1);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    c.statement.executeUpdate(q2);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    c.statement.executeUpdate(q3);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

                JOptionPane.showMessageDialog(null,"Pin changed successfully!!");
                setVisible(false);
                new Transactions(pin);
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new Transactions(pin);
        }
    }
}
