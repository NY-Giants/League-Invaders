import java.awt.Color;
import java.awt.Graphics;

public class Projectile  extends GameObject {
int speed;
Projectile(int x, int y, int width, int height){
	super();
	

	this.x=x;
	this.width = width;
	this.height = height;
	this.y = y;	
	speed = 10;
	
}
void update(){
	y -= speed;
	if(y < 0){
		isAlive = false;
	}
	super.update();
}
void draw(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(x, y, width, height);
}
}
