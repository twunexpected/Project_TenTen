package com.kh.project_TenTen.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class TestMainWord extends JFrame{
	WordDao wd = new WordDao();
	String[] wordStr = null;
	public static Word[] word = null;
	int index = 0;
	JFrame tt ;
	
	public TestMainWord() {
		tt = this;
		
		this.setSize(1000, 1000);
		this.setLocation(200, 200);
		this.setLayout(null);
		
		word = objectTest(returnSubject("�丮"));
		wordStr = new String[10];
		
		for(int i = 0; i < word.length; i++) {
			wordStr[i] = word[i].getSpelling();
		}
		
		//�̺κ� �����ؾ���
//		wordStr = spellTest(returnSubject("�丮"));
		
		JTextField txf1 = new JTextField();
		txf1.setSize(300, 100);
		txf1.setLocation(100, 100);
		txf1.setText(wordStr[index]);
		this.add(txf1);
		
		
		JButton jbtn1 = new JButton("����");
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
						JOptionPane.showMessageDialog(null, "�߰��Ҵܾ �����ϴ�.");
					}
				}
			}
		});
		this.add(jbtn1);
		
		
		JButton jbtn2 = new JButton("�ȴ���");
		jbtn2.setSize(100, 50);
		jbtn2.setLocation(400, 500);
		this.add(jbtn2);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public int returnSubject(String subject) {
		int num = 0;
		
		switch(subject) {
		case "�丮" : break;
		case "������" : num = 1; break;
		case "����" : num = 2; break;
		case "�����Ͻ�" : num = 3; break;
		case "����" : num = 4; break;
		case "����" : num = 5; break;
		}
		
		return num;
	}
	
	public Word[] objectTest(int num) {
		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];
		
		//�о�� �ܾ� ��ü�� �ֱ�
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
	
	/*public String[] spellTest(int num) {
		
		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];
		
		String[] strArr = new String[10];
		
		//�о�� �ܾ� ��ü�� �ֱ�
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}
		
		//��ü���ִ� ���縵 �迭�� ����
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = word[i].getSpelling();
		}
		
		//����
		ArrayList shuffleList = new ArrayList(Arrays.asList(strArr));
		Collections.shuffle(shuffleList);
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = (String)shuffleList.get(i);
		}
		
		return strArr;
	}*/
	
	public static void main(String[] args) {
		new TestMainWord();
	}
}
