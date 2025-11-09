package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1550,830);
        add(img);

        JLabel l1 = new JLabel("Please select your transaction");
        l1.setBounds(430,180,700,35);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,28));
        img.add(l1);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(74, 158, 158));
        b1.setBounds(405,272,150,35);
        b1.addActionListener(this);
        img.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(74, 158, 158));
        b2.setBounds(405,320,150,35);
        b2.addActionListener(this);
        img.add(b2);

        b3 = new JButton("PIN CHANGE");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(74, 158, 158));
        b3.setBounds(405,367,150,35);
        b3.addActionListener(this);
        img.add(b3);

        b4 = new JButton("EXIT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(74, 158, 158));
        b4.setBounds(703,413,150,35);
        b4.addActionListener(this);
        img.add(b4);

        b5 = new JButton("CASH WITHDRAWAL");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(74, 158, 158));
        b5.setBounds(703,272,150,35);
        b5.addActionListener(this);
        img.add(b5);

        b6 = new JButton("MINI STATEMENT");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(74, 158, 158));
        b6.setBounds(703,320,150,35);
        b6.addActionListener(this);
        img.add(b6);

        b7 = new JButton("BALANCE ENQUIRY");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(74, 158, 158));
        b7.setBounds(703,367,150,35);
        b7.addActionListener(this);
        img.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transactions("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource() == b2){
            new FastCash(pin);
            setVisible(false);
        }else if(e.getSource() == b3){
            new Pin(pin);
            setVisible(false);
        }else if(e.getSource() == b5){
            new CashWithdrawal(pin);
            setVisible(false);
        }else if(e.getSource() == b6){
            new MiniStatement(pin);
            setVisible(false);
        }else if(e.getSource() == b7){
            new Enquiry(pin);
            setVisible(false);
        }else if(e.getSource() == b4){
            System.exit(202);
        }
    }
}
