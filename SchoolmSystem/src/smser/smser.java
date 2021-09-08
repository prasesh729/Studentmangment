package smser;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class smser extends JFrame {

	 JPanel mainw_contentPane;
	 JTextField tf_search,tf_lastname,tf_firstname,tf_username,tf_age,tf_experience,
	 tf_qualification,tf_teacherid,tf_gender,tf_email,tf_contact,tf_dob;

	
	 public smser() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 730);
		
		mainw_contentPane = new JPanel();
		mainw_contentPane.setBackground(Color.WHITE);
		mainw_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainw_contentPane);
		mainw_contentPane.setLayout(null);
		
		JTabbedPane p_m_sd_tPane = new JTabbedPane(JTabbedPane.TOP);
		p_m_sd_tPane.setBounds(29, 104, 1123, 561);
		p_m_sd_tPane.setBorder(null);
		p_m_sd_tPane.setBackground(Color.WHITE);
		mainw_contentPane.add(p_m_sd_tPane);
		
		
		//----------------------------------------------------Profile pane panel-------------------------------------------------------
		
		JLayeredPane profile_pane = new JLayeredPane();
		profile_pane.setBorder(null);
		profile_pane.setForeground(Color.WHITE);
		profile_pane.setBackground(Color.WHITE);
		p_m_sd_tPane.addTab("Profile", null, profile_pane, null);
		profile_pane.setLayout(null);
		
		JPanel profile_panel = new JPanel();
		profile_panel.setBounds(10, 11, 1097, 511);
		profile_pane.add(profile_panel);
		profile_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHER PAGE");
		lblNewLabel.setBounds(469, 32, 270, 61);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 26));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 218, 185));
		mainw_contentPane.add(lblNewLabel);
		
				
	//------------------------------------------------------------Profile label --------------------------------------------------
		
		JLabel lbl_teacherid = new JLabel("Teacher ID :");
		lbl_teacherid.setForeground(new Color(255, 255, 255));
		lbl_teacherid.setBounds(39, 24, 72, 37);
		profile_panel.add(lbl_teacherid);
		
		JLabel lbl_fname = new JLabel("First Name:");
		lbl_fname.setForeground(new Color(255, 255, 255));
		lbl_fname.setBounds(39, 64, 72, 37);
		profile_panel.add(lbl_fname);
	
		JLabel lbl_lname = new JLabel("Last Name:");
		lbl_lname.setForeground(new Color(255, 255, 255));
		lbl_lname.setBounds(39, 104, 72, 37);
		profile_panel.add(lbl_lname);
		
		JLabel lbl_un = new JLabel("Username:");
		lbl_un.setForeground(new Color(255, 255, 255));
		lbl_un.setBounds(39, 144, 72, 37);
		profile_panel.add(lbl_un);
		
		JLabel lbl_age = new JLabel("Age:");
		lbl_age.setForeground(new Color(255, 255, 255));
		lbl_age.setBounds(39, 184, 72, 37);
		profile_panel.add(lbl_age);
		
		JLabel lbl_exp = new JLabel("Experience:");
		lbl_exp.setForeground(new Color(255, 255, 255));
		lbl_exp.setBounds(39, 225, 95, 37);
		profile_panel.add(lbl_exp);
		
		JLabel lbl_qualification = new JLabel("Qualification:");
		lbl_qualification.setForeground(new Color(255, 255, 255));
		lbl_qualification.setBounds(39, 265, 95, 37);
		profile_panel.add(lbl_qualification);
		
		JLabel lbl_gender = new JLabel("Gender");
		lbl_gender.setForeground(new Color(255, 255, 255));
		lbl_gender.setBounds(39, 305, 95, 37);
		profile_panel.add(lbl_gender);
		
		JLabel lbl_em = new JLabel("E-mail:");
		lbl_em.setForeground(new Color(255, 255, 255));
		lbl_em.setBounds(39, 345, 95, 37);
		profile_panel.add(lbl_em);
		
		JLabel lbl_contact = new JLabel("Contact:");
		lbl_contact.setForeground(new Color(255, 255, 255));
		lbl_contact.setBounds(39, 381, 95, 37);
		profile_panel.add(lbl_contact);
		
		JLabel lbl_dob = new JLabel("D.O.B:");
		lbl_dob.setForeground(new Color(255, 255, 255));
		lbl_dob.setBounds(39, 421, 95, 37);
		profile_panel.add(lbl_dob);
		
	
		//-------------------------------------------------------- ProfileTextField ------------------------------------------------
		
		tf_teacherid = new JTextField();
		tf_teacherid.setBounds(144, 28, 241, 29);
		tf_teacherid.setColumns(10);
		profile_panel.add(tf_teacherid);
		
		tf_firstname = new JTextField();
		tf_firstname.setBounds(144, 68, 241, 29);
		tf_firstname.setColumns(10);
		profile_panel.add(tf_firstname);
		
		tf_lastname = new JTextField();
		tf_lastname.setBounds(144, 108, 241, 29);
		profile_panel.add(tf_lastname);
		tf_lastname.setColumns(10);
		
		tf_username = new JTextField();
		tf_username.setBounds(144, 148, 241, 29);
		tf_username.setColumns(10);
		profile_panel.add(tf_username);
		
		tf_age = new JTextField();
		tf_age.setBounds(144, 188, 241, 29);
		tf_age.setColumns(10);
		profile_panel.add(tf_age);
		
		tf_experience = new JTextField();
		tf_experience.setBounds(144, 229, 241, 29);
		tf_experience.setColumns(10);
		profile_panel.add(tf_experience);
		
		tf_qualification = new JTextField();
		tf_qualification.setBounds(144, 269, 241, 29);
		tf_qualification.setColumns(10);
		profile_panel.add(tf_qualification);
		
		tf_gender = new JTextField();
		tf_gender.setBounds(144, 309, 241, 29);
		tf_gender.setColumns(10);
		profile_panel.add(tf_gender);
		
		tf_email = new JTextField();
		tf_email.setBounds(144, 349, 241, 29);
		tf_email.setColumns(10);
		profile_panel.add(tf_email);
		
		tf_contact = new JTextField();
		tf_contact.setBounds(144, 385, 241, 29);
		tf_contact.setColumns(10);
		profile_panel.add(tf_contact);
		
		tf_dob = new JTextField();
		tf_dob.setBounds(144, 425, 241, 29);
		tf_dob.setColumns(10);
		profile_panel.add(tf_dob);
		
		//------------------------------------------------Profile button--------------------------------------------------
		JButton btnp_update = new JButton("Update");
		btnp_update.setBounds(144, 463, 110, 37);
		profile_panel.add(btnp_update);
		
		JButton btnp_clear = new JButton("Clear");
		btnp_clear.setBounds(275, 463, 110, 37);
		profile_panel.add(btnp_clear);
		
		//-----------------------------------------------Profile Search panel--------------------------------------------------------------
	    JPanel searchw_panel = new JPanel();
		searchw_panel.setBounds(465, 39, 593, 415);
		searchw_panel.setBorder(new LineBorder(new Color(0, 0, 51), 3));
		profile_panel.add(searchw_panel);
		searchw_panel.setLayout(null);
		
		tf_search = new JTextField();
		tf_search.setBounds(90, 22, 263, 38);
		searchw_panel.add(tf_search);
		tf_search.setFont(new Font("Arial", Font.PLAIN, 16));
		tf_search.setColumns(10);
		
		JButton btnp_search = new JButton("Search");
		btnp_search.setBounds(382, 23, 122, 35);
		searchw_panel.add(btnp_search);
		btnp_search.setFont(new Font("Arial", Font.PLAIN, 16));
		btnp_search.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
		btnp_search.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
		
		
		//--------------------------------------------------------Moudle label icon-------------------------------------------------
		
		JLayeredPane Module_panel = new JLayeredPane();
		Module_panel.setBackground(Color.LIGHT_GRAY);
		p_m_sd_tPane.addTab("Module", null, Module_panel, null);
		Module_panel.setLayout(null);
		
		JLabel lbl_englishicon = new JLabel("");
		lbl_englishicon.setBounds(204, 99, 151, 175);
		lbl_englishicon.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2 (1).jpg"));
		lbl_englishicon.setForeground(new Color(255, 165, 0));
		lbl_englishicon.setBackground(new Color(255, 165, 0));
		Module_panel.add(lbl_englishicon);
		
		JLabel lbl_scienceicon = new JLabel("");
		lbl_scienceicon.setBounds(502, 99, 160, 175);
		lbl_scienceicon.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\jaredd-craig-HH4WBGNyltc-unsplash (1).jpg"));
		lbl_scienceicon.setForeground(new Color(255, 165, 0));
		lbl_scienceicon.setBackground(new Color(255, 165, 0));
		Module_panel.add(lbl_scienceicon);
		
		JLabel lbl_socialicon = new JLabel("");
		lbl_socialicon.setBounds(787, 99, 156, 175);
		lbl_socialicon.setIcon(new ImageIcon("C:\\Users\\Default.WINDOWS-D4EV9FU\\Downloads\\bg img 2.jpg"));
		lbl_socialicon.setForeground(new Color(255, 165, 0));
		lbl_socialicon.setBackground(new Color(255, 165, 0));
		Module_panel.add(lbl_socialicon);
		
		
		//------------------------------------------------------------Module button-----------------------------------------------------
		
		JButton btnm_english = new JButton("English");
		btnm_english.setBounds(204, 316, 151, 44);
		btnm_english.setFont(new Font("Arial", Font.BOLD, 16));
		Module_panel.add(btnm_english);
		
		JButton btnm_science = new JButton("Science");
		btnm_science.setBounds(502, 316, 160, 44);
		btnm_science.setFont(new Font("Arial", Font.BOLD, 16));
		btnm_science.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		Module_panel.add(btnm_science);
		
		JButton btnm_soical = new JButton("Social");
		btnm_soical.setBounds(792, 316, 151, 44);
		btnm_soical.setFont(new Font("Arial", Font.BOLD, 16));
		Module_panel.add(btnm_soical);
		
		JButton btnm_add = new JButton("ADD");
		btnm_add.setBounds(87, 457, 160, 37);
		btnm_add.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Module_panel.add(btnm_add);
		
		JButton btnm_delete = new JButton("DELETE");
		btnm_delete.setBounds(318, 458, 160, 37);
		btnm_delete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Module_panel.add(btnm_delete);
		
		JButton btnm_update = new JButton("UPDATE");
		btnm_update.setBounds(552, 458, 160, 37);
		btnm_update.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Module_panel.add(btnm_update);
		
		JButton btnm_showadetail = new JButton("SHOW ALL DETAILS");
		btnm_showadetail.setBounds(787, 458, 209, 37);
		btnm_showadetail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Module_panel.add(btnm_showadetail);
		
		
		//------------------------------------------------------ Show details window ----------------------------------------------------------
	
		JLayeredPane SD_lpane = new JLayeredPane();
		p_m_sd_tPane.addTab("Students Details", null, SD_lpane, null);
		SD_lpane.setLayout(null);
		
		
		//------------------------------------------------------ Background Images ---------------------------------------------------------------
		
	    JLabel main_bgimage = new JLabel("");
	    main_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
	    main_bgimage.setBounds(0, 0, 1184, 691);
	    mainw_contentPane.add(main_bgimage);

		JLabel p_bgimage = new JLabel("");
		p_bgimage.setForeground(new Color(255, 255, 255));
		p_bgimage.setIcon(new ImageIcon("D:\\bg_img1.jpg"));
		p_bgimage.setBounds(0, 0, 1097, 525);
		profile_panel.add(p_bgimage);
		
		JLabel m_bgimage = new JLabel("");
		m_bgimage.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
		m_bgimage.setBounds(0, 0, 1118, 533);
		Module_panel.add(m_bgimage);
				
		JLabel sD_bgimage = new JLabel(" ");
		sD_bgimage.setIcon(new ImageIcon("D:\\bg img 11.jpg"));
		sD_bgimage.setBounds(0, 0, 1118, 533);
		SD_lpane.add(sD_bgimage);
							
	}

	
public static void main(String[] args) {
	smser frame = new smser();
	frame.setVisible(true);
	frame.setResizable(false);
	} 
}