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
import javax.swing.JTextField;

public class Test_SpellTest extends JPanel{

	private Login_MainFrame mf;
	private JPanel Test_SpellTest;
	

	public Test_SpellTest(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_SpellTest = this;
		
		//배경
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);


		//상단제목 패널 "단어 TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));

		//상단 제목 "단어 TEST"
		JLabel lbTop = new JLabel("단어 TEST");
		lbTop.setBounds(150, 0, 200, 50);
		lbTop.setSize(400, 45);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));


		// TEST 남은 단어 표시
		// 단어 스펠링 배열 어떻게....??!
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


		// TEST 노출단어 표시 -> JtextField 로 변경 !!!!! 
		JTextField lbVoca = new JTextField("Explain");
		lbVoca.setBounds(50, 220, 300, 100);
		lbVoca.setFont(new Font(" ", Font.BOLD, 10)); // 굵은 폰트
		lbVoca.setFont(lbVoca.getFont().deriveFont(45.0f));
		lbVoca.setHorizontalAlignment(JTextField.CENTER);

		// 다음 버튼생성
		JButton buttonNext = new JButton("다음");
		buttonNext.setBounds(140, 500, 140, 50);
		buttonNext.setBackground(new Color(36, 107, 220));
		buttonNext.setFont(buttonNext.getFont().deriveFont(25.0f));
		buttonNext.setHorizontalAlignment(JTextField.CENTER);
		
		//정답 입력창
		JTextField tfAnswer = new JTextField("올바른 스펠링을 입력하세요."); 
		tfAnswer.setBounds(65, 440, 280, 50);
		tfAnswer.setFont(lbNumber.getFont().deriveFont(16.0f));
		tfAnswer.setHorizontalAlignment(JTextField.CENTER);


		//Copyrights ⓒ  비!뇨내과 All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		buttomText.setBounds(60, 600, 400, 50);
		buttomText.setFont(new Font("Serif", Font.BOLD, 13));
		this.setLayout(null);


		this.add(tfAnswer);
		this.add(buttomText);
		this.add(lbVoca);
		this.add(lbNumber);
		this.add(tfWord);
		this.add(lbTop);
		this.add(panelTitle);
		this.add(buttonNext);
		mf.add(this);

		
		buttonNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_SpellTest, new Test_TestPopup(mf));
			}

		});
		
		

		//패널에 이벤트 추가
		//		buttonO.addMouseListener(new MouseAdapter() {
		//			@Override
		//			public void mouseClicked(MouseEvent e) {
		//				if(e.getButton() == 1) {
		//					card.next(card1.getParent());
		//				}
		//				if(e.getButton() == 3) {
		//					card.previous(card1.getParent());
		//				}
		//			}
		//		});



		this.setVisible(true);
	}

}

