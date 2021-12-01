import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();
    private JButton b9 = new JButton("9");
    private JButton b8 = new JButton("8");
    private JButton b7 = new JButton("7");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton b0 = new JButton("0");
    private JButton Plus = new JButton("+");
    private JButton Minus = new JButton("-");
    private JButton Multiply = new JButton("*");
    private JButton Divide = new JButton("/");
    private JButton Equals = new JButton("=");
    private JButton Del = new JButton("C");
    private String text = "";
    public window(){
        Font ex = new Font("Impact", Font.BOLD, 40);
        setLayout(null);
        setSize(400, 600);
        setVisible(true);
        setLocation(700, 250);
        f.setFont(ex);
        f.setSize(330, 60);
        f.setLocation(25, 25);
        f.setVisible(true);
        add(f);
        b9.setFont(ex);
        b9.setSize(60,60);
        b9.setLocation(180,225);
        b9.setVisible(true);
        add(b9);
        b8.setFont(ex);
        b8.setSize(60,60);
        b8.setLocation(105,225);
        b8.setVisible(true);
        add(b8);
        b7.setFont(ex);
        b7.setSize(60,60);
        b7.setLocation(25,225);
        b7.setVisible(true);
        add(b7);
        b6.setFont(ex);
        b6.setSize(60,60);
        b6.setLocation(25,300);
        b6.setVisible(true);
        add(b6);
        b5.setFont(ex);
        b5.setSize(60,60);
        b5.setLocation(105,300);
        b5.setVisible(true);
        add(b5);
        b4.setFont(ex);
        b4.setSize(60,60);
        b4.setLocation(180,300);
        b4.setVisible(true);
        add(b4);
        b3.setFont(ex);
        b3.setSize(60,60);
        b3.setLocation(25,380);
        b3.setVisible(true);
        add(b3);
        b2.setFont(ex);
        b2.setSize(60,60);
        b2.setLocation(105,380);
        b2.setVisible(true);
        add(b2);
        b1.setFont(ex);
        b1.setSize(60,60);
        b1.setLocation(180,380);
        b1.setVisible(true);
        add(b1);
        b0.setFont(ex);
        b0.setSize(60,60);
        b0.setLocation(105,450);
        b0.setVisible(true);
        add(b0);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        Del.setFont(ex);
        Del.setSize(60,60);
        Del.setLocation(265,225);
        Del.setVisible(true);
        add(Del);
        Del.addActionListener(this);
        Plus.setFont(ex);
        Plus.setSize(60,60);
        Plus.setLocation(25,450);
        Plus.setVisible(true);
        add(Plus);
        Plus.addActionListener(this);
        Minus.setFont(ex);
        Minus.setSize(60,60);
        Minus.setLocation(180,450);
        Minus.setVisible(true);
        add(Minus);
        Minus.addActionListener(this);
        Multiply.setFont(ex);
        Multiply.setSize(60,60);
        Multiply.setLocation(265,300);
        Multiply.setVisible(true);
        add(Multiply);
        Multiply.addActionListener(this);
        Divide.setFont(ex);
        Divide.setSize(60,60);
        Divide.setLocation(265,380);
        Divide.setVisible(true);
        add(Divide);
        Divide.addActionListener(this);
        Equals.setFont(ex);
        Equals.setSize(60,60);
        Equals.setLocation(265,450);
        Equals.setVisible(true);
        add(Equals);
        Equals.addActionListener(this);
    }








    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource() == b1) {
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource() == b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource() == b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource() == b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource() == b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource() == b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource() == b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource() == b8) {
            text = text + b8.getText();
            f.setText(text);

        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            f.setText(text);

        }
        if (e.getSource() == Del) {
            text = "";
            f.setText(text);

        }
        if (e.getSource() == Multiply) {
            text = text + Multiply;
            f.setText(text);

        }
    }



    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}



