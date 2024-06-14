import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;


class Traffic extends JFrame
{
    Traffic()
    {
        JFrame frame =new JFrame("Traffic Light");
        JRadioButton[] b=new JRadioButton[3];
        ButtonGroup bg=new ButtonGroup();
        for (int i=0;i<3;i++)
        {
            b[i]=new JRadioButton("");
            b[i].setBackground(Color.BLACK);
            bg.add(b[i]);
            frame.add(b[i]);
            //b[i].setFont("Agency FB",Font.BOLD,24);

        }
        
       /*  b[1].setBackground(Color.BLACK);
        b[2].setBackground(Color.BLACK);
    
        
        bg.add(b[1]);
        bg.add(b[2]);

        
        frame.add(b[1]);
        frame.add(b[2]); */

        frame.setSize(130,300);
        frame.setLayout(new GridLayout(3,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        b[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                b[0].setBackground(Color.RED);
                b[1].setBackground(Color.BLACK);
                b[2].setBackground(Color.BLACK);
                b[0].setText("STOP");
                b[1].setText("");
                b[2].setText("");
            }
        });
        b[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                b[0].setBackground(Color.BLACK);
                b[1].setBackground(Color.YELLOW);
                b[2].setBackground(Color.BLACK);
                b[0].setText("");
                b[1].setText("WAIT");
                b[2].setText("");
            }
        });
        b[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                b[0].setBackground(Color.BLACK);
                b[1].setBackground(Color.BLACK);
                b[2].setBackground(Color.GREEN);
                b[0].setText("");
                b[1].setText("");
                b[2].setText("GO");
            }
        });
    }
}
public class EXP2 {
    public static void main(String[] args) {
        Traffic tl = new Traffic();
    }
}
