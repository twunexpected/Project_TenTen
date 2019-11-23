package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Popup;

public class Test_TestPopup extends JPanel {

	private Login_MainFrame mf;
	private JPanel Test_TestPopup;


	public Test_TestPopup (Login_MainFrame mf) {

		this.mf = mf;
		this.Test_TestPopup = this;

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


		JLabel labelCenter = new JLabel("<html>������ �׽�Ʈ�� �Ϸ��Ͽ����ϴ�.</html>");
		labelCenter.setBounds(135, 275, 220, 100);
		labelCenter.setForeground(Color.BLACK);
		labelCenter.setFont(new Font("���", Font.BOLD, 16));
		this.setLayout(null);



		//		btpopup.addActionListener(new ActionListener() {
		//			@Override
		//			public void actionPerformed(ActionEvent e) {
		//				ChangePanel.changePanel(mf, Test_TestPopup, new Test_gotTenTen(mf));
		//
		//			}
		//		});



		//���� �г�
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
		btnLeft1.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>����<br/>�ܾ�</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>�ܾ�<br/>�߰�</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>�ܾ�<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("���", Font.BOLD, 20));
		btnLeft4.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>����<br/>����</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("���", Font.BOLD, 20));
		this.setLayout(null);


		//ī�Ƕ���Ʈ
		JLabel naming = new JLabel("Copyrights ��   ��!������ All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("���", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);


		mf.add(this);
		this.add(labelCenter);
		this.add(panelTitle);

		this.add(btnLeft1);
		this.add(btnLeft2);
		this.add(btnLeft3);
		this.add(btnLeft4);
		this.add(btnLeft5);

		this.add(panelLeft1);
		this.add(panelLeft2);
		this.add(panelLeft3);
		this.add(panelLeft4); 


		this.setVisible(true);



		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_TestPopup, new MainPage(mf));			
			}

		});



		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ChangePanel.changePanel(mf, Test_TestPopup, new MyWord1(mf));            
				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "�ܾ ���� �н��ϼ���~��");
				}
			}

		});



		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_TestPopup, new AddWord(mf));
			}

		});

		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_TestPopup, new Test_Main(mf));
			}

		});



		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Test_TestPopup, new SeoungJang(mf));
			}

		});


	}

}



