import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

//This is the pizza panel class that will update the look of the pizza button panel.

public class PizzaV2 extends JPanel {

	// Private final variables storing the prices
	public final double SMALL = 7;
	public final double MEDIUM = 9;
	public final double LARGE = 11;
	public final double EXTRA_LARGE = 14;

	// Private radio buttons to hold the sizes
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	private JRadioButton extraLarge;

	// Private button group to hold the size buttons together
	private ButtonGroup sizeBtnGr;

	// Constructor
	public PizzaV2() {

		// Set the grid lay out with 2 rows 4 colums
		setLayout(new GridLayout(2, 4));
		setOpaque(false);
		setBorder(BorderFactory.createTitledBorder(null, "SIZE", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				null, Color.WHITE));
		
		
		// Create the Radio Buttons
		// The small button is automatically set to true in this case. 
		small = new JRadioButton("Small $7.00", true);
		medium = new JRadioButton("Medium $9.00");
		large = new JRadioButton("Large $11.00");
		extraLarge = new JRadioButton("Extra Large $14.00");

		// Set the small button properties to Opaque and red
		small.setOpaque(false);
		small.setForeground(Color.red);

		// Set the medium button properties to Opaque and red
		medium.setOpaque(false);
		medium.setForeground(Color.red);

		// Set the large button properties to Opaque and red
		large.setOpaque(false);
		large.setForeground(Color.red);

		// Set the extraLarge button properties to Opaque and red
		extraLarge.setOpaque(false);
		extraLarge.setForeground(Color.red);

		// Group the Radio Buttons.
		sizeBtnGr = new ButtonGroup();
		sizeBtnGr.add(small);
		sizeBtnGr.add(medium);
		sizeBtnGr.add(large);
		sizeBtnGr.add(extraLarge);

		// Add a border around the panel.
		
	

		// Add the radio buttons to the panel.
		add(small);
		add(medium);
		add(large);
		add(extraLarge);

	}

	// Function to store what button is selected for pizza size and store its price
	// to the total.
	public double getPizzaSizeCost() {
		double sizeCost = 0.0;

		if (small.isSelected())
			sizeCost = SMALL;
		if (medium.isSelected())
			sizeCost = MEDIUM;
		if (large.isSelected())
			sizeCost = LARGE;
		if (extraLarge.isSelected())
			sizeCost = EXTRA_LARGE;

		return sizeCost;
	}

}
