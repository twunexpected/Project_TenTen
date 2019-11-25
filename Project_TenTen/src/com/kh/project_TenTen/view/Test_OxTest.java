package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Member;
import com.kh.project_TenTen.model.vo.Word;

public class Test_OxTest extends JPanel {

	private Login_MainFrame mf;
	private JPanel Test_OxTest;


	WordDao wd = new WordDao();
	
	String[] spellStr = null;	//단어 스펠링
	String[] meanStr = null;	//뜻
	static String[] checkStr = null;	//정답 체크
	
	public static Word[] word = null;

	char [] checkAns = null;
	public static int index = 0;
	public static int answer = 0;
	

	public Word[] objectTest(int num) {
		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];

		//읽어온 단어 객체에 넣기
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}

		ArrayList shuffleList = new ArrayList(Arrays.asList(word));
		Collections.shuffle(shuffleList);

		for (int i = 0; i < word.length; i++) {
			word[i] = (Word) shuffleList.get(i);
		}

		return word;
	}
	
	
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
	
	public Test_OxTest(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_OxTest = this;
			
		//MainPage 에서 선택한 주제 단어 호출
		word = objectTest(returnSubject(MainPage.subjectWord));

		spellStr = new String[10];
		meanStr = new String[10];
		
		for(int i = 0; i < word.length; i++) {
			spellStr[i] = word[i].getSpelling();
		}

		for(int i = 0; i < word.length; i++) {
			meanStr[i] = word[i].getMean();
		}
		
		
		char[] ch = makeAnswer(); // 0 = O, 1 = X 
		checkAns = new char[10]; // 정답을 담는 배열

		checkStr = new String[ch.length];
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'O') {
				checkStr[i] = meanStr[i];
			}else if (ch[i] == 'X') {
				if(i == 9) {
					checkStr[i] = meanStr[i-1];
				}else {
					checkStr[i] = meanStr[i+1];
				}
			}
		}

		//배경
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		
		//단어 라벨
		JLabel panelTitle = new JLabel("단어 Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(120, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("고딕",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		
		// TEST 남은 단어 표시
		JLabel tfWord = new JLabel();
		tfWord.setBounds(200, 165, 30, 30);
		tfWord.setFont(new Font("고딕", Font.BOLD, 20));
		tfWord.setBackground(new Color(123, 185, 237));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		tfWord.setText(Integer.valueOf(index+1).toString());
		this.setLayout(null);

		//  tfWord + "/10"
		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(230, 150, 60, 60);
		lbNumber.setFont(new Font("고딕", Font.BOLD, 20));
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		//Test 노출단어 spelling
		JLabel lbVoca = new JLabel();
		lbVoca.setBounds(85, 185, 300, 100);
		lbVoca.setFont(new Font("고딕", Font.BOLD, 10)); // 굵은 폰트
		lbVoca.setFont(lbVoca.getFont().deriveFont(38.0f));
		lbVoca.setBackground(new Color(123, 185, 237));
		lbVoca.setText(spellStr[index]);
		lbVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// TEST 노출단어 뜻
		JLabel lbMeanning = new JLabel();
		lbMeanning.setBounds(135, 280, 200, 50);
		lbMeanning.setBackground(new Color(123, 185, 237));
		lbMeanning.setFont(new Font("고딕", Font.BOLD, 22));
		lbMeanning.setText(meanStr[index]);
		lbMeanning.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// O, X 버튼생성
		JButton buttonO = new JButton("O");
		buttonO.setBounds(125, 410, 100, 60);
		buttonO.setBackground(new Color(36, 107, 220));
		buttonO.setForeground(Color.WHITE);
//		buttonO.setOpaque(true);	// 버튼색상 available
//		buttonO.setBorderPainted(false);	// 버튼색상 available
		buttonO.setFont(lbNumber.getFont().deriveFont(25.0f));
		this.setLayout(null);

		JButton buttonX = new JButton("X");
		buttonX.setBounds(255, 410, 100, 60);
		buttonX.setBackground(new Color(36, 107, 220));
		buttonX.setForeground(Color.WHITE);
//		buttonX.setOpaque(true);	// 버튼색상 available
//		buttonX.setBorderPainted(false);	// 버튼색상 available
		buttonX.setFont(lbNumber.getFont().deriveFont(25.0f));
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
//		btnLeft1.setOpaque(true);	// 버튼색상 available
//		btnLeft1.setBorderPainted(false);	// 버튼색상 available
		btnLeft1.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
//		btnLeft2.setOpaque(true);	// 버튼색상 available
//		btnLeft2.setBorderPainted(false);	// 버튼색상 available
		btnLeft2.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
//		btnLeft3.setOpaque(true);	// 버튼색상 available
//		btnLeft3.setBorderPainted(false);	// 버튼색상 available
		btnLeft3.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
//		btnLeft4.setOpaque(true);	// 버튼색상 available
//		btnLeft4.setBorderPainted(false);	// 버튼색상 available
		btnLeft4.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
//		btnLeft5.setOpaque(true);	// 버튼색상 available
//		btnLeft5.setBorderPainted(false);	// 버튼색상 available
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);
		
		
		
		//카피라이트
		JLabel naming = new JLabel("Copyrights ⓒ   비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		
		
		this.add(panelLeft1);
		this.add(panelLeft2);
		this.add(panelLeft3);
		this.add(panelLeft4);
		
		this.add(btnLeft1);
		this.add(btnLeft2);
		this.add(btnLeft3);
		this.add(btnLeft4);
		this.add(btnLeft5);
		
		this.add(naming);
		this.add(buttonO);
		this.add(buttonX);
		this.add(lbMeanning);
		this.add(naming);
		this.add(lbVoca);
		this.add(lbNumber);
		this.add(tfWord);
		this.add(panelTitle);
		mf.add(this);

		
		buttonO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					++index;
					lbVoca.setText(spellStr[index]);
					lbMeanning.setText(checkStr[index]);
					checkAns[index - 1] = 'O';
					tfWord.setText(Integer.valueOf(index + 1).toString());
				}catch(Exception e1){
					if(index >= 9) {
						checkAns[index - 1] = 'O';
						for(int i = 0; i < ch.length; i++) {
							if(ch[i] == checkAns[i]) {
								answer++;

							}
						}
						MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getExp()+answer);
						JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.<html>");
						
						ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));
					}
				}
			}
		});

		

		buttonX.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					++index;
					lbVoca.setText(spellStr[index]);
					lbMeanning.setText(checkStr[index]);
					checkAns[index - 1] = 'X';
					tfWord.setText(Integer.valueOf(index + 1).toString());
				}catch(Exception e1){
					if(index >= 9) {
						checkAns[index - 1] = 'X';
						for(int i = 0; i < ch.length; i++) {
							if(ch[i] == checkAns[i]) {
								answer++;

							}
						}
						MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getExp() + answer);
						JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.");
						
						ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));
					}
				}

			}
		});

		
		
		//좌측 메뉴버튼 5
		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new MainPage(mf));			
			}

		});
		
			
		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ChangePanel.changePanel(mf, Test_OxTest, new MyWord1(mf));            
				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "단어를 먼저 학습하세요~♥");
				}
			}

		});

		
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new AddWord(mf));
			}

		});

		//단어 TEST 버튼
		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index >= 10) {
					
					ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));
				}else {
					ChangePanel.changePanel(mf, Test_OxTest, new Test_Main(mf));
				}
			}
		});



		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new SeoungJang(mf));
			}

		});


		this.setVisible(true);
	}


	public char[] makeAnswer() {
		
		
		
		int[]numArr = new int[10];

		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 2);
		}

		char ch[] = new char [10];

		for(int i = 0; i < ch.length; i++) {
			if(numArr[i] == 0) {
				ch[i] = 'O';
			}else {
				ch[i] = 'X';
			}
		}
		return ch;
	}



}