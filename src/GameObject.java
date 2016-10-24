import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
int x;
int y;
int width;
int height;
boolean isAlive;
Rectangle collisionBox;
void update(){
	collisionBox.setBounds(x, y, width, height);
}
GameObject(){
	x = 50;
	y  = 500;
	isAlive = true;
	 collisionBox = new Rectangle(x ,y, width, height);
}
void draw(Graphics batman){

}
}
