import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

//these are the objects/ or the constructors 
public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2, 10);// gives me the text area for the
												// words

	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");

	JButton buttonadd = new JButton("+");
	JButton buttonsub = new JButton("-");
	JButton buttonmul = new JButton("*");
	JButton buttondiv = new JButton("/");
	JButton buttonclr = new JButton("clr");
	JButton buttondot = new JButton(".");
	JButton buttonequal = new JButton("=");

	// this creates the size of the calculator
	public Calculator() {
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");

		// this creates a red border
		frame.add(panel);
		panel.setBackground(Color.gray);
		Border border = BorderFactory.createLineBorder(Color.RED, 6);// this
																		// gives
																		// me
																		// the
																		// size
																		// of
																		// the
																		// border
																		// and
																		// the
																		// color
																		// of
																		// the
																		// border
		panel.setBorder(border);

		panel.add(textarea);// this implements the text area on the middle top

		textarea.setBackground(Color.BLUE);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE, 3);
		textarea.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.white);
		textarea.setPreferredSize(new Dimension(2, 10));
		textarea.setLineWrap(true);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);

		panel.add(buttondot);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonadd);
		panel.add(buttonequal);
		panel.add(buttonclr);

	}

}
