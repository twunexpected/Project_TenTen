package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test_gotTenTen extends JPanel{

	private Login_MainFrame mf;
	private JPanel Test_gotTenTen;


	public Test_gotTenTen(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_gotTenTen = this;

		//¹è°æ
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);


		//´Ü¾î Ãß°¡ ¶óº§
		JLabel panelTitle = new JLabel("ÅÙÅÙ È¹µæ");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(95, 0);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("°íµñ",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		// ¹öÆ°»ý¼º
		JButton tentenPoint = new JButton("º¸À¯ÅÙÅÙ È®ÀÎ");
		tentenPoint.setBounds(100, 500, 200, 60);
		tentenPoint.setBackground(new Color(36, 107, 220));
		tentenPoint.setFont(new Font("°íµñ",Font.BOLD,22));
//		tentenPoint.setFont(tentenPoint.getFont().deriveFont(25.0f));
		this.setLayout(null);

		//		JButton buttonNext = new JButton("º¸À¯ ÅÙÅÙ È®ÀÎ");
		//		buttonNext.setBounds(100, 700, 200, 50);
		//		buttonNext.setBackground(new Color(36, 107, 220));
		//		buttonNext.setFont(buttonNext.getFont().deriveFont(25.0f));
		//		buttonNext.setHorizontalAlignment(JTextField.CENTER);

		//Test °á°ú°ª Ãâ·Â
		JLabel testResult = new JLabel("Å×½ºÆ® °á°ú");
		//		System.out.println("¸ÂÀº °¹¼ö :  °³");
		//		System.out.println("Æ²¸° °¹¼ö :  °³");
		//		System.out.println("È¹µæ ÅÙÅÙ :  °³");
		testResult.setBounds(90, 120, 220, 120);
		testResult.setFont(new Font("°íµñ", Font.BOLD, 20));
		this.setLayout(null);

		//Copyrights ¨Ï  ºñ!´¢³»°ú All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ¨Ï  ºñ!´¢³»°ú All Rights reserved.");
		buttomText.setBounds(60, 600, 400, 50);
		buttomText.setFont(new Font("°íµñ", Font.BOLD, 13));
		this.setLayout(null);


		tentenPoint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_gotTenTen, new SeoungJang(mf));
			}

		});		


		this.add(tentenPoint);
		this.add(testResult);
		this.add(buttomText);
		this.add(panelTitle);
		mf.add(this);



		this.setVisible(true);
	}



}

