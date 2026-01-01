package hoge5;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main2 extends Thread {
    
    
    @Override
    public void run() {
    
        Main.text.addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()== KeyEvent.VK_ENTER){
        if(Main.text.getText().equals("引く")){
        String b = Main.card.poll();
        Main.label.setText(b);
        Judge.playerpoint += Integer.parseInt(b.substring(5));
        if(Judge.turn == 1){
        Judge.dealerpoint += Integer.parseInt(b.substring(5));
            Judge.turn--;
        }
        Judge.turn++;
     

        }
    }
    

    }
});
    }
    
    
    
}