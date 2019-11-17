package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test_ChooseTest extends JPanel {

	private MainFrame mf;
	private JPanel Test_ChooseTest;


	public Test_ChooseTest(MainFrame mf) {

		this.mf = mf;
		Test_ChooseTest = this;

//		this.setBounds(650, 100, 400, 700);
//		this.setLayout(null);

		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//상단 패널
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(130, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);

		//상단 박스
		JLabel lableTitle = new JLabel("단어 Test");
		lableTitle.setBounds(180, 0, 100, 50);
		lableTitle.setForeground(new Color(255, 255, 225));
		lableTitle.setFont(new Font("Serif", Font.BOLD, 24));
		this.setLayout(null);

		//테스트버튼 3가지 유형 
		JButton btnTest1 = new JButton("4지선다");
		btnTest1.setBounds(150, 220, 180, 60);
		btnTest1.setForeground(new Color(255, 255, 225));
		btnTest1.setBackground(new Color(36, 107, 220));
		btnTest1.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		JButton btnTest2 = new JButton("O/X 퀴즈");
		btnTest2.setBounds(150, 300, 180, 60);
		btnTest2.setForeground(new Color(255, 255, 225));
		btnTest2.setBackground(new Color(36, 107, 220));
		btnTest2.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		JButton btnTest3 = new JButton("스펠링 맞히기");
		btnTest3.setBounds(150, 380, 180, 60);
		btnTest3.setForeground(new Color(255, 255, 225));
		btnTest3.setBackground(new Color(36, 107, 220));
		btnTest3.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		//좌측 
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);

		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.setLayout(null);

		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.setLayout(null);

		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.setLayout(null);

		//좌측  텍스트 박스
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("Serif", Font.BOLD, 20));
		this.setLayout(null);

		//Copyrightsⓒ  비!뇨내과 All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		buttomText.setBounds(110, 600, 400, 50);
		this.setLayout(null);



		//		4지선다 버튼.addActionListener(new ActionListener() {
		//			@Override
		//			public void actionPerformed(ActionEvent e) {
		//					4지선다 = new 4지선다
		//					나중에 갖다붙이기		
		//			}
		//			
		//		}


		btnTest2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_ChooseTest, new Test_OxTest(mf));
			}

		});		

		btnTest3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_ChooseTest, new Test_SpellTest(mf));

			}

		});		



		this.add(buttomText);
		
		this.add(panelLeft1);
		this.add(panelLeft2);
		this.add(panelLeft3);
		this.add(panelLeft4); 

		this.add(btnLeft1);
		this.add(btnLeft2);
		this.add(btnLeft3);
		this.add(btnLeft4);
		this.add(btnLeft5);

		this.add(btnTest1);
		this.add(btnTest2);
		this.add(btnTest3);

		this.add(lableTitle);
		this.add(panelTitle);
		mf.add(this);

		this.setVisible(true);

	}

}