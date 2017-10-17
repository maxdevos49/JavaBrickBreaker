import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JPanel implements ActionListener,KeyListener{

	Timer tm = new Timer(5, this);
	int x = 300, velX = 0, y = 300, velY = 0;
	String keyPress = "False";

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillRect(x,580,100,10);

		g.setColor(Color.RED);
		g.fillRect(x,10,100,10);

		g.setColor(Color.RED);
		g.fillRect(10,y,10,100);

		g.setColor(Color.RED);
		g.fillRect(580,y,10,100);


	}

	public Main(){

		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	public void actionPerformed(ActionEvent e){

		if(x < 0){
			velX = 0;
			x = 10;

		}else if(x > 490){
			velX = 0;
			x = 490;
		}

		if(y < 0){
			velY = 0;
			y = 10;
		}else if(y > 490){
			velY = 0;
			y = 490;
		}

		x += velX;
		y += velY;

		repaint();

	}

	public void keyPressed(KeyEvent e){

		int c = e.getKeyCode();
		//keyPress = "True";

		if(c == e.VK_LEFT){

			velX = -3;
			velY = 0;
			//keyPress = "False";

		}else if(c == e.VK_RIGHT){

			velX = 3;
			velY = 0;
			//keyPress = "False";

		}else if(c == e.VK_UP){

			velY = -3;
			velX = 0;
			//keyPress = "False";

		}else if(c == e.VK_DOWN){

			velY = 3;
			velX = 0;
			//keyPress = "False";

		}


	}

	public void keyTyped(KeyEvent e){}

	public void keyReleased(KeyEvent e){

		// int c = e.getKeyCode();

		// if (keyPress == "False"){

		// 	if(c == e.VK_LEFT){

		// 		velX = 0;


		// 	}
		// 	if(c == e.VK_RIGHT){

		// 		velX = 0;


		// 	}
		// 	if(c == e.VK_UP){

		// 		velY = 0;

		// 	}
		// 	if(c == e.VK_DOWN){

		// 		velY = 0;

		// 	}
		// }

	}

	//main function. program begins here
	public static void main(String[] args) {

		Main br = new Main();
		JFrame frame = new JFrame();
		frame.setTitle("Bouncing Rectangle");
		frame.setSize(600,620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(br);
		frame.setVisible(true);

	}

}

