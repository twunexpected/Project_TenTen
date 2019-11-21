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
	String[] checkStr = null;

	public static Word[] word = null;

	char [] checkAns = null;
	int index = 0;
	int answer = 0;
	
	
	
	
	
	public Test_OxTest(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_OxTest = this;

		word = objectTest(returnSubject("요리"));
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


		// 콘솔창 연습
		for(int i = 0; i < spellStr.length; i++) {
			System.out.println(meanStr[i]);
		}

		for(int i = 0; i < spellStr.length; i++) {
			System.out.println(checkStr[i]);
		}

		for(int i = 0; i < spellStr.length; i++) {
			System.out.println(ch[i]);
		}


		//배경
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		
		//단어 라벨
		JLabel panelTitle = new JLabel("단어 Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(100, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("고딕",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		// TEST 남은 단어 표시
		JTextField tfWord = new JTextField();
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("고딕", Font.BOLD, 20));
		tfWord.setBackground(new Color(123, 185, 237));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		tfWord.setText(Integer.valueOf(index+1).toString());
		this.setLayout(null);

		//  tfWord + "/10"
		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("고딕", Font.BOLD, 20));
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		//Test 노출단어 spelling
		JTextField lbVoca = new JTextField();
		lbVoca.setBounds(50, 220, 300, 100);
		lbVoca.setFont(new Font(" ", Font.BOLD, 10)); // 굵은 폰트
		lbVoca.setFont(lbVoca.getFont().deriveFont(45.0f));
		lbVoca.setBackground(new Color(123, 185, 237));
		lbVoca.setText(spellStr[index]);
		lbVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		// TEST 노출단어 뜻
		JTextField lbMeanning = new JTextField();
		lbMeanning.setBounds(105, 330, 200, 50);
		lbMeanning.setBackground(new Color(123, 185, 237));
		lbMeanning.setFont(new Font(" ", Font.BOLD, 10)); // 굵은 폰트
		lbMeanning.setFont(lbVoca.getFont().deriveFont(16.0f));
		lbMeanning.setText(meanStr[index]);
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

		//카피라이트
		JLabel naming = new JLabel("Copyrights ⓒ   비!뇨내과 All Rights reserved.");
		naming.setBounds(65, 600, 400, 50);
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		
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
					checkAns[index] = 'O';
					tfWord.setText(Integer.valueOf(index+1).toString());
				}catch(Exception e1){
					if(index >= 10) {
						for(int i = 0; i < ch.length; i++) {
							if(ch[i] == checkAns[i]) {
								answer++;
								
							
								MemberDao.loginMember.setHaveTen(answer);
						
							}
						}
						JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.");
						
						
						ChangePanel.changePanel(mf, Test_OxTest, new SeoungJang(mf));
						
						
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
					checkAns[index] = 'X';
					tfWord.setText(Integer.valueOf(index+1).toString());
				}catch(Exception e1){
					if(index >= 10) {
						for(int i = 0; i < ch.length; i++) {
							if(ch[i] == checkAns[i]) {
								answer++;
								MemberDao.loginMember.setHaveTen(answer);
								
								
							}
						}
					JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.");
					
					ChangePanel.changePanel(mf, Test_OxTest, new SeoungJang(mf));
					}
				}
			}
		});


		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(index >= 10) {
//					for(int i = 0; i < ch.length; i++) {
//						if(ch[i] == checkAns[i]) {
//							answer++;
//						}
//					}
//					JOptionPane.showMessageDialog(null, answer);
//				}
//			}
//
//		});



		this.setVisible(true);
		//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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


	public int returnSubject(String subject) {
		int num = 0;

		switch(subject) {
		case "요리" : break;
		case "스포츠" : num = 1; break;
		case "여행" : num = 2; break;
		case "비지니스" : num = 3; break;
		case "경제" : num = 4; break;
		case "예술" : num = 5; break;
		}

		return num;
	}


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


//	public static void main(String[] args) {
//
//		Test_OxTest2 tox = new Test_OxTest2();
//		tox.Test_OxTest();
//
//	}

}