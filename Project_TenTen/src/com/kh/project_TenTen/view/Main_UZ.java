package com.kh.project_TenTen.view;
  
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main_UZ extends JFrame {

	public Main_UZ() {
		// 프레임 
		super("텐텐 메인 페이지");
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);



		//마이페이지 버튼
		JPanel MyPage = new JPanel();
		MyPage.setBackground(new Color(123, 185, 237));
		MyPage.setSize(120, 45);
		MyPage.setLocation(260, 20);
		JButton btn = new JButton("마이페이지");
		btn.setBackground(new Color(36, 107, 220));
		btn.setFont(new Font("고딕",Font.PLAIN,12));
		btn.setPreferredSize(new Dimension(120, 45));



		//암기 버튼
		JPanel	memory1 = new JPanel();
		memory1.setBackground(new Color(123, 185, 237));
		memory1.setSize(105, 60);
		memory1.setLocation(105,390);
		JButton arm = new JButton("암기");
		arm.setPreferredSize(new Dimension(105, 60));
		arm.setBackground(new Color(36, 107, 220));


		//비암기버
		JPanel	memory2 = new JPanel();
		memory2.setBackground(new Color(123, 185, 237));
		memory2.setSize(105, 60);
		memory2.setLocation(240, 390);
		JButton beearm = new JButton("비암기");
		beearm.setPreferredSize(new Dimension(105, 60));
		beearm.setBackground(new Color(36, 107, 220));



		//주제 여 텍스
		JPanel sectionPanel = new JPanel();
		sectionPanel.setBackground(new Color(123, 185, 237));
		//sectionPanel.setBounds(130, 100, 200, 200);
		sectionPanel.setSize(80, 50);
		sectionPanel.setLocation(185, 120);
		JTextField sectionText = new JTextField("  주제");
		sectionText.setBackground(new Color(123, 185, 237));
		sectionText.setFont(new Font("고딕",Font.PLAIN,20));
		sectionText.setPreferredSize(new Dimension(80, 50));


		//단어 텍스
		JPanel wordView = new JPanel();
		//wordView.setBounds(20, 200, 500, 500);
		wordView.setBackground(new Color(123, 185, 237));
		wordView.setSize(240, 90);
		wordView.setLocation(105, 180);
		JTextField wordText = new JTextField(" 단 어");
		wordText.setBackground(new Color(123, 185, 237));
		wordText.setFont(new Font("고딕",Font.BOLD,80));
		wordText.setPreferredSize(new Dimension(240, 90));



		//카운 텍스
		JPanel counting = new JPanel();
		counting.setBackground(new Color(123, 185, 237));
		counting.setSize(50, 40);
		counting.setLocation(170, 460);
		JTextField countnum = new JTextField("입력값");
		countnum.setFont(new Font("고딕",Font.PLAIN,15));
		countnum.setPreferredSize(new Dimension(50, 40));


		// " /10 "
		JPanel countingMax = new JPanel();
		countingMax.setBackground(new Color(123, 185, 237));
		countingMax.setSize(50, 40);
		countingMax.setLocation(220, 465);
		JLabel countMax = new JLabel("/ 10");
		countMax.setFont(new Font("고딕",Font.PLAIN,20));
		//	라벨은 사이즈값 따로 안써도 패널에 자동 부착.



		countingMax.add(countMax);
		this.add(countingMax);
		MyPage.add(btn);
		this.add(MyPage);
		memory1.add(arm);
		this.add(memory1);
		memory2.add(beearm);
		this.add(memory2);
		sectionPanel.add(sectionText);
		this.add(sectionPanel);
		wordView.add(wordText);
		this.add(wordView);
		counting.add(countnum);
		this.add(counting);


		//카피라잇
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//배경
		JPanel jp = new JPanel();
		jp.setSize(400, 700);
		jp.setLayout(null);
		jp.setBackground(new Color(123, 185, 237));
		this.add(jp);   
		this.setBounds(600, 100, 400, 700);
		

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//좌측 메뉴
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕",Font.BOLD,20));
		jp.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		jp.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕",Font.BOLD,20));
		jp.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		jp.add(panelLeft2);


		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕",Font.BOLD,20));
		jp.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		jp.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕",Font.BOLD,20));
		jp.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		jp.add(panelLeft4);



		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕",Font.BOLD,20));
		jp.add(btnLeft5);


		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}









