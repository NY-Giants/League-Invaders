import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {



	public static void main(String[] args) {
	

	}
Rocketship(int x, int y){
width = x;
height = y;
}
void update(){
	
}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}
