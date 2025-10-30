package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, pinLabel;
    JTextField tf;
    JPasswordField p;
    JButton log,sign,clr;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,10,100,100);
        add(img);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image = new JLabel(ii3);
        image.setBounds(630,350,100,100);
        add(image);

        label1 = new JLabel("WELCOME TO RAM BANK");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,34));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Railway", Font.BOLD,24));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        tf = new JTextField(15);
        tf.setBounds(325,190,230,30);
        tf.setFont(new Font("Arial",Font.BOLD,12));
        add(tf);

        pinLabel = new JLabel("PIN: ");
        pinLabel.setFont(new Font("Railway",Font.BOLD,24));
        pinLabel.setForeground(Color.WHITE);
        pinLabel.setBounds(150,250,375,30);
        add(pinLabel);

        p = new JPasswordField(15);
        p.setBounds(325,250,230,30);
        p.setFont(new Font("Arial",Font.BOLD,12));
        add(p);

        log = new JButton("LOG IN");
        log.setForeground(Color.WHITE);
        log.setFont(new Font("Arial",Font.BOLD,12));
        log.setBounds(300,300,100,30);
        log.setBackground(Color.BLACK);
        log.addActionListener(this);
        add(log);

        clr = new JButton("CLEAR");
        clr.setForeground(Color.WHITE);
        clr.setFont(new Font("Arial",Font.BOLD,12));
        clr.setBounds(430,300,100,30);
        clr.setBackground(Color.BLACK);
        clr.addActionListener(this);
        add(clr);

        sign = new JButton("SIGN UP");
        sign.setForeground(Color.WHITE);
        sign.setFont(new Font("Arial",Font.BOLD,12));
        sign.setBounds(300,350,230,30);
        sign.setBackground(Color.BLACK);
        sign.addActionListener(this);
        add(sign);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel image2 = new JLabel(iii3);
        image2.setBounds(0,0,850,480);
        add(image2);

        setLayout(null);
        setSize(850,480);
        setVisible(true);
        setLocation(450,200);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == log){

            } else if(e.getSource() == clr) {
                tf.setText("");
                p.setText("");
            }else if(e.getSource() == sign){

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
