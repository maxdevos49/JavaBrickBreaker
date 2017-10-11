import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		int r = 0;
		int g2 = 0;
		int b = 0;
		Color myColor = new Color(r += 20, g2 += 10, b += 50);
		int run = 0;

		while (run < 200){

			run++;


			for(int i = 0; i < 12; i++ ){
				for(int ii = 0; ii < 12; ii++ ){


					r += 10;
					g2 += 10;
					b += 10;

					if(r > 255){
						r = 0;
					}
					if(g2 > 255){
						g2 = 0;
					}
					if(b > 255){
						b = 0;
					}

					myColor = new Color(r, g2, b);
					g.setColor(myColor);
					g.fillRect(0 + (ii * 50),0 + (i * 50),200,200);

				}
			}
		}
	}	

}
