package bank.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    Random ran = new Random();
    long f4 = (ran.nextLong() % 9000L) + 1000L;
    String f = " " + Math.abs(f4);
    JTextField textName, fName, email, address, city, code, state;
    JDateChooser date;
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(25,10,100,100);
        add(img);

        JLabel l1 = new JLabel("APPLICATION FORM NO. " + f);
        l1.setBounds(160,20,600,40);
        l1.setFont(new Font("Railway",Font.BOLD,34));
        add(l1);

        JLabel l2 = new JLabel("Page 1");
        l2.setFont(new Font("Railway",Font.BOLD,20));
        l2.setBounds(330,70,600,30);
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setFont(new Font("Railway",Font.BOLD,22));
        l3.setBounds(290,90,600,30);
        add(l3);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Railway",Font.BOLD,18));
        name.setBounds(100,190,100,30);
        add(name);

        textName = new JTextField();
        textName.setFont(new Font("Railway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel father = new JLabel("Father's Name: ");
        father.setFont(new Font("Railway",Font.BOLD,18));
        father.setBounds(100,240,200,30);
        add(father);

        fName = new JTextField();
        fName.setFont(new Font("Railway",Font.BOLD,14));
        fName.setBounds(300,240,400,30);
        add(fName);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Railway",Font.BOLD,18));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        date = new JDateChooser();
        date.setForeground(new Color(105,105,105));
        date.setBounds(300,340,400,30);
        add(date);

        JLabel g = new JLabel("Gender: ");
        g.setFont(new Font("Railway",Font.BOLD,18));
        g.setBounds(100,290,200,30);
        add(g);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway", Font.BOLD,12));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway", Font.BOLD,12));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Railway", Font.BOLD,12));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,290,60,30);
        add(r3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JLabel lm = new JLabel("Email Address: ");
        lm.setFont(new Font("Railway",Font.BOLD,18));
        lm.setBounds(100,390,200,30);
        add(lm);

        email = new JTextField();
        email.setFont(new Font("Railway",Font.BOLD,14));
        email.setBounds(300,390,400,30);
        add(email);

        JLabel lms = new JLabel("Married Status: ");
        lms.setFont(new Font("Railway",Font.BOLD,18));
        lms.setBounds(100,440,200,30);
        add(lms);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Railway", Font.BOLD,12));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,90,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Railway", Font.BOLD,12));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,90,30);
        add(m2);

        m3 = new JRadioButton("Divorced");
        m3.setFont(new Font("Railway", Font.BOLD,12));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,90,30);
        add(m3);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(m1);
        bg2.add(m2);

        JLabel add = new JLabel("Address: ");
        add.setFont(new Font("Railway",Font.BOLD,18));
        add.setBounds(100,490,200,30);
        add(add);

        address = new JTextField();
        address.setFont(new Font("Railway",Font.BOLD,14));
        address.setBounds(300,490,400,30);
        add(address);

        JLabel c = new JLabel("City: ");
        c.setFont(new Font("Railway",Font.BOLD,18));
        c.setBounds(100,540,200,30);
        add(c);

        city = new JTextField();
        city.setFont(new Font("Railway",Font.BOLD,14));
        city.setBounds(300,540,400,30);
        add(city);

        JLabel pin = new JLabel("Pin Code: ");
        pin.setFont(new Font("Railway",Font.BOLD,18));
        pin.setBounds(100,590,200,30);
        add(pin);

        code = new JTextField();
        code.setFont(new Font("Railway",Font.BOLD,14));
        code.setBounds(300,590,400,30);
        add(code);

        JLabel s = new JLabel("State: ");
        s.setFont(new Font("Railway",Font.BOLD,18));
        s.setBounds(100,640,200,30);
        add(s);

        state = new JTextField();
        state.setFont(new Font("Railway",Font.BOLD,14));
        state.setBounds(300,640,400,30);
        add(state);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,12));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = f;
        String name = textName.getText();
        String father = fName.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()) gender = "Male";
        else if(r2.isSelected()) gender = "Female";
        else if(r3.isSelected()) gender = "Other";
        String em = email.getText();
        String martial = null;
        if(m1.isSelected()) martial = "Married";
        else if(m2.isSelected()) martial = "Unmarried";
        else if(m3.isSelected()) martial = "Divorced";
        String add = address.getText();
        String c = city.getText();
        String pc = code.getText();
        String st = state.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn con1 = new Conn();
                String q = "insert into signup values('"+formNo+"','"+name+"','"+father+"','"+dob+"','"+gender+"','"+em+"','"+martial+"','"+add+"','"+c+"','"+pc+"','"+st+"')";
                con1.statement.executeUpdate(q);
                new Signup2(f);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
