import java.awt.Color;
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
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
}
GamePanel(){
	time = new Timer(1000/60, this);
	 currentState = MENU_STATE;
}
void startGame(){
	time.start();
}
void  updateMenuState(){
	
}
void updateGameState(){
	
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    

}
void drawGameState(Graphics g){
	
}
void drawEndState(Graphics g){
	
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
