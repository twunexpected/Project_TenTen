package com.kh.project_TenTen.view;


import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.DefaultPersistenceDelegate;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.kh.project_TenTen.controller.MemberController;
import com.kh.project_TenTen.model.dao.MemberDao;

public class MyPage extends JPanel {
	
	private Login_MainFrame mf;
	private JPanel MyPage;
	MemberController mc = new MemberController();
			
	public MyPage(Login_MainFrame mf) {
		this.mf = mf;
		MyPage = this;
		
		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);  
		
		//留덉씠�럹�씠吏�以묒븰�긽�떒�씪踰�
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
		
		//�땳�꽕�엫蹂�寃� 踰꾪듉紐⑥뼇 �뙣�꼸 add

		JButton logOutBtn = new JButton("로그아웃");
		logOutBtn.setForeground(Color.white);
		logOutBtn.setBackground(new Color(36, 107, 220));
		logOutBtn.setBounds(250,70,110,40);
		logOutBtn.setFont(new Font("고딕", Font.BOLD, 17));
		this.add(logOutBtn);
		
		JButton changePassBtn = new JButton("비밀번호 변경");
		changePassBtn.setForeground(Color.white);
		changePassBtn.setBackground(new Color(36, 107, 220));
		changePassBtn.setBounds(200,120,160,40);
		changePassBtn.setFont(new Font("고딕", Font.BOLD, 17));
		
		this.add(changePassBtn);
		
		Dialog changePassDlog = new Dialog(mf, "鍮꾨�踰덊샇 蹂�寃� �떎�씠�뼹濡쒓렇");
		changePassDlog.setLayout(null);
		changePassDlog.setBounds(300,500,350,350);
		changePassDlog.setBackground(new Color(123, 185, 237));
		
		changePassBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				changePassDlog.setVisible(true);
			}
		});
		
		JLabel changePassLab = new JLabel("鍮꾨�踰덊샇 蹂�寃�");
		changePassLab.setBounds(110, 60, 300, 30);
		changePassLab.setFont(new Font("怨좊뵓", Font.BOLD, 20));
		changePassLab.setForeground(Color.white);
		changePassDlog.add(changePassLab);
		
		JPasswordField changePassTxF = new JPasswordField();
		changePassTxF.setSize(150, 40);
		changePassTxF.setLocation(100, 120);
		changePassDlog.add(changePassTxF);
		
		JButton ChangePYesBtn = new JButton("�꽕");
		ChangePYesBtn.setBounds(75, 200, 90, 30);
		ChangePYesBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		ChangePYesBtn.setForeground(Color.white);
		ChangePYesBtn.setBackground(new Color(36, 107, 220));
		changePassDlog.add(ChangePYesBtn);
		ChangePYesBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(changePassTxF.getPassword().length >= 1) {
					MemberDao md = new MemberDao();
					char[] ch = new char[changePassTxF.getPassword().length];
					for(int i = 0; i < ch.length; i++) {
						ch[i] = changePassTxF.getPassword()[i];
					}
					md.loginMember.setPassword(ch);
					JOptionPane.showMessageDialog(null, "鍮꾨�踰덊샇 蹂�寃쎌씠 �셿猷뚮릺�뿀�뒿�땲�떎.");
					changePassDlog.dispose();
					System.out.println("蹂�寃쎌씠�셿猷뚮릺�뿀�뒿�땲�떎.");
				}else {
					JOptionPane.showMessageDialog(null, "蹂�寃쏀븷 鍮꾨�踰덊샇瑜� �엯�젰�빐二쇱꽭�슂." );
				}
				
			}
		});

		JButton ChangePNoBtn = new JButton("�븘�땲�삤");
		ChangePNoBtn.setBounds(185, 200, 90, 30);
		ChangePNoBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		ChangePNoBtn.setForeground(Color.white);
		ChangePNoBtn.setBackground(new Color(36, 107, 220));
		changePassDlog.add(ChangePNoBtn);
		ChangePNoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changePassDlog.dispose();
			}
		});
		
