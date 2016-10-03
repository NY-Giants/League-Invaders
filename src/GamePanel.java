import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {  
Timer time;
Font titleFont;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState;
Rocketship ship;
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	
	if(currentState == MENU_STATE){
		updateMenuState( );
	}else if(currentState == GAME_STATE){
		updateGameState( );
	}else if(currentState == END_STATE){
		updateEndState();
	}
}
GamePanel(){
	time = new Timer(1000/60, this);
	 currentState = MENU_STATE;
	 titleFont = new Font("Arial", Font.PLAIN, 48);
	 ship = new Rocketship(50, 50);
		ship.x = 250;
		ship.y = 700;
	 
}
void startGame(){
	time.start();
}
void  updateMenuState(){
	
}
void updateGameState(){
	ship.update();
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);  
	g.setFont(titleFont); 
	g.setColor(Color.GREEN);
	g.drawString("LeagueInvaders", 50, 100);
	
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
	ship.draw(g);

}
void drawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
	g.setFont(titleFont); 
	g.setColor(Color.GREEN);
	g.drawString("Game Over", 50, 100);
}
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		drawMenuState( g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_ENTER)
	{
		currentState++;
		
		if(currentState > END_STATE){
			currentState = MENU_STATE;
		}	
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
}
}
