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
	
	String[] spellStr = null;	//�ܾ� ���縵
	String[] meanStr = null;	//��
	static String[] checkStr = null;	//���� üũ
	
	public static Word[] word = null;

	char [] checkAns = null;
	public static int index = 0;
	public static int answer = 0;
	

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
	
	
	public int returnSubject(String returnSubject) {
		int num = 0;

		switch(returnSubject) {
		case "�丮" : break;
		case "������" : num = 1; break;
		case "����" : num = 2; break;
		case "ȸ��" : num = 3; break;
		case "����" : num = 4; break;
		case "����" : num = 5; break;
		}

		return num;
	}
	
	public Test_OxTest(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_OxTest = this;
			
		//MainPage ���� ������ ���� �ܾ� ȣ��
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
		checkAns = new char[10]; // ������ ��� �迭

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

		//���
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		
		//�ܾ� ��
		JLabel panelTitle = new JLabel("�ܾ� Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(120, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("���",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));

		
		// TEST ���� �ܾ� ǥ��
		JLabel tfWord = new JLabel();
		tfWord.setBounds(200, 165, 30, 30);
		tfWord.setFont(new Font("���", Font.BOLD, 20));
		tfWord.setBackground(new Color(123, 185, 237));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		tfWord.setText(Integer.valueOf(index+1).toString());
		this.setLayout(null);

		//  tfWord + "/10"
		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(230, 150, 60, 60);
		lbNumber.setFont(new Font("���", Font.BOLD, 20));
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		//Test ����ܾ� spelling
		JLabel lbVoca = new JLabel();
		lbVoca.setBounds(85, 185, 300, 100);
		lbVoca.setFont(new Font("���", Font.BOLD, 10)); // ���� ��Ʈ
		lbVoca.setFont(lbVoca.getFont().deriveFont(38.0f));
		lbVoca.setBackground(new Color(123, 185, 237));
		lbVoca.setText(spellStr[index]);
		lbVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// TEST ����ܾ� ��
		JLabel lbMeanning = new JLabel();
		lbMeanning.setBounds(135, 280, 200, 50);
		lbMeanning.setBackground(new Color(123, 185, 237));
		lbMeanning.setFont(new Font("���", Font.BOLD, 22));
		lbMeanning.setText(meanStr[index]);
		lbMeanning.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// O, X ��ư����
		JButton buttonO = new JButton("O");
		buttonO.setBounds(125, 410, 100, 60);
		buttonO.setBackground(new Color(36, 107, 220));
		buttonO.setForeground(Color.WHITE);
//		buttonO.setOpaque(true);	// ��ư���� available
//		buttonO.setBorderPainted(false);	// ��ư���� available
		buttonO.setFont(lbNumber.getFont().deriveFont(25.0f));
		this.setLayout(null);

		JButton buttonX = new JButton("X");
		buttonX.setBounds(255, 410, 100, 60);
		buttonX.setBackground(new Color(36, 107, 220));
		buttonX.setForeground(Color.WHITE);
//		buttonX.setOpaque(true);	// ��ư���� available
//		buttonX.setBorderPainted(false);	// ��ư���� available
		buttonX.setFont(lbNumber.getFont().deriveFont(25.0f));
		this.setLayout(null);

		
		//���� 
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
		
		//����  �ؽ�Ʈ �ڽ�
		final JButton btnLeft1 = new JButton("<html>����<br/>ȭ��</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
//		btnLeft1.setOpaque(true);	// ��ư���� available
//		btnLeft1.setBorderPainted(false);	// ��ư���� available
		btnLeft1.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>����<br/>�ܾ�</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
//		btnLeft2.setOpaque(true);	// ��ư���� available
//		btnLeft2.setBorderPainted(false);	// ��ư���� available
		btnLeft2.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>�ܾ�<br/>�߰�</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
//		btnLeft3.setOpaque(true);	// ��ư���� available
//		btnLeft3.setBorderPainted(false);	// ��ư���� available
		btnLeft3.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>�ܾ�<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("���", Font.BOLD, 20));
//		btnLeft4.setOpaque(true);	// ��ư���� available
//		btnLeft4.setBorderPainted(false);	// ��ư���� available
		btnLeft4.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>����<br/>����</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
//		btnLeft5.setOpaque(true);	// ��ư���� available
//		btnLeft5.setBorderPainted(false);	// ��ư���� available
		btnLeft5.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);
		
		
		
		//ī�Ƕ���Ʈ
		JLabel naming = new JLabel("Copyrights ��   ��!������ All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("���", Font.BOLD, 13));
		
		
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
						JOptionPane.showMessageDialog(null, "<html> ���� ���� : " + answer + "�� <br> ���� " + answer + "���� ȹ���Ͽ����ϴ�.<html>");
						
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
						JOptionPane.showMessageDialog(null, "<html> ���� ���� : " + answer + "�� <br> ���� " + answer + "���� ȹ���Ͽ����ϴ�.");
						
						ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));
					}
				}

			}
		});

		
		
		//���� �޴���ư 5
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
					JOptionPane.showMessageDialog(null, "�ܾ ���� �н��ϼ���~��");
				}
			}

		});

		
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new AddWord(mf));
			}

		});

		//�ܾ� TEST ��ư
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