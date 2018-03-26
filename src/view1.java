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

public class view1 {

	private JFrame frame;
	private JTextField creditHours1;
	private JTextField grade1;
	private JTextField courseName1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view1 window = new view1();
					window.frame.pack();
					window.frame.setVisible(true);
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
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		frame = new JFrame();
		frame.setBounds(100, 100, (int)(width*.6), (int)(height*.8));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[15px:n:30px,grow,center][120px:126.00px,grow][90px:n,grow][80px:n,grow][115px:n,grow][::90px,grow]", "[44.00px][][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][]"));
		
		JLabel lblNewLabel = new JLabel("GPA Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel, "cell 1 0,alignx center,aligny top");
		
		JButton button = new JButton("HELP");
		frame.getContentPane().add(button, "cell 5 0,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Credit Hours");
		frame.getContentPane().add(lblNewLabel_1, "cell 2 1");
		
		JLabel lblNewLabel_2 = new JLabel("Grade (Optional)");
		frame.getContentPane().add(lblNewLabel_2, "cell 3 1");
		
		JLabel lblNewLabel_3 = new JLabel("Course Name (Optional)");
		frame.getContentPane().add(lblNewLabel_3, "cell 4 1");
		
		JButton btnDeleteAll = new JButton("Delete All");
		frame.getContentPane().add(btnDeleteAll, "cell 5 1");
		
		JLabel label = new JLabel("1");
		frame.getContentPane().add(label, "cell 0 2,alignx center");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox, "cell 1 2,growx");
		
		creditHours1 = new JTextField();
		frame.getContentPane().add(creditHours1, "cell 2 2,growx");
		creditHours1.setColumns(10);
		
		grade1 = new JTextField();
		frame.getContentPane().add(grade1, "cell 3 2,growx");
		grade1.setColumns(10);
		
		courseName1 = new JTextField();
		frame.getContentPane().add(courseName1, "cell 4 2,growx");
		courseName1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Row");
		frame.getContentPane().add(btnNewButton, "cell 5 2");
		
