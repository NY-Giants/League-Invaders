import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
	int counter;
	int xspeed = 15;
	
Alien(int x, int y, int width, int height){
	super();
	
	this.x=x;
	this.width = width;
	this.height = height;
	this.y = y;	
}
void draw(Graphics g){
	g.drawImage(GamePanel.alienImg, x, y, width, height, null);

	
}
void update(){
	counter++;
	x += xspeed;
	if(counter == 5){
		y++;
		counter = 0;
		
	}
	
	if(counter == 4){
	
		
		
		xspeed = -xspeed;
		
	}
	super.update();
}
}
