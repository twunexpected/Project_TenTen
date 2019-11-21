package com.kh.project_TenTen.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		Gttnum.setSize(80, 40);
		Gttnum.setLocation(110, 500);
		Gttnum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(Gttnum);

		// 현재 보유 텐텐 
		//텐텐 누적된거 여기에 가져와야함.
		JLabel myttnum = new JLabel(String.valueOf(mb.getHaveTen()).toString());
		myttnum.setBackground(new Color(123, 185, 237));
		myttnum.setSize(80, 40);
		myttnum.setLocation(170, 500);
		myttnum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(myttnum);





		// 획득조건 :
		JLabel getCd = new JLabel("획득조건: 텐텐 ");
		getCd.setBackground(new Color(123, 185, 237));
		getCd.setSize(80, 40);
		getCd.setLocation(200, 540);
		getCd.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(getCd);

		// 텐텐 몇개 필요하다는 라벨
		JLabel needTTNum = new JLabel(" 20");
		needTTNum.setBackground(new Color(123, 185, 237));
		needTTNum.setSize(80, 40);
		needTTNum.setLocation(285, 540);
		needTTNum.setFont(new Font("고딕",Font.PLAIN,15));
		this.add(needTTNum);


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		// 상장 교환 버튼
		JButton ttChangeB = new JButton("교환") ;
		ttChangeB.setSize(65, 40);
		ttChangeB.setLocation(240,575);
		ttChangeB.setBackground(new Color(36, 107, 220));
		ttChangeB.setFont(new Font("고딕",Font.BOLD,13));
		ttChangeB.setForeground(Color.WHITE);
		this.add(ttChangeB);

		//시연시 보여줄 텐텐개수 추가 버튼
		JButton showTen = new JButton("^^");
		showTen.setSize(47,30);
		showTen.setLocation(320,585);
		showTen.setBackground(new Color(36, 107, 220));
		showTen.setFont(new Font("고딕",Font.BOLD,10));
		showTen.setForeground(Color.WHITE);
		this.add(showTen);


		//^^ 버튼 누르면 텐텐개수 30개로 셋팅
		showTen.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

	
				MemberDao.loginMember.setHaveTen(30);

				myttnum.setText(String.valueOf(MemberDao.loginMember.getHaveTen()).toString());	

				}
				
			
	
			

		});


 
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//하단 미니상장이미지
		Image reword = new ImageIcon("images/sangjang.PNG").getImage().getScaledInstance(50, 70, 0);
		JLabel rewordImg = new JLabel(new ImageIcon(reword));
		rewordImg.setSize(50, 75);
		rewordImg.setLocation(130,540);
		this.add(rewordImg);

		//하단 트로피이미지
		Image gold = new ImageIcon("images/gold.PNG").getImage().getScaledInstance(70, 90, 0);
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



		//교환버튼 클릭시 이벤트 발생

		/*MemberDao md = new MemberDao();
		ArrayList list = new ArrayList();
		list = md.findMember();
		Member[] m = new Member[list.size()];

		for()

		if(mb.getId().equals("aa11")) {*/


		//myttnum.setText(String.valueOf(MemberDao.loginMember.getHaveTen()).toString());	


		ttChangeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(MemberDao.loginMember.getHaveTen() == 30 ) {	

					rewordImg.setLocation(100,140);
					goldImg.setVisible(true);

					MemberDao.loginMember.setHaveTen(MemberDao.loginMember.getHaveTen()-20);

					myttnum.setText(String.valueOf(MemberDao.loginMember.getHaveTen()).toString());

					needTTNum.setText("30");
				}

			
			}
		});


		//이 아이디로 로그인 안하고 할때
		/*		if(mb.getHaveTen() >= 20) {	

		ttChangeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				rewordImg.setLocation(100,140);
				goldImg.setVisible(true);

				mb.setHaveTen(mb.getHaveTen()-20);

				myttnum.setText(String.valueOf(mb.getHaveTen()).toString());
			}
		});
		}*/


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





		//상장올릴위치 좌표값 알아내는 구문
		/*	PanLabel.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent e) {
		             this.display("Mouse released (#of click :," + e.getClickCount()+")",e);
		          }

				private void display(String s, MouseEvent e) {
					System.out.println(s +"X =" +e.getX()+",Y="+e.getY());

				}

		      });*/


	}

	/*	public final void initUI() {


		ttChangeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton ttChangeB = (JButton)e.getSource();
				if(myttnum.getText().equals("20")) {
					Image reword2 = new ImageIcon("images/sangjang.PNG").getImage().getScaledInstance(200, 200, 0);
					JLabel rewordImg2 = new JLabel(new ImageIcon(reword2));
					rewordImg2.setLocation(20,20);


				}

			}


		});



	}*/

}












