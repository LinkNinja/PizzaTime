//menu.java
//April 7, 2020
//This program demonstrates both check box objects and the GridLayout.

import javax.swing.*; //needed for JFrame
import java.awt.*; //needed for GridLayout
import java.awt.event.*; //needed for Listener interfaces

public class Drinks extends JPanel implements ActionListener {

	private ButtonGroup grpRadioSnacks = new ButtonGroup();
	private Menu frame;

	private double price;

	// constructor
	public Drinks() {

		this.frame = frame;
		this.setLayout(new GridLayout(1, 4));

		createButton("Soda $2.00", "2");
		createButton("Tea $1.50", "1.50");
		createButton("Bottled Water $1.25", "1.25");
		createButton("Tap Water $0.00", "0");

		this.setVisible(true);
	}

	private JRadioButton createButton(String text, String actionCommand) {
		JRadioButton button = new JRadioButton(text);
		button.setActionCommand(actionCommand);
		button.addActionListener(this);
		button.setForeground(Color.white);
		button.setBackground(Color.black);
		this.grpRadioSnacks.add(button);
		this.add(button);

		return button;
	}

	public void actionPerformed(ActionEvent e) {
		this.price = Double.parseDouble(e.getActionCommand());
		// frame.updateTotal();
	}

	public double getPrice() {
		return price;
	}

}
