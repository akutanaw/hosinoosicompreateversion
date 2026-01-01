package hoge5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main5 extends Thread{
    @Override
    public void run(){
        Main.text.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(Main.text.getText().equals("動け")){
                 try {
                    Robot robot = new Robot();
                    robot.mouseMove(1600,600);

                 } catch (AWTException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                 }
                }            
                }
            
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(Main.text.getText().equals("動け")){
                 try {
                    Robot robot = new Robot();
                    robot.mouseMove(1600,600);

                 } catch (AWTException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                 }
                }            
                }
            
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }});
    }
    
}
