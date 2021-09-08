package smser;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

public class smser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		smser frame = new smser();
		frame.setVisible(true);
		frame.setResizable(false);
				} 

	/**
	 * Create the frame.
	 */
	public smser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(29, 104, 1123, 561);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		contentPane.add(tabbedPane);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBorder(null);
		layeredPane_4.setForeground(Color.WHITE);
		layeredPane_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Profile", null, layeredPane_4, null);
		layeredPane_4.setLayout(null);
		
		JPanel panel_1 = 
				new JPanel();
		panel_1.setBounds(10, 11, 1097, 511);
		layeredPane_4.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(39, 64, 72, 37);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 108, 241, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(39, 104, 72, 37);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(144, 463, 110, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(39, 184, 72, 37);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Username:");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setBounds(39, 144, 72, 37);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Experience:");
		lblNewLabel_1_1_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1.setBounds(39, 225, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(144, 68, 241, 29);
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		textField_7 = new JTextField();
		textField_7.setBounds(144, 148, 241, 29);
		textField_7.setColumns(10);
		panel_1.add(textField_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 188, 241, 29);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(144, 229, 241, 29);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(144, 269, 241, 29);
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(144, 28, 241, 29);
		textField_6.setColumns(10);
		panel_1.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(144, 309, 241, 29);
		textField_8.setColumns(10);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_1_2 = new JLabel("Teacher ID :");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(39, 24, 72, 37);
		panel_1.add(lblNewLabel_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(465, 39, 593, 415);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(90, 22, 263, 38);
		panel_2.add(textField);
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(382, 23, 122, 35);
		panel_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Qualification:");
		lblNewLabel_1_1_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_1.setBounds(39, 265, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.setBounds(275, 463, 110, 37);
		panel_1.add(btnNewButton_1_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(144, 349, 241, 29);
		textField_9.setColumns(10);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(144, 385, 241, 29);
		textField_10.setColumns(10);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(144, 425, 241, 29);
		textField_11.setColumns(10);
		panel_1.add(textField_11);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("E-mail:");
		lblNewLabel_1_1_3_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_2.setBounds(39, 345, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1_2);
		
		JLabel lblNewLabel_1_1_3_1_3 = new JLabel("Contact:");
		lblNewLabel_1_1_3_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_3.setBounds(39, 381, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1_3);
		
		JLabel lblNewLabel_1_1_3_1_4 = new JLabel("D.O.B:");
		lblNewLabel_1_1_3_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_4.setBounds(39, 421, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1_4);
		
		JLabel lblNewLabel_1_1_3_1_5 = new JLabel("Gender");
		lblNewLabel_1_1_3_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_3_1_5.setBounds(39, 305, 95, 37);
		panel_1.add(lblNewLabel_1_1_3_1_5);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\alfons-morales-YLSwjSy7stw-unsplash.jpg"));
		lblNewLabel_3.setBounds(-12, -14, 1109, 539);
		panel_1.add(lblNewLabel_3);
		
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Module", null, layeredPane_1, null);
		layeredPane_1.setLayout(null);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(117, 31, 1, 1);
		layeredPane_1.add(layeredPane_2);
		
		JButton btnNewButton_1_2 = new JButton("ADD");
		btnNewButton_1_2.setBounds(87, 457, 160, 37);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		layeredPane_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("DELETE");
		btnNewButton_1_2_1.setBounds(318, 458, 160, 37);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		layeredPane_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("UPDATE");
		btnNewButton_1_2_2.setBounds(552, 458, 160, 37);
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		layeredPane_1.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("SHOW ALL DETAILS");
		btnNewButton_1_2_3.setBounds(787, 458, 209, 37);
		btnNewButton_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		layeredPane_1.add(btnNewButton_1_2_3);
		
		JButton btn_english = new JButton("English");
		btn_english.setBounds(204, 316, 151, 44);
		btn_english.setFont(new Font("Arial", Font.BOLD, 16));
		layeredPane_1.add(btn_english);
		
		JButton btn_science = new JButton("Science");
		btn_science.setBounds(502, 316, 160, 44);
		btn_science.setFont(new Font("Arial", Font.BOLD, 16));
		btn_science.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		layeredPane_1.add(btn_science);
		
		JButton btn_english_1 = new JButton("Social");
		btn_english_1.setBounds(792, 316, 151, 44);
		btn_english_1.setFont(new Font("Arial", Font.BOLD, 16));
		layeredPane_1.add(btn_english_1);
		
		JLabel lbl_englishicon = new JLabel("");
		lbl_englishicon.setBounds(204, 99, 151, 175);
		lbl_englishicon.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2 (1).jpg"));
		lbl_englishicon.setForeground(new Color(255, 165, 0));
		lbl_englishicon.setBackground(new Color(255, 165, 0));
		layeredPane_1.add(lbl_englishicon);
		
		JLabel lbl_englishicon_1 = new JLabel("");
		lbl_englishicon_1.setBounds(502, 99, 160, 175);
		lbl_englishicon_1.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\jaredd-craig-HH4WBGNyltc-unsplash (1).jpg"));
		lbl_englishicon_1.setForeground(new Color(255, 165, 0));
		lbl_englishicon_1.setBackground(new Color(255, 165, 0));
		layeredPane_1.add(lbl_englishicon_1);
		
		JLabel lbl_englishicon_2 = new JLabel("");
		lbl_englishicon_2.setBounds(787, 99, 156, 175);
		lbl_englishicon_2.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2.jpg"));
		lbl_englishicon_2.setForeground(new Color(255, 165, 0));
		lbl_englishicon_2.setBackground(new Color(255, 165, 0));
		layeredPane_1.add(lbl_englishicon_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2 (1).jpg"));
		lblNewLabel_4.setBounds(0, 0, 1118, 533);
		layeredPane_1.add(lblNewLabel_4);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Students Details", null, layeredPane_3, null);
		layeredPane_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2 (1).jpg"));
		lblNewLabel_5.setBounds(0, 0, 1118, 533);
		layeredPane_3.add(lblNewLabel_5);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(517, 120, 1, 1);
		contentPane.add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("TEACHER PAGE");
		lblNewLabel.setBounds(469, 32, 270, 61);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 26));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 218, 185));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\alfons-morales-YLSwjSy7stw-unsplash.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1184, 691);
		contentPane.add(lblNewLabel_2);
		
		
	}
}




