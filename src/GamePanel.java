import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {  
Timer time;
Font titleFont;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState;
public static BufferedImage alienImg;
public static BufferedImage rocketImg;
public static BufferedImage bulletImg;
public static BufferedImage spaceImg;
ImageIcon icon;
JLabel label;
Rocketship ship;
ObjectManager manager = new ObjectManager();
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
		
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	//	ImageIcon icon = new ImageIcon(spaceImg); 
		// thumb = new JLabel();
		//thumb.setIcon(icon);
		//this.add(thumb);
		manager.addObject(ship); 
	
}
void startGame(){
	time.start();
}
void  updateMenuState(){
	
}
void updateGameState(){
manager.update();
manager.manageEnemies();
manager.checkCollision();
if(!ship.isAlive){
	currentState = END_STATE;
	manager.reset();
	ship = new Rocketship(100,110);
	manager.addObject(ship);
}

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
	
	manager.draw(g);

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
	if(e.getKeyCode()==KeyEvent.VK_UP){
		Rocketship.upkey = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_DOWN){
		Rocketship.downkey = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT){
		Rocketship.rightkey = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		Rocketship.leftkey = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_SPACE){

		manager.addObject(new Projectile((ship.x + ship.width/2 -5 ), (ship.y -10), 10, 10));
	}
}
@Override
public void keyReleased(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_UP){
		Rocketship.upkey = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_DOWN){
		Rocketship.downkey = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT){
		Rocketship.rightkey = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		Rocketship.leftkey = false;
	}
}
}
