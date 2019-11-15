package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main_UZ extends JPanel {

	private MainFrame mf;
	private JPanel Main_UZ;

	public Main_UZ(MainFrame mf) {
		this.mf = mf;
		Main_UZ = this;
		
		// 프레임 
//		super("텐텐 메인 페이지");
//		this.setBounds(650, 100, 400, 700);
//		this.setLayout(null);



		//마이페이지 버튼
		JButton btn = new JButton("마이페이지");
		btn.setSize(120, 45);
		btn.setLocation(260, 20);
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(36, 107, 220));
		btn.setFont(new Font("고딕",Font.PLAIN,12));
		btn.setPreferredSize(new Dimension(120, 45));

		
		

		//암기 버튼
		JButton arm = new JButton("암기");
		arm.setSize(105, 60);
		arm.setLocation(105,390);
		arm.setForeground(Color.WHITE);
		arm.setPreferredSize(new Dimension(105, 60));
		arm.setBackground(new Color(36, 107, 220));


		//비암기버튼
		JButton beearm = new JButton("비암기");
		beearm.setSize(105, 60);
		beearm.setLocation(240, 390);
		beearm.setForeground(Color.WHITE);
		beearm.setPreferredSize(new Dimension(105, 60));
		beearm.setBackground(new Color(36, 107, 220));



		//주제 여 텍스
		JTextField sectionText = new JTextField("  주제");
		sectionText.setSize(80, 50);
		sectionText.setLocation(185, 120);
		sectionText.setBackground(new Color(123, 185, 237));
		sectionText.setFont(new Font("고딕",Font.PLAIN,20));
		sectionText.setPreferredSize(new Dimension(80, 50));


		//단어 텍스
//		wordView.setBackground(new Color(123, 185, 237));
		JTextField wordText = new JTextField(" 단 어");
		wordText.setSize(240, 90);
		wordText.setLocation(105, 180);
		wordText.setBackground(new Color(123, 185, 237));
		wordText.setFont(new Font("고딕",Font.BOLD,80));
		wordText.setPreferredSize(new Dimension(240, 90));



		//카운 텍스
		JTextField countnum = new JTextField("입력값");
		countnum.setBackground(new Color(123, 185, 237));
		countnum.setSize(60, 50);
		countnum.setLocation(165, 460);
		countnum.setFont(new Font("고딕",Font.PLAIN,15));
		countnum.setPreferredSize(new Dimension(60, 50));


		// " /10 "
		JLabel countMax = new JLabel("/ 10");
		countMax.setBackground(new Color(123, 185, 237));
		countMax.setSize(50, 40);
		countMax.setLocation(225, 465);
		countMax.setFont(new Font("고딕",Font.PLAIN,20));
		//	라벨은 사이즈값 따로 안써도 패널에 자동 부착.



		this.add(countMax);
		this.add(btn);
		this.add(arm);
		this.add(beearm);
		this.add(sectionText);
		this.add(wordText);
		this.add(countnum);


		//카피라잇
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//배경
//		JPanel jp = new JPanel();
//		jp.setSize(400, 700);
//		jp.setLayout(null);
//		jp.setBackground(new Color(123, 185, 237));
//		mf.add(this);   
//		this.setBounds(600, 100, 400, 700);
		
		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);   
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//좌측 메뉴
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);


		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);



		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft5);


		
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 ChangePanel.changePanel(mf, Main_UZ, new  MyPage_UZ(mf));				
			}
			
		});

		
		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, Main_UZ, new Grow_UZ(mf));
			}
			
		});
		
		

//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);

	}
	

	
}









