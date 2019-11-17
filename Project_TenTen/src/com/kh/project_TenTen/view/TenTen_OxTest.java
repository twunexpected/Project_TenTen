package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TenTen_OxTest extends JFrame{

	public TenTen_OxTest() {
		super("텐텐 TEST");
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);

		//배경
		JPanel panelBackground = new JPanel();
		panelBackground.setSize(400, 700);
		panelBackground.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//상단제목 패널 "단어 TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);

		//상단 제목 "단어 TEST"
		JLabel lbTop = new JLabel("단어 TEST");
		lbTop.setBounds(100, 0, 200, 50);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		lbTop.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// TEST 남은 단어 표시
		JTextField tfWord = new JTextField("1");
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setBackground(new Color(255, 255, 225));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(null);

		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("Serif", Font.BOLD, 20)); // 굵은 폰트
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		// TEST 노출단어 표시 
		JTextField lbVoca = new JTextField("Explain 노출");
		lbVoca.setBounds(50, 220, 300, 100);
		lbVoca.setFont(new Font(" ", Font.BOLD, 10)); // 굵은 폰트
		lbVoca.setFont(lbVoca.getFont().deriveFont(45.0f));
		lbVoca.setBackground(new Color(255, 255, 225));
		lbVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		// TEST 노출단어 뜻
		JTextField lbMeanning = new JTextField("v. 설명하다.");
		lbMeanning.setBounds(105, 330, 200, 50);
		lbMeanning.setBackground(new Color(255, 255, 225));
		lbMeanning.setFont(new Font(" ", Font.BOLD, 10)); // 굵은 폰트
		lbMeanning.setFont(lbVoca.getFont().deriveFont(16.0f));
		lbMeanning.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		

		// O, X 버튼생성
		JButton buttonO = new JButton("O");
		buttonO.setBounds(90, 480, 100, 60);
		buttonO.setBackground(new Color(36, 107, 220));
		buttonO.setFont(lbNumber.getFont().deriveFont(25.0f));
		this.setLayout(null);

		JButton buttonX = new JButton("X");
		buttonX.setBounds(220, 480, 100, 60);
		buttonX.setBackground(new Color(36, 107, 220));
		buttonX.setFont(lbNumber.getFont().deriveFont(25.0f));
		this.setLayout(null);


		//Copyrightsⓒ  비!뇨내과 All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		buttomText.setBounds(60, 600, 400, 50);
		this.setLayout(null);
		
		
		this.add(lbMeanning);
		this.add(buttomText);
		this.add(lbVoca);
		this.add(lbNumber);
		this.add(lbTop);
		this.add(tfWord);
		this.add(panelTitle);
		this.add(buttonO);
		this.add(buttonX);
		this.add(panelBackground);

		
		
		buttonO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TenTen_TestPopup tp = new TenTen_TestPopup();
		}

		});
		
		buttonX.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			TenTen_TestPopup tp = new TenTen_TestPopup();
		}

		});


		//사이즈 고정
		this.setResizable(false);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new TenTen_OxTest();
	}
	
}




