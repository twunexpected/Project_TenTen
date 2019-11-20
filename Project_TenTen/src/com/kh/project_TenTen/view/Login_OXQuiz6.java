package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
 
public class Login_OXQuiz6 extends JPanel {
	private Login_MainFrame mf;
	private JPanel login_OXQuiz3;

	public Login_OXQuiz6(Login_MainFrame mf) {
		this.mf = mf;
		login_OXQuiz3 = this;
		
		
		//�� ȭ��
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		
		
		//copyRights
		JLabel copyRights = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		copyRights.setBounds(60, 600, 400, 50);
		copyRights.setFont(new Font("���", Font.BOLD, 13));
		
		
		//����
		JLabel word = new JLabel("�ܾ�");
		word.setBounds(50, 110, 70, 50);
		word.setFont(new Font("���", Font.BOLD, 22));

		JLabel mean = new JLabel("��");
		mean.setBounds(160, 110, 70, 50);
		mean.setFont(new Font("���", Font.BOLD, 22));

		JLabel o = new JLabel("O");
		o.setBounds(260, 110, 70, 50);
		o.setFont(new Font("���", Font.BOLD, 22));

		JLabel x = new JLabel("X");
		x.setBounds(310, 110, 70, 50);
		x.setFont(new Font("���", Font.BOLD, 22));

		//word
		JLabel word1 = new JLabel("emotionalism");
		word1.setBounds(20, 170, 120, 35);
		word1.setFont(new Font("���", Font.BOLD, 15));
		word1.setHorizontalAlignment(JTextField.LEFT);

		JLabel word2 = new JLabel("illusionism");
		word2.setBounds(20, 200, 120, 35);
		word2.setFont(new Font("���", Font.BOLD, 15));
		word2.setHorizontalAlignment(JTextField.LEFT);

		JLabel word3 = new JLabel("piano");
		word3.setBounds(20, 230, 120, 35);
		word3.setFont(new Font("���", Font.BOLD, 15));
		word3.setHorizontalAlignment(JTextField.LEFT);

		JLabel word4 = new JLabel("plane");
		word4.setBounds(20, 260, 120, 35);
		word4.setFont(new Font("���", Font.BOLD, 15));
		word4.setHorizontalAlignment(JTextField.LEFT);

		JLabel word5 = new JLabel("composition");
		word5.setBounds(20, 290, 120, 35);
		word5.setFont(new Font("���", Font.BOLD, 15));
		word5.setHorizontalAlignment(JTextField.LEFT);

		JLabel word6 = new JLabel("bride");
		word6.setBounds(20, 320, 120, 35);
		word6.setFont(new Font("���", Font.BOLD, 15));
		word6.setHorizontalAlignment(JTextField.LEFT);

		JLabel word7 = new JLabel("angle");
		word7.setBounds(20, 350, 120, 35);
		word7.setFont(new Font("���", Font.BOLD, 15));
		word7.setHorizontalAlignment(JTextField.LEFT);

		JLabel word8 = new JLabel("regisseur");
		word8.setBounds(20, 380, 120, 35);
		word8.setFont(new Font("���", Font.BOLD, 15));
		word8.setHorizontalAlignment(JTextField.LEFT);

		JLabel word9 = new JLabel("toeshoe");
		word9.setBounds(20, 410, 120, 35);
		word9.setFont(new Font("���", Font.BOLD, 15));
		word9.setHorizontalAlignment(JTextField.LEFT);

		JLabel word10 = new JLabel("sempre");
		word10.setBounds(20, 440, 120, 35);
		word10.setFont(new Font("���", Font.BOLD, 15));
		word10.setHorizontalAlignment(JTextField.LEFT);

		//mean
		JLabel mean1 = new JLabel("�ǾƳ�");
		mean1.setBounds(140, 170, 120, 35);
		mean1.setFont(new Font("���", Font.BOLD, 15));
		mean1.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean2 = new JLabel("ȯ����");
		mean2.setBounds(140, 200, 120, 35);
		mean2.setFont(new Font("���", Font.BOLD, 15));
		mean2.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean3 = new JLabel("������ �帧");
		mean3.setBounds(140, 230, 120, 35);
		mean3.setFont(new Font("���", Font.BOLD, 15));
		mean3.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean4 = new JLabel("���");
		mean4.setBounds(140, 260, 120, 35);
		mean4.setFont(new Font("���", Font.BOLD, 15));
		mean4.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean5 = new JLabel("�۰�");
		mean5.setBounds(140, 290, 120, 35);
		mean5.setFont(new Font("���", Font.BOLD, 15));
		mean5.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean6 = new JLabel("���Ⱑ");
		mean6.setBounds(140, 320, 120, 35);
		mean6.setFont(new Font("���", Font.BOLD, 15));
		mean6.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean7 = new JLabel("�ٸ�");
		mean7.setBounds(140, 350, 120, 35);
		mean7.setFont(new Font("���", Font.BOLD, 15));
		mean7.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean8 = new JLabel("����");
		mean8.setBounds(140, 380, 120, 35);
		mean8.setFont(new Font("���", Font.BOLD, 15));
		mean8.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean9 = new JLabel("���� ��");
		mean9.setBounds(140, 410, 120, 35);
		mean9.setFont(new Font("���", Font.BOLD, 15));
		mean9.setHorizontalAlignment(JTextField.LEFT);

		JLabel mean10 = new JLabel("���Ӿ���");
		mean10.setBounds(140, 440, 120, 35);
		mean10.setFont(new Font("���", Font.BOLD, 15));
		mean10.setHorizontalAlignment(JTextField.LEFT);

		//btnFinish
		JButton btnFinish = new JButton("����");
		btnFinish.setBounds(140, 550, 90, 40);
		btnFinish.setForeground(new Color(255, 255, 225));
		btnFinish.setBackground(new Color(36, 107, 220));
		btnFinish.setFont(new Font("���", Font.BOLD, 20));

		//RadioButton 1~10
		JRadioButton rb1_o = new JRadioButton();
		rb1_o.setBounds(260, 180, 20, 15);
		rb1_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb1_x = new JRadioButton();
		rb1_x.setBounds(310, 180, 20, 15);
		rb1_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group1 = new ButtonGroup();

		JRadioButton rb2_o = new JRadioButton();
		rb2_o.setBounds(260, 210, 20, 15);
		rb2_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb2_x = new JRadioButton();
		rb2_x.setBounds(310, 210, 20, 15);
		rb2_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group2 = new ButtonGroup();

		JRadioButton rb3_o = new JRadioButton();
		rb3_o.setBounds(260, 240, 20, 15);
		rb3_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb3_x = new JRadioButton();
		rb3_x.setBounds(310, 240, 20, 15);
		rb3_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group3 = new ButtonGroup();

		JRadioButton rb4_o = new JRadioButton();
		rb4_o.setBounds(260, 270, 20, 15);
		rb4_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb4_x = new JRadioButton();
		rb4_x.setBounds(310, 270, 20, 15);
		rb4_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group4 = new ButtonGroup();

		JRadioButton rb5_o = new JRadioButton();
		rb5_o.setBounds(260, 300, 20, 15);
		rb5_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb5_x = new JRadioButton();
		rb5_x.setBounds(310, 300, 20, 15);
		rb5_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group5 = new ButtonGroup();

		JRadioButton rb6_o = new JRadioButton();
		rb6_o.setBounds(260, 330, 20, 15);
		rb6_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb6_x = new JRadioButton();
		rb6_x.setBounds(310, 330, 20, 15);
		rb6_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group6 = new ButtonGroup();

		JRadioButton rb7_o = new JRadioButton();
		rb7_o.setBounds(260, 360, 20, 15);
		rb7_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb7_x = new JRadioButton();
		rb7_x.setBounds(310, 360, 20, 15);
		rb7_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group7 = new ButtonGroup();

		JRadioButton rb8_o = new JRadioButton();
		rb8_o.setBounds(260, 390, 20, 15);
		rb8_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb8_x = new JRadioButton();
		rb8_x.setBounds(310, 390, 20, 15);
		rb8_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group8 = new ButtonGroup();

		JRadioButton rb9_o = new JRadioButton();
		rb9_o.setBounds(260, 420, 20, 15);
		rb9_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb9_x = new JRadioButton();
		rb9_x.setBounds(310, 420, 20, 15);
		rb9_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group9 = new ButtonGroup();

		JRadioButton rb10_o = new JRadioButton();
		rb10_o.setBounds(260, 450, 20, 15);
		rb10_o.setBackground(new Color(123, 185, 237));

		JRadioButton rb10_x = new JRadioButton();
		rb10_x.setBounds(310, 450, 20, 15);
		rb10_x.setBackground(new Color(123, 185, 237));
		ButtonGroup group10 = new ButtonGroup();

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

		//��������
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
				JOptionPane.showMessageDialog(null, "�ʱ��Դϴ�.."); 
			}
		});
	}
}