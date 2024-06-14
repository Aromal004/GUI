import javax.swing.JButton;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame implements ActionListener {
    JButton d1,d2,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,div,mul,equal,clear,mod,rev;
    JPanel reader,keys;
    JTextField read;
    Calculator() {
        super("Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        reader = new JPanel(new FlowLayout());
        keys = new JPanel(new GridLayout(5, 4));

        keys.setSize(280, 330);
        reader.setSize(280, 200);

        setLocationRelativeTo(null);

        read = new JTextField(15);
        read.setPreferredSize(new Dimension(250, 40));
        reader.add(read);
        //read.setBackground(Color.LIGHT_GRAY);

        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        equal=new JButton("=");
        mod=new JButton("%");
        rev=new JButton("<x");
        clear=new JButton("C");
        d1=new JButton(".");
        d2=new JButton(".");

        b1.setBackground(Color.LIGHT_GRAY);
        d1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        d2.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b0.setBackground(Color.LIGHT_GRAY);
        clear.setBackground(Color.WHITE);
        add.setBackground(Color.gray);
        sub.setBackground(Color.gray);
        mul.setBackground(Color.gray);
        div.setBackground(Color.gray);
        mod.setBackground(Color.gray);
        rev.setBackground(Color.red);
        equal.setBackground(Color.BLUE);

        keys.add(div);
        keys.add(mod);
        keys.add(clear);
        keys.add(rev);
        keys.add(b7);
        keys.add(b8);
        keys.add(b9);
        keys.add(mul);
        keys.add(b4);
        keys.add(b5);
        keys.add(b6);
        keys.add(sub);
        keys.add(b1);
        keys.add(b2);
        keys.add(b3);
        keys.add(add);
        keys.add(d1);
        keys.add(b0);
        keys.add(d2);
        keys.add(equal);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        d1.addActionListener(this);
        d2.addActionListener(this);

        keys.setBackground(Color.DARK_GRAY);
        reader.setBackground(Color.gray);
        add(keys, BorderLayout.SOUTH);
        add(reader);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String command=e.getActionCommand();
        if(command.equals("C"))
        {
            read.setText("");
        }
        else if(command.equals("="))
        {
            read.setText(read.getText()+" = "+eval(read.getText()));
        }
        else if(command.equals("<x"))
        {
            int l=read.getText().length();
            read.setText((read.getText()).substring(0,l-2));
        }
        else
        {
            read.setText(read.getText()+command);
        }
    }
    public static String eval(String exp)
    {
        char[] s=exp.toCharArray();
        int n=s.length;
        String op1="",op2="";
        String operator="";
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s[i]) )
            {
                if(op1.equals(""))
                    op1=op1+s[i];
                else if(op2.equals(""))
                    op2=op2+s[i];
            }
            else
            {
                operator=operator+s[i];
            }
            
        }
        if(operator.equals("+"))
        {
            return ""+(Integer.parseInt(op1)+Integer.parseInt(op2));
        }
        if(operator.equals("-"))
        {
            return ""+(Integer.parseInt(op1)-Integer.parseInt(op2));
        }
        if(operator.equals("*"))
        {
            return ""+(Integer.parseInt(op1)*Integer.parseInt(op2));
        }
        if(operator.equals("/"))
        {
            return ""+(Integer.parseInt(op1)/Integer.parseInt(op2));
        }
        if(operator.equals("%"))
        {
            return ""+(Integer.parseInt(op1)%Integer.parseInt(op2));
        }
        return "";
    } 
    public static void main(String[] args) {
        new Calculator();
    }
}
