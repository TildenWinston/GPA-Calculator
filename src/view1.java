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
	private JTextField creditHours2;
	private JTextField creditHours3;
	private JTextField creditHours4;
	private JTextField creditHours5;
	private JTextField creditHours6;
	private JTextField creditHours7;
	private JTextField creditHours8;
	private JTextField creditHours9;
	private JTextField textField_8creditHours10;
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
		double width = (screenSize.getWidth()) * .8;
/*		if (width < 1024) {
			width = 1024;
		}*/
		
		double height = (screenSize.getHeight()) * .8;
/*		if (width < 768) {
			width = 768;
		}*/
		
		frame = new JFrame();
		frame.getContentPane().setMinimumSize(new Dimension(1024, 768));
		frame.setBounds(100, 100, (int)(width), (int)(height));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[0px:n,grow][15px:n:30px,grow,center][120px:126.00px:150px,grow][90px:n:100px,grow][155px:n:180px,grow][115px:n:175px,grow][::90px,grow][0px:n,grow]", "[44.00px][][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][::100px,grow][][]"));
		
		JLabel lblTitle = new JLabel("GPA Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblTitle, "cell 2 0,alignx center,aligny top");
		
		JButton btnHelp = new JButton("HELP");
		frame.getContentPane().add(btnHelp, "cell 6 0,alignx center");
		
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
		
		JButton deleteRow1 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow1, "cell 6 2");
		
		JLabel label_1 = new JLabel("2");
		frame.getContentPane().add(label_1, "cell 1 3,alignx center");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_1, "cell 2 3,growx");
		
		creditHours2 = new JTextField();
		creditHours2.setColumns(10);
		frame.getContentPane().add(creditHours2, "cell 3 3,growx");
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		frame.getContentPane().add(grade2, "cell 4 3,growx");
		
		courseName2 = new JTextField();
		courseName2.setColumns(10);
		frame.getContentPane().add(courseName2, "cell 5 3,growx");
		
		JButton deleteRow2 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow2, "cell 6 3");
		
		JLabel label_2 = new JLabel("3");
		frame.getContentPane().add(label_2, "cell 1 4,alignx center");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_2, "cell 2 4,growx");
		
		creditHours3 = new JTextField();
		creditHours3.setColumns(10);
		frame.getContentPane().add(creditHours3, "cell 3 4,growx");
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		frame.getContentPane().add(grade3, "cell 4 4,growx");
		
		courseName3 = new JTextField();
		frame.getContentPane().add(courseName3, "cell 5 4,growx");
		courseName3.setColumns(10);
		
		JButton deleteRow3 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow3, "cell 6 4");
		
		JLabel label_3 = new JLabel("4");
		frame.getContentPane().add(label_3, "cell 1 5,alignx center");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_3, "cell 2 5,growx");
		
		creditHours4 = new JTextField();
		creditHours4.setColumns(10);
		frame.getContentPane().add(creditHours4, "cell 3 5,growx");
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		frame.getContentPane().add(grade4, "cell 4 5,growx");
		
		courseName4 = new JTextField();
		frame.getContentPane().add(courseName4, "cell 5 5,growx");
		courseName4.setColumns(10);
		
		JButton deleteRow4 = new JButton("Delete Row");
		deleteRow4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(deleteRow4, "cell 6 5");
		
		JLabel label_4 = new JLabel("5");
		frame.getContentPane().add(label_4, "cell 1 6,alignx center");
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_4, "cell 2 6,growx");
		
		creditHours5 = new JTextField();
		creditHours5.setColumns(10);
		frame.getContentPane().add(creditHours5, "cell 3 6,growx");
		
		grade5 = new JTextField();
		frame.getContentPane().add(grade5, "cell 4 6,growx");
		grade5.setColumns(10);
		
		courseName5 = new JTextField();
		frame.getContentPane().add(courseName5, "cell 5 6,growx");
		courseName5.setColumns(10);
		
		JButton deleteRow5 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow5, "cell 6 6");
		
		JLabel label_5 = new JLabel("6");
		frame.getContentPane().add(label_5, "cell 1 7,alignx center");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_5, "cell 2 7,growx");
		
		creditHours6 = new JTextField();
		creditHours6.setColumns(10);
		frame.getContentPane().add(creditHours6, "cell 3 7,growx");
		
		grade6 = new JTextField();
		frame.getContentPane().add(grade6, "cell 4 7,growx");
		grade6.setColumns(10);
		
		courseName6 = new JTextField();
		frame.getContentPane().add(courseName6, "cell 5 7,growx");
		courseName6.setColumns(10);
		
		JButton deleteRow6 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow6, "cell 6 7");
		
		JLabel label_6 = new JLabel("7");
		frame.getContentPane().add(label_6, "cell 1 8,alignx center");
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_6, "cell 2 8,growx");
		
		creditHours7 = new JTextField();
		creditHours7.setColumns(10);
		frame.getContentPane().add(creditHours7, "cell 3 8,growx");
		
		grade7 = new JTextField();
		frame.getContentPane().add(grade7, "cell 4 8,growx");
		grade7.setColumns(10);
		
		courseName7 = new JTextField();
		frame.getContentPane().add(courseName7, "cell 5 8,growx");
		courseName7.setColumns(10);
		
		JButton deleteRow7 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow7, "cell 6 8");
		
		JLabel label_7 = new JLabel("8");
		frame.getContentPane().add(label_7, "cell 1 9,alignx center");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_7, "cell 2 9,growx");
		
		creditHours8 = new JTextField();
		creditHours8.setColumns(10);
		frame.getContentPane().add(creditHours8, "cell 3 9,growx");
		
		grade8 = new JTextField();
		frame.getContentPane().add(grade8, "cell 4 9,growx");
		grade8.setColumns(10);
		
		courseName8 = new JTextField();
		frame.getContentPane().add(courseName8, "cell 5 9,growx");
		courseName8.setColumns(10);
		
		JButton deleteRow8 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow8, "cell 6 9");
		
		JLabel label_8 = new JLabel("9");
		frame.getContentPane().add(label_8, "cell 1 10,alignx center");
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_8, "cell 2 10,growx");
		
		creditHours9 = new JTextField();
		creditHours9.setColumns(10);
		frame.getContentPane().add(creditHours9, "cell 3 10,growx");
		
		grade9 = new JTextField();
		frame.getContentPane().add(grade9, "cell 4 10,growx");
		grade9.setColumns(10);
		
		courseName9 = new JTextField();
		frame.getContentPane().add(courseName9, "cell 5 10,growx");
		courseName9.setColumns(10);
		
		JButton deleteRow9 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow9, "cell 6 10");
		
		JLabel label_9 = new JLabel("10");
		frame.getContentPane().add(label_9, "cell 1 11,alignx center");
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_9, "cell 2 11,growx");
		
		textField_8creditHours10 = new JTextField();
		textField_8creditHours10.setColumns(10);
		frame.getContentPane().add(textField_8creditHours10, "cell 3 11,growx");
		
		grade10 = new JTextField();
		frame.getContentPane().add(grade10, "cell 4 11,growx");
		grade10.setColumns(10);
		
		courseName10 = new JTextField();
		frame.getContentPane().add(courseName10, "cell 5 11,growx");
		courseName10.setColumns(10);
		
		JButton deleteRow10 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow10, "cell 6 11");
		
		JLabel label_10 = new JLabel("11");
		frame.getContentPane().add(label_10, "cell 1 12,alignx center");
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_10, "cell 2 12,growx");
		
		creditHours11 = new JTextField();
		creditHours11.setColumns(10);
		frame.getContentPane().add(creditHours11, "cell 3 12,growx");
		
		grade11 = new JTextField();
		frame.getContentPane().add(grade11, "cell 4 12,growx");
		grade11.setColumns(10);
		
		courseName11 = new JTextField();
		frame.getContentPane().add(courseName11, "cell 5 12,growx");
		courseName11.setColumns(10);
		
		JButton deleteRow11 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow11, "cell 6 12");
		
		JLabel label_11 = new JLabel("12");
		frame.getContentPane().add(label_11, "cell 1 13,alignx center");
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_11, "cell 2 13,growx");
		
		creditHours12 = new JTextField();
		creditHours12.setColumns(10);
		frame.getContentPane().add(creditHours12, "cell 3 13,growx");
		
		grade12 = new JTextField();
		frame.getContentPane().add(grade12, "cell 4 13,growx");
		grade12.setColumns(10);
		
		courseName12 = new JTextField();
		frame.getContentPane().add(courseName12, "cell 5 13,growx");
		courseName12.setColumns(10);
		
		JButton deleteRow12 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow12, "cell 6 13");
		
		JLabel label_12 = new JLabel("13");
		frame.getContentPane().add(label_12, "cell 1 14,alignx center");
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_12, "cell 2 14,growx");
		
		creditHours13 = new JTextField();
		creditHours13.setColumns(10);
		frame.getContentPane().add(creditHours13, "cell 3 14,growx");
		
		grade13 = new JTextField();
		frame.getContentPane().add(grade13, "cell 4 14,growx");
		grade13.setColumns(10);
		
		courseName13 = new JTextField();
		frame.getContentPane().add(courseName13, "cell 5 14,growx");
		courseName13.setColumns(10);
		
		JButton deleteRow13 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow13, "cell 6 14");
		
		JLabel label_13 = new JLabel("14");
		frame.getContentPane().add(label_13, "cell 1 15,alignx center");
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_13, "cell 2 15,growx");
		
		creditHours14 = new JTextField();
		creditHours14.setColumns(10);
		frame.getContentPane().add(creditHours14, "cell 3 15,growx");
		
		grade14 = new JTextField();
		frame.getContentPane().add(grade14, "cell 4 15,growx");
		grade14.setColumns(10);
		
		courseName14 = new JTextField();
		courseName14.setColumns(10);
		frame.getContentPane().add(courseName14, "cell 5 15,growx");
		
		JButton deleteRow14 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow14, "cell 6 15");
		
		JLabel label_14 = new JLabel("15");
		frame.getContentPane().add(label_14, "cell 1 16,alignx center");
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"taken", "current", "anticipated"}));
		frame.getContentPane().add(comboBox_14, "cell 2 16,growx");
		
		creditHours15 = new JTextField();
		creditHours15.setColumns(10);
		frame.getContentPane().add(creditHours15, "cell 3 16,growx");
		
		grade15 = new JTextField();
		frame.getContentPane().add(grade15, "cell 4 16,growx");
		grade15.setColumns(10);
		
		courseName15 = new JTextField();
		courseName15.setColumns(10);
		frame.getContentPane().add(courseName15, "cell 5 16,growx");
		
		JButton deleteRow15 = new JButton("Delete Row");
		frame.getContentPane().add(deleteRow15, "cell 6 16");
		
		JButton btnCalculateGpa = new JButton("Calculate GPA");
		frame.getContentPane().add(btnCalculateGpa, "cell 5 17,alignx center");
		
		JLabel GPA = new JLabel("GPA");
		GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(GPA, "cell 6 17");
		
		JLabel targetGPALabel = new JLabel("Target GPA:");
		frame.getContentPane().add(targetGPALabel, "cell 2 18,alignx trailing");
		
		targetGPA = new JTextField();
		frame.getContentPane().add(targetGPA, "cell 3 18,growx");
		targetGPA.setColumns(10);
		
		JButton targetGPAButton = new JButton("Calculate GPA for Target");
		frame.getContentPane().add(targetGPAButton, "cell 4 18,alignx center");
		
		JLabel lblGpa = new JLabel("GPA:");
		frame.getContentPane().add(lblGpa, "cell 5 18");
		
		JLabel lblNeededGpa = new JLabel("Needed GPA:");
		frame.getContentPane().add(lblNeededGpa, "cell 6 18");
		
	}

}