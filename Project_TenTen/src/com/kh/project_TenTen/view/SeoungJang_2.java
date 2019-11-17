package com.kh.project_TenTen.view;
 
import java.awt.Color; 
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeoungJang_2 extends JPanel{

	private Login_MainFrame mf;
	private JPanel SeoungJang_2;
	
	public SeoungJang_2(Login_MainFrame mf) {
		this.mf = mf;
		SeoungJang_2 = this;
		
//		super("�꽦�옣怨쇱젙");
//		this.setBounds(650, 100, 400, 700);
//		this.setLayout(null);

		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123,185,237));
		mf.add(this);


		//JOptionPane.showMessageDiaLog(null,"";)

		//留덉씠�럹�씠吏� 以묒븰�긽�떒 �씪踰�
		JPanel Above = new JPanel();
		Above.setBackground(new Color(36, 107, 220));
		Above.setSize(220, 50);
		Above.setLocation(120, 5);
		JLabel mp= new JLabel("성장과정");
		mp.setBounds(70, 0, 200, 50);
		mp.setForeground(Color.WHITE);
		mp.setFont(new Font("고딕",Font.BOLD,20));

		Above.add(mp);
		this.add(Above);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		// 蹂댁쑀�뀗�뀗 :
		JLabel Gttnum = new JLabel("보유 텐텐: ");
		Gttnum.setBackground(new Color(123, 185, 237));
		Gttnum.setSize(80, 40);
		Gttnum.setLocation(110, 500);
		Gttnum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(Gttnum);

		// 蹂댁쑀�뀗�뀗媛쒖닔 蹂댁뿬二쇨린
		JLabel myttnum = new JLabel("20");
		myttnum.setBackground(new Color(123, 185, 237));
		myttnum.setSize(80, 40);
		myttnum.setLocation(170, 500);
		myttnum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(myttnum);


		// �쉷�뱷議곌굔 :
		JLabel getCd = new JLabel("획득조건: ");
		getCd.setBackground(new Color(123, 185, 237));
		getCd.setSize(80, 40);
		getCd.setLocation(200, 540);
		getCd.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(getCd);

		// �긽�옣援먰솚議곌굔 �뀗�뀗 媛쒖닔
		JLabel needTTNum = new JLabel("텐텐 10개");
		needTTNum.setBackground(new Color(123, 185, 237));
		needTTNum.setSize(80, 40);
		needTTNum.setLocation(285, 540);
		needTTNum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(needTTNum);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		// 援먰솚 踰꾪듉
		JButton ttChangeB = new JButton("교환") ;
		ttChangeB.setSize(50, 40);
		ttChangeB.setLocation(250,575);
		ttChangeB.setBackground(new Color(36, 107, 220));
		ttChangeB.setFont(new Font("고딕",Font.BOLD,16));
		this.add(ttChangeB);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//�븯�떒 誘몃━ 蹂댁뿬二쇰뒗 �긽�옣 �씠誘몄�
		Image reword = new ImageIcon("/Users/uzdev/Documents/Dev/images/sangjang.PNG").getImage().getScaledInstance(50, 70, 0);
		JLabel rewordImg = new JLabel(new ImageIcon(reword));
		rewordImg.setSize(50, 75);
		rewordImg.setLocation(130,540);
		this.add(rewordImg);

		//吏꾩뿴�옣 �쐞�뿉 �긽�옣異붽��씠誘몄�
		Image reword2 = new ImageIcon("/Users/uzdev/Documents/Dev/images/sangjang.PNG").getImage().getScaledInstance(50, 70, 0);
		JLabel rewordImg2 = new JLabel(new ImageIcon(reword2));
		rewordImg2.setSize(50, 75);
		rewordImg2.setLocation(105,140);
		this.add(rewordImg2);

		//吏꾩뿴�옣 �씠誘몄� 
		Image backGround = new ImageIcon("/Users/uzdev/Documents/Dev/images/Pan.PNG").getImage().getScaledInstance(390, 370, 0);
		JLabel PanLabel = new JLabel(new ImageIcon(backGround));
		PanLabel.setSize(320, 380);
		PanLabel.setLocation(80,100);
		this.add(PanLabel);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//移댄뵾�씪�엲
		JLabel naming = new JLabel("Copyrights ⓒ    비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//諛곌꼍
//		JPanel jp = new JPanel();
//		jp.setSize(400, 700);
//		jp.setLayout(null);
//		jp.setBackground(new Color(123, 185, 237));
//		this.add(jp);   
//		this.setBounds(600, 100, 400, 700);

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	

		//醫뚯륫 硫붾돱
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

		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new MainPage(mf));
			}
			
		});

	
		
		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new MainPage(mf));
			}
			
		});


	
		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new MyWord1(mf));
			}
			
		});
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new AddWord(mf));
			}
			
		});
		
		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new Test_ChooseTest(mf));
			}
			
		});

		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang_2, new SeoungJang(mf));
			}
			
		});
		


	}

}
