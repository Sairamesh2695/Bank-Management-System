package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan,textAd;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    Signup2(String f){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(150,5,100,100);
        add(img);
        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Railway",Font.BOLD,20));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String[] religion = {"Hindu","Christian","Muslim","Sikh","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(181,211,204));
        comboBox.setFont(new Font("Railway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String[] category = {"General","General-EWS","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(181,211,204));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Railway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String[] income = {"null","< 1,50,000","< 2,50,000","< 5,00,000","up to 10,00,000","above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(181,211,204));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational: ");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String[] educational = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(181,211,204));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Railway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String[] occupation = {"Salaried","Self-Employed","Business","Retired","Student","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(181,211,204));
        comboBox5.setFont(new Font("Railway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number: ");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Railway",Font.BOLD,18));
        textPan.setBounds(350,390,300,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhaar Number: ");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(100,440,200,30);
        add(l9);

        textAd = new JTextField();
        textAd.setFont(new Font("Railway",Font.BOLD,18));
        textAd.setBounds(350,440,300,30);
        add(textAd);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Railway",Font.BOLD,18));
        l10.setBounds(100,490,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBounds(350,490,90,30);
        r1.setBackground(new Color(181, 211, 204));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBounds(460,490,90,30);
        r2.setBackground(new Color(181, 211, 204));
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Railway",Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Railway",Font.BOLD,14));
        e1.setBounds(350,540,90,30);
        e1.setBackground(new Color(181, 211, 204));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Railway",Font.BOLD,14));
        e2.setBounds(460,540,90,30);
        e2.setBackground(new Color(181, 211, 204));
        add(e2);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(e1);
        bg1.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Railway",Font.BOLD,18));
        l12.setBounds(700,10,150,30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Railway",Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        getContentPane().setBackground(new Color(181, 211, 204));
        setSize(850,750);
        setLocation(450,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
