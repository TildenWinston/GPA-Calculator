import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import java.lang.Math;


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
 * https://stackoverflow.com/questions/3680221/how-can-i-get-screen-resolution-in-java
 * https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
 * http://gpacalculator.net/how-to-calculate-gpa/
 * https://stackoverflow.com/questions/7747469/how-can-i-truncate-a-double-to-only-two-decimal-places-in-java
 * 
 * Assumptions:
 * GPA is Weighted
 * GPA only needs to be displayed to 3 decimal places
 * GPA is input as a decimal and not a letter in order to prevent compatibility issues between schools and universities
 */

public class view1 {

	/**
	 * Variables representing text fields and other GUI components
	 */
	private JFrame frmGpaCalculator;
	private JTextField creditHours1;
	private JTextField grade1;
	private JTextField courseName1;
	private JTextField creditHours2;
	private JTextField creditHours3;
	private JTextField creditHours4;
	private JTextField creditHours5;
	private JTextField creditHours6;
	private JTextField creditHours7;
	private JTextField creditHours8;
	private JTextField creditHours9;
	private JTextField creditHours10;
	private JTextField creditHours11;
	private JTextField creditHours12;
	private JTextField creditHours13;
	private JTextField creditHours14;
	private JTextField creditHours15;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField courseName2;
	private JTextField grade5;
	private JTextField grade6;
	private JTextField grade7;
	private JTextField grade8;
	private JTextField grade9;
	private JTextField grade10;
	private JTextField grade11;
	private JTextField grade12;
	private JTextField targetGPA;
	private JTextField grade13;
	private JTextField grade14;
	private JTextField grade15;
	private JTextField courseName3;
	private JTextField courseName4;
	private JTextField courseName5;
	private JTextField courseName6;
	private JTextField courseName7;
	private JTextField courseName8;
	private JTextField courseName9;
	private JTextField courseName10;
	private JTextField courseName11;
	private JTextField courseName12;
	private JTextField courseName13;
	private JTextField courseName14;
	private JTextField courseName15;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;
	private JComboBox comboBox_12;
	private JComboBox comboBox_13;
	private JComboBox comboBox_14;
	private JLabel errorLabel;
	private JLabel lblNewLabel;
	private JLabel gpaLabel;
	private JLabel neededGPA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view1 window = new view1();
					window.frmGpaCalculator.pack();
					window.frmGpaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * each of the input fields and buttons are created and added to the displayed frame.
	 * 
	 * Course status fields are optional drop down menus. They are not used in the calculation, they are implemented to aid the users organization
	 * Credit hours is not optional it accepts the credit hours for a class
	 * GPA accepts the end grade for a class. Accepts a double value. 
	 * Course Name is like the course status field. It is not used for calculations and is implemented to aid the user.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//Dynamically sizes window based on screen size
		double width = (screenSize.getWidth()) * .8;
/*		if (width < 1024) {
			width = 1024;
		}*/
		
		double height = (screenSize.getHeight()) * .8;
/*		if (width < 768) {
			width = 768;
		}*/
		
