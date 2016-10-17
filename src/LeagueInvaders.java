import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders {
JFrame frame;
static final int width = 500;
static final int height = 800;
GamePanel gpanel = new GamePanel();
	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
			invaders.setup();
		
	}
LeagueInvaders(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.addKeyListener(gpanel);


}
void setup(){
	frame.add(gpanel);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	gpanel.startGame();
}

}
