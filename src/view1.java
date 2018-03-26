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
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;

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
		frame.getContentPane().setLayout(new MigLayout("", "[0px:n,grow][15px:n:30px,grow,center][120px:126.00px:150px,grow][90px:n:100px,grow][155px:n:180px,grow][115px:n:175px,grow][::90px,grow][0px:n,grow]", "[44.00px][][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][][]"));
		
		JLabel lblNewLabel = new JLabel("GPA Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel, "cell 2 0,alignx center,aligny top");
		
		JButton button = new JButton("HELP");
		frame.getContentPane().add(button, "cell 6 0,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Credit Hours");
		frame.getContentPane().add(lblNewLabel_1, "cell 3 1");
		
		JLabel lblNewLabel_2 = new JLabel("Grade (Optional)");
		frame.getContentPane().add(lblNewLabel_2, "cell 4 1");
		
		JLabel lblNewLabel_3 = new JLabel("Course Name (Optional)");
		frame.getContentPane().add(lblNewLabel_3, "cell 5 1");
		
		JButton btnDeleteAll = new JButton("Delete All");
		frame.getContentPane().add(btnDeleteAll, "cell 6 1");
		
		JLabel label = new JLabel("1");
		frame.getContentPane().add(label, "cell 1 2,alignx center");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox, "cell 2 2,growx");
		
		creditHours1 = new JTextField();
		frame.getContentPane().add(creditHours1, "cell 3 2,growx");
		creditHours1.setColumns(10);
		
		grade1 = new JTextField();
		frame.getContentPane().add(grade1, "cell 4 2,growx");
		grade1.setColumns(10);
		
		courseName1 = new JTextField();
		frame.getContentPane().add(courseName1, "cell 5 2,growx");
		courseName1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Row");
		frame.getContentPane().add(btnNewButton, "cell 6 2");
		
		JLabel label_1 = new JLabel("2");
		frame.getContentPane().add(label_1, "cell 1 3,alignx center");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_1, "cell 2 3,growx");
		
		textField = new JTextField();
		textField.setColumns(10);
		frame.getContentPane().add(textField, "cell 3 3,growx");
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14, "cell 4 3,growx");
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17, "cell 5 3,growx");
		
		JButton button_2 = new JButton("Delete Row");
		frame.getContentPane().add(button_2, "cell 6 3");
		
		JLabel label_2 = new JLabel("3");
		frame.getContentPane().add(label_2, "cell 1 4,alignx center");
		
		JComboBox comboBox_2 = new JComboBox();
		frame.getContentPane().add(comboBox_2, "cell 2 4,growx");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1, "cell 3 4,growx");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15, "cell 4 4,growx");
		
		textField_30 = new JTextField();
		frame.getContentPane().add(textField_30, "cell 5 4,growx");
		textField_30.setColumns(10);
		
		JButton button_3 = new JButton("Delete Row");
		frame.getContentPane().add(button_3, "cell 6 4");
		
		JLabel label_3 = new JLabel("4");
		frame.getContentPane().add(label_3, "cell 1 5,alignx center");
		
		JComboBox comboBox_3 = new JComboBox();
		frame.getContentPane().add(comboBox_3, "cell 2 5,growx");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2, "cell 3 5,growx");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		frame.getContentPane().add(textField_16, "cell 4 5,growx");
		
		textField_31 = new JTextField();
		frame.getContentPane().add(textField_31, "cell 5 5,growx");
		textField_31.setColumns(10);
		
		JButton button_4 = new JButton("Delete Row");
		frame.getContentPane().add(button_4, "cell 6 5");
		
		JLabel label_4 = new JLabel("5");
		frame.getContentPane().add(label_4, "cell 1 6,alignx center");
		
		JComboBox comboBox_4 = new JComboBox();
		frame.getContentPane().add(comboBox_4, "cell 2 6,growx");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3, "cell 3 6,growx");
		
		textField_18 = new JTextField();
		frame.getContentPane().add(textField_18, "cell 4 6,growx");
		textField_18.setColumns(10);
		
		textField_32 = new JTextField();
		frame.getContentPane().add(textField_32, "cell 5 6,growx");
		textField_32.setColumns(10);
		
		JButton button_5 = new JButton("Delete Row");
		frame.getContentPane().add(button_5, "cell 6 6");
		
		JLabel label_5 = new JLabel("6");
		frame.getContentPane().add(label_5, "cell 1 7,alignx center");
		
		JComboBox comboBox_5 = new JComboBox();
		frame.getContentPane().add(comboBox_5, "cell 2 7,growx");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4, "cell 3 7,growx");
		
		textField_19 = new JTextField();
		frame.getContentPane().add(textField_19, "cell 4 7,growx");
		textField_19.setColumns(10);
		
		textField_33 = new JTextField();
		frame.getContentPane().add(textField_33, "cell 5 7,growx");
		textField_33.setColumns(10);
		
		JButton button_6 = new JButton("Delete Row");
		frame.getContentPane().add(button_6, "cell 6 7");
		
		JLabel label_6 = new JLabel("7");
		frame.getContentPane().add(label_6, "cell 1 8,alignx center");
		
		JComboBox comboBox_6 = new JComboBox();
		frame.getContentPane().add(comboBox_6, "cell 2 8,growx");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5, "cell 3 8,growx");
		
		textField_20 = new JTextField();
		frame.getContentPane().add(textField_20, "cell 4 8,growx");
		textField_20.setColumns(10);
		
		textField_34 = new JTextField();
		frame.getContentPane().add(textField_34, "cell 5 8,growx");
		textField_34.setColumns(10);
		
		JButton button_7 = new JButton("Delete Row");
		frame.getContentPane().add(button_7, "cell 6 8");
		
		JLabel label_7 = new JLabel("8");
		frame.getContentPane().add(label_7, "cell 1 9,alignx center");
		
		JComboBox comboBox_7 = new JComboBox();
		frame.getContentPane().add(comboBox_7, "cell 2 9,growx");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6, "cell 3 9,growx");
		
		textField_21 = new JTextField();
		frame.getContentPane().add(textField_21, "cell 4 9,growx");
		textField_21.setColumns(10);
		
		textField_35 = new JTextField();
		frame.getContentPane().add(textField_35, "cell 5 9,growx");
		textField_35.setColumns(10);
		
		JButton button_8 = new JButton("Delete Row");
		frame.getContentPane().add(button_8, "cell 6 9");
		
		JLabel label_8 = new JLabel("9");
		frame.getContentPane().add(label_8, "cell 1 10,alignx center");
		
		JComboBox comboBox_8 = new JComboBox();
		frame.getContentPane().add(comboBox_8, "cell 2 10,growx");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7, "cell 3 10,growx");
		
		textField_22 = new JTextField();
		frame.getContentPane().add(textField_22, "cell 4 10,growx");
		textField_22.setColumns(10);
		
		textField_36 = new JTextField();
		frame.getContentPane().add(textField_36, "cell 5 10,growx");
		textField_36.setColumns(10);
		
		JButton button_9 = new JButton("Delete Row");
		frame.getContentPane().add(button_9, "cell 6 10");
		
		JLabel label_9 = new JLabel("10");
		frame.getContentPane().add(label_9, "cell 1 11,alignx center");
		
		JComboBox comboBox_9 = new JComboBox();
		frame.getContentPane().add(comboBox_9, "cell 2 11,growx");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8, "cell 3 11,growx");
		
		textField_23 = new JTextField();
		frame.getContentPane().add(textField_23, "cell 4 11,growx");
		textField_23.setColumns(10);
		
		textField_37 = new JTextField();
		frame.getContentPane().add(textField_37, "cell 5 11,growx");
		textField_37.setColumns(10);
		
		JButton button_10 = new JButton("Delete Row");
		frame.getContentPane().add(button_10, "cell 6 11");
		
		JLabel label_10 = new JLabel("11");
		frame.getContentPane().add(label_10, "cell 1 12,alignx center");
		
		JComboBox comboBox_10 = new JComboBox();
		frame.getContentPane().add(comboBox_10, "cell 2 12,growx");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9, "cell 3 12,growx");
		
		textField_24 = new JTextField();
		frame.getContentPane().add(textField_24, "cell 4 12,growx");
		textField_24.setColumns(10);
		
		textField_38 = new JTextField();
		frame.getContentPane().add(textField_38, "cell 5 12,growx");
		textField_38.setColumns(10);
		
		JButton button_11 = new JButton("Delete Row");
		frame.getContentPane().add(button_11, "cell 6 12");
		
		JLabel label_11 = new JLabel("12");
		frame.getContentPane().add(label_11, "cell 1 13,alignx center");
		
		JComboBox comboBox_11 = new JComboBox();
		frame.getContentPane().add(comboBox_11, "cell 2 13,growx");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		frame.getContentPane().add(textField_10, "cell 3 13,growx");
		
		textField_25 = new JTextField();
		frame.getContentPane().add(textField_25, "cell 4 13,growx");
		textField_25.setColumns(10);
		
		textField_39 = new JTextField();
		frame.getContentPane().add(textField_39, "cell 5 13,growx");
		textField_39.setColumns(10);
		
		JButton button_12 = new JButton("Delete Row");
		frame.getContentPane().add(button_12, "cell 6 13");
		
		JLabel label_12 = new JLabel("13");
		frame.getContentPane().add(label_12, "cell 1 14,alignx center");
		
		JComboBox comboBox_12 = new JComboBox();
		frame.getContentPane().add(comboBox_12, "cell 2 14,growx");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11, "cell 3 14,growx");
		
		textField_27 = new JTextField();
		frame.getContentPane().add(textField_27, "cell 4 14,growx");
		textField_27.setColumns(10);
		
		textField_40 = new JTextField();
		frame.getContentPane().add(textField_40, "cell 5 14,growx");
		textField_40.setColumns(10);
		
		JButton button_13 = new JButton("Delete Row");
		frame.getContentPane().add(button_13, "cell 6 14");
		
		JLabel label_13 = new JLabel("14");
		frame.getContentPane().add(label_13, "cell 1 15,alignx center");
		
		JComboBox comboBox_13 = new JComboBox();
		frame.getContentPane().add(comboBox_13, "cell 2 15,growx");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12, "cell 3 15,growx");
		
		textField_28 = new JTextField();
		frame.getContentPane().add(textField_28, "cell 4 15,growx");
		textField_28.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		frame.getContentPane().add(textField_41, "cell 5 15,growx");
		
		JButton button_14 = new JButton("Delete Row");
		frame.getContentPane().add(button_14, "cell 6 15");
		
		JLabel label_14 = new JLabel("15");
		frame.getContentPane().add(label_14, "cell 1 16,alignx center");
		
		JComboBox comboBox_14 = new JComboBox();
		frame.getContentPane().add(comboBox_14, "cell 2 16,growx");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13, "cell 3 16,growx");
		
		textField_29 = new JTextField();
		frame.getContentPane().add(textField_29, "cell 4 16,growx");
		textField_29.setColumns(10);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		frame.getContentPane().add(textField_42, "cell 5 16,growx");
		
		JButton button_15 = new JButton("Delete Row");
		frame.getContentPane().add(button_15, "cell 6 16");
		
		JButton btnCalculateGpa = new JButton("Calculate GPA");
		frame.getContentPane().add(btnCalculateGpa, "cell 5 17,alignx center");
		
		JLabel GPA = new JLabel("GPA");
		GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(GPA, "cell 6 17");
		
		JLabel lblNewLabel_4 = new JLabel("Target GPA:");
		frame.getContentPane().add(lblNewLabel_4, "cell 2 18,alignx trailing");
		
		textField_26 = new JTextField();
		frame.getContentPane().add(textField_26, "cell 3 18,growx");
		textField_26.setColumns(10);
		
		JButton button_1 = new JButton("Calculate GPA for Target");
		frame.getContentPane().add(button_1, "cell 4 18,alignx center");
		
		JLabel lblGpa = new JLabel("GPA:");
		frame.getContentPane().add(lblGpa, "cell 5 18");
		
		JLabel lblNeededGpa = new JLabel("Needed GPA:");
		frame.getContentPane().add(lblNeededGpa, "cell 6 18");
		
	}

}
