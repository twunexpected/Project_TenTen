package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TenTen_gotTenTen extends JFrame{

	public TenTen_gotTenTen() {
		super("���� TEST");
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);

		//���
		JPanel panelBackground = new JPanel();
		panelBackground.setSize(400, 700);
		panelBackground.setBackground(new Color(123, 185, 237));

		//������� �г� "�ܾ� TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);

		//��� ���� �ؽ�Ʈ "�ܾ� TEST"
		JLabel lbTop = new JLabel("���� ȹ��");
		lbTop.setBounds(100, 0, 200, 50);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		lbTop.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		// ��ư����
		JButton tentenPoint = new JButton("���� ȹ��");
		tentenPoint.setBounds(120, 500, 160, 60);
		tentenPoint.setBackground(new Color(36, 107, 220));
		tentenPoint.setFont(tentenPoint.getFont().deriveFont(25.0f));
		this.setLayout(null);
		
		
		//		JButton buttonNext = new JButton("���� ���� Ȯ��");
//		buttonNext.setBounds(100, 700, 200, 50);
//		buttonNext.setBackground(new Color(36, 107, 220));
//		buttonNext.setFont(buttonNext.getFont().deriveFont(25.0f));
//		buttonNext.setHorizontalAlignment(JTextField.CENTER);
		
		//Test ����� ���
		JTextArea testResult = new JTextArea("====== �׽�Ʈ ��� ======");
//		System.out.println("���� ���� :  ��");
//		System.out.println("Ʋ�� ���� :  ��");
//		System.out.println("ȹ�� ���� :  ��");
		testResult.setBounds(90, 120, 220, 120);
		testResult.setFont(testResult.getFont().deriveFont(15.0f));
		this.setLayout(null);
		
		//Copyrights ��  ��!������ All Rights reserved.
		JLabel buttomText = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		buttomText.setBounds(60, 600, 400, 50);
		buttomText.setFont(new Font("Serif", Font.BOLD, 13));
		this.setLayout(null);

		
		
		this.add(tentenPoint);
		this.add(testResult);
		this.add(buttomText);
		this.add(lbTop);
		this.add(panelTitle);
		this.add(panelBackground);



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


		//������ ����
//		this.setResizable(false);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

