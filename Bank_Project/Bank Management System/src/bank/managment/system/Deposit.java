package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField tf;
    JButton b1,b2;
    Deposit(String pin){
        super("Deposit");
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1550,830);
        add(img);

        JLabel l1 = new JLabel("ENTER AMOUNT TO BE DEPOSITED");
        l1.setFont(new Font("System",Font.BOLD,20));
        l1.setBounds(460,180,400,35);
        l1.setForeground(Color.WHITE);
        img.add(l1);

        tf = new JTextField();
        tf.setBounds(460,230,350,25);
        tf.setFont(new Font("Raleway",Font.BOLD,22));
        tf.setBackground(new Color(197, 197, 197));
        img.add(tf);

        b1 = new JButton("DEPOSIT");
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
        setLocation(0,0);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = tf.getText();
            Date date = new Date();
            if(e.getSource() == b1){
                if(amount.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter Valid Amount!!");
                }else{
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited Successfully!");
                    setVisible(false);
                    new Transactions(pin);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new Transactions(pin);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