//		------------------------------------------------------ �옉�뾽�빐�빞�븿
		
		//濡쒓렇�븘�썐 �떎�씠�뼹濡쒓렇
		Dialog logOutDlog = new Dialog(mf,"濡쒓렇�븘�썐 �떎�씠�뼹濡쒓렇");
		logOutDlog.setLayout(null);
		logOutDlog.setBounds(300,500,300,300);
		logOutDlog.setBackground(new Color(123, 185, 237));
		
		//踰꾪듉�겢由��떆 �떎�씠�뼹濡쒓렇 �끂異�
		logOutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logOutDlog.setVisible(true);
			}
		});
		
		JLabel logOutMLab = new JLabel("濡쒓렇�븘�썐 �븯�떆寃좎뒿�땲源�?");
		logOutMLab.setBounds(50, 100, 300, 30);
		logOutMLab.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		logOutMLab.setForeground(Color.white);
		logOutDlog.add(logOutMLab);
		
		JButton logOutYesBtn = new JButton("�꽕");
		logOutYesBtn.setBounds(55, 200, 90, 30);
		logOutYesBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		logOutYesBtn.setForeground(Color.white);
		logOutYesBtn.setBackground(new Color(36, 107, 220));
		logOutYesBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.logoutMember();
				logOutDlog.dispose();
				ChangePanel.changePanel(mf, MyPage, new Login_MainPage(mf));
			}
		});

		JButton logOutNoBtn = new JButton("�븘�땲�삤");
		logOutNoBtn.setBounds(165, 200, 90, 30);
		logOutNoBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		logOutNoBtn.setForeground(Color.white);
		logOutNoBtn.setBackground(new Color(36, 107, 220));
		logOutNoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				logOutDlog.dispose();
			}
		});
		
		logOutDlog.add(logOutYesBtn);
		logOutDlog.add(logOutNoBtn);
		
		//�븘�씠�뵒�씪踰�
		JLabel ID = new JLabel("�븘�씠�뵒 :");
		ID.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		ID.setBackground(new Color(2, 234, 23));
		ID.setBounds(120, 165, 115, 40);
		this.add(ID);

		//�엯�젰諛쏆��븘�씠�뵒
		JLabel userID = new JLabel(MemberDao.loginMember.getId());
		userID.setBackground(new Color(123,185,237));
		userID.setBounds(205, 165, 115, 40);
		userID.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(userID);

		//�땳�꽕�엫�씪踰�
		JLabel nickName = new JLabel("�땳�꽕�엫 :");
		nickName.setBounds(120, 207, 115, 40);
		nickName.setBackground(new Color(123, 185, 237));
		nickName.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(nickName);

		//�엯�젰諛쏆� �땳�꽕�엫
		JLabel userNickName = new JLabel(MemberDao.loginMember.getNickname());
		userNickName.setBackground(new Color(123,185,237));
		userNickName.setBounds(205, 207, 115, 40);
		userNickName.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(userNickName);

		//�굹�쓽�젅踰� : 
		JLabel myLevel = new JLabel("�굹�쓽 �젅踰� :");
		myLevel.setBackground(new Color(123, 185, 237));
		myLevel.setSize(115, 40);
		myLevel.setLocation(100,255);
		myLevel.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(myLevel);

		//�쑀���젅踰�
		JLabel userMyLevel = new JLabel(String.valueOf(MemberDao.loginMember.getLevel()));
		userMyLevel.setBackground(new Color(123,185,237));
		userMyLevel.setSize(110, 40);
		userMyLevel.setLocation(230,255);
		userMyLevel.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(userMyLevel);

		//////////////////////////

		//�떒�뼱�젅踰� : 
		JLabel wLevel = new JLabel("�떒�뼱 �젅踰� :");
		wLevel.setBackground(new Color(123, 185, 237));
		wLevel.setSize(115, 40);
		wLevel.setLocation(100,305);
		wLevel.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(wLevel);

		//珥�/以�/怨좉툒
		JLabel userWdLevel = new JLabel(MemberDao.loginMember.getWordLevel());
		userWdLevel.setBackground(new Color(123,185,237));
		userWdLevel.setSize(120, 40);
		userWdLevel.setLocation(220,305);
		userWdLevel.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(userWdLevel);

		//////////////////////////

		
		
		//蹂댁쑀�뀗�뀗
		JLabel ttCount = new JLabel("蹂댁쑀 �뀗�뀗 :");
		ttCount.setBackground(new Color(123, 185, 237));
		ttCount.setSize(115, 40);
		ttCount.setLocation(100,355);
		ttCount.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(ttCount);

		//�쁽�옱 �뀗�뀗媛쒖닔
		JLabel myttNow = new JLabel(String.valueOf(MemberDao.loginMember.getHaveTen()));
		myttNow.setBackground(new Color(123,185,237));
		myttNow.setSize(110, 40);
		myttNow.setLocation(230,355);
		myttNow.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(myttNow);

		//////////////////////////

		/*//�븰�뒿�떆�옉�씪 : 
		JLabel ddCount = new JLabel("�븰�뒿�떆�옉�씪 :") ;
		ddCount.setSize(115, 40);
		ddCount.setLocation(90,405);
		ddCount.setBackground(new Color(123, 185, 237));
		ddCount.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(ddCount);

		//�떆�옉�븳 Date
		JLabel myddNow = new JLabel("yy.mm.dd");
		myddNow.setBackground(new Color(123,185,237));
		myddNow.setSize(110, 40);
		myddNow.setLocation(205,405);
		myddNow.setFont(new Font("怨좊뵓",Font.PLAIN,19));
		this.add(myddNow);*/

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//�땳�꽕�엫蹂�寃쎈쾭�듉
		JButton ncbButton = new JButton("蹂�寃�") ;
		ncbButton.setSize(60, 40);
		ncbButton.setLocation(290,207);
		ncbButton.setBackground(new Color(36, 107, 220));
		ncbButton.setForeground(Color.WHITE);
		ncbButton.setFont(new Font("怨좊뵓",Font.PLAIN,12));
		this.add(ncbButton);


		//@@@@@@@@@@@@@@@@@@@@@ 蹂�寃쎈쾭�듉 �늻瑜쇱떆 �뙘�뾽李�  @@@@@@@@@@@@@@@@@@@@@@@
		//�뙣�꼸
		//�떎�씠�뼱濡쒓렇
		Dialog changeNickDlog = new Dialog(mf,"�땳�꽕�엫 蹂�寃�");
		changeNickDlog.setLayout(null);
		changeNickDlog.setBounds(300,500,400,400);
		changeNickDlog.setBackground(new Color(123, 185, 237));
