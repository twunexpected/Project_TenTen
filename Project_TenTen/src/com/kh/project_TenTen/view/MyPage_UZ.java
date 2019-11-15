package mini_Gui.view;


import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPage_UZ extends JFrame {

	public MyPage_UZ() {
		super("텐텐 마이페이지");



		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);


		//마이페이지 중앙상단 라벨
		JPanel Above = new JPanel();
		Above.setBackground(new Color(36, 107, 220));
		Above.setSize(220, 50);
		Above.setLocation(120, 5);


		//JLabel mp= new JLabel("<html><br/>마이 페이지</html");
		JLabel mp= new JLabel("마이페이지");
		mp.setBounds(150, 0, 200, 50);
		mp.setForeground(Color.WHITE);
		mp.setFont(new Font("고딕",Font.BOLD,20));
		//mp.setHorizontalAlignment(JLabel.CENTER);


		//		라벨은 위치값 조정 불가
		//mp.setLocation(140,10);
		Above.add(mp);
		this.add(Above);



		//아이디 :
		JPanel idPanel = new JPanel();
		idPanel.setBackground(new Color(123, 185, 237));
		idPanel.setSize(115, 40);
		idPanel.setLocation(110,155);
		JLabel ID = new JLabel("아이디 :");
		ID.setFont(new Font("고딕",Font.PLAIN,19));
		idPanel.add(ID);
		this.add(idPanel);

		//입력받은 아이디
		JPanel userIDPanel = new JPanel();
		userIDPanel.setBackground(new Color(123,185,237));
		userIDPanel.setSize(115, 40);
		userIDPanel.setLocation(205,150);
		JTextField userID = new JTextField("syso");
		userID.setFont(new Font("고딕",Font.PLAIN,19));
		userIDPanel.add(userID);
		this.add(userIDPanel);
		//////////////////////////////


		//닉네 :
		JPanel nnPanel = new JPanel();
		nnPanel.setBackground(new Color(123, 185, 237));
		nnPanel.setSize(115, 40);
		nnPanel.setLocation(110,207);
		JLabel NicName = new JLabel("닉네임 :");
		NicName.setFont(new Font("고딕",Font.PLAIN,19));
		nnPanel.add(NicName);
		this.add(nnPanel);

		//입력받은 닉네임
		JPanel userNnPanel = new JPanel();
		userNnPanel.setBackground(new Color(123,185,237));
		userNnPanel.setSize(115, 40);
		userNnPanel.setLocation(205,202);
		JTextField userNickName = new JTextField("비뇨내과");
		userNickName.setFont(new Font("고딕",Font.PLAIN,19));
		userNnPanel.add(userNickName);
		this.add(userNnPanel);


		//////////////////////////

		//나의레벨 페널
		JPanel mlPanel = new JPanel();
		mlPanel.setBackground(new Color(123, 185, 237));
		mlPanel.setSize(115, 40);
		mlPanel.setLocation(100,255);
		JLabel myLevel = new JLabel("나의 레벨 :");
		myLevel.setFont(new Font("고딕",Font.PLAIN,19));
		mlPanel.add(myLevel);
		this.add(mlPanel);

		//나의레벨카운
		JPanel userMlPanel = new JPanel();
		userMlPanel.setBackground(new Color(123,185,237));
		userMlPanel.setSize(110, 40);
		userMlPanel.setLocation(205,255);
		JLabel userMyLevel = new JLabel("Lv.1");
		userMyLevel.setFont(new Font("고딕",Font.PLAIN,19));
		userMlPanel.add(userMyLevel);
		this.add(userMlPanel);



		//////////////////////////

		//단어레벨 페널
		JPanel wPanel = new JPanel();
		wPanel.setBackground(new Color(123, 185, 237));
		wPanel.setSize(115, 40);
		wPanel.setLocation(100,305);
		JLabel wLevel = new JLabel("단어 레벨 :");
		wLevel.setFont(new Font("고딕",Font.PLAIN,19));
		wPanel.add(wLevel);
		this.add(wPanel);

		//단어레벨카운
		JPanel userWdPanel = new JPanel();
		userWdPanel.setBackground(new Color(123,185,237));
		userWdPanel.setSize(110, 40);
		userWdPanel.setLocation(205,305);
		JLabel userWdLevel = new JLabel("초급");
		userWdLevel.setFont(new Font("고딕",Font.PLAIN,19));
		userWdPanel.add(userWdLevel);
		this.add(userWdPanel);


		//////////////////////////

		//보유텐텐 페널
		JPanel ttPanel = new JPanel();
		ttPanel.setBackground(new Color(123, 185, 237));
		ttPanel.setSize(115, 40);
		ttPanel.setLocation(100,355);
		JLabel ttCount = new JLabel("보유 텐텐 :");
		ttCount.setFont(new Font("고딕",Font.PLAIN,19));
		ttPanel.add(ttCount);
		this.add(ttPanel);

		//나의보유텐텐
		JPanel myttPanel = new JPanel();
		myttPanel.setBackground(new Color(123,185,237));
		myttPanel.setSize(110, 40);
		myttPanel.setLocation(205,355);
		JLabel myttNow = new JLabel("20");
		myttNow.setFont(new Font("고딕",Font.PLAIN,19));
		myttPanel.add(myttNow);
		this.add(myttPanel);


		//////////////////////////

		//학습시작일 페널
		JPanel ddPanel = new JPanel();
		ddPanel.setBackground(new Color(123, 185, 237));
		ddPanel.setSize(115, 40);
		ddPanel.setLocation(100,405);
		JLabel ddCount = new JLabel("학습시작일 :") ;
		ddCount.setFont(new Font("고딕",Font.PLAIN,19));
		ddPanel.add(ddCount);
		this.add(ddPanel);

		//학습시작일 Date
		JPanel myddPanel = new JPanel();
		myddPanel.setBackground(new Color(123,185,237));
		myddPanel.setSize(110, 40);
		myddPanel.setLocation(205,405);
		JLabel myddNow = new JLabel("yy.mm.dd");
		myddNow.setFont(new Font("고딕",Font.PLAIN,19));
		myddPanel.add(myddNow);
		this.add(myddPanel);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//닉네임 변경 버튼
		JPanel	ncbPanel = new JPanel();
		ncbPanel.setBackground(new Color(123, 185, 237));
		ncbPanel.setSize(50, 40);
		ncbPanel.setLocation(315,200);
		JButton ncbButton = new JButton("변경") ;
		ncbButton.setPreferredSize(new Dimension(50, 40));
		ncbButton.setBackground(new Color(36, 107, 220));
		ncbButton.setFont(new Font("고딕",Font.PLAIN,18));
		ncbPanel.add(ncbButton);
		this.add(ncbPanel);



		//@@@@@@@@@@@@@@@@@@@@@ 닉네임변경 팝업창 @@@@@@@@@@@@@@@@@@@@@@@
		//상단 닉네임변경 라벨 받쳐주는 패널
		JPanel pop = new JPanel();
		pop.setBackground(new Color(36,107,220));
		pop.setSize(200, 40);
		pop.setLocation(100, 10);

		//다이어로그
		Dialog sd = new Dialog(this,"닉네임 변경");
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
		JPanel	dlPanel = new JPanel();
		dlPanel.setBackground(new Color(123, 185, 237));
		dlPanel.setSize(115, 50);
		dlPanel.setLocation(175,550);
		JButton mdlButton = new JButton("회원 탈퇴") ;
		mdlButton.setPreferredSize(new Dimension(115, 50));
		mdlButton.setBackground(new Color(36, 107, 220));
		mdlButton.setFont(new Font("고딕",Font.PLAIN,18));
		dlPanel.add(mdlButton);
		this.add(dlPanel);


		//회원탈퇴 재확인 팝업창
		//다이어로그
		Dialog sd2 = new Dialog(this,"회원탈퇴");
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
		Dialog sd3 = new Dialog(this,"정보삭제확인창");
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













