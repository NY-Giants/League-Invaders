import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int length;
void update(){
x = x +1;
}
GameObject(){
	x = 50;
	y  = 500;
}
void draw(Graphics batman){
	batman.fillRect(x, y, 100, 100);
}
}
