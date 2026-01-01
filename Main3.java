package hoge5;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main3 extends Thread{
    @Override
    public void run(){
        Main.text.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {     


        
if(e.getKeyCode()==KeyEvent.VK_ENTER){
        if(Main.text.getText().equals("待つ")){
        for(; true ;){
            String b = Main.card.poll();
            Main.label.setText(b);
            Judge.dealerpoint += Integer.parseInt(b.substring(5));
            if(21/1.5 < Judge.dealerpoint){
        if(Judge.playerpoint >= Judge.dealerpoint && 21 > Judge.dealerpoint && 21 > Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }
        if(Judge.playerpoint <= Judge.dealerpoint && 21 >= Judge.dealerpoint && 21 >= Judge.playerpoint){
            Main.label.setText("D勝利");
              break;
        }
           if(Judge.playerpoint >= Judge.dealerpoint && 21 <= Judge.dealerpoint && 21 <= Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }if(Judge.playerpoint <= Judge.dealerpoint && 21 <= Judge.dealerpoint && 21 <= Judge.playerpoint){
            Main.label.setText("D勝利");
              break;
        }
        if(Judge.playerpoint >= Judge.dealerpoint && 21 <= Judge.dealerpoint && 21 >= Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }if(Judge.playerpoint <= Judge.dealerpoint && 21 <= Judge.dealerpoint && 21 >= Judge.playerpoint){
            Main.label.setText("D勝利");
              break;
        }
        if(Judge.playerpoint >= Judge.dealerpoint && 21 >= Judge.dealerpoint && 21 <= Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }if(Judge.playerpoint <= Judge.dealerpoint && 21 >= Judge.dealerpoint && 21 <= Judge.playerpoint){
            Main.label.setText("D勝利");
              break;
        }
        if(Judge.playerpoint <= Judge.dealerpoint && 21 <= Judge.dealerpoint && 21 <= Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }if(Judge.playerpoint >= Judge.dealerpoint && 21 >= Judge.dealerpoint && 21 >= Judge.playerpoint){
            Main.label.setText("P勝利");
              break;
        }
        
    }
    }
        }
    }        
        
        



        }
    }
    

        
    
);   
}
}
