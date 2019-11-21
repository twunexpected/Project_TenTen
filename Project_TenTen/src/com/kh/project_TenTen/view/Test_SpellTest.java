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


	public Test_SpellTest(Login_MainFrame mf2) {

		this.mf = mf2;
		this.Test_SpellTest = this;

		int index = 0;
		
		//���
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);


		//�ܾ� �߰� ��
		JLabel panelTitle = new JLabel("�ܾ� Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(100, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("���",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));


		// TEST ���� �ܾ� ǥ��
		// �ܾ� ���縵 �迭 ���....??!
		JTextField tfWord = new JTextField();
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("���", Font.BOLD, 20));
		tfWord.setBackground(new Color(123, 185, 237));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setText(Integer.valueOf(index+1).toString());
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(null);

		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("���", Font.BOLD, 20)); // ���� ��Ʈ
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		// TEST ����ܾ� ǥ�� 
		JTextField lbVoca = new JTextField("Explain");
		lbVoca.setBounds(50, 220, 300, 100);
		tfWord.setBackground(new Color(123, 185, 237));
		lbVoca.setFont(new Font("���", Font.BOLD, 10));
		lbVoca.setFont(lbVoca.getFont().deriveFont(45.0f));
		lbVoca.setHorizontalAlignment(JTextField.CENTER);

		// ���� ��ư����
		JButton buttonNext = new JButton("����");
		buttonNext.setBounds(140, 500, 140, 50);
		buttonNext.setBackground(new Color(36, 107, 220));
		lbVoca.setFont(new Font("���", Font.BOLD, 24));
		buttonNext.setHorizontalAlignment(JTextField.CENTER);

		//���� �Է�â
		JTextField tfAnswer = new JTextField("�ùٸ� ���縵�� �Է��ϼ���."); 
		tfAnswer.setBounds(65, 440, 280, 50);
		tfAnswer.setFont(lbNumber.getFont().deriveFont(16.0f));
		tfAnswer.setHorizontalAlignment(JTextField.CENTER);


		//ī�Ƕ���Ʈ
		JLabel naming = new JLabel("Copyrights ��   ��!������ All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("���", Font.BOLD, 13));
		this.setLayout(null);


		this.add(tfAnswer);
		this.add(naming);
		this.add(lbVoca);
		this.add(lbNumber);
		this.add(tfWord);
		this.add(panelTitle);
		this.add(buttonNext);
		mf2.add(this);


		buttonNext.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					++index;
//					lbVoca.setText(spellStr[index]);
//					lbMeanning.setText(checkStr[index]);
//					checkAns[index] = 'X';
//					tfWord.setText(Integer.valueOf(index+1).toString());
//				}catch(Exception e1){
//					if(index >= 10) {
//					//ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup);
//					}
//				}
//			}
//		});

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int index = 0; 

				try {
					++index;
					tfWord.setText(Integer.valueOf(index+1).toString());
				}catch(Exception e1){
					if(index >= 10) {
						ChangePanel.changePanel(mf2, Test_SpellTest, new Test_TestPopup(mf2));
					}
				}
			}

		});



		//�гο� �̺�Ʈ �߰�
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

