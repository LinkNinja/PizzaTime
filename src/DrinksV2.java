import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

/*
 * The Second version of the Drinks Panel Class that allows the user to select
 * a drink.
 */

public class DrinksV2 extends JPanel{


	public final double SODA = 2.00;
	public final double TEA = 1.50;
	public final double BOTTLED_WATER = 1.25;
	public final double TAP_WATER = 0.00;
	
	private JRadioButton soda;				// To select the soda
	private JRadioButton tea;				// To select the tea
	private JRadioButton bottledWater;		// To select the bottled water.
	private JRadioButton tapWater;			// to select the tap water.
	private ButtonGroup drinksBtnGr;	// Radio button group for the water
	
	
	//Constructor for the drinks panel.
	public DrinksV2()
	{
		// Create a Grid Layout Manager with
		// two(2) rows and four(4) column
		setLayout(new GridLayout(2,4));
		setOpaque(false);
		setBorder(BorderFactory.createTitledBorder(null, "DRINKS", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				null, Color.WHITE));
		
		
		
		// Set the soda button properties to Opaque and green
		soda = new JRadioButton("Soda $2.00");
		soda.setOpaque(false);
		soda.setForeground(Color.green);  
		
		// Set the tea button properties to Opaque and green
		tea = new JRadioButton("Tea $1.50");
		tea.setOpaque(false);
		tea.setForeground(Color.green);  
		
		// Set the bottledWater button properties to Opaque and green
		bottledWater = new JRadioButton("Bottled Water $1.00");
		bottledWater.setOpaque(false);
		bottledWater.setForeground(Color.green);  
		
		// Set the tapWater button properties to Opaque and green
		tapWater = new JRadioButton("Tap Water $0.00");
		tapWater.setOpaque(false);
		tapWater.setForeground(Color.green);  
		
		
		// Group the Radio buttons
		drinksBtnGr = new ButtonGroup();
		drinksBtnGr.add(soda);
		drinksBtnGr.add(tea);
		drinksBtnGr.add(bottledWater);
		drinksBtnGr.add(tapWater);

		
		//Add the radio buttons to the panel.
		add(soda);
		add(tea);
		add(bottledWater);
		add(tapWater);
		
		
	}
	
	// Function to Get the drinks cost and return the total.
	public double getDrinksCost()
	{
		double drinksCost = 0.0;
		
		if(soda.isSelected())
			drinksCost += SODA;
		else if(tea.isSelected())
			drinksCost += TEA;
		else if(bottledWater.isSelected())
			drinksCost += BOTTLED_WATER;
		else if(tapWater.isSelected())
			drinksCost += TAP_WATER;
		return drinksCost;
	}

}
