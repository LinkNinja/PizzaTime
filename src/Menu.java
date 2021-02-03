/*borderExample.java
 * April 7, 2020
 * This program demonstrates the BorderLayout.
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;

public class Menu extends JFrame {


	// Variables for classes
	private PizzaV2 selectPizzaSizeV2;
	private ToppingsV2 selectToppingsV2;
	private DrinksV2 selectDrinksV2;

	// Label to thold the total
	private JLabel lblTotal;
	private JLabel lblTitle;
	private JLabel lblSize;
	private JLabel lblToppings;
	private JLabel lblDrinks;

	private JPanel pnlTotal;
	private JPanel pnlExit;

	private JButton btnTotal;
	private JButton btnExit;

	private ImageIcon pizzaIcon = new ImageIcon("pizzaIcon.jpg");
	private ImageIcon drinksIcon = new ImageIcon("drinksIcon.jpg");
	private ImageIcon toppingsIcon = new ImageIcon("toppingsIcon.jpg");
	// Constructor

	Menu() {

		// Call super class and assign Title to window
		super("Lab 6 - Pizza Gui");

		// Set the size of the window.
		setSize(600, 800);

		// Set the Background of what is contained inside the Menu Window
		setContentPane(new JLabel(new ImageIcon(("menuBackground.jpg"))));

		// Set the Grid Layout of the Menu Window.
		setLayout(new GridLayout(10, 5));

		// Set the close operation for Menu Window.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Declare the Pizza panel with everything thats inside its constuctor
		selectPizzaSizeV2 = new PizzaV2();
		selectToppingsV2 = new ToppingsV2();
		selectDrinksV2 = new DrinksV2();

		// Declare the labels

		// Title Label and its attributes
		lblTitle = new JLabel("Seahawks Pizza", SwingConstants.CENTER);
		lblTitle.setFont(new Font("Serif", Font.BOLD, 25));
		lblTitle.setForeground(new Color(173, 216, 230));

		// Select Pizza Size Label with font style,size,color. Pizza Icon also included
		lblSize = new JLabel("Select Pizza Size", pizzaIcon, SwingConstants.CENTER);
		lblSize.setFont(new Font("Chalkboard", Font.PLAIN, 25));
		lblSize.setForeground(Color.red);
		lblSize.setHorizontalTextPosition(SwingConstants.LEFT);

		// Select Toppings Label with font style,size,color.
		lblToppings = new JLabel("Select Toppings: ",toppingsIcon, SwingConstants.CENTER);
		lblToppings.setFont(new Font("Chalkboard", Font.PLAIN, 25));
		lblToppings.setForeground(Color.white);
		lblToppings.setHorizontalTextPosition(SwingConstants.LEFT);
		
		

		// Select Drinks Label with font style,size,color.
		lblDrinks = new JLabel("Select a drink: ", SwingConstants.CENTER);
		lblDrinks.setFont(new Font("Chalkboard", Font.PLAIN, 25));
		lblDrinks.setForeground(Color.green);
		lblDrinks.setIcon(drinksIcon);
		lblDrinks.setHorizontalTextPosition(SwingConstants.LEFT);

		// Total Label with font style,size,color.
		lblTotal = new JLabel("Total: $0.00", SwingConstants.CENTER);
		lblTotal.setFont(new Font("Serif", Font.BOLD, 25));
		lblTotal.setForeground(Color.white);

		// total panel to hold total button
		pnlTotal = new JPanel();
		// exit panel to hold exit button
		pnlExit = new JPanel();

		btnTotal = new JButton("Calculate Total");
		btnTotal.setContentAreaFilled(false);
		btnTotal.addActionListener(new btnTotalListener());

		btnExit = new JButton("Exit");
		btnExit.setPreferredSize(new Dimension(100, 20));
		btnExit.addActionListener(new btnExitListener());

		// Add the buttons to the panels for exit and total.
		pnlExit.add(btnExit);
		pnlTotal.add(btnTotal);

		// Add Pizza Resteraunt label
		add(lblTitle);
		// Add the SelectSize Title Label
		add(lblSize);

		// Add the Select Pizza size panel
		add(selectPizzaSizeV2);

		add(lblToppings);

		add(selectToppingsV2);

		add(lblDrinks);

		add(selectDrinksV2);
		// The totalLa
		add(lblTotal);

		add(pnlTotal);
		// the panel containing the exit button is added to this Window
		add(pnlExit);

		// set visible
		setVisible(true);

	}

	// Method that will calculate total of the Pizza order.

	public void calculateTotal() {
		lblTotal.setText(String.format("%s%.2f", "Total: $", (selectPizzaSizeV2.getPizzaSizeCost()
				+ selectToppingsV2.getToppingCost() + selectDrinksV2.getDrinksCost())));
		lblTotal.setForeground(Color.white);
	}

	// Action listener for the Exit button
	private class btnExitListener implements ActionListener {
		// Add close application to btnExitListener.
		// This will close out the application when the exit button is pressed.
		public void actionPerformed(ActionEvent e) {
			dispose();
		}

	}

	// Action listener for the Calculate total button
	private class btnTotalListener implements ActionListener {
		// Add updateTotal(); to btntotalListender
		// This will close out the application when the exit button is pressed.
		public void actionPerformed(ActionEvent e) {
			calculateTotal();
		}

	}

//The main method that calls the WindowDriver and runs all of the code within size,toppings,drinks.
	public static void main(String[] args) {
		// declare an instance of borderExample
		Menu myWindow = new Menu();

	}

}
