package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project_TenTen.controller.UZ_Manager;
import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class MainPage extends JPanel {

	WordDao wd = new WordDao();
	String[] wordStr = null;
	int index = 0;

	private Login_MainFrame mf;
	private JPanel MainPage;



	public int returnSubject(String subject) {
		int num = 0;

		switch(subject) {
		case "요리" : break;
		case "스포츠" : num = 1; break;
		case "여행" : num = 2; break;
		case "회사" : num = 3; break;
		case "경제" : num = 4; break;
		case "예술" : num = 5; break;
		}

		return num;
	}
	public String[] spellTest(int num) {

		ArrayList wordList = wd.readWord(num); 
		Word[] word = new Word[wordList.size()]; 

		String[] strArr = new String[10];

		//읽어온 단어 객체에 넣기
		for(int i = 0; i < wordList.size(); i++) {   
			word[i] = (Word) wordList.get(i); 

		}

		//객체에있는 스펠링 배열에 저장
		for(int i = 0; i < strArr.length; i++) { 
			strArr[i] = word[i].getSpelling();
		}

		//셔플
		ArrayList shuffleList = new ArrayList(Arrays.asList(strArr));
		Collections.shuffle(shuffleList);

		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = (String)shuffleList.get(i);
		}

		return strArr;
	}


	public MainPage(Login_MainFrame mf) {
		this.mf = mf;
		MainPage = this;


		//단어 텍스
		JTextField wordText = new JTextField(" 단 어");
		wordText.setSize(250, 90);
		wordText.setLocation(105, 200);
		wordText.setBackground(new Color(123, 185, 237));
		wordText.setFont(new Font("고딕",Font.BOLD,40));
		wordText.setHorizontalAlignment(JTextField.CENTER);
		wordText.setPreferredSize(new Dimension(250, 90));
	




		//요리 버튼
		JButton cook = new JButton("요리");
		cook.setSize(80, 40);
		cook.setLocation(100,70);
		cook.setForeground(Color.WHITE);
		cook.setBackground(new Color(36, 107, 220));
		this.add(cook);
		//요리버튼 이벤트
		cook.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("요리"));
				wordText.setText(wordStr[0]);
			}
		});

		//스포츠 버튼
		JButton sports = new JButton("스포츠");
		sports.setSize(80, 40);
		sports.setLocation(190,70);
		sports.setForeground(Color.WHITE);
		sports.setBackground(new Color(36, 107, 220));
		this.add(sports);

		//스포츠 버튼 이벤트
		sports.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("스포츠"));
				wordText.setText(wordStr[index]);
			}
		});

		//여행 버튼
		JButton trip= new JButton("여행");
		trip.setSize(80, 40);
		trip.setLocation(280,70);
		trip.setForeground(Color.WHITE);
		trip.setBackground(new Color(36, 107, 220));
		this.add(trip);

		//여행버튼 이벤트
		trip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("여행"));
				wordText.setText(wordStr[index]);				
			}
		});

		//비지니스 버튼
		JButton business= new JButton("회사");
		business.setSize(80, 40);
		business.setLocation(100,120);
		business.setForeground(Color.WHITE);
		business.setBackground(new Color(36, 107, 220));
		this.add(business);

		//비지니스 버튼 이벤트
		business.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("회사"));
				wordText.setText(wordStr[index]);				
			}
		});

		//경제 버튼
		JButton economy = new JButton("경제");
		economy.setSize(80, 40);
		economy.setLocation(190,120);
		economy.setForeground(Color.WHITE);
		economy.setBackground(new Color(36, 107, 220));
		this.add(economy);

		//경제 버튼 이벤트
		economy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("경제"));
				wordText.setText(wordStr[index]);				
			}
		});

		//예술 버튼
		JButton art = new JButton("예술");
		art.setSize(80, 40);
		art.setLocation(280,120);
		art.setForeground(Color.WHITE);
		art.setBackground(new Color(36, 107, 220));
		this.add(art);

		//예술 버튼 이벤트
		art.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordStr = spellTest(returnSubject("예술"));
				wordText.setText(wordStr[index]);				
			}
		});



		//////////////////////////////////////////////////////////////////////
		//암기 버튼
		JButton arm = new JButton("암기");
		arm.setSize(105, 60);
		arm.setLocation(105,390);
		arm.setForeground(Color.WHITE);
		arm.setPreferredSize(new Dimension(105, 60));
		arm.setBackground(new Color(36, 107, 220));



		arm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					++index;
					wordText.setText(wordStr[index]);

				}catch(Exception e1){
					if(index >= 10) {
						JOptionPane.showMessageDialog(null, "추가할단어가 없습니다.");
					}
				}

			}
		});

		


		//비암기버튼
		JButton beearm = new JButton("비암기");
		beearm.setSize(105, 60);
		beearm.setLocation(240, 390);
		beearm.setForeground(Color.WHITE);
		beearm.setPreferredSize(new Dimension(105, 60));
		beearm.setBackground(new Color(36, 107, 220));



		//카운 텍스
		JTextField countnum = new JTextField("입력값");
		countnum.setBackground(new Color(123, 185, 237));
		countnum.setSize(60, 50);
		countnum.setLocation(165, 460);
		countnum.setFont(new Font("고딕",Font.PLAIN,15));
		countnum.setPreferredSize(new Dimension(60, 50));


		// " /10 "
		JLabel countMax = new JLabel("/ 10");
		countMax.setBackground(new Color(123, 185, 237));
		countMax.setSize(50, 40);
		countMax.setLocation(225, 465);
		countMax.setFont(new Font("고딕",Font.PLAIN,20));
	

		//마이페이지 버튼
		JButton btn = new JButton("마이페이지");
		btn.setSize(120, 45);
		btn.setLocation(260, 20);
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(36, 107, 220));
		btn.setFont(new Font("고딕",Font.PLAIN,12));
		btn.setPreferredSize(new Dimension(120, 45));


		this.add(countMax);
		this.add(btn);
		this.add(arm);
		this.add(beearm);
		//this.add(sectionText);
		this.add(wordText);
		this.add(countnum);


		//카피라잇
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);


		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);   


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//좌측 메뉴
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);


		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);



		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft5);




		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new MyPage(mf));				
			}

		});

		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new MyWord1(mf));
			}

		});
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new AddWord(mf));
			}

		});

		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new Test_ChooseTest(mf));
			}

		});



		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new SeoungJang(mf));
			}

		});


	}






}