		frmGpaCalculator = new JFrame();
		//Changes icon on the window
		frmGpaCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(view1.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Text-Color-Black.png")));
		//Adds title to the window
		frmGpaCalculator.setTitle("GPA Calculator");
		//Ensures the window never starts smaller than 1024x768
		frmGpaCalculator.getContentPane().setMinimumSize(new Dimension(1024, 768));
		frmGpaCalculator.setBounds(25, 25, (int)(width), (int)(height));
		
		
		frmGpaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sets up MigLayout
		frmGpaCalculator.getContentPane().setLayout(new MigLayout("", "[0px:n,grow][15px:n:30px,grow,center][120px:126.00px:150px,grow][90px:n:100px,grow][155px:n:180px,grow][115px:n:175px,grow][::90px,grow][0px:n,grow]", "[20px:44.00px][][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][][][15px:n:30px,grow]"));
		
		JLabel lblTitle = new JLabel("GPA Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmGpaCalculator.getContentPane().add(lblTitle, "cell 2 0,alignx center,aligny center");
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.addMouseListener(new MouseAdapter() {
			//Help button displays help text in the errorLabel spot
			@Override
			public void mouseClicked(MouseEvent arg0) {
				errorLabel.setText("GPA should only be doubles and Credits should only be integers.");
			}
		});
		frmGpaCalculator.getContentPane().add(btnHelp, "cell 6 0,alignx center");
		
		lblNewLabel = new JLabel("Course Status");
		frmGpaCalculator.getContentPane().add(lblNewLabel, "cell 2 1");
		
		JLabel lblNewLabel_1 = new JLabel("Credit Hours");
		frmGpaCalculator.getContentPane().add(lblNewLabel_1, "cell 3 1");
		
		JLabel lblNewLabel_2 = new JLabel("Grade (Optional)");
		frmGpaCalculator.getContentPane().add(lblNewLabel_2, "cell 4 1");
		
		JLabel lblNewLabel_3 = new JLabel("Course Name (Optional)");
		frmGpaCalculator.getContentPane().add(lblNewLabel_3, "cell 5 1");
		
		JButton btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addMouseListener(new MouseAdapter() {
			//Calls all deleteRow methods to clear everything.
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow1();
				deleteRow2();
				deleteRow3();
				deleteRow4();
				deleteRow5();
				deleteRow6();
				deleteRow7();
				deleteRow8();
				deleteRow9();
				deleteRow10();
				deleteRow11();
				deleteRow12();
				deleteRow13();
				deleteRow14();
				deleteRow15();
			}
		});
		frmGpaCalculator.getContentPane().add(btnDeleteAll, "cell 6 1");
		
		JLabel label = new JLabel("1");
		frmGpaCalculator.getContentPane().add(label, "cell 1 2,alignx center");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox, "cell 2 2,growx");
		
		creditHours1 = new JTextField();
		frmGpaCalculator.getContentPane().add(creditHours1, "cell 3 2,growx");
		creditHours1.setColumns(10);
		
