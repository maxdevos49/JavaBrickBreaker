
// public class Main {

// 	public static void main(String[] args){

// 		System.out.println("Hello Terminal");

// 	}

// }







import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window win = new Window();
		frame.add(win);
		frame.setSize(600,600);
		frame.setVisible(true);
		
		
	}

}

