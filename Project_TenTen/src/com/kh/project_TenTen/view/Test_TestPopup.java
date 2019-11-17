package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Popup;

public class Test_TestPopup extends JPanel {

	private Login_MainFrame mf;
	private JPanel Test_TestPopup;
	
	
	
	public Test_TestPopup(Login_MainFrame mf) {
		
		this.mf = mf;
		this.Test_TestPopup = this;
		
		//배경
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//상단제목 패널 "단어 TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);


		//상단 제목 "단어 TEST"
		JLabel lbTop = new JLabel("단어 TEST");
		lbTop.setBounds(140, 0, 200, 50);
		lbTop.setSize(400, 45);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		this.setLayout(null);
		//			lbTop.setFont(new Font(" ", Font.BOLD, 10));


		JPanel panelpopup = new JPanel();
		panelpopup.setBounds(50, 200, 300, 200);
		panelpopup.setBackground(new Color(237, 237, 237));
		this.setLayout(null);

		JTextField tfWord = new JTextField("!");
		tfWord.setBounds(190,240, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setForeground(Color.BLACK);
		tfWord.setBackground(Color.YELLOW);
		tfWord.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		JLabel labelCenter = new JLabel("<html>오늘의 테스트를<br/>완료하셨습니다.</html>");
		labelCenter.setBounds(140, 250, 220, 100);
		labelCenter.setForeground(Color.BLACK);
		labelCenter.setFont(new Font("Serif", Font.BOLD, 16));
		this.setLayout(null);

		JButton btpopup = new JButton("텐텐 받기");
		btpopup.setBounds(140, 340, 130, 50);
		btpopup.setFont(new Font("Serif", Font.BOLD, 20));
		btpopup.setBackground(new Color(36, 107, 220));
		btpopup.setBackground(new Color(36, 107, 220));
		btpopup.setForeground(Color.WHITE);
		this.setLayout(null);

		
		btpopup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_TestPopup, new Test_gotTenTen(mf));

			}
		});

		

		mf.add(this);
		this.add(tfWord);
		this.add(labelCenter);
		this.add(btpopup);
		this.add(panelpopup);
		this.add(lbTop);
		this.add(panelTitle);


		this.setVisible(true);

	}

}



