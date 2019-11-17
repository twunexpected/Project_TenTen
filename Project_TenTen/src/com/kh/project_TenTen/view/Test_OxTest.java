package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test_OxTest extends JPanel {
	
	private Login_MainFrame mf;
	private JPanel Test_OxTest;

	
	public Test_OxTest(Login_MainFrame mf) {

		this.mf = mf;
		this.Test_OxTest = this;
		
		//���
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
		lbTop.setBounds(100, 0, 200, 50);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		lbTop.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		
		// TEST ���� �ܾ� ǥ��
		JTextField tfWord = new JTextField("1");
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setBackground(new Color(255, 255, 225));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(null);

		JLabel lbNumber = new JLabel("/10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("Serif", Font.BOLD, 20)); // ���� ��Ʈ
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);


		// TEST ����ܾ� ǥ�� 
		JTextField lbVoca = new JTextField("Explain ����");
		lbVoca.setBounds(50, 220, 300, 100);
		lbVoca.setFont(new Font(" ", Font.BOLD, 10)); // ���� ��Ʈ
		lbVoca.setFont(lbVoca.getFont().deriveFont(45.0f));
		lbVoca.setBackground(new Color(255, 255, 225));
		lbVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		// TEST ����ܾ� ��
		JTextField lbMeanning = new JTextField("v. �����ϴ�.");
		lbMeanning.setBounds(105, 330, 200, 50);
		lbMeanning.setBackground(new Color(255, 255, 225));
		lbMeanning.setFont(new Font(" ", Font.BOLD, 10)); // ���� ��Ʈ
		lbMeanning.setFont(lbVoca.getFont().deriveFont(16.0f));
		lbMeanning.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		

		// O, X ��ư����
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


		//Copyrights��  ��!������ All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		buttomText.setBounds(60, 600, 400, 50);
		this.setLayout(null);
		
		
		this.add(buttonO);
		this.add(buttonX);
		this.add(lbMeanning);
		this.add(buttomText);
		this.add(lbVoca);
		this.add(lbNumber);
		this.add(lbTop);
		this.add(tfWord);
		this.add(panelTitle);
		mf.add(this);

		
		
		//TestField ����� ������ �̺�Ʈ ����ž� �� (10����)
		buttonO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));
				
		}

		});
		
		buttonX.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_OxTest, new Test_TestPopup(mf));		}

		});


		this.setVisible(true);
	}
	
}




