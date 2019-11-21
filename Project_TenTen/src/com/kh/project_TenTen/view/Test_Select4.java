package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test_Select4 extends JPanel{
	//
	private Login_MainFrame mf;
	private JPanel Test_Select4;

	public Test_Select4(Login_MainFrame mf) {

		this.mf = mf;
		Test_Select4 = this;


		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);


		//´Ü¾î Ãß°¡ ¶óº§
		JLabel panelTitle = new JLabel("´Ü¾î Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(95, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("°íµñ",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		// TEST ³²Àº ´Ü¾î Ç¥½Ã -> JtextFiled ·Î º¯°æ !!!!!
		JTextField tfWord = new JTextField("1");
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("°íµñ", Font.BOLD, 20));
		tfWord.setBackground(new Color(255, 255, 225));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(null);

		JLabel lbNumber = new JLabel("/ 10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("°íµñ", Font.BOLD, 20)); // ±½Àº ÆùÆ®
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);

		//JtextField ·Î º¯°æ !!!!! 
		JTextField tfVoca = new JTextField("Explain");
		tfVoca.setBounds(45, 220, 300, 100);
		tfVoca.setFont(new Font(" ", Font.BOLD, 10)); // ±½Àº ÆùÆ®
		tfVoca.setFont(tfVoca.getFont().deriveFont(45.0f));
		tfVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		//¹øÈ£
		JLabel lbcenter1 = new JLabel("¨ç");
		lbcenter1.setBounds(50, 350, 30, 30);
		lbcenter1.setForeground(Color.BLACK);
		lbcenter1.setFont(new Font("°íµñ", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter2 = new JLabel("¨è");
		lbcenter2.setBounds(200, 350, 30, 30);
		lbcenter2.setForeground(Color.BLACK);
		lbcenter2.setFont(new Font("°íµñ", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter3 = new JLabel("¨é");
		lbcenter3.setBounds(50, 400, 30, 30);
		lbcenter3.setForeground(Color.BLACK);
		lbcenter3.setFont(new Font("°íµñ", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter4 = new JLabel("¨ê");
		lbcenter4.setBounds(200, 400, 30, 30);
		lbcenter4.setForeground(Color.BLACK);
		lbcenter4.setFont(new Font("°íµñ", Font.BOLD, 25));
		this.setLayout(null);

		// ´Ü¾î ¶æ
		JTextField tfsouth1 = new JTextField("´Ü¾î1");
		tfsouth1.setBounds(80, 350, 100, 30);
		tfsouth1.setForeground(Color.BLACK);
		tfsouth1.setBackground(new Color(123, 185, 237));
		tfsouth1.setFont(new Font("°íµñ", Font.BOLD, 10)); // ±½Àº ÆùÆ®
		tfsouth1.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		JTextField tfsouth2 = new JTextField("´Ü¾î2");
		tfsouth2.setBounds(230, 350, 100, 30);
		tfsouth2.setForeground(Color.BLACK);
		tfsouth2.setBackground(new Color(123, 185, 237));
		tfsouth2.setFont(new Font("°íµñ", Font.BOLD, 10)); // ±½Àº ÆùÆ®
		tfsouth2.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		JTextField tfsouth3 = new JTextField("´Ü¾î3");
		tfsouth3.setBounds(80, 400, 100, 30);
		tfsouth3.setForeground(Color.BLACK);
		tfsouth3.setBackground(new Color(123, 185, 237));
		tfsouth3.setFont(new Font("°íµñ", Font.BOLD, 10)); // ±½Àº ÆùÆ®	
		tfsouth3.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		JTextField tfsouth4 = new JTextField("´Ü¾î4");
		tfsouth4.setBounds(230, 400, 100, 30);
		tfsouth4.setForeground(Color.BLACK);
		tfsouth4.setBackground(new Color(123, 185, 237));
		tfsouth4.setFont(new Font("°íµñ", Font.BOLD, 10)); // ±½Àº ÆùÆ®		
		tfsouth4.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		JTextArea tasouth1 = new JTextArea("Á¤´äÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
		tasouth1.setBounds(80, 450, 250, 30);
		tasouth1.setFont(new Font("°íµñ", Font.BOLD, 20)); // ±½Àº ÆùÆ®		
		this.setLayout(null);

		JButton btsouth1  = new JButton("´ÙÀ½");
		btsouth1.setBounds(150, 520, 100, 50);
		btsouth1.setFont(new Font("°íµñ", Font.BOLD, 20));
		btsouth1.setBackground(new Color(36, 107, 220));
		btsouth1.setForeground(Color.WHITE);
		this.setLayout(null);

		JLabel naming = new JLabel("Copyrights ¨Ï  ºñ!´¢³»°ú All Rights reserved.");
		naming.setBounds(60, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("°íµñ", Font.BOLD, 13));
		this.setLayout(null);

		btsouth1.addActionListener(new ActionListener() {//ÀÍ¸í
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Select4, new Test_TestPopup(mf));
			}
		});
		this.add(naming);

		this.add(tfsouth4);
		this.add(tfsouth3);
		this.add(tfsouth2);
		this.add(tfsouth1);
		this.add(tasouth1);
		this.add(btsouth1);
		this.add(lbcenter1);
		this.add(lbcenter2);
		this.add(lbcenter3);
		this.add(lbcenter4);
		this.add(tfWord);
		this.add(tfVoca);
		this.add(lbNumber);
		this.add(panelTitle);
		mf.add(this);

		//»çÀÌÁî °íÁ¤
	}

}