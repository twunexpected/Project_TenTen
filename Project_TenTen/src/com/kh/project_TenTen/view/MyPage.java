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
	
	private Login_MainFrame mf;
	private JPanel MyPage;
	 
	public MyPage(Login_MainFrame mf) {
		this.mf = mf;
		MyPage = this;
		
		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);  


		//마이페이지중앙상단라벨
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

		//�엯�젰諛쏆� �븘�씠�뵒
		JTextField userID = new JTextField("syso");
		userID.setBackground(new Color(123,185,237));
		userID.setSize(115, 40);
		userID.setLocation(205,155);
		userID.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userID);
		//////////////////////////////


		//�땳�꽕 :
		JLabel NicName = new JLabel("닉네임 :");
		NicName.setBackground(new Color(123, 185, 237));
		NicName.setSize(115, 40);
		NicName.setLocation(110,207);
		NicName.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(NicName);

		//�엯�젰諛쏆� �땳�꽕�엫
		JTextField userNickName = new JTextField("비뇨내과");
		userNickName.setBackground(new Color(123,185,237));
		userNickName.setSize(115, 40);
		userNickName.setLocation(205,207);
		userNickName.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userNickName);


		//////////////////////////

		//�굹�쓽�젅踰� �럹�꼸
		JLabel myLevel = new JLabel("나의 레벨 :");
		myLevel.setBackground(new Color(123, 185, 237));
		myLevel.setSize(115, 40);
		myLevel.setLocation(100,255);
		myLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myLevel);

		//�굹�쓽�젅踰⑥뭅�슫
		JLabel userMyLevel = new JLabel("Lv.1");
		userMyLevel.setBackground(new Color(123,185,237));
		userMyLevel.setSize(110, 40);
		userMyLevel.setLocation(220,255);
		userMyLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userMyLevel);



		//////////////////////////

		//�떒�뼱�젅踰� �럹�꼸
		JLabel wLevel = new JLabel("단어 레벨 :");
		wLevel.setBackground(new Color(123, 185, 237));
		wLevel.setSize(115, 40);
		wLevel.setLocation(100,305);
		wLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(wLevel);

		//�떒�뼱�젅踰⑥뭅�슫
		JLabel userWdLevel = new JLabel("초급");
		userWdLevel.setBackground(new Color(123,185,237));
		userWdLevel.setSize(120, 40);
		userWdLevel.setLocation(220,305);
		userWdLevel.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(userWdLevel);


		//////////////////////////

		//蹂댁쑀�뀗�뀗 �럹�꼸
		JLabel ttCount = new JLabel("보유 텐텐 :");
		ttCount.setBackground(new Color(123, 185, 237));
		ttCount.setSize(115, 40);
		ttCount.setLocation(100,355);
		ttCount.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(ttCount);

		//�굹�쓽蹂댁쑀�뀗�뀗
		JLabel myttNow = new JLabel("20");
		myttNow.setBackground(new Color(123,185,237));
		myttNow.setSize(110, 40);
		myttNow.setLocation(215,355);
		myttNow.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myttNow);


		//////////////////////////

		//�븰�뒿�떆�옉�씪 �럹�꼸
		JLabel ddCount = new JLabel("합습시작일 :") ;
		ddCount.setSize(115, 40);
		ddCount.setLocation(100,405);
		ddCount.setBackground(new Color(123, 185, 237));
		ddCount.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(ddCount);

		//�븰�뒿�떆�옉�씪 Date
		JLabel myddNow = new JLabel("yy.mm.dd");
		myddNow.setBackground(new Color(123,185,237));
		myddNow.setSize(110, 40);
		myddNow.setLocation(205,405);
		myddNow.setFont(new Font("고딕",Font.PLAIN,19));
		this.add(myddNow);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//�땳�꽕�엫 蹂�寃� 踰꾪듉
		JButton ncbButton = new JButton("변경") ;
		ncbButton.setSize(50, 40);
		ncbButton.setLocation(320,207);
		ncbButton.setPreferredSize(new Dimension(50, 40));
		ncbButton.setBackground(new Color(36, 107, 220));
		ncbButton.setForeground(Color.WHITE);
		ncbButton.setFont(new Font("고딕",Font.PLAIN,18));
		this.add(ncbButton);



		//@@@@@@@@@@@@@@@@@@@@@ �땳�꽕�엫蹂�寃� �뙘�뾽李� @@@@@@@@@@@@@@@@@@@@@@@
		//�긽�떒 �땳�꽕�엫蹂�寃� �씪踰� 諛쏆퀜二쇰뒗 �뙣�꼸
		JPanel pop = new JPanel();
		pop.setBackground(new Color(36,107,220));
		pop.setSize(200, 40);
		pop.setLocation(100, 10);

		//�떎�씠�뼱濡쒓렇
		Dialog sd = new Dialog(mf,"닉네임 변경");
		sd.setBounds(300,500,400,400);
		sd.setBackground(new Color(123, 185, 237));

		//�긽�떒"�땳�꽕�엫蹂�寃�" �씪
		JLabel nc = new JLabel("닉네임변경");
		nc.setBounds(150,10,200,40);
		nc.setForeground(Color.WHITE);
		nc.setBackground(new Color(36, 107, 220));
		nc.setFont(new Font("고딕",Font.BOLD,20));
		pop.add(nc);


		//�븯�떒"蹂�寃쎌셿猷�"踰꾪듉
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

		//湲곗〈�땳�꽕�엫 : 
		JPanel oldNickP = new JPanel();
		oldNickP.setBounds(52, 100, 100, 30);
		oldNickP.setBackground(new Color(123,185,237));
		lb.add(oldNickP);
		JLabel oldNick = new JLabel("기존 닉네임 : ");
		oldNick.setBackground(new Color(123,185,237));
		oldNick.setFont(new Font("고딕",Font.PLAIN,18));
		oldNickP.add(oldNick);

		// �쁽�옱 �쑀�� �땳�꽕�엫
		JPanel userOldNickP = new JPanel();
		userOldNickP.setBounds(170, 100, 100, 30);
		userOldNickP.setBackground(new Color(123,185,237));
		lb.add(userOldNickP);
		JLabel userOldNick = new JLabel("비뇨내과");
		userOldNick.setBackground(new Color(123,185,237));
		userOldNick.setFont(new Font("고딕",Font.PLAIN,18));
		userOldNickP.add(userOldNick);

		//�깉 �땳�꽕�엫 : 
		JPanel	newNickP = new JPanel();
		newNickP.setBounds(60, 150, 100, 30);
		newNickP.setBackground(new Color(123,185,237));
		lb.add(newNickP);
		JLabel newNick = new JLabel("새 닉네임 : ");
		newNick.setBackground(new Color(123,185,237));
		newNick.setFont(new Font("고딕",Font.PLAIN,18));
		newNickP.add(newNick);

		// �엯�젰諛쏆쓣 �땳�꽕�엫
		JPanel userNewNP = new JPanel();
		userNewNP.setBounds(170, 145, 100, 40);
		userNewNP.setBackground(new Color(123,185,237));
		lb.add(userNewNP);
		JTextField userNewNick = new JTextField();
		userNewNick.setPreferredSize(new Dimension(110, 40));
		userNewNick.setFont(new Font("고딕",Font.PLAIN,15));
		userNewNP.add(userNewNick);

		JLabel naming1 = new JLabel("Copyrights ⓒ    비!뇨내과� All Rights reserved.");
		naming1.setBounds(60, 330, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming1.setFont(new Font("고딕", Font.BOLD, 13));
		this.setLayout(null);
		lb.add(naming1);



		//留덉씠�럹�씠吏� - �땳�꽕�엫蹂�寃� 踰꾪듉 �늻瑜대㈃ �쐞媛� �떎�뻾.
		ncbButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sd.setVisible(true);
			}

		});




		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//�쉶�썝 �깉�눜 踰꾪듉
		JButton mdlButton = new JButton("회원탈퇴") ;
		mdlButton.setBackground(new Color(123, 185, 237));
		mdlButton.setSize(115, 50);
		mdlButton.setLocation(175,550);
		mdlButton.setPreferredSize(new Dimension(115, 50));
		mdlButton.setBackground(new Color(36, 107, 220));
		mdlButton.setForeground(Color.WHITE);
		mdlButton.setFont(new Font("고딕",Font.PLAIN,18));
		this.add(mdlButton);


		//�쉶�썝�깉�눜 �옱�솗�씤 �뙘�뾽李�
		//�떎�씠�뼱濡쒓렇
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
		
		//�쉶�썝�깉�눜 �옱�솗�씤 "�꽕" 踰꾪듉
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
		
		
		//@@@@@@@@@@@@@@@@ �쐞�뿉 �쉶�썝�깉�눜 �옱�솗�씤 "�꽕" �닃瑜대㈃ �쑉�뒗 "�궘�젣�릺�뿀�뒿�땲�떎." 李� @@@@@@@@@@@@
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
		
		// �깉�눜 �옱吏덈Ц�뿉 "�꽕" �닃���쓣 寃쎌슦 �쑉�뒗 李� �쐞�뿉 "�솗�씤" 踰꾪듉
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
		
		
		
		//�쉶�썝�깉�눜 �옱�솗�씤 "�븘�땲�삤" 踰꾪듉 - �늻瑜대㈃ 李� 爰쇱졇�빞�빐. �븘�옒 �씠踰ㅽ듃�엳�쓬
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
		
		//�븘�땲�삤 �늻瑜대㈃ 李� 爰쇱��뒗�씠踰ㅽ듃
		aniyoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sd2.dispose();
			}
		});

		//�쉶�썝�깉�눜 �늻瑜� �떆 �뙘�뾽李쎌씠踰ㅽ듃
		
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

		//移댄뵾�씪�엲
		JLabel naming = new JLabel("Copyrights ⓒ    비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);



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
				ChangePanel.changePanel(mf, MyPage, new MainPage(mf));
			}
			
		});

	
		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyPage, new MyWord1(mf));
			}
			
		});
		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyPage, new AddWord(mf));
			}
			
		});
		
		btnLeft4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyPage, new Test_ChooseTest(mf));
			}
			
		});

		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyPage, new SeoungJang(mf));
			}
			
		});
		

	}




}













