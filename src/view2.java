	/**
	 * 
	 * @author Tilden Winston (tw8rt)
	 * 
	 * GPA Calculator
	 *
	 * Sources:
	 * Inclass examples
	 * WindowBuilder for Eclipse
	 * https://www.youtube.com/watch?v=oeswfZz4IW0
	 * 
	 */

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;


	public class view2 extends JFrame {
		private JButton calculateButton;
		private JLabel infoLabel;
		private JLabel instruction;
		private JTextField textField;
		private FlowLayout layout = new FlowLayout();
		
		private JLabel title;
		
		private JTextField courseNameField1;
		private JTextField gradeField1;
		private JTextField creditsField1;

		private JTextField courseNameField2;
		private JTextField gradeField2;
		private JTextField creditsField2;
		
		private JTextField courseNameField3;
		private JTextField gradeField3;
		private JTextField creditsField3;

		private JTextField courseNameField4;
		private JTextField gradeField4;
		private JTextField creditsField4;
		
		private JTextField courseNameField5;
		private JTextField gradeField5;
		private JTextField creditsField5;
		
		
		// constructor
		/*public GUIDemo() {
			
		}*/
		public void addComponentsToPane(Container pane) {

			JPanel panelLabel = new JPanel();
	        JPanel panel1 = new JPanel();
	        JPanel panel2 = new JPanel();
	        JPanel panel3 = new JPanel();
	        JPanel panel4 = new JPanel();
	        JPanel panel5 = new JPanel();
	        
	        // add a layout
	        panelLabel.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panelLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        panel1.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        panel2.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        panel3.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panel3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        panel4.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panel4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        
	        panel5.setLayout( layout );
	        layout.setAlignment(FlowLayout.LEADING);
	        panel5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			
			
	        // add three elements to the frame
	        // text field
	        
	        title = new JLabel("GPA Calculator");
			panelLabel.add(title);
	        
	        textField = new JTextField(5);
			panel1.add(textField);
			courseNameField1 = new JTextField(5);
			panel1.add(courseNameField1);
			courseNameField2 = new JTextField(5);
			panel2.add(courseNameField2);
			courseNameField3 = new JTextField(5);
			panel3.add(courseNameField3);
			courseNameField4 = new JTextField(5);
			panel4.add(courseNameField4);
			courseNameField5 = new JTextField(5);
			panel5.add(courseNameField5);
			
			
			
			// create a class for the button action
			class ButtonListener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					if (e.getActionCommand().equals("click")) {
						String name = "";
						name = textField.getText();
						double kilo = Double.parseDouble(name);
						double mile = kilo/1.609344;
						infoLabel.setText("Number of miles: " + mile);
						pack(); // Resizes the window
					}
				}
			}
			
			
			// button
			calculateButton = new JButton("Action");
			calculateButton.setActionCommand("click");
			calculateButton.addActionListener(new ButtonListener());
			panel1.add(calculateButton);
			
			// label
			//JPanel panel2 = new JPanel();
			instruction = new JLabel("Type text into the field");
			panel2.add(instruction);
			
			infoLabel = new JLabel("Enter number of kilometers to be converted to miles");
			panel1.add(infoLabel);
			
			
			
			pane.add(panelLabel, BorderLayout.NORTH);
			
			panel1.add(panel2, BorderLayout.NORTH);
			panel1.add(panel3, BorderLayout.CENTER);
			panel1.add(panel4, BorderLayout.SOUTH);
			pane.add(panel1, BorderLayout.CENTER);
			pane.add(panel5, BorderLayout.SOUTH);

		}
		
		 private static void createAndShowGUI() {
		        //Create and set up the window.
		        
		        Calculator frame = new Calculator();
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        //Set up the content pane.
		        frame.addComponentsToPane(frame.getContentPane());
		        //Display the window.
		        frame.pack();
		        frame.setVisible(true);
		    }
		
		public static void main(String[] args) {
			 javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {     
		               createAndShowGUI();
		            }
		        });
		}

	}
	/**
	 * Create the application.
	 */
	public view2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 50%, 50%);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
