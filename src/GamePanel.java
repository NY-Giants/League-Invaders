import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {  
Timer time;
GameObject object = new GameObject();

@Override
public void actionPerformed(ActionEvent e) {
	object.update();
	repaint();
}
GamePanel(){
	time = new Timer(1000/60, this);
}
void startGame(){
	time.start();
}
public void paintComponent(Graphics g){
	object.draw(g);
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
