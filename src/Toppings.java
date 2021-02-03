
import javax.swing.*; //needed for JFrame
import java.awt.*; //needed for GridLayout
import java.awt.event.*; //needed for Listener interfaces

public class Toppings extends JPanel implements ItemListener {

	// Declare variables for check boxes to be used in Toppings.
	private JCheckBox chkPepperoni; // To select pepperoni
	private JCheckBox chkSausage;   // To select Sausage.
	private JCheckBox chkMushrooms; // To select Mushrooms.
	private JCheckBox chkHam;       // To select Ham.

	// Variable to save the price of the toppings that are selected.
	private double price = 0;

	// Default constructor.
	public Toppings() {

		// Layout to setup for toppings.
		// Take a look at this again to see if you need to change the layout.
		this.setLayout(new GridLayout(1, 4));

		// 
		JCheckBox check1 = new JCheckBox("Macaroni 25.00");

		//chkPepperoni = createCheckBox("Pepperoni $1.00");
		//chkSausage = createCheckBox("Sausage $1.00");
		//chkMushrooms = createCheckBox("Mushrooms $1.00");
		//chkHam = createCheckBox("Ham $1.00");

	}

	
	private JCheckBox createCheckBox(String text) {
		JCheckBox checkBox = new JCheckBox(text);
		checkBox.addItemListener(this);
		checkBox.setForeground(Color.white);
		checkBox.setBackground(Color.black);
		this.add(checkBox);
		return checkBox;
	}

	public void itemStateChanged(ItemEvent e) {
		int total = 0;
		if (chkPepperoni.isSelected())
			total += 1;
		if (chkSausage.isSelected())
			total += 1;
		if (chkMushrooms.isSelected())
			total += 1;
		if (chkHam.isSelected())
			total += 1;

		this.price = total;
		// frame.updateTotal();

	}

	public double getPrice() {
		return price;
	}
}
