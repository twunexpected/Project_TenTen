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

public class Grow_UZ extends JFrame{

	public Grow_UZ() {
		super("성장과정"); 
 

		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);



		//JOptionPane.showMessageDiaLog(null,"";)

		//마이페이지 중앙상단 라벨
		JPanel Above = new JPanel();
		Above.setBackground(new Color(36, 107, 220));
		Above.setSize(220, 50);
		Above.setLocation(120, 5);
		JLabel mp= new JLabel("성장과정");
		mp.setBounds(150, 0, 200, 50);
		mp.setForeground(Color.WHITE);
		mp.setFont(new Font("고딕",Font.BOLD,20));

		Above.add(mp);
		this.add(Above);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		// 보유텐텐 :
		JPanel	GttPanel = new JPanel();
		GttPanel.setBackground(new Color(123, 185, 237));
		GttPanel.setSize(80, 40);
		GttPanel.setLocation(110, 500);
		JLabel Gttnum = new JLabel("보유 텐텐: ");
		Gttnum.setFont(new Font("고딕",Font.PLAIN,19));
		GttPanel.add(Gttnum);
		this.add(GttPanel);

		// 보유텐텐개수 보여주기
		JPanel	myttPanel = new JPanel();
		myttPanel.setBackground(new Color(123, 185, 237));
		myttPanel.setSize(80, 40);
		myttPanel.setLocation(170, 500);
		JLabel myttnum = new JLabel("20");
		myttnum.setFont(new Font("고딕",Font.PLAIN,19));
		myttPanel.add(myttnum);
		this.add(myttPanel);


		// 획득조건 :
		JPanel	getCdPanel= new JPanel();
		getCdPanel.setBackground(new Color(123, 185, 237));
		getCdPanel.setSize(80, 40);
		getCdPanel.setLocation(200, 540);
		JLabel getCd = new JLabel("획득 조건: ");
		getCd.setFont(new Font("고딕",Font.PLAIN,19));
		getCdPanel.add(getCd);
		this.add(getCdPanel);

		// 상장교환조건 텐텐 개수
		JPanel	needTTPanel = new JPanel();
		needTTPanel.setBackground(new Color(123, 185, 237));
		needTTPanel.setSize(80, 40);
		needTTPanel.setLocation(285, 540);
		JLabel needTTNum = new JLabel("텐텐 10개");
		needTTNum.setFont(new Font("고딕",Font.PLAIN,19));
		needTTPanel.add(needTTNum);
		this.add(needTTPanel);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//닉네임 변경 버튼
		JPanel	ttCPanel = new JPanel();
		ttCPanel.setBackground(new Color(123, 185, 237));
		ttCPanel.setSize(50, 40);
		ttCPanel.setLocation(250,570);
		JButton ttChangeB = new JButton("교환") ;
		ttChangeB.setPreferredSize(new Dimension(50, 40));
		ttChangeB.setBackground(new Color(36, 107, 220));
		ttChangeB.setFont(new Font("고딕",Font.PLAIN,18));
		ttCPanel.add(ttChangeB);
		this.add(ttCPanel);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//상장 이미지
		JPanel rewordPanel = new JPanel(); 
		rewordPanel.setSize(40, 40);
		rewordPanel.setLocation(170,560);
		Image reword = new ImageIcon("/Users/uzdev/Documents/Dev/images/Pan.PNG").getImage().getScaledInstance(100, 100, 0);
		JLabel rewordImg = new JLabel(new ImageIcon(reword));
		rewordImg.setSize(40,40);
		rewordImg.setLocation(170,560);
		rewordPanel.add(rewordImg);
		this.add(rewordPanel);


		//진열장 이미지  - 안돼ㅐㅐㅐㅐㅐㅐㅐㅐㅐ
		JPanel panelBack = new JPanel(); 
		panelBack.setSize(500, 380);
		panelBack.setLocation(80,100);
		Image backGround = new ImageIcon("/Users/uzdev/Documents/Dev/images/sanjang.PNG").getImage().getScaledInstance(150, 100, 0);
		JLabel backLabel = new JLabel(new ImageIcon(backGround));
		backLabel.setSize(500,380);
		backLabel.setLocation(80,100);
		panelBack.add(backLabel);
		this.add(panelBack);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

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






		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
