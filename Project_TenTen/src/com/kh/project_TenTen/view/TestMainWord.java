package com.kh.project_TenTen.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class TestMainWord extends JFrame{
	WordDao wd = new WordDao();
	String[] wordStr = null;
	int index = 0;
	
	public TestMainWord() {
		
		this.setSize(1000, 1000);
		this.setLocation(200, 200);
		this.setLayout(null);
		
		//이부분 수정해야함
		wordStr = spellTest(returnSubject("요리"));
		
		JTextField txf1 = new JTextField();
		txf1.setSize(300, 100);
		txf1.setLocation(100, 100);
		txf1.setText(wordStr[index]);
		this.add(txf1);
		
		
		JButton jbtn1 = new JButton("다음");
		jbtn1.setSize(100, 50);
		jbtn1.setLocation(200, 500);
		jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				++index;
				txf1.setText(wordStr[index]);
				}catch(Exception e1){
					if(index >= 10) {
						JOptionPane.showMessageDialog(null, "추가할단어가 없습니다.");
					}
				}
			}
		});
		this.add(jbtn1);
		
		
		JButton jbtn2 = new JButton("안다음");
		jbtn2.setSize(100, 50);
		jbtn2.setLocation(400, 500);
		this.add(jbtn2);
		

		this.add(jbtn1);
		this.add(jbtn2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
	public static void main(String[] args) {
//		new TestMainWord();
		TestMainWord td = new TestMainWord();
	}
}
