package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CashWithdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField tf;
    JButton b1,b2;
    CashWithdrawal(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1550,830);
        add(img);

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWAL IS Rs.10,000");
        l1.setFont(new Font("System",Font.BOLD,20));
        l1.setBounds(460,180,700,35);
        l1.setForeground(Color.WHITE);
        img.add(l1);

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System",Font.BOLD,20));
        l2.setBounds(460,220,400,35);
        l2.setForeground(Color.WHITE);
        img.add(l2);

        tf = new JTextField();
        tf.setBounds(460,260,350,25);
        tf.setFont(new Font("Raleway",Font.BOLD,22));
        tf.setBackground(new Color(197, 197, 197));
        img.add(tf);

        b1 = new JButton("WITHDRAW");
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

    public static void main(String[] args) {
        new CashWithdrawal("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            try {
                String amount = tf.getText();
                Date date = new Date();
                if (amount.isEmpty()) JOptionPane.showMessageDialog(null, "Please enter the amount to be withdrawn");
                else {
                    Conn c = new Conn();
                    ResultSet rs = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("INSERT INTO bank VALUES('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " debited successfully!!");
                    setVisible(false);
                    new Transactions(pin);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new Transactions(pin);
        }
    }
}
