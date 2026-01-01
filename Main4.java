package hoge5;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main4 extends Thread{
    @Override
    public void run(){
        Main.text.addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_ENTER && !(Main.text.getText().equals("待つ")) && !(Main.text.getText().equals("引く"))){
    Main.label2.setText(Main.text.getText());
    if(Main.label2.getText().length() > 10){
        Main.label3.setText(Main.text.getText().substring(10));
    }
        }
        }
        
});
    }
    
}
