import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
int speed;
static boolean upkey;
static boolean downkey;
static boolean rightkey;
static boolean leftkey;
	public static void main(String[] args) {
	

	}
Rocketship(int x, int y){
this.x=x;
width = 35;
height = 35;
this.y = y;
speed = 400;
upkey = false;
downkey = false;
rightkey = false;
leftkey = false;
}
void update(){
if(upkey){
	y--;
}
if(downkey){
	y++;
}
if(rightkey){
	x++;
}
if(leftkey){
	x--;
}
}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
	
}
}
