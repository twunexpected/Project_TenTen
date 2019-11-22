package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;
 
public class Login_OXQuiz5 extends JPanel {
	private Login_MainFrame mf;
	private JPanel login_OXQuiz5;
	int q1 = 0;
	int q2 = 0;
	int q3 = 0;
	int q4 = 0;
	int q5 = 0;
	int q6 = 0;
	int q7 = 0;
	int q8 = 0;
	int q9 = 0;
	int q10 = 0;
	String grade;
	int all;
	
	public Login_OXQuiz5(Login_MainFrame mf) {
		this.mf = mf;
		login_OXQuiz5 = this;
		
		
		//¹é È­¸é
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		
		
		//copyRights
		JLabel copyRights = new JLabel("Copyrights ¨Ï  ºñ!´¢³»°ú All Rights reserved.");
		copyRights.setBounds(60, 600, 400, 50);
		copyRights.setFont(new Font("°íµñ", Font.BOLD, 13));
		
		
		//º»¹®
		JLabel word = new JLabel("´Ü¾î");
		word.setBounds(50, 110, 70, 50);
		word.setFont(new Font("°íµñ", Font.BOLD, 22));

		JLabel mean = new JLabel("¶æ");
		mean.setBounds(160, 110, 70, 50);
		mean.setFont(new Font("°íµñ", Font.BOLD, 22));

		JLabel o = new JLabel("O");
		o.setBounds(260, 110, 70, 50);
		o.setFont(new Font("°íµñ", Font.BOLD, 22));

		JLabel x = new JLabel("X");
		x.setBounds(310, 110, 70, 50);
		x.setFont(new Font("°íµñ", Font.BOLD, 22));

		//word
		JLabel word1 = new JLabel("receipt");
		word1.setBounds(20, 170, 120, 35);
		word1.setFont(new Font("°íµñ", Font.BOLD, 15));
		word1.setHorizontalAlignment(JTextField.LEFT);

		JLabel word2 = new JLabel("visible balance");
		word2.setBounds(20, 200, 120, 35);
		word2.setFont(new Font("°íµñ", Font.BOLD, 15));
		word2.setHorizontalAlignment(JTextField.LEFT);

		JLabel word3 = new JLabel("net income");
		word3.setBounds(20, 230, 120, 35);
		word3.setFont(new Font("°íµñ", Font.BOLD, 15));
		word3.setHorizontalAlignment(JTextField.LEFT);

		JLabel word4 = new JLabel("depreciatiion");
		word4.setBounds(20, 260, 120, 35);
		word4.setFont(new Font("°íµñ", Font.BOLD, 15));
		word4.setHorizontalAlignment(JTextField.LEFT);

		JLabel word5 = new JLabel("working asset");
		word5.setBounds(20, 290, 120, 35);
		word5.setFont(new Font("°íµñ", Font.BOLD, 15));
		word5.setHorizontalAlignment(JTextField.LEFT);

		JLabel word6 = new JLabel("sales forecast");
		word6.setBounds(20, 320, 120, 35);
		word6.setFont(new Font("°íµñ", Font.BOLD, 15));
		word6.setHorizontalAlignment(JTextField.LEFT);

		JLabel word7 = new JLabel("sales analysis");
		word7.setBounds(20, 350, 120, 35);
		word7.setFont(new Font("°íµñ", Font.BOLD, 15));
		word7.setHorizontalAlignment(JTextField.LEFT);

		JLabel word8 = new JLabel("product mix");
		word8.setBounds(20, 380, 120, 35);
		word8.setFont(new Font("°íµñ", Font.BOLD, 15));
		word8.setHorizontalAlignment(JTextField.LEFT);

		JLabel word9 = new JLabel("stock");
		word9.setBounds(20, 410, 120, 35);
		word9.setFont(new Font("°íµñ", Font.BOLD, 15));
		word9.setHorizontalAlignment(JTextField.LEFT);

		JLabel word10 = new JLabel("benchmarking");
		word10.setBounds(20, 440, 120, 35);
		word10.setFont(new Font("°íµñ", Font.BOLD, 15));
		word10.setHorizontalAlignment(JTextField.LEFT);

		//mean
		JLabel mean1 = new JLabel("¿µ¼öÁõ");
		mean1.setBounds(140, 170, 120, 35);
		mean1.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean1.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean2 = new JLabel("¼øÀÌÀÍ");
		mean2.setBounds(140, 200, 120, 35);
		mean2.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean2.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean3 = new JLabel("¹«¿ª ¼öÁö");
		mean3.setBounds(140, 230, 120, 35);
		mean3.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean3.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean4 = new JLabel("°¡Ä¡ ÇÏ¶ô");
		mean4.setBounds(140, 260, 120, 35);
		mean4.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean4.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean5 = new JLabel("¿î¿ë ÀÚ»ê");
		mean5.setBounds(140, 290, 120, 35);
		mean5.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean5.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean6 = new JLabel("ÆÇ¸Å ¿¹Ãø");
		mean6.setBounds(140, 320, 120, 35);
		mean6.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean6.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean7 = new JLabel("Á¦Ç° ¹Í½º");
		mean7.setBounds(140, 350, 120, 35);
		mean7.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean7.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean8 = new JLabel("ÆÇ¸Å ºÐ¼®");
		mean8.setBounds(140, 380, 120, 35);
		mean8.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean8.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean9 = new JLabel("ÁÖ½Ä ÀÚº»");
		mean9.setBounds(140, 410, 120, 35);
		mean9.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean9.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean10 = new JLabel("º¥Ä¡¸¶Å·");
		mean10.setBounds(140, 440, 120, 35);
		mean10.setFont(new Font("°íµñ", Font.BOLD, 15));
		mean10.setHorizontalAlignment(JTextField.LEFT);

		//btnFinish
		JButton btnFinish = new JButton("Á¦Ãâ");
		btnFinish.setBounds(140, 550, 90, 40);
		btnFinish.setForeground(new Color(255, 255, 225));
		btnFinish.setBackground(new Color(36, 107, 220));
		btnFinish.setFont(new Font("°íµñ", Font.BOLD, 20));
		//------------------------------------------------------------
		//RadioButton 1~10
		JRadioButton rb1_o = new JRadioButton();
		rb1_o.setBounds(260, 180, 20, 15);
		rb1_o.setBackground(new Color(123, 185, 237));
		rb1_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q1 = 1;
			}
		});

		JRadioButton rb1_x = new JRadioButton();
		rb1_x.setBounds(310, 180, 20, 15);
		rb1_x.setBackground(new Color(123, 185, 237));
		rb1_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q1 = 0;
			}
		});
		ButtonGroup group1 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb2_o = new JRadioButton();
		rb2_o.setBounds(260, 210, 20, 15);
		rb2_o.setBackground(new Color(123, 185, 237));
		rb2_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q2 = 0;
			}
		});
		JRadioButton rb2_x = new JRadioButton();
		rb2_x.setBounds(310, 210, 20, 15);
		rb2_x.setBackground(new Color(123, 185, 237));
		rb2_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q2 = 1;
			}
		});
		ButtonGroup group2 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb3_o = new JRadioButton();
		rb3_o.setBounds(260, 240, 20, 15);
		rb3_o.setBackground(new Color(123, 185, 237));
		rb3_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q3 = 0;
			}
		});
		JRadioButton rb3_x = new JRadioButton();
		rb3_x.setBounds(310, 240, 20, 15);
		rb3_x.setBackground(new Color(123, 185, 237));
		rb3_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q3 = 1;
			}
		});
		ButtonGroup group3 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb4_o = new JRadioButton();
		rb4_o.setBounds(260, 270, 20, 15);
		rb4_o.setBackground(new Color(123, 185, 237));
		rb4_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q4 = 1;
			}
		});
		JRadioButton rb4_x = new JRadioButton();
		rb4_x.setBounds(310, 270, 20, 15);
		rb4_x.setBackground(new Color(123, 185, 237));
		rb4_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q4 = 0;
			}
		});
		ButtonGroup group4 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb5_o = new JRadioButton();
		rb5_o.setBounds(260, 300, 20, 15);
		rb5_o.setBackground(new Color(123, 185, 237));
		rb5_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q5 = 1;
			}
		});
		JRadioButton rb5_x = new JRadioButton();
		rb5_x.setBounds(310, 300, 20, 15);
		rb5_x.setBackground(new Color(123, 185, 237));
		rb5_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q5 = 0;
			}
		});
		ButtonGroup group5 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb6_o = new JRadioButton();
		rb6_o.setBounds(260, 330, 20, 15);
		rb6_o.setBackground(new Color(123, 185, 237));
		rb6_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q6 = 1;
			}
		});
		JRadioButton rb6_x = new JRadioButton();
		rb6_x.setBounds(310, 330, 20, 15);
		rb6_x.setBackground(new Color(123, 185, 237));
		rb6_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q6 = 0;
			}
		});
		ButtonGroup group6 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb7_o = new JRadioButton();
		rb7_o.setBounds(260, 360, 20, 15);
		rb7_o.setBackground(new Color(123, 185, 237));
		rb7_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q7 = 0;
			}
		});
		JRadioButton rb7_x = new JRadioButton();
		rb7_x.setBounds(310, 360, 20, 15);
		rb7_x.setBackground(new Color(123, 185, 237));
		rb7_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q7 = 1;
			}
		});
		ButtonGroup group7 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb8_o = new JRadioButton();
		rb8_o.setBounds(260, 390, 20, 15);
		rb8_o.setBackground(new Color(123, 185, 237));
		rb8_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q8 = 0;
			}
		});
		JRadioButton rb8_x = new JRadioButton();
		rb8_x.setBounds(310, 390, 20, 15);
		rb8_x.setBackground(new Color(123, 185, 237));
		rb8_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q8 = 1;
			}
		});
		ButtonGroup group8 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb9_o = new JRadioButton();
		rb9_o.setBounds(260, 420, 20, 15);
		rb9_o.setBackground(new Color(123, 185, 237));
		rb9_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				q9 = 1;
			}
		});

		JRadioButton rb9_x = new JRadioButton();
		rb9_x.setBounds(310, 420, 20, 15);
		rb9_x.setBackground(new Color(123, 185, 237));
		rb9_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				q9 = 0;
			}
		});
		ButtonGroup group9 = new ButtonGroup();
		//------------------------------------------------------------
		JRadioButton rb10_o = new JRadioButton();
		rb10_o.setBounds(260, 450, 20, 15);
		rb10_o.setBackground(new Color(123, 185, 237));
		rb10_o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q10 = 1;
			}
		});

		JRadioButton rb10_x = new JRadioButton();
		rb10_x.setBounds(310, 450, 20, 15);
		rb10_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group10 = new ButtonGroup();
		rb10_x.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				q10 = 0;
			}
		});
		//------------------------------------------------------------
		//ox RadioButton Group 1~10
		group1.add(rb1_o);
		group1.add(rb1_x);
		this.add(rb1_o);
		this.add(rb1_x);

		group2.add(rb2_o);
		group2.add(rb2_x);
		this.add(rb2_o);
		this.add(rb2_x);

		group3.add(rb3_o);
		group3.add(rb3_x);
		this.add(rb3_o);
		this.add(rb3_x);

		group4.add(rb4_o);
		group4.add(rb4_x);
		this.add(rb4_o);
		this.add(rb4_x);

		group5.add(rb5_o);
		group5.add(rb5_x);
		this.add(rb5_o);
		this.add(rb5_x);

		group6.add(rb6_o);
		group6.add(rb6_x);
		this.add(rb6_o);
		this.add(rb6_x);

		group7.add(rb7_o);
		group7.add(rb7_x);
		this.add(rb7_o);
		this.add(rb7_x);

		group8.add(rb8_o);
		group8.add(rb8_x);
		this.add(rb8_o);
		this.add(rb8_x);

		group9.add(rb9_o);
		group9.add(rb9_x);
		this.add(rb9_o);
		this.add(rb9_x);

		group10.add(rb10_o);
		group10.add(rb10_x);
		this.add(rb10_o);
		this.add(rb10_x);

		//word1~10
		this.add(word1);
		this.add(word2);
		this.add(word3);
		this.add(word4);
		this.add(word5);
		this.add(word6);
		this.add(word7);
		this.add(word8);
		this.add(word9);
		this.add(word10);

		//mean1~10
		this.add(mean1);
		this.add(mean2);
		this.add(mean3);
		this.add(mean4);
		this.add(mean5);
		this.add(mean6);
		this.add(mean7);
		this.add(mean8);
		this.add(mean9);
		this.add(mean10);

		//¿©·¯°¡Áö
		this.add(btnFinish);
		this.add(word);
		this.add(mean);
		this.add(o);
		this.add(x);
		this.add(copyRights);
		mf.add(this);

		btnFinish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int all = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10;
				if(all >= 9 && all <= 10) {
					grade = "°í±Þ";
				}else if(all >= 5 && all <= 8) {
					grade = "Áß±Þ";
				}else if(all >= 0 && all <= 4) {
					grade = "ÃÊ±Þ";
				}
				JOptionPane.showMessageDialog(null, "´ç½Å Á¡¼ö´Â " + all + "Á¡ÀÔ´Ï´Ù." + "´ç½ÅÀº "+ grade +"ÀÔ´Ï´Ù.");
				ArrayList ar = new ArrayList();
				MemberDao md = new MemberDao();
				ar = md.findMember();
				Member[] m = new Member[ar.size()];
				
				for(int i = 0; i < m.length; i++) {
					m[i] = (Member) ar.get(i);
				}
				
				for(int i = 0; i < m.length; i++) {
					if(Login_TestTitle.id.equals(m[i].getId())) {
						m[i].setWordLevel(grade);
						break;
					}
				}
				
				ar.clear();
				
				for(int i = 0; i < m.length; i++) {
					ar.add(m[i]);
				}
				
				md.writeMember(ar);
				
				JOptionPane.showMessageDialog(null, "¸ÞÀÎÈ­¸éÀ¸·Î ÀÌµ¿ÇÕ´Ï´Ù.");
				ChangePanel.changePanel(mf, login_OXQuiz5, new Login_MainPage(mf));
				 
			}
		});
	}

}