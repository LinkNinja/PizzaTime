import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pizza extends JPanel implements ActionListener {

	// part of the code that allows you to create a button group so only one is
	// selected
	ButtonGroup pizzaSize = new ButtonGroup();
	// the price we will be using to store the pizza size and calculate
	double price = 0.0;

	public Pizza() {

		JPanel pizzaPanel = new JPanel();
		pizzaPanel.setBackground(Color.BLUE);

		// ImageIcon imgPizza= new ImageIcon("pizza.png");
		// JLabel label1 = new JLabel(imgPizza, JLabel.CENTER);

		this.setLayout(new GridLayout(1, 4));

		// create buttons with text and pricing
		createButton("Small", "7");
		createButton("Medium", "9");
		createButton("Large", "11");
		createButton("Extra large", "14");

	}

	private void createButton(String text, String actionCommand) {
		// Here if you remove text it will remove the text from the radio buttons which
		// are using createButton above
		JRadioButton button = new JRadioButton(text);
		// Here it sends the command which would be the price of the pizza size to the
		// action listener
		button.setActionCommand(actionCommand);
		button.addActionListener(this);

		button.setForeground(Color.white);
		button.setBackground(Color.black);
		// removing button allows you to select multiple pizza sizes. Leave alone
		this.pizzaSize.add(button);
		this.add(button);
	}

	public double getPrice() {
		return price;
	}

	public void actionPerformed(ActionEvent e) {
		this.price = Double.parseDouble(e.getActionCommand());
		// frame.updateTotal();
	}
}
