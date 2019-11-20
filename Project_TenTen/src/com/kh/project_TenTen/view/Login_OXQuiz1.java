package com.kh.project_TenTen.view;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_OXQuiz1 extends JPanel{
	private Login_MainFrame mf;
	private JPanel login_OXQuiz1;

	public Login_OXQuiz1(Login_MainFrame mf) {
		this.mf = mf;
		login_OXQuiz1 = this;

		
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
		JLabel word1 = new JLabel("apple");
		word1.setBounds(20, 170, 120, 35);
		word1.setFont(new Font("���", Font.BOLD, 15));
		word1.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel word2 = new JLabel("pear");
		word2.setBounds(20, 200, 120, 35);
		word2.setFont(new Font("���", Font.BOLD, 15));
		word2.setHorizontalAlignment(JTextField.LEFT);

		JLabel word3 = new JLabel("peach");
		word3.setBounds(20, 230, 120, 35);
		word3.setFont(new Font("���", Font.BOLD, 15));
		word3.setHorizontalAlignment(JTextField.LEFT);

		JLabel word4 = new JLabel("watermelon");
		word4.setBounds(20, 260, 120, 35);
		word4.setFont(new Font("���", Font.BOLD, 15));
		word4.setHorizontalAlignment(JTextField.LEFT);

		JLabel word5 = new JLabel("pistachio");
		word5.setBounds(20, 290, 120, 35);
		word5.setFont(new Font("���", Font.BOLD, 15));
		word5.setHorizontalAlignment(JTextField.LEFT);

		JLabel word6 = new JLabel("peanut");
		word6.setBounds(20, 320, 120, 35);
		word6.setFont(new Font("���", Font.BOLD, 15));
		word6.setHorizontalAlignment(JTextField.LEFT);

		JLabel word7 = new JLabel("melon");
		word7.setBounds(20, 350, 120, 35);
		word7.setFont(new Font("���", Font.BOLD, 15));
		word7.setHorizontalAlignment(JTextField.LEFT);

		JLabel word8 = new JLabel("strawberry");
		word8.setBounds(20, 380, 120, 35);
		word8.setFont(new Font("���", Font.BOLD, 15));
		word8.setHorizontalAlignment(JTextField.LEFT);

		JLabel word9 = new JLabel("tomato");
		word9.setBounds(20, 410, 120, 35);
		word9.setFont(new Font("���", Font.BOLD, 15));
		word9.setHorizontalAlignment(JTextField.LEFT);

		JLabel word10 = new JLabel("blueberry");
		word10.setBounds(20, 440, 120, 35);
		word10.setFont(new Font("���", Font.BOLD, 15));
		word10.setHorizontalAlignment(JTextField.LEFT);
		
		//mean
		JLabel mean1 = new JLabel("������");
		mean1.setBounds(140, 170, 120, 35);
		mean1.setFont(new Font("���", Font.BOLD, 15));
		mean1.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean2 = new JLabel("��");
		mean2.setBounds(140, 200, 120, 35);
		mean2.setFont(new Font("���", Font.BOLD, 15));
		mean2.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean3 = new JLabel("���");
		mean3.setBounds(140, 230, 120, 35);
		mean3.setFont(new Font("���", Font.BOLD, 15));
		mean3.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean4 = new JLabel("����");
		mean4.setBounds(140, 260, 120, 35);
		mean4.setFont(new Font("���", Font.BOLD, 15));
		mean4.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean5 = new JLabel("�ǽ�Ÿġ��");
		mean5.setBounds(140, 290, 120, 35);
		mean5.setFont(new Font("���", Font.BOLD, 15));
		mean5.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean6 = new JLabel("�޷�");
		mean6.setBounds(140, 320, 120, 35);
		mean6.setFont(new Font("���", Font.BOLD, 15));
		mean6.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean7 = new JLabel("����");
		mean7.setBounds(140, 350, 120, 35);
		mean7.setFont(new Font("���", Font.BOLD, 15));
		mean7.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean8 = new JLabel("����");
		mean8.setBounds(140, 380, 120, 35);
		mean8.setFont(new Font("���", Font.BOLD, 15));
		mean8.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean9 = new JLabel("�丶��");
		mean9.setBounds(140, 410, 120, 35);
		mean9.setFont(new Font("���", Font.BOLD, 15));
		mean9.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mean10 = new JLabel("��纣��");
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
		JLabel lb = new JLabel();
		CheckboxGroup rb = new CheckboxGroup();
		Checkbox ra_1 = new Checkbox();

		ra_1.setBounds(260, 180, 20, 15);
		ra_1.setBackground(new Color(123, 185, 237));
		Checkbox ra_2 = new Checkbox();
		
		ra_2.setBounds(310, 180, 20, 15);
		ra_2.setBackground(new Color(123, 185, 237));
		mf.add(ra_1);
		mf.add(ra_2);
		
		//��������
		this.add(btnFinish);
		this.add(word);
		this.add(mean);
		this.add(o);
		this.add(x);
		this.add(copyRights);
		mf.add(this);

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

		btnFinish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�ʱ��Դϴ�.."); 
			}
		});
	}
}