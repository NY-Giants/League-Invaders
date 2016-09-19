import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {  
Timer time;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState;
@Override
public void actionPerformed(ActionEvent e) {
	
}
GamePanel(){
	time = new Timer(1000/60, this);
	int currentState = final int MENU_STATE;
}
void startGame(){
	time.start();
}
public void paintComponent(Graphics g){

}
@Override
public void keyTyped(KeyEvent e) {
	System.out.println("Good Morning");
	
}
@Override
public void keyPressed(KeyEvent e) {
	System.out.println("Good Afternoon");	
}
@Override
public void keyReleased(KeyEvent e) {
	System.out.println("Good Night");	
}
}
