package com.kh.project_TenTen.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;




public class SeoungJang extends JPanel{

	private Login_MainFrame mf;
	private JPanel SeoungJang;

	//int count = 0;
	//boolean check = true;

	Member mb = new Member();
	public static int rewordChNum =0;




	public SeoungJang(Login_MainFrame mf) {
		this.mf = mf;
		SeoungJang = this;


		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123,185,237));
		mf.add(this);




		//중앙상단 성장과정 패널
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
		// 보유텐텐 :
		JLabel Gttnum = new JLabel("보유 텐텐 : ");
		Gttnum.setBackground(new Color(123, 185, 237));
		Gttnum.setSize(100, 40);
		Gttnum.setLocation(90, 500);
		Gttnum.setFont(new Font("고딕",Font.PLAIN,17));
		this.add(Gttnum);

		// 현재 보유 텐텐 
		//텐텐 누적된거 여기에 가져와야함.

		
	
		JLabel myttnum = new JLabel("  "+String.valueOf(MemberDao.loginMember.getHaveTen()).toString());	
		myttnum.setBackground(new Color(123, 185, 237));
		myttnum.setSize(100, 40);
		myttnum.setLocation(180, 500);
		myttnum.setFont(new Font("고딕",Font.BOLD,17));
		this.add(myttnum);





		// 획득조건 :
		JLabel getCd = new JLabel("획득조건: 텐텐 ");
		getCd.setBackground(new Color(123, 185, 237));
		getCd.setSize(120, 40);
		getCd.setLocation(205, 540);
		getCd.setFont(new Font("고딕",Font.PLAIN,17));
		this.add(getCd);

		// 텐텐 몇개 필요하다는 라벨
		JLabel needTTNum = new JLabel("2개");
		needTTNum.setBackground(new Color(123, 185, 237));
		needTTNum.setSize(110, 40);
		needTTNum.setLocation(320, 540);
		needTTNum.setFont(new Font("고딕",Font.BOLD,17));
		this.add(needTTNum); 


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		// 상장 교환 버튼
		JButton ttChangeB = new JButton("교환") ;
		ttChangeB.setSize(65, 40);
		ttChangeB.setLocation(250,575);
		ttChangeB.setBackground(new Color(36, 107, 220));
		ttChangeB.setFont(new Font("고딕",Font.BOLD,13));
		ttChangeB.setForeground(Color.WHITE);
		this.add(ttChangeB);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//하단 미니상장이미지
		Image reword = new ImageIcon("images/상장.PNG").getImage().getScaledInstance(50, 70, 0);
		JLabel rewordImg = new JLabel(new ImageIcon(reword));
		rewordImg.setSize(50, 75);
		rewordImg.setLocation(130,540);
		this.add(rewordImg);



		//하단 등트로피이미지
		Image Dong = new ImageIcon("images/동트.PNG").getImage().getScaledInstance(70, 90, 0);
		JLabel DongImg = new JLabel(new ImageIcon(Dong));
		DongImg.setSize(60, 75);
		DongImg.setLocation(120,540);
		DongImg.setVisible(false);
		this.add(DongImg);

		//하단 은트로피이미지
		Image silver = new ImageIcon("images/은트.PNG").getImage().getScaledInstance(70, 90, 0);
		JLabel silverImg = new JLabel(new ImageIcon(silver));
		silverImg.setSize(60, 75);
		silverImg.setLocation(120,540);
		silverImg.setVisible(false);
		this.add(silverImg);

		//하단 금트로피이미지
		Image gold = new ImageIcon("images/금트.PNG").getImage().getScaledInstance(70, 90, 0);
		JLabel goldImg = new JLabel(new ImageIcon(gold));
		goldImg.setSize(60, 75);
		goldImg.setLocation(120,540);
		goldImg.setVisible(false);
		this.add(goldImg);


		//진열장이미지
		Image backGround = new ImageIcon("images/Pan.PNG").getImage().getScaledInstance(390, 370, 0);
		JLabel PanLabel = new JLabel(new ImageIcon(backGround));
		PanLabel.setSize(320, 380);
		PanLabel.setLocation(80,100);
		this.add(PanLabel);	




		

		////////// 교환버튼 클릭 이벤트 //////////
		ttChangeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(needTTNum.getText().equals("2개")) {
					
					rewordChNum += 1;
					System.out.println("1 : "+rewordChNum);
					if(rewordChNum == 1) {

							if(MemberDao.loginMember.getHaveTen()>=2) {
							//	if(needTTNum.getText().equals("2개")) {
									//보유텐텐이 5개 이상이고 보상조건이 5개일때
									//보유텐텐 5개 삭감하고 보상조건 10개로 증가시켜라
									MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getHaveTen()-2);
									myttnum.setText("  "+String.valueOf(MemberDao.loginMember.getHaveTen()).toString());	
									needTTNum.setText("4개");

									rewordImg.setLocation(100,140);
									DongImg.setVisible(true);
					//		}
						}
					}
					}
				
			}
			
		}); 
		

		ttChangeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(needTTNum.getText().equals("4개")) {
				rewordChNum += 1;
				System.out.println("2 : "+rewordChNum);
				if(rewordChNum ==2) {

						if(MemberDao.loginMember.getHaveTen()>=4) {
						//	if(needTTNum.getText().equals("4개")) {
								//보유텐텐이 10개 이상이고 보상조건이 10개일때
								//보유텐텐 10개 삭감하고 보상조건 20개로 증가시켜라
								MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getHaveTen()-4);
								myttnum.setText("  "+String.valueOf(MemberDao.loginMember.getHaveTen()).toString());
								needTTNum.setText("6개");

								DongImg.setLocation(205,140);
								silverImg.setVisible(true);

						//	}
						
					}
				}
				}
			
			}


		});
		
		ttChangeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(needTTNum.getText().equals("6개")) {
					rewordChNum += 1;
					System.out.println("3 : "+rewordChNum);
					if(rewordChNum ==3) {
					
							if(MemberDao.loginMember.getHaveTen()>=6) {
							//	if(needTTNum.getText().equals("6개")) {
									//보유텐텐이 10개 이상이고 보상조건이 20개일때
									//보유텐텐 10개 삭감하고 보상조건 30개로 증가시켜라
									MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getHaveTen()-6);
									myttnum.setText("  "+String.valueOf(MemberDao.loginMember.getHaveTen()).toString());
									needTTNum.setText("8개");

									silverImg.setLocation(320,145);
									goldImg.setVisible(true);

								}

							
					//	}

					}
				}
			}
			
		});




		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//카피라이트
		JLabel naming = new JLabel("Copyrights ⓒ    비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	

		//좌측패널
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
				ChangePanel.changePanel(mf, SeoungJang, new MainPage(mf));
			}

		});


		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ChangePanel.changePanel(mf, SeoungJang, new MyWord1(mf));            
				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "단어를 먼저 학습하세요~♥");
				}
			}

		});

		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang, new AddWord(mf));
			}

		});

		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, SeoungJang, new Test_Main(mf));
			}

		});



	}
}


