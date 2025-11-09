package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Enquiry extends JFrame implements ActionListener{
    JLabel l2;
    JButton b1;
    String pin;
    Enquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1550,830);
        add(img);

        JLabel l1 = new JLabel("Your Current Balance is: Rs.");
        l1.setFont(new Font("System",Font.BOLD,20));
        l1.setBounds(430,180,700,35);
        l1.setForeground(Color.WHITE);
        img.add(l1);

        l2 = new JLabel("");
        l2.setFont(new Font("System",Font.BOLD,20));
        l2.setBounds(430,220,400,35);
        l2.setForeground(Color.WHITE);
        img.add(l2);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(74, 158, 158));
        b1.addActionListener(this);
        img.add(b1);

        int balance = 0;
        try{
            Conn c = new Conn();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '"+pin+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l2.setText("" + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setLayout(null);
        setLocation(0,0);
        setSize(1550,1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Enquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transactions(pin);
    }
}
