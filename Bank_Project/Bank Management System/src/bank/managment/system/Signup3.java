package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){
        super("ACCOUNT DETAILS");

        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(150,5,100,100);
        add(img);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(280,80,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Savings");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(239,209,209));
        r1.setBounds(100,180,200,30);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(239,209,209));
        r2.setBounds(350,180,300,30);
        add(r2);
        r3 = new JRadioButton("Current");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(239,209,209));
        r3.setBounds(100,220,200,30);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(239,209,209));
        r4.setBounds(350,220,200,30);
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel l4 = new JLabel("Card Number");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,280,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16 digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,10));
        l5.setBounds(100,300,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-5887");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,280,250,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statement)");
        l7.setFont(new Font("Raleway",Font.BOLD,10));
        l7.setBounds(330,300,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,340,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,340,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,10));
        l10.setBounds(100,360,500,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,400,200,30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(239,209,209));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,450,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(239,209,209));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,250,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(239,209,209));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,500,250,30);
        add(c3);

        c4 = new JCheckBox("E-Mail Alert");
        c4.setBackground(new Color(239,209,209));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,450,200,30);
        add(c4);

        c5 = new JCheckBox("Check Book");
        c5.setBackground(new Color(239,209,209));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,550,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(239,209,209));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,550,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I Hereby Declare that the details given above are correct to my Knowledge.",true);
        c7.setBackground(new Color(239,209,209));
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBounds(100,630,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(680,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,670,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,670,100,30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        getContentPane().setBackground(new Color(239, 209, 209));
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType = "";
        if(r1.isSelected()) aType = "Savings";
        else if(r2.isSelected()) aType = "Fixed Deposit";
        else if(r3.isSelected()) aType = "Current";
        else if(r4.isSelected()) aType = "Recurring Deposit";

        Random ran = new Random();
        long f7 = (ran.nextLong() % 90000000L) + 630225000000000L;
        String cno = "" + Math.abs(f7);
        long f3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(f3);
        String ser = "";
        if(c1.isSelected()) ser += "ATM CARD";
        else if(c2.isSelected()) ser += "Internet Banking";
        else if(c3.isSelected()) ser += "Mobile Banking";
        else if(c4.isSelected()) ser += "E-Mail Alert";
        else if(c5.isSelected()) ser += "Check Book";
        else if(c6.isSelected()) ser += "E-Statement";

        try{
            if(e.getSource() == s){
                if(aType.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill All the fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "INSERT INTO signup3 VALUES('"+formno+"','"+aType+"','"+cno+"','"+pin+"','"+ser+"')";
                    String q2 = "INSERT INTO login VALUES('"+formno+"','"+cno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number:" + cno +"\n PIN: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if(e.getSource() == c){
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
