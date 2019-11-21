package com.kh.project_TenTen.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

import java.util.*;

public class Test_Select4 extends JPanel{


	WordDao wd = new WordDao();
	String[] wordStr1 = null;
	String[] wordStr2 = null;
	int index = 0;
	int answer = 0;
	
	
	private Login_MainFrame mf;
	private JPanel Test_Select4_new1;
	private String[] strArr;



	public String[] meanTest(int num) {

		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];

		String[] strArr2 = new String[10];

		//�о�� �ܾ� ��ü�� �ֱ�
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}

		//��ü�� �ִ� �迭�� ����
		for(int i = 0; i < strArr2.length; i++) {
			strArr2[i] = word[i].getMean();
		}

		//����
		ArrayList<String> shuffleList = new ArrayList(Arrays.asList(strArr2));
		Collections.shuffle(shuffleList);

		for (int i = 0; i < strArr2.length; i++) {
			strArr2[i] = (String)shuffleList.get(i);
		}

		return strArr2;
	}


	public String[] spellTest(int num) {

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
		ArrayList<String> shuffleList = new ArrayList(Arrays.asList(strArr));
		Collections.shuffle(shuffleList);

		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = (String)shuffleList.get(i);
		}

		return strArr;
	}







	public Test_Select4_new1(Login_MainFrame mf) {
		wordStr1 = spellTest(0);
		wordStr2 = meanTest(0);



		this.mf = mf;
		Test_Select4_new1 = this;


		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		//������� �г� "�ܾ� TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);


		//��� ���� "�ܾ� TEST"
		JLabel lbTop = new JLabel("�ܾ� TEST");
		lbTop.setBounds(140, 0, 200, 50);
		lbTop.setSize(400, 45);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		this.setLayout(null);
		//			lbTop.setFont(new Font(" ", Font.BOLD, 10));

		// TEST ���� �ܾ� ǥ�� -> JtextFiled �� ���� !!!!!

		JTextField tfWord = new JTextField("1");
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setBackground(new Color(255, 255, 225));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		tfWord.setText(Integer.valueOf(index+1).toString());
		this.setLayout(null);


		JLabel lbNumber = new JLabel("/ 10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("Serif", Font.BOLD, 20)); // ���� ��Ʈ
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);

		//JtextField �� ���� !!!!! 

		JTextField tfVoca = new JTextField("");
		tfVoca.setBounds(45, 220, 300, 100);
		tfVoca.setFont(new Font(" ", Font.BOLD, 10)); // ���� ��Ʈ
		tfVoca.setFont(tfVoca.getFont().deriveFont(45.0f));
		tfVoca.setHorizontalAlignment(JTextField.CENTER);
		tfVoca.setText(wordStr1[index]);

		this.setLayout(null);
		//��ȣ
		JLabel lbcenter1 = new JLabel("��");
		lbcenter1.setBounds(50, 350, 30, 30);
		lbcenter1.setForeground(Color.BLACK);
		lbcenter1.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter2 = new JLabel("��");
		lbcenter2.setBounds(200, 350, 30, 30);
		lbcenter2.setForeground(Color.BLACK);
		lbcenter2.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter3 = new JLabel("��");
		lbcenter3.setBounds(50, 400, 30, 30);
		lbcenter3.setForeground(Color.BLACK);
		lbcenter3.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);

		JLabel lbcenter4 = new JLabel("��");
		lbcenter4.setBounds(200, 400, 30, 30);
		lbcenter4.setForeground(Color.BLACK);
		lbcenter4.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);

		// �ܾ� ��
		JTextField tfsouth1 = new JTextField("�ܾ�1");
		tfsouth1.setBounds(80, 350, 100, 30);
		tfsouth1.setForeground(Color.BLACK);
		tfsouth1.setBackground(new Color(123, 185, 237));
		tfsouth1.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ
		tfsouth1.setHorizontalAlignment(JTextField.CENTER);
		tfsouth1.setText(wordStr2[index]);
		this.setLayout(null);

		JTextField tfsouth2 = new JTextField("�ܾ�2");
		tfsouth2.setBounds(230, 350, 100, 30);
		tfsouth2.setForeground(Color.BLACK);
		tfsouth2.setBackground(new Color(123, 185, 237));
		tfsouth2.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ
		tfsouth2.setHorizontalAlignment(JTextField.CENTER);
		tfsouth2.setText(wordStr2[index+2]);
		this.setLayout(null);

		JTextField tfsouth3 = new JTextField("�ܾ�3");
		tfsouth3.setBounds(80, 400, 100, 30);
		tfsouth3.setForeground(Color.BLACK);
		tfsouth3.setBackground(new Color(123, 185, 237));
		tfsouth3.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ	
		tfsouth3.setHorizontalAlignment(JTextField.CENTER);
		tfsouth3.setText(wordStr2[index+3]);
		this.setLayout(null);

		JTextField tfsouth4 = new JTextField("�ܾ�4");
		tfsouth4.setBounds(230, 400, 100, 30);
		tfsouth4.setForeground(Color.BLACK);
		tfsouth4.setBackground(new Color(123, 185, 237));
		tfsouth4.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ		
		tfsouth4.setHorizontalAlignment(JTextField.CENTER);
		tfsouth4.setText(wordStr2[index+4]);
		this.setLayout(null);

		JLabel jbProblem = new JLabel("���� ��ȣ�� �Է� �ϼ��� : ");
		jbProblem.setBounds(50, 450, 250, 30);
		jbProblem.setFont(new Font("Serif", Font.BOLD, 15)); // ���� ��Ʈ		
		this.setLayout(null);


		JTextArea tasouth1 = new JTextArea(); 
		tasouth1.setBounds(250, 450, 30, 30);
		tasouth1.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ		
		this.setLayout(null);


		JButton btsouth1  = new JButton("����");
		btsouth1.setBounds(150, 520, 80, 50);
		btsouth1.setFont(new Font("Serif", Font.BOLD, 20));
		btsouth1.setBackground(new Color(36, 107, 220));
		btsouth1.setForeground(Color.WHITE);
		this.setLayout(null);
		
		JButton btsouth2  = new JButton("����");
		btsouth2.setBounds(280, 450, 80, 30);
		btsouth2.setFont(new Font("Serif", Font.BOLD, 20));
		btsouth2.setBackground(new Color(36, 107, 220));
		btsouth2.setForeground(Color.WHITE);
		this.setLayout(null);






		btsouth1.addActionListener(new ActionListener() {//�͸�
			@Override
			public void actionPerformed(ActionEvent e) {

				int num1 =0;
				int num2 =0;
				int num3 =0;
				int num4 =0;

				/*	int str1 = Integer.parseInt("tasouth1");
					System.out.println(str1);
				 */


				if((index + 1) >= 10) {
					JOptionPane.showMessageDialog(null, "�׽�Ʈ�� �Ϸ�");

					ChangePanel.changePanel(mf, Test_Select4_new1, new Test_TestPopup(mf));	
				}else {

					tfVoca.setText(wordStr1[index]);
					tfWord.setText(Integer.valueOf(index+2).toString());
					
					
					
					
					
					for(int i=1; i<11; i++) {

						tfsouth1.setText(wordStr2[index]);
						num1=(int)(Math.random()*9)+1;
						if(index != num1) {
							
							tfsouth2.setText(wordStr2[num1]);
							num2= (int)(Math.random()*9)+1;
							if(num1 != num2) {
								
								tfsouth3.setText(wordStr2[num2]);
								num3= (int)(Math.random()*9)+1;
								if(num2 != num3){
									tfsouth4.setText(wordStr2[num3]);
							

								}
							}

						}
					}
					
					
					index++;
				}
				
				/*
				JOptionPane.showMessageDialog(null, "<html> ���� ���� : " + answer + "�� <br> ���� " + answer + "���� ȹ���Ͽ����ϴ�.");
				ChangePanel.changePanel(mf, Test, new SeoungJang(mf));
				*/
				
		
			}
		});
		
		/*1234123412  
		0123456789*/
		
		
		
		/*btsouth2.addActionListener(new ActionListener() {//�͸�
			@Override
			public void actionPerformed(ActionEvent e) {
		
				int show = Integer.parseInt(tasouth1.getText());
				
				
				
				if(show==(index%4)+1) {
					
					BufferedWriter answer =null;
					try {
						answer = new BufferedWriter(new FileWriter("answer.txt",true));
						answer.write("O");;
						answer.flush();
						answer.close();
						
					}catch(IOException e2) {
						e2.printStackTrace();
					}
					
				}else {
					BufferedWriter answer =null;
					try {
						answer = new BufferedWriter(new FileWriter("answer.txt",true));
						answer.write("X");;
						answer.flush();
						answer.close();
						
					}catch(IOException e2) {
						e2.printStackTrace();
					}
					
				}  
	
			}
		});*/
		
		
		
		
		

		JLabel naming = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		naming.setBounds(60, 600 , 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("Serif", Font.BOLD, 13));
		this.setLayout(null);


		/*    tfVoca.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try{
					++index;
					 tfVoca.setText(wordStr[index]);
					}catch(Exception e1) {
						if(index >= 10) {
							JOptionPane.showMessageDialog(null, "�׽�Ʈ�� �Ϸ��ϼ̽��ϴ�.");
						}
					}

				}
			});*/

		this.add(btsouth2);
		this.add(jbProblem);
		this.add(naming);
		this.add(jbProblem);
		this.add(tfsouth4);
		this.add(tfsouth3);
		this.add(tfsouth2);
		this.add(tfsouth1);
		this.add(tasouth1);
		this.add(btsouth1);
		this.add(lbcenter1);
		this.add(lbcenter2);
		this.add(lbcenter3);
		this.add(lbcenter4);
		this.add(tfWord);
		this.add(tfVoca);
		this.add(lbNumber);
		this.add(lbTop);
		this.add(panelTitle);
		mf.add(this);


		//��ư


	}


}