		JLabel label_1 = new JLabel("2");
		frame.getContentPane().add(label_1, "cell 0 3,alignx center");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_1, "cell 1 3,growx");
		
		textField = new JTextField();
		textField.setColumns(10);
		frame.getContentPane().add(textField, "cell 2 3,growx");
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14, "cell 3 3,growx");
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17, "cell 4 3,growx");
		
		JLabel label_2 = new JLabel("3");
		frame.getContentPane().add(label_2, "cell 0 4,alignx center");
		
		JComboBox comboBox_2 = new JComboBox();
		frame.getContentPane().add(comboBox_2, "cell 1 4,growx");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1, "cell 2 4,growx");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15, "cell 3 4,growx");
		
		JLabel label_3 = new JLabel("4");
		frame.getContentPane().add(label_3, "cell 0 5,alignx center");
		
		JComboBox comboBox_3 = new JComboBox();
		frame.getContentPane().add(comboBox_3, "cell 1 5,growx");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2, "cell 2 5,growx");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		frame.getContentPane().add(textField_16, "cell 3 5,growx");
		
		JLabel label_4 = new JLabel("5");
		frame.getContentPane().add(label_4, "cell 0 6,alignx center");
		
		JComboBox comboBox_4 = new JComboBox();
		frame.getContentPane().add(comboBox_4, "cell 1 6,growx");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3, "cell 2 6,growx");
		
		textField_18 = new JTextField();
		frame.getContentPane().add(textField_18, "cell 3 6,growx");
		textField_18.setColumns(10);
		
		JLabel label_5 = new JLabel("6");
		frame.getContentPane().add(label_5, "cell 0 7,alignx center");
		
		JComboBox comboBox_5 = new JComboBox();
		frame.getContentPane().add(comboBox_5, "cell 1 7,growx");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4, "cell 2 7,growx");
		
		textField_19 = new JTextField();
		frame.getContentPane().add(textField_19, "cell 3 7,growx");
		textField_19.setColumns(10);
		
		JLabel label_6 = new JLabel("7");
		frame.getContentPane().add(label_6, "cell 0 8,alignx center");
		
		JComboBox comboBox_6 = new JComboBox();
		frame.getContentPane().add(comboBox_6, "cell 1 8,growx");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5, "cell 2 8,growx");
		
		textField_20 = new JTextField();
		frame.getContentPane().add(textField_20, "cell 3 8,growx");
		textField_20.setColumns(10);
		
		JLabel label_7 = new JLabel("8");
		frame.getContentPane().add(label_7, "cell 0 9,alignx center");
		
		JComboBox comboBox_7 = new JComboBox();
		frame.getContentPane().add(comboBox_7, "cell 1 9,growx");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6, "cell 2 9,growx");
		
		textField_21 = new JTextField();
		frame.getContentPane().add(textField_21, "cell 3 9,growx");
		textField_21.setColumns(10);
		
		JLabel label_8 = new JLabel("9");
		frame.getContentPane().add(label_8, "cell 0 10,alignx center");
		
		JComboBox comboBox_8 = new JComboBox();
		frame.getContentPane().add(comboBox_8, "cell 1 10,growx");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7, "cell 2 10,growx");
		
		textField_22 = new JTextField();
		frame.getContentPane().add(textField_22, "cell 3 10,growx");
		textField_22.setColumns(10);
		
		JLabel label_9 = new JLabel("10");
		frame.getContentPane().add(label_9, "cell 0 11,alignx center");
		
		JComboBox comboBox_9 = new JComboBox();
		frame.getContentPane().add(comboBox_9, "cell 1 11,growx");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8, "cell 2 11,growx");
		
		textField_23 = new JTextField();
		frame.getContentPane().add(textField_23, "cell 3 11,growx");
		textField_23.setColumns(10);
		
		JLabel label_10 = new JLabel("11");
		frame.getContentPane().add(label_10, "cell 0 12,alignx center");
		
		JComboBox comboBox_10 = new JComboBox();
		frame.getContentPane().add(comboBox_10, "cell 1 12,growx");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9, "cell 2 12,growx");
		
		textField_24 = new JTextField();
		frame.getContentPane().add(textField_24, "cell 3 12,growx");
		textField_24.setColumns(10);
		
		JLabel label_11 = new JLabel("12");
		frame.getContentPane().add(label_11, "cell 0 13,alignx center");
		
		JComboBox comboBox_11 = new JComboBox();
		frame.getContentPane().add(comboBox_11, "cell 1 13,growx");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		frame.getContentPane().add(textField_10, "cell 2 13,growx");
		
		textField_25 = new JTextField();
		frame.getContentPane().add(textField_25, "cell 3 13,growx");
		textField_25.setColumns(10);
		
		JLabel label_12 = new JLabel("13");
		frame.getContentPane().add(label_12, "cell 0 14,alignx center");
		
		JComboBox comboBox_12 = new JComboBox();
		frame.getContentPane().add(comboBox_12, "cell 1 14,growx");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11, "cell 2 14,growx");
		
		JLabel label_13 = new JLabel("14");
		frame.getContentPane().add(label_13, "cell 0 15,alignx center");
		
		JComboBox comboBox_13 = new JComboBox();
		frame.getContentPane().add(comboBox_13, "cell 1 15,growx");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12, "cell 2 15,growx");
		
		JLabel label_14 = new JLabel("15");
		frame.getContentPane().add(label_14, "cell 0 16,alignx center");
		
		JComboBox comboBox_14 = new JComboBox();
		frame.getContentPane().add(comboBox_14, "cell 1 16,growx");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13, "cell 2 16,growx");
		
		JButton btnCalculateGpa = new JButton("Calculate GPA");
		frame.getContentPane().add(btnCalculateGpa, "cell 4 17,alignx center");
		
		JLabel GPA = new JLabel("GPA");
		GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(GPA, "cell 5 17");
		
	}

}
