import javax.swing.JFrame;
public class RunnerClass {
JFrame frame;
static final int width = 500;
static final int height = 800;
public static void main(String[] args) {

}
	RunnerClass(){
			frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(width, height);
			
	}
	void setup(){
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		}
}
