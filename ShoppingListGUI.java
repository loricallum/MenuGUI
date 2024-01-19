import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingListGUI extends JFrame {
	
	private static final long serialVersionUID = 1L; // serialVersionUID is a constant long that serves as a version control in a Serializable class. It helps to ensure that the class can be deserialized correctly even if changes have been made to the class.
	  
	private shoppingList myShopping;

    public ShoppingListGUI() {
        // Create a Shopping object
        myShopping = new shoppingList();

        // Set up the GUI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shopping List");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create buttons
        JButton addButton = new JButton("Add Item");
        JButton listButton = new JButton("List Items");

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = JOptionPane.showInputDialog(null, "Enter a new item:", "Add Item", JOptionPane.PLAIN_MESSAGE);
                if (newItem != null && !newItem.isEmpty()) {
                    myShopping.addItem(newItem);
                }
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myShopping.listItems();
            }
        });

        // Create a panel and add buttons
        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(listButton);

        // Add panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShoppingListGUI();
            }
        });
    }
	

}
