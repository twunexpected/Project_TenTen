package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyWord3_DJ extends JPanel {
	private MainFrame mf;

	public MyWord3_DJ(MainFrame mf) {
		this.mf = mf;

		//프레임
		this.setSize(400, 700);
		this.setLocation(650,100);
		//기본패널
		JPanel myWord3 = new JPanel();
		myWord3.setLayout(null);
		myWord3.setBackground(new Color(123, 185, 237));
		myWord3.setSize(400,700);
		//표올릴 패널
		JPanel p = new JPanel();
		p.setSize(210,490);
		p.setLocation(130, 100);
		//표
		String[] headings = new String[] {"번호","단어","뜻"};
		Object data[][] ={
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
				{"1","apple","사과"},
				{"2","banana","바나나"},
				{"3","orange","오렌지"},
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(190,470));
		table.setFillsViewportHeight(true);
		p.add(new JScrollPane(table));
		//암기 비암기 버튼
		JButton b1 = new JButton("암기");
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setForeground(Color.white);
		b1.setFont(new Font("고딕",Font.BOLD,17));
		b1.setBackground(new Color(36, 107, 220));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, myWord3, new MyWord1_DJ(mf));
			}

		});
		JButton b2 = new JButton("비암기");
		b2.setHorizontalAlignment(JLabel.CENTER);
		b2.setForeground(Color.white);
		b2.setFont(new Font("고딕",Font.BOLD,14));
		b2.setBackground(new Color(36, 107, 220));
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, myWord3, new MyWord2_DJ(mf));
			}

		});
		JButton b3 = new JButton("즐겨찾기");
		b3.setHorizontalAlignment(JLabel.CENTER);
		b3.setForeground(Color.white);
		b3.setFont(new Font("고딕",Font.BOLD,12));
		b3.setBackground(new Color(225, 91, 91));
		b1.setBounds(95, 20, 70, 50);
		b2.setBounds(180, 20, 79, 50);
		b3.setBounds(275, 20, 87, 50);	
		myWord3.add(b1);
		myWord3.add(b2);
		myWord3.add(b3);
		myWord3.add(p);
		//좌측 고정
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕", Font.BOLD, 20));
		myWord3.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		myWord3.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕", Font.BOLD, 20));
		myWord3.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		myWord3.add(panelLeft2);

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕", Font.BOLD, 20));
		myWord3.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		myWord3.add(panelLeft3);
		btnLeft3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, myWord3, new AddWord_DJ(mf));
			}

		});

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
		myWord3.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		myWord3.add(panelLeft4);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		myWord3.add(btnLeft5);


		//카피라이터
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(100, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고딕", Font.BOLD, 12));
		this.add(naming);
		mf.add(myWord3);
		//this.setVisible(true);
		/*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	}


}
