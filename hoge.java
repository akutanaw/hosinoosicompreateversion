package hoge5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class hoge extends Dialog {
 public int count = 0;
    public hoge(Frame owner) {
        super(owner);    
        addWindowListener ( new WindowAdapter () {
            public void windowClosing (WindowEvent we) {
                setVisible(false);
            }
        });
        Color col2 = new Color(0,0,0);
        Button button = new Button("表示");
        GridBagLayout gnt = new GridBagLayout();
        GridBagConstraints cont = new GridBagConstraints();
        
        cont.gridx = 0;
        cont.gridy = 0;
        cont.gridheight = 0;
        cont.gridwidth = 2;
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                setTitle(String.valueOf(count));
            }
        });
        setLayout(gnt);
        gnt.setConstraints(button, cont);
        button.setPreferredSize(new Dimension(50,50));
        add(button);
        button.setVisible(true);
        setBackground(col2);
        setTitle("ぽっぷあっぷ");
        setSize(100, 100);
        setVisible(true);  
    }
    
    
}