		grade1 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade1, "cell 4 2,growx");
		grade1.setColumns(10);
		
		courseName1 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName1, "cell 5 2,growx");
		courseName1.setColumns(10);
		
		JButton deleteRow1 = new JButton("Delete Row");
		deleteRow1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				deleteRow1();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow1, "cell 6 2");
		
		JLabel label_1 = new JLabel("2");
		frmGpaCalculator.getContentPane().add(label_1, "cell 1 3,alignx center");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_1, "cell 2 3,growx");
		
		creditHours2 = new JTextField();
		creditHours2.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours2, "cell 3 3,growx");
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		frmGpaCalculator.getContentPane().add(grade2, "cell 4 3,growx");
		
		courseName2 = new JTextField();
		courseName2.setColumns(10);
		frmGpaCalculator.getContentPane().add(courseName2, "cell 5 3,growx");
		
		JButton deleteRow2 = new JButton("Delete Row");
		deleteRow2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow2();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow2, "cell 6 3");
		
		JLabel label_2 = new JLabel("3");
		frmGpaCalculator.getContentPane().add(label_2, "cell 1 4,alignx center");
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_2, "cell 2 4,growx");
		
		creditHours3 = new JTextField();
		creditHours3.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours3, "cell 3 4,growx");
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		frmGpaCalculator.getContentPane().add(grade3, "cell 4 4,growx");
		
		courseName3 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName3, "cell 5 4,growx");
		courseName3.setColumns(10);
		
		JButton deleteRow3 = new JButton("Delete Row");
		deleteRow3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow3();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow3, "cell 6 4");
		
		JLabel label_3 = new JLabel("4");
		frmGpaCalculator.getContentPane().add(label_3, "cell 1 5,alignx center");
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_3, "cell 2 5,growx");
		
		creditHours4 = new JTextField();
		creditHours4.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours4, "cell 3 5,growx");
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		frmGpaCalculator.getContentPane().add(grade4, "cell 4 5,growx");
		
		courseName4 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName4, "cell 5 5,growx");
		courseName4.setColumns(10);
		
		JButton deleteRow4 = new JButton("Delete Row");
		deleteRow4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				deleteRow4();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow4, "cell 6 5");
		
		JLabel label_4 = new JLabel("5");
		frmGpaCalculator.getContentPane().add(label_4, "cell 1 6,alignx center");
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_4, "cell 2 6,growx");
		
		creditHours5 = new JTextField();
		creditHours5.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours5, "cell 3 6,growx");
		
		grade5 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade5, "cell 4 6,growx");
		grade5.setColumns(10);
		
		courseName5 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName5, "cell 5 6,growx");
		courseName5.setColumns(10);
		
		JButton deleteRow5 = new JButton("Delete Row");
		deleteRow5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow5();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow5, "cell 6 6");
		
		JLabel label_5 = new JLabel("6");
		frmGpaCalculator.getContentPane().add(label_5, "cell 1 7,alignx center");
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_5, "cell 2 7,growx");
		
		creditHours6 = new JTextField();
		creditHours6.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours6, "cell 3 7,growx");
		
		grade6 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade6, "cell 4 7,growx");
		grade6.setColumns(10);
		
		courseName6 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName6, "cell 5 7,growx");
		courseName6.setColumns(10);
		
		JButton deleteRow6 = new JButton("Delete Row");
		deleteRow6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow6();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow6, "cell 6 7");
		
		JLabel label_6 = new JLabel("7");
		frmGpaCalculator.getContentPane().add(label_6, "cell 1 8,alignx center");
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_6, "cell 2 8,growx");
		
		creditHours7 = new JTextField();
		creditHours7.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours7, "cell 3 8,growx");
		
		grade7 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade7, "cell 4 8,growx");
		grade7.setColumns(10);
		
		courseName7 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName7, "cell 5 8,growx");
		courseName7.setColumns(10);
		
		JButton deleteRow7 = new JButton("Delete Row");
		deleteRow7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow7();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow7, "cell 6 8");
		
		JLabel label_7 = new JLabel("8");
		frmGpaCalculator.getContentPane().add(label_7, "cell 1 9,alignx center");
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_7, "cell 2 9,growx");
		
		creditHours8 = new JTextField();
		creditHours8.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours8, "cell 3 9,growx");
		
		grade8 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade8, "cell 4 9,growx");
		grade8.setColumns(10);
		
		courseName8 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName8, "cell 5 9,growx");
		courseName8.setColumns(10);
		
		JButton deleteRow8 = new JButton("Delete Row");
		deleteRow8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow8();
			}
		});
		frmGpaCalculator.getContentPane().add(deleteRow8, "cell 6 9");
		
		JLabel label_8 = new JLabel("9");
		frmGpaCalculator.getContentPane().add(label_8, "cell 1 10,alignx center");
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_8, "cell 2 10,growx");
		
		creditHours9 = new JTextField();
		creditHours9.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours9, "cell 3 10,growx");
		
		grade9 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade9, "cell 4 10,growx");
		grade9.setColumns(10);
		
		courseName9 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName9, "cell 5 10,growx");
		courseName9.setColumns(10);
		
		JButton deleteRow9 = new JButton("Delete Row");
		deleteRow9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow9();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow9, "cell 6 10");
		
		JLabel label_9 = new JLabel("10");
		frmGpaCalculator.getContentPane().add(label_9, "cell 1 11,alignx center");
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_9, "cell 2 11,growx");
		
		creditHours10 = new JTextField();
		creditHours10.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours10, "cell 3 11,growx");
		
		grade10 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade10, "cell 4 11,growx");
		grade10.setColumns(10);
		
		courseName10 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName10, "cell 5 11,growx");
		courseName10.setColumns(10);
		
		JButton deleteRow10 = new JButton("Delete Row");
		deleteRow10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow10();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow10, "cell 6 11");
		
		JLabel label_10 = new JLabel("11");
		frmGpaCalculator.getContentPane().add(label_10, "cell 1 12,alignx center");
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_10, "cell 2 12,growx");
		
		creditHours11 = new JTextField();
		creditHours11.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours11, "cell 3 12,growx");
		
		grade11 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade11, "cell 4 12,growx");
		grade11.setColumns(10);
		
		courseName11 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName11, "cell 5 12,growx");
		courseName11.setColumns(10);
		
		JButton deleteRow11 = new JButton("Delete Row");
		deleteRow11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow11();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow11, "cell 6 12");
		
		JLabel label_11 = new JLabel("12");
		frmGpaCalculator.getContentPane().add(label_11, "cell 1 13,alignx center");
		
		comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_11, "cell 2 13,growx");
		
		creditHours12 = new JTextField();
		creditHours12.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours12, "cell 3 13,growx");
		
		grade12 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade12, "cell 4 13,growx");
		grade12.setColumns(10);
		
		courseName12 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName12, "cell 5 13,growx");
		courseName12.setColumns(10);
		
		JButton deleteRow12 = new JButton("Delete Row");
		deleteRow12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow12();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow12, "cell 6 13");
		
		JLabel label_12 = new JLabel("13");
		frmGpaCalculator.getContentPane().add(label_12, "cell 1 14,alignx center");
		
		comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_12, "cell 2 14,growx");
		
		creditHours13 = new JTextField();
		creditHours13.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours13, "cell 3 14,growx");
		
		grade13 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade13, "cell 4 14,growx");
		grade13.setColumns(10);
		
		courseName13 = new JTextField();
		frmGpaCalculator.getContentPane().add(courseName13, "cell 5 14,growx");
		courseName13.setColumns(10);
		
		JButton deleteRow13 = new JButton("Delete Row");
		deleteRow13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow13();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow13, "cell 6 14");
		
		JLabel label_13 = new JLabel("14");
		frmGpaCalculator.getContentPane().add(label_13, "cell 1 15,alignx center");
		
		comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_13, "cell 2 15,growx");
		
		creditHours14 = new JTextField();
		creditHours14.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours14, "cell 3 15,growx");
		
		grade14 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade14, "cell 4 15,growx");
		grade14.setColumns(10);
		
		courseName14 = new JTextField();
		courseName14.setColumns(10);
		frmGpaCalculator.getContentPane().add(courseName14, "cell 5 15,growx");
		
		JButton deleteRow14 = new JButton("Delete Row");
		deleteRow14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow14();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow14, "cell 6 15");
		
		JLabel label_14 = new JLabel("15");
		frmGpaCalculator.getContentPane().add(label_14, "cell 1 16,alignx center");
		
		comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"", "taken", "current", "anticipated"}));
		frmGpaCalculator.getContentPane().add(comboBox_14, "cell 2 16,growx");
		
		creditHours15 = new JTextField();
		creditHours15.setColumns(10);
		frmGpaCalculator.getContentPane().add(creditHours15, "cell 3 16,growx");
		
		grade15 = new JTextField();
		frmGpaCalculator.getContentPane().add(grade15, "cell 4 16,growx");
		grade15.setColumns(10);
		
		courseName15 = new JTextField();
		courseName15.setColumns(10);
		frmGpaCalculator.getContentPane().add(courseName15, "cell 5 16,growx");
		
		JButton deleteRow15 = new JButton("Delete Row");
		deleteRow15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deleteRow15();
			}
			
		});
		frmGpaCalculator.getContentPane().add(deleteRow15, "cell 6 16");
		
		JButton btnCalculateGpa = new JButton("Calculate GPA");
		btnCalculateGpa.addMouseListener(new MouseAdapter() {
			//Calls calculateGPA
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calculateGPA();
			}
		});
		frmGpaCalculator.getContentPane().add(btnCalculateGpa, "cell 4 17,alignx center");
		
		gpaLabel = new JLabel("GPA");
		gpaLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmGpaCalculator.getContentPane().add(gpaLabel, "cell 5 17");
		
		JLabel targetGPALabel = new JLabel("Target GPA:");
		frmGpaCalculator.getContentPane().add(targetGPALabel, "cell 2 18,alignx trailing");
		
		targetGPA = new JTextField();
		frmGpaCalculator.getContentPane().add(targetGPA, "cell 3 18,growx");
		targetGPA.setColumns(10);
		
		JButton targetGPAButton = new JButton("Calculate GPA for Target");
		targetGPAButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				targetGPA();
			}
		});
		frmGpaCalculator.getContentPane().add(targetGPAButton, "cell 4 18,alignx center");
		
		neededGPA = new JLabel("Needed GPA:");
		neededGPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmGpaCalculator.getContentPane().add(neededGPA, "cell 5 18");
		
		errorLabel = new JLabel("");
		errorLabel.setForeground(Color.RED);
		frmGpaCalculator.getContentPane().add(errorLabel, "cell 2 19,aligny center");
		
	}
	
	/**
	 * Validates input for credit hour fields
	 * 
	 * Checks to make sure that the input is valid. Checks for empty string and checks that it is an int value.
	 * 
	 * Returns -1 for an empty input
	 * 0 for an invalid data type (Not int)
	 * 1 for a valid input
	 * 
	 * @param input
	 * @return int
	 * @Assumption Could be modified to check if the value is reasonable. Not currently included in order to avoid causing issues with schools with different systems.
	 * Also assumes
	 * 
	 *
	 * 
	 */
	public int creditValidate(JTextField input) {
       String text = ((JTextField) input).getText();
      // System.out.println(text.isEmpty());
       if (text.isEmpty()) { //Checks to see if the string is empty
    	   return -1;
       }
       try {
          Integer.parseInt(text);
       } catch (NumberFormatException e) {
          return 0;
       }

       return 1;
	}
	
	/**
	 * Validates input for grade fields
	 * 
	 * Checks to make sure that the input is valid. Checks for empty string and checks that it is a double value.
	 * 
	 * Returns -1 for an empty input
	 * 0 for an invalid data type (Not Double)
	 * 1 for a valid input
	 * 
	 * @param input JTextField
	 * @return int
	 * @Assumption Could be modified to check if the value is reasonable. Not currently included in order to avoid causing issues with schools with different systems.
	 * 
	 */
	public int gradeValidate(JTextField input) {
	       String text = ((JTextField) input).getText();
	       //System.out.println(text.isEmpty());
	       if (text.isEmpty()) { //Checks to see if the string is empty
	    	   return -1;
	       }
	       try {
	          Double.parseDouble(text);
	       } catch (NumberFormatException e) {
	          return 0;
	       }

	       return 1;
		}
	
	
	/**
	 * Calculates GPA based on user inputs
	 * Currently does not return a value, instead sets the gpa label text to the answer.
	 * 
	 * The method looks at all relevant text fields and then validates the contained data.
	 * The input is validated for type and existence.
	 * If the input passes, the data is then parsed and added to the calculation
	 * This has to be competed for all relevant input fields separately due to the fields being unique.
	 * 
	 * If at any point the input fails validation due to formatting, errorFlag is set to false causing an error message to be displayed.
	 * Calculation goes on skilling the bad input.
	 */
	public void calculateGPA() {
		int totalCredits = 0;
		double creditGPA = 0; //credit hours times grade
		double gpa;
		boolean errorFlag = false;
		
		//creditGPA = grade1 * creditHours1;
		//System.out.println(creditValidate(creditHours1));
		//System.out.println(gradeValidate(grade1));
		if (creditValidate(creditHours1) == 1 && gradeValidate(grade1) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade1.getText()) * Integer.parseInt(creditHours1.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours1.getText());
		}
		else if (creditValidate(creditHours1) == 0 || gradeValidate(grade1) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours2) == 1 && gradeValidate(grade2) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade2.getText()) * Integer.parseInt(creditHours2.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours2.getText());
		}
		else if (creditValidate(creditHours2) == 0 || gradeValidate(grade2) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours3) == 1 && gradeValidate(grade3) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade3.getText()) * Integer.parseInt(creditHours3.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours3.getText());
		}
		else if (creditValidate(creditHours3) == 0 || gradeValidate(grade3) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours4) == 1 && gradeValidate(grade4) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade4.getText()) * Integer.parseInt(creditHours4.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours4.getText());
		}
		else if (creditValidate(creditHours4) == 0 || gradeValidate(grade4) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours5) == 1 && gradeValidate(grade5) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade5.getText()) * Integer.parseInt(creditHours5.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours5.getText());
		}
		else if (creditValidate(creditHours5) == 0 || gradeValidate(grade5) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours6) == 1 && gradeValidate(grade6) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade6.getText()) * Integer.parseInt(creditHours6.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours6.getText());
		}
		else if (creditValidate(creditHours6) == 0 || gradeValidate(grade6) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours7) == 1 && gradeValidate(grade7) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade7.getText()) * Integer.parseInt(creditHours7.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours7.getText());
		}
		else if (creditValidate(creditHours7) == 0 || gradeValidate(grade7) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours8) == 1 && gradeValidate(grade8) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade8.getText()) * Integer.parseInt(creditHours8.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours8.getText());
		}
		else if (creditValidate(creditHours8) == 0 || gradeValidate(grade8) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours9) == 1 && gradeValidate(grade9) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade9.getText()) * Integer.parseInt(creditHours9.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours9.getText());
		}
		else if (creditValidate(creditHours9) == 0 || gradeValidate(grade9) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours10) == 1 && gradeValidate(grade10) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade10.getText()) * Integer.parseInt(creditHours10.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours10.getText());
		}
		else if (creditValidate(creditHours10) == 0 || gradeValidate(grade10) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours11) == 1 && gradeValidate(grade11) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade11.getText()) * Integer.parseInt(creditHours11.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours11.getText());
		}
		else if (creditValidate(creditHours11) == 0 || gradeValidate(grade11) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours12) == 1 && gradeValidate(grade12) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade12.getText()) * Integer.parseInt(creditHours12.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours12.getText());
		}
		else if (creditValidate(creditHours12) == 0 || gradeValidate(grade12) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours13) == 1 && gradeValidate(grade13) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade13.getText()) * Integer.parseInt(creditHours13.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours13.getText());
		}
		else if (creditValidate(creditHours13) == 0 || gradeValidate(grade13) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours14) == 1 && gradeValidate(grade14) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade14.getText()) * Integer.parseInt(creditHours14.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours14.getText());
		}
		else if (creditValidate(creditHours14) == 0 || gradeValidate(grade14) == 0) {
			errorFlag = true;
		}
		
		if (creditValidate(creditHours15) == 1 && gradeValidate(grade15) == 1) {
			creditGPA = creditGPA + (Double.parseDouble(grade15.getText()) * Integer.parseInt(creditHours15.getText()));
			totalCredits = totalCredits + Integer.parseInt(creditHours15.getText());
		}
		else if (creditValidate(creditHours15) == 0 || gradeValidate(grade15) == 0) {
			errorFlag = true;
		}
		
		
		gpa = creditGPA / totalCredits;
		
		gpaLabel.setText("GPA: " +  (Math.floor(gpa * 1000) / 1000)); //Only displays to 3 decimal places
		
		//System.out.println("creditGPA: " + creditGPA);
		//System.out.println("GPA: " + gpa);
		
		if (errorFlag == true) {
			errorLabel.setText(" One or more values entered is an incorrect type. GPA should only be doubles and Credits should only be integers."); //\n GPA should only be doubles and Credits should only be integers
		}
		
		//Resets the errorLabel if no error is detected
		else {
			errorLabel.setText("");
		}
	}
	
	/**
	 * Calculates target GPA based on user inputs
	 * Currently does not return a value, instead sets the neededGPA and gpa
	 * 
	 * The method looks at all relevant text fields and then validates the contained data.
	 * The input is validated for type and existence.
	 * If the input passes, the data is then parsed and added to the calculation
	 * If only the creditHours text field contains data, then the hours are added as planned credits.
	 * This has to be competed for all relevant input fields separately due to the fields being unique.
	 * 
	 * If at any point the input fails validation due to formatting, errorFlag is set to false causing an error message to be displayed.
	 * Calculation goes on skilling the bad input.
	 */
	public void targetGPA() {
		int currentCredits = 0; //Total number of credits with a grade associated.
		int plannedCredits = 0;
		double creditGPA = 0; //credit hours times grade
		double gpa;
		double target; //Target GPA
		boolean errorFlag = false;
		double requiredGPA = 0;
		
		//creditGPA = grade1 * creditHours1;
		//System.out.println(creditValidate(creditHours1));
		//System.out.println(gradeValidate(grade1));
		
		if(gradeValidate(targetGPA)==1) {
			target = Double.parseDouble(targetGPA.getText());
			
			if (creditValidate(creditHours1) == 1 && gradeValidate(grade1) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade1.getText()) * Integer.parseInt(creditHours1.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours1.getText());
			}
			else if (creditValidate(creditHours1) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours1.getText()); 
			}
			else if (creditValidate(creditHours1) == 0 || gradeValidate(grade1) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours2) == 1 && gradeValidate(grade2) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade2.getText()) * Integer.parseInt(creditHours2.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours2.getText());
			}
			else if (creditValidate(creditHours2) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours2.getText()); 
			}
			else if (creditValidate(creditHours2) == 0 || gradeValidate(grade2) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours3) == 1 && gradeValidate(grade3) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade3.getText()) * Integer.parseInt(creditHours3.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours3.getText());
			}
			else if (creditValidate(creditHours3) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours3.getText()); 
			}
			else if (creditValidate(creditHours3) == 0 || gradeValidate(grade3) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours4) == 1 && gradeValidate(grade4) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade4.getText()) * Integer.parseInt(creditHours4.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours4.getText());
			}
			else if (creditValidate(creditHours4) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours4.getText()); 
			}
			else if (creditValidate(creditHours4) == 0 || gradeValidate(grade4) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours5) == 1 && gradeValidate(grade5) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade5.getText()) * Integer.parseInt(creditHours5.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours5.getText());
			}
			else if (creditValidate(creditHours5) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours5.getText()); 
			}
			else if (creditValidate(creditHours5) == 0 || gradeValidate(grade5) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours6) == 1 && gradeValidate(grade6) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade6.getText()) * Integer.parseInt(creditHours6.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours6.getText());
			}
			else if (creditValidate(creditHours6) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours6.getText()); 
			}
			else if (creditValidate(creditHours6) == 0 || gradeValidate(grade6) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours7) == 1 && gradeValidate(grade7) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade7.getText()) * Integer.parseInt(creditHours7.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours7.getText());
			}
			else if (creditValidate(creditHours7) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours7.getText()); 
			}
			else if (creditValidate(creditHours7) == 0 || gradeValidate(grade7) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours8) == 1 && gradeValidate(grade8) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade8.getText()) * Integer.parseInt(creditHours8.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours8.getText());
			}
			else if (creditValidate(creditHours8) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours8.getText()); 
			}
			else if (creditValidate(creditHours8) == 0 || gradeValidate(grade8) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours9) == 1 && gradeValidate(grade9) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade9.getText()) * Integer.parseInt(creditHours9.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours9.getText());
			}
			else if (creditValidate(creditHours9) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours9.getText()); 
			}
			else if (creditValidate(creditHours9) == 0 || gradeValidate(grade9) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours10) == 1 && gradeValidate(grade10) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade10.getText()) * Integer.parseInt(creditHours10.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours10.getText());
			}
			else if (creditValidate(creditHours10) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours10.getText()); 
			}
			else if (creditValidate(creditHours10) == 0 || gradeValidate(grade10) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours11) == 1 && gradeValidate(grade11) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade11.getText()) * Integer.parseInt(creditHours11.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours11.getText());
			}
			else if (creditValidate(creditHours11) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours11.getText()); 
			}
			else if (creditValidate(creditHours11) == 0 || gradeValidate(grade11) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours12) == 1 && gradeValidate(grade12) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade12.getText()) * Integer.parseInt(creditHours12.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours12.getText());
			}
			else if (creditValidate(creditHours12) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours12.getText()); 
			}
			else if (creditValidate(creditHours12) == 0 || gradeValidate(grade12) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours13) == 1 && gradeValidate(grade13) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade13.getText()) * Integer.parseInt(creditHours13.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours13.getText());
			}
			else if (creditValidate(creditHours13) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours13.getText()); 
			}
			else if (creditValidate(creditHours13) == 0 || gradeValidate(grade13) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours14) == 1 && gradeValidate(grade14) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade14.getText()) * Integer.parseInt(creditHours14.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours14.getText());
			}
			else if (creditValidate(creditHours14) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours14.getText()); 
			}
			else if (creditValidate(creditHours14) == 0 || gradeValidate(grade14) == 0) {
				errorFlag = true;
			}
			
			if (creditValidate(creditHours15) == 1 && gradeValidate(grade15) == 1) {
				creditGPA = creditGPA + (Double.parseDouble(grade15.getText()) * Integer.parseInt(creditHours15.getText()));
				currentCredits = currentCredits + Integer.parseInt(creditHours15.getText());
			}
			else if (creditValidate(creditHours15) == 1) {
				plannedCredits = plannedCredits + Integer.parseInt(creditHours15.getText()); 
			}
			else if (creditValidate(creditHours15) == 0 || gradeValidate(grade15) == 0) {
				errorFlag = true;
			}
			
			
			gpa = creditGPA / currentCredits;
			
			
			gpaLabel.setText("GPA: " +  (Math.floor(gpa * 1000) / 1000)); //Only displays to 3 decimal places
			
			//System.out.println("current: " + currentCredits);
			//System.out.println("planned: " + plannedCredits);
			requiredGPA = (target * (currentCredits + plannedCredits));
			//System.out.println("requiredGPA: " + requiredGPA);
			requiredGPA = requiredGPA - (creditGPA);
			//System.out.println("requiredGPA: " + requiredGPA);
			requiredGPA = requiredGPA / (plannedCredits);
			//System.out.println("requiredGPA: " + requiredGPA);
			 
			neededGPA.setText("Needed GPA: " + (Math.floor(requiredGPA * 1000) / 1000));	//Only displays to 3 decimal places
			
			//System.out.println("creditGPA: " + creditGPA);
			//System.out.println("GPA: " + gpa);
			
		}
		
		else if(gradeValidate(targetGPA) == 0) {
			errorFlag = true;
		}
		
		if (errorFlag == true) {
			errorLabel.setText("One or more values entered is an incorrect type. GPA should only be doubles and Credits should only be integers."); //\n GPA should only be doubles and Credits should only be integers
		}
		
		//Resets errorLabel
		else {
			errorLabel.setText("");
		}
		
		//Warns user if the needed GPA is over 4.0
		if (requiredGPA > 4) {
			errorLabel.setText("Needed GPA over 4.0, try adding more credit hours and recalculating.  "); 
		}
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow1() {
		comboBox.setSelectedIndex(0);
		creditHours1.setText("");
		grade1.setText("");
		courseName1.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow2() {
		comboBox_1.setSelectedIndex(0);
		creditHours2.setText("");
		grade2.setText("");
		courseName2.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow3() {
		comboBox_2.setSelectedIndex(0);
		creditHours3.setText("");
		grade3.setText("");
		courseName3.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow4() {
		comboBox_3.setSelectedIndex(0);
		creditHours4.setText("");
		grade4.setText("");
		courseName4.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow5() {
		comboBox_4.setSelectedIndex(0);
		creditHours5.setText("");
		grade5.setText("");
		courseName5.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow6() {
		comboBox_5.setSelectedIndex(0);
		creditHours6.setText("");
		grade6.setText("");
		courseName6.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow7() {
		comboBox_6.setSelectedIndex(0);
		creditHours7.setText("");
		grade7.setText("");
		courseName7.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow8() {
		comboBox_7.setSelectedIndex(0);
		creditHours8.setText("");
		grade8.setText("");
		courseName8.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow9() {
		comboBox_8.setSelectedIndex(0);
		creditHours9.setText("");
		grade9.setText("");
		courseName9.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow10() {
		comboBox_9.setSelectedIndex(0);
		creditHours10.setText("");
		grade10.setText("");
		courseName10.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow11() {
		comboBox_10.setSelectedIndex(0);
		creditHours11.setText("");
		grade11.setText("");
		courseName11.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow12() {
		comboBox_11.setSelectedIndex(0);
		creditHours12.setText("");
		grade12.setText("");
		courseName12.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow13() {
		comboBox_12.setSelectedIndex(0);
		creditHours13.setText("");
		grade13.setText("");
		courseName13.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow14() {
		comboBox_13.setSelectedIndex(0);
		creditHours14.setText("");
		grade14.setText("");
		courseName14.setText("");
		//System.out.println("Delete Button One Pressed");
	}
	
	/**
	 * Clears values in specified row
	 */
	public void deleteRow15() {
		comboBox_14.setSelectedIndex(0);
		creditHours15.setText("");
		grade15.setText("");
		courseName15.setText("");
		//System.out.println("Delete Button One Pressed");
	}

}