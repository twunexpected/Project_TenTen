package com.kh.project_TenTen.view;


import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPage extends JPanel {
	
	private MainFrame mf;
	private JPanel MyPage;
	
	public MyPage(MainFrame mf) {
		this.mf = mf;
		MyPage = this;
		
		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);  
		
		
//		super("텐텐 마이페이지");
//		this.setBounds(650, 100, 400, 700);
//		this.setLayout(null);


		//마이페이지 중앙상단 라벨
		JPanel Above = new JPanel();
		Above.setBackground(new Color(36, 107, 220));
		Above.setSize(220, 50);
		Above.setLocation(120, 5);
		JLabel mp= new JLabel("마이페이지");
		mp.setBounds(70, 0, 200, 50);
		mp.setForeground(Color.WHITE);
		mp.setFont(new Font("고딕",Font.BOLD,20));


		Above.add(mp);
		this.add(Above);



		//아이디 :

		JLabel ID = new JLabel("아이디 :");
		ID.setFont(new Font("고딕",Font.PLAIN,19));
		ID.setBackground(new Color(2, 234, 23));
		ID.setSize(115, 40);
		ID.setLocation(110,155);
		this.add(ID);

		//입력받은 아이디
		JTextField userID = new JTextField("syso");
		userID.setBackground(new Color(123,185,237));
		userID.setSize(115, 40);
		userID.setLocation(205,155);
		userID.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userID);
		//////////////////////////////


		//닉네 :
		JLabel NicName = new JLabel("닉네임 :");
		NicName.setBackground(new Color(123, 185, 237));
		NicName.setSize(115, 40);
		NicName.setLocation(110,207);
		NicName.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(NicName);

		//입력받은 닉네임
		JTextField userNickName = new JTextField("비뇨내과");
		userNickName.setBackground(new Color(123,185,237));
		userNickName.setSize(115, 40);
		userNickName.setLocation(205,207);
		userNickName.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userNickName);


		//////////////////////////

		//나의레벨 페널
		JLabel myLevel = new JLabel("나의 레벨 :");
		myLevel.setBackground(new Color(123, 185, 237));
		myLevel.setSize(115, 40);
		myLevel.setLocation(100,255);
		myLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myLevel);

		//나의레벨카운
		JLabel userMyLevel = new JLabel("Lv.1");
		userMyLevel.setBackground(new Color(123,185,237));
		userMyLevel.setSize(110, 40);
		userMyLevel.setLocation(220,255);
		userMyLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userMyLevel);



		//////////////////////////

		//단어레벨 페널
		JLabel wLevel = new JLabel("단어 레벨 :");
		wLevel.setBackground(new Color(123, 185, 237));
		wLevel.setSize(115, 40);
		wLevel.setLocation(100,305);
		wLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(wLevel);

		//단어레벨카운
		JLabel userWdLevel = new JLabel("초급");
		userWdLevel.setBackground(new Color(123,185,237));
		userWdLevel.setSize(120, 40);
		userWdLevel.setLocation(220,305);
		userWdLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userWdLevel);


		//////////////////////////

		//보유텐텐 페널
		JLabel ttCount = new JLabel("보유 텐텐 :");
		ttCount.setBackground(new Color(123, 185, 237));
		ttCount.setSize(115, 40);
		ttCount.setLocation(100,355);
		ttCount.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(ttCount);

		//나의보유텐텐
		JLabel myttNow = new JLabel("20");
		myttNow.setBackground(new Color(123,185,237));
		myttNow.setSize(110, 40);
		myttNow.setLocation(215,355);
		myttNow.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myttNow);


		//////////////////////////

		//학습시작일 페널
		JLabel ddCount = new JLabel("학습시작일 :") ;
		ddCount.setSize(115, 40);
		ddCount.setLocation(100,405);
		ddCount.setBackground(new Color(123, 185, 237));
		ddCount.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(ddCount);

		//학습시작일 Date
		JLabel myddNow = new JLabel("yy.mm.dd");
		myddNow.setBackground(new Color(123,185,237));
		myddNow.setSize(110, 40);
		myddNow.setLocation(205,405);
		myddNow.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myddNow);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//닉네임 변경 버튼
		JButton ncbButton = new JButton("변경") ;
		ncbButton.setSize(50, 40);
		ncbButton.setLocation(320,207);
		ncbButton.setPreferredSize(new Dimension(50, 40));
		ncbButton.setBackground(new Color(36, 107, 220));
		ncbButton.setForeground(Color.WHITE);
		ncbButton.setFont(new Font("고딕",Font.PLAIN,18));
		this.add(ncbButton);



		//@@@@@@@@@@@@@@@@@@@@@ 닉네임변경 팝업창 @@@@@@@@@@@@@@@@@@@@@@@
		//상단 닉네임변경 라벨 받쳐주는 패널
		JPanel pop = new JPanel();
		pop.setBackground(new Color(36,107,220));
		pop.setSize(200, 40);
		pop.setLocation(100, 10);

		//다이어로그
		Dialog sd = new Dialog(mf,"닉네임 변경");
		sd.setBounds(300,500,400,400);
		sd.setBackground(new Color(123, 185, 237));

		//상단"닉네임변경" 라
		JLabel nc = new JLabel("닉네임변경");
		nc.setBounds(150,10,200,40);
		nc.setForeground(Color.WHITE);
		nc.setBackground(new Color(36, 107, 220));
		nc.setFont(new Font("고딕",Font.BOLD,20));
		pop.add(nc);


		//하단"변경완료"버튼
		JButton jb = new JButton("변경완료");
		jb.setSize(100,50);
		jb.setLocation(150,300);
		jb.setForeground(Color.WHITE);
		jb.setBackground(new Color(36, 107, 220));
		sd.add(jb);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd.dispose();
			}

		});


		JLabel lb = new JLabel();
		lb.setSize(400,400);
		sd.add(lb);

		lb.add(pop);

		//기존닉네임 : 
		JPanel oldNickP = new JPanel();
		oldNickP.setBounds(52, 100, 100, 30);
		oldNickP.setBackground(new Color(123,185,237));
		lb.add(oldNickP);
		JLabel oldNick = new JLabel("기존 닉네임 : ");
		oldNick.setBackground(new Color(123,185,237));
		oldNick.setFont(new Font("고딕",Font.PLAIN,18));
		oldNickP.add(oldNick);

		// 현재 유저 닉네임
		JPanel userOldNickP = new JPanel();
		userOldNickP.setBounds(170, 100, 100, 30);
		userOldNickP.setBackground(new Color(123,185,237));
		lb.add(userOldNickP);
		JLabel userOldNick = new JLabel("비뇨내과");
		userOldNick.setBackground(new Color(123,185,237));
		userOldNick.setFont(new Font("고딕",Font.PLAIN,18));
		userOldNickP.add(userOldNick);

		//새 닉네임 : 
		JPanel	newNickP = new JPanel();
		newNickP.setBounds(60, 150, 100, 30);
		newNickP.setBackground(new Color(123,185,237));
		lb.add(newNickP);
		JLabel newNick = new JLabel("새 닉네임 : ");
		newNick.setBackground(new Color(123,185,237));
		newNick.setFont(new Font("고딕",Font.PLAIN,18));
		newNickP.add(newNick);

		// 입력받을 닉네임
		JPanel userNewNP = new JPanel();
		userNewNP.setBounds(170, 145, 100, 40);
		userNewNP.setBackground(new Color(123,185,237));
		lb.add(userNewNP);
		JTextField userNewNick = new JTextField();
		userNewNick.setPreferredSize(new Dimension(110, 40));
		userNewNick.setFont(new Font("고딕",Font.PLAIN,15));
		userNewNP.add(userNewNick);

		JLabel naming1 = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming1.setBounds(60, 330, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming1.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		lb.add(naming1);



		//마이페이지 - 닉네임변경 버튼 누르면 위가 실행.
		ncbButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd.setVisible(true);
			}

		});




		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//회원 탈퇴 버튼
		JButton mdlButton = new JButton("회원 탈퇴") ;
		mdlButton.setBackground(new Color(123, 185, 237));
		mdlButton.setSize(115, 50);
		mdlButton.setLocation(175,550);
		mdlButton.setPreferredSize(new Dimension(115, 50));
		mdlButton.setBackground(new Color(36, 107, 220));
		mdlButton.setForeground(Color.WHITE);
		mdlButton.setFont(new Font("고딕",Font.PLAIN,18));
		this.add(mdlButton);


		//회원탈퇴 재확인 팝업창
		//다이어로그
		Dialog sd2 = new Dialog(mf,"회원탈퇴");
		sd2.setBounds(300,500,400,700);
		//		sd2.setBackground(new Color(123, 185, 237));
		JPanel deletePop = new JPanel();
		deletePop.setSize(400, 700);
		

		Image backGround = new ImageIcon("/Users/uzdev/Documents/Dev/images/delete1.PNG").getImage().getScaledInstance(400, 700, 0);
		JLabel deleteWarn = new JLabel(new ImageIcon(backGround));
		deleteWarn.setSize(400,700);
		deletePop.add(deleteWarn);
		sd2.add(deletePop);
		
		//회원탈퇴 재확인 "네" 버튼
		JPanel	yesPanel = new JPanel();
		yesPanel.setSize(80, 50);
		yesPanel.setLocation(115,370);
		JButton naeButton = new JButton("네") ;
		naeButton.setPreferredSize(new Dimension(80, 50));
		naeButton.setForeground(Color.WHITE);
		naeButton.setBackground(new Color(36, 107, 220));
		naeButton.setFont(new Font("고딕",Font.PLAIN,18));
		yesPanel.add(naeButton);
		deleteWarn.add(yesPanel);
		
		
		//@@@@@@@@@@@@@@@@ 위에 회원탈퇴 재확인 "네" 눌르면 뜨는 "삭제되었습니다." 창 @@@@@@@@@@@@
		Dialog sd3 = new Dialog(mf,"정보삭제확인창");
		sd3.setBounds(300,500,400,700);
		JPanel DConfirmPop = new JPanel();
		DConfirmPop.setSize(400,700);
		
	
		
		
		Image backGround2 = new ImageIcon("/Users/uzdev/Documents/Dev/images/delete2.PNG").getImage().getScaledInstance(400, 700, 0);
		JLabel deletePopImg = new JLabel(new ImageIcon(backGround2));
		deletePopImg.setSize(400,700);
		DConfirmPop.add(deletePopImg);
		
		sd3.add(DConfirmPop);
		
		
		naeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd3.setVisible(true);
			}
			
		});
		
		// 탈퇴 재질문에 "네" 눌렀을 경우 뜨는 창 위에 "확인" 버튼
		JPanel OkPanel = new JPanel();
		OkPanel.setSize(80,50);
		OkPanel.setLocation(160,370);
		JButton OkButton = new JButton("확인");
		OkButton.setPreferredSize(new Dimension(80,50));
		OkButton.setForeground(Color.WHITE);
		OkButton.setBackground(new Color(36,107,220));
		OkButton.setFont(new Font("고딕",Font.PLAIN,18));
		OkPanel.add(OkButton);
		deletePopImg.add(OkPanel);
		
		OkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd3.dispose();
				sd2.dispose();
			}
			
		});
		
		
		
		//회원탈퇴 재확인 "아니오" 버튼 - 누르면 창 꺼져야해. 아래 이벤트있음
		JPanel	NoPanel = new JPanel();
		NoPanel.setSize(80, 50);
		NoPanel.setLocation(200,370);
		JButton aniyoButton = new JButton("아니오") ;
		aniyoButton.setPreferredSize(new Dimension(80, 50));
		aniyoButton.setForeground(Color.WHITE);
		aniyoButton.setBackground(new Color(36, 107, 220));
		aniyoButton.setFont(new Font("고딕",Font.PLAIN,18));
		NoPanel.add(aniyoButton);
		deleteWarn.add(NoPanel);
		
		//아니오 누르면 창 꺼지는이벤트
		aniyoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sd2.dispose();
			}
		});

		//회원탈퇴 누를 시 팝업창이벤트
		
		mdlButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd2.setVisible(true);
			}
		});

//		mf.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) { 
//                System.exit(0);
//        }
//
//		});


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//카피라잇
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);



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

		
		btnLeft1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyPage, new MainPage(mf));
			}
			
		});

		
		
		
//		btnLeft2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ChangePanel.changePanel(mf, MyPage, new MyWord1_DJ(mf));
//			}
//			
//		});

		
//		this.setSize(400, 700);
//		this.setLayout(null);
//		this.setBackground(new Color(123, 185, 237));
//		mf.add(this);  



	//	this.setVisible(true);
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}




}













