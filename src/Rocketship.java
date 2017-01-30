import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	static boolean upkey;
	static boolean downkey;
	static boolean rightkey;
	static boolean leftkey;

	public static void main(String[] args) {

	}

	Rocketship(int x, int y) {
		super();
		this.x = x;
		width = 35;
		height = 35;
		this.y = y;
		speed = 10;
		upkey = false;
		downkey = false;
		rightkey = false;
		leftkey = false;
	}

	void update() {

		if (upkey) {
			y--;

		}

		if (downkey) {
			y++;
		}
		if (rightkey) {
			x++;
		}
		if (leftkey) {
			x--;
		}
		super.update();
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}
}
