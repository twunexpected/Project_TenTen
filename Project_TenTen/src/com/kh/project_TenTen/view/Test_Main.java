package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class Test_Main extends JPanel {

	private Login_MainFrame mf;
	private JPanel Test_Main;

	WordDao wd = new WordDao();
	String[] spellStr = null;	//단어 스펠링
	String[] meanStr = null;	//뜻
	String[] checkStr = null;	// 정답비교

	public static Word[] word = null;
	
	//int MainIndex;

	char [] checkAns = null;
	
	int index = 0;
	int answer = 0;
	int count = 0;
	
	
	public int returnSubject(String returnSubject) {
		int num = 0;
		
		switch(returnSubject) {
		case "요리" : break;
		case "스포츠" : num = 1; break;
		case "여행" : num = 2; break;
		case "회사" : num = 3; break;
		case "경제" : num = 4; break;
		case "예술" : num = 5; break;
		}
		return num;
	}
	
	
	
	
	public Test_Main(Login_MainFrame mf) {
		this.mf = mf;
		Test_Main = this;

		

		
		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//단어 추가 라벨
		JLabel panelTitle = new JLabel("단어 Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(120, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("고딕",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		//본문
		JLabel labelCenter = new JLabel("Test 시작버튼을 눌러주세요.");
		labelCenter.setLocation(140, 220);
		labelCenter.setSize(220, 100);
		labelCenter.setFont(new Font("고딕", Font.BOLD, 16));
		this.setLayout(null);

		//Test 시작 버튼
		JButton btnCenter = new JButton("Test 시작");
		btnCenter.setBounds(155, 300, 150, 50);
		btnCenter.setForeground(new Color(255, 255, 225));
		btnCenter.setBackground(new Color(36, 107, 220));
		btnCenter.setFont(new Font("고딕", Font.BOLD, 20));
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
		btnLeft1.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		//카피라이트
		JLabel naming = new JLabel("Copyrights ⓒ   비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);

		
		
		
		//********* To do ********
		//메인에서 10개 단어 넘기면 버튼클릭 가능하게 아니면 다이얼로그 메시지 경고창 
		
		btnCenter.addActionListener(new ActionListener() {//익명
			@Override
			public void actionPerformed(ActionEvent e) {
				if(MainPage.MainIndex == 10) {

					ChangePanel.changePanel(mf, Test_Main, new Test_ChooseTest(mf));
				} else {
					
					JOptionPane.showMessageDialog(null, "먼저 오늘의 단어학습을 완료해주세요.");
				}
				
			}
		});

		
		

		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Main, new MyPage(mf));				
			}

		});

		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Main, new MyWord1(mf));
			}

		});
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Main, new AddWord(mf));
			}

		});

		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Main, new Test_Main(mf));
			}

		});



		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_Main, new SeoungJang(mf));
			}

		});



		this.add(naming);

		this.add(btnLeft1);
		this.add(btnLeft2);
		this.add(btnLeft3);
		this.add(btnLeft4);
		this.add(btnLeft5);

		this.add(panelLeft1);
		this.add(panelLeft2);
		this.add(panelLeft3);
		this.add(panelLeft4); 

		this.add(labelCenter);
		this.add(btnCenter);
		this.add(panelTitle);
		//		this.add(lableTitle);
		mf.add(this);

	}

}