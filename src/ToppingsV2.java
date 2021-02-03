import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

/*
 * The Topping Panel class allows user to select toppings
 * for the the pizza.
 */



public class ToppingsV2 extends JPanel {

	
	// The following constants are used to indicate cost.
	// Pepperoni $1.00
	// Sausage $1.00
	// Mushrooms $1.00
	// Ham $1.00 

	public final double PEPPERONI = 1.00;
	public final double SAUSAGE = 1.00;
	public final double MUSHROOMS = 1.00;
	public final double HAM = 1.00;
	
	private JCheckBox pepperoni;	// To select pepperoni.
	private JCheckBox sausage;		// To select sausage.
	private JCheckBox mushrooms;	// To select mushrooms.
	private JCheckBox ham;			// To select ham.
	
	public ToppingsV2()
	{
		// Create a gridLayout manager
		setLayout(new GridLayout(2,4));
		setOpaque(false);
		setBorder(BorderFactory.createTitledBorder(null, "TOPPINGS", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
				null, Color.WHITE));		
		
		// Set the Pepperoni checkbox properties to Opaque and text to white
		pepperoni = new JCheckBox("Pepperoni $1.00");
		pepperoni.setOpaque(false);
		pepperoni.setForeground(Color.WHITE);  

		// Set the sausage checkbox properties to Opaque and text to white
		sausage = new JCheckBox("Sausage  $1.00");
		sausage.setOpaque(false);
		sausage.setForeground(Color.WHITE);  
		
		// Set the mushrooms checkbox properties to Opaque and text to white
		mushrooms = new JCheckBox("Mushrooms  $1.00");
		mushrooms.setOpaque(false);
		mushrooms.setForeground(Color.WHITE);  
		
		// Set the ham checkbox properties to Opaque and text to white
		ham = new JCheckBox("Ham  $1.00");
		ham.setOpaque(false);
		ham.setForeground(Color.WHITE);  

		
		// Add a border around the panel.

	
		
	    
		
		// Add the check boxes to the panel.
		add(pepperoni);
		add(sausage);
		add(mushrooms);
		add(ham);

	}
	
	
	/*
	 * Get Toppings Cost Method
	 * Return the cost of the selected toppings
	 */
	
	public double getToppingCost()
	{
		double toppingCost = 0.0;
		
		if(pepperoni.isSelected())
			toppingCost += PEPPERONI;
		if(sausage.isSelected())
			toppingCost += SAUSAGE;
		if(mushrooms.isSelected())
			toppingCost += MUSHROOMS;
		if(ham.isSelected())
			toppingCost += HAM;
		
		return toppingCost;
	}
	
	
	
}