//		changeNickDlog.setResizable(false);
		
		//�땳�꽕�엫蹂�寃쎈쾭�듉 �늻瑜쇱떆 �뙘�뾽李쎈쑉�뒗 �씠踰ㅽ듃
		ncbButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeNickDlog.setVisible(true);
			}
		});
		//�땳�꽕�엫蹂�寃� 踰꾪듉紐⑥뼇 �뙣�꼸 add
		JPanel titlePan = new JPanel();
		titlePan.setBounds(140,70,130,40);
		titlePan.setBackground(new Color(36, 107, 220));
		titlePan.setLayout(null);
		changeNickDlog.add(titlePan);
		
		JLabel titleLab = new JLabel("�땳�꽕�엫蹂�寃�");
		titleLab.setForeground(Color.white);
		titleLab.setBounds(20,5,100,30);
		titleLab.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		titlePan.add(titleLab);

		JLabel oldLab = new JLabel("湲곗〈 �땳�꽕�엫 : ");
		oldLab.setSize(100, 30);
		oldLab.setLocation(50, 150);
		oldLab.setFont(new Font("怨좊뵓",Font.BOLD, 15));
		changeNickDlog.add(oldLab);
		
		JLabel oldLab2 = new JLabel(MemberDao.loginMember.getNickname());
		oldLab2.setSize(150, 30);
		oldLab2.setLocation(160, 150);
		oldLab2.setFont(new Font("怨좊뵓",Font.BOLD, 15));
		changeNickDlog.add(oldLab2);
		
		JLabel newLab = new JLabel("蹂�寃쏀븷 �땳�꽕�엫 : ");
		newLab.setSize(130, 30);
		newLab.setLocation(30, 200);
		newLab.setFont(new Font("怨좊뵓",Font.BOLD, 15));
		changeNickDlog.add(newLab);

		JTextField newTxF = new JTextField();
		newTxF.setSize(150, 30);
		newTxF.setLocation(155, 200);
		changeNickDlog.add(newTxF);
		
		//蹂�寃쎌셿猷뚮쾭�듉
		JButton finishBtn = new JButton("蹂�寃쎌셿猷�");
		finishBtn.setSize(100,50);
		finishBtn.setLocation(90,280);
		finishBtn.setForeground(Color.WHITE);
		finishBtn.setBackground(new Color(36, 107, 220));
		changeNickDlog.add(finishBtn);
		
		finishBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDao.loginMember.setNickname(newTxF.getText());
				JOptionPane.showMessageDialog(null, "蹂�寃쎌씠�셿猷뚮릺�뿀�뒿�땲�떎.");
				changeNickDlog.dispose();
			}
		});
		
		JButton backBtn = new JButton("�뮘濡�");
		finishBtn.setSize(100,50);
		finishBtn.setLocation(170,280);
		finishBtn.setForeground(Color.WHITE);
		finishBtn.setBackground(new Color(36, 107, 220));
		changeNickDlog.add(finishBtn);
		
		finishBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeNickDlog.dispose();
			}
		});


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//�쉶�썝�깉�눜踰꾪듉
		JButton mdlButton = new JButton("�쉶�썝�깉�눜") ;
		mdlButton.setBackground(new Color(123, 185, 237));
		mdlButton.setSize(115, 50);
		mdlButton.setLocation(175,450);
		mdlButton.setBackground(new Color(36, 107, 220));
		mdlButton.setForeground(Color.WHITE);
		mdlButton.setFont(new Font("怨좊뵓",Font.PLAIN,18));
		this.add(mdlButton);


		//�깉�눜李� �떎�씠�뼱濡쒓렇


		//�쉶�썝�깉�눜 �떎�씠�뼹濡쒓렇
		Dialog deleteMemDlog = new Dialog(mf,"�쉶�썝�깉�눜");
		deleteMemDlog.setLayout(null);
		deleteMemDlog.setBounds(300,500,300,300);
		deleteMemDlog.setBackground(new Color(123, 185, 237));

		mdlButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteMemDlog.setVisible(true);
			}
		});

		JLabel deleteMsgLab = new JLabel("�젙留먰쉶�썝�깉�눜 �븯�떆寃좎뒿�땲源�?");
		deleteMsgLab.setBounds(35, 100, 300, 30);
		deleteMsgLab.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		deleteMsgLab.setForeground(Color.white);
		deleteMemDlog.add(deleteMsgLab);

		JButton deleteMYesBtn = new JButton("�꽕");
		deleteMYesBtn.setBounds(55, 200, 90, 30);
		deleteMYesBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		deleteMYesBtn.setForeground(Color.white);
		deleteMYesBtn.setBackground(new Color(36, 107, 220));
		
		deleteMYesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.deleteMember(MemberDao.loginMember);
				deleteMemDlog.dispose();
				ChangePanel.changePanel(mf, MyPage, new Login_MainPage(mf));
			}
		});

		JButton deleteMNoBtn = new JButton("�븘�땲�삤");
		deleteMNoBtn.setBounds(165, 200, 90, 30);
		deleteMNoBtn.setFont(new Font("怨좊뵓", Font.BOLD, 17));
		deleteMNoBtn.setForeground(Color.white);
		deleteMNoBtn.setBackground(new Color(36, 107, 220));
		deleteMNoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deleteMemDlog.dispose();
			}
		});

		deleteMemDlog.add(deleteMNoBtn);
		deleteMemDlog.add(deleteMYesBtn);
		

		
		


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//移댄뵾�씪�씠�듃
		JLabel naming = new JLabel("Copyrights �뱬    鍮�!�눊�궡怨� All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("怨좊뵓", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);



		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		


		//醫뚯륫 �뙣�꼸
		final JButton btnLeft1 = new JButton("<html>硫붿씤<br/>�솕硫�</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("怨좊뵓",Font.BOLD,20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>�굹�쓽<br/>�떒�뼱</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("怨좊뵓",Font.BOLD,20));
		this.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);


		final JButton btnLeft3 = new JButton("<html>�떒�뼱<br/>異붽�</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("怨좊뵓",Font.BOLD,20));
		this.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>�떒�뼱<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("怨좊뵓",Font.BOLD,20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);

		final JButton btnLeft5 = new JButton("<html>�꽦�옣<br/>怨쇱젙</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("怨좊뵓",Font.BOLD,20));
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













