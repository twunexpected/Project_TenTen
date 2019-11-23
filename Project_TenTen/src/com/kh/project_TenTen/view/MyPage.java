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
      
      //닉네임변경 버튼모양 패널 add

      JButton logOutBtn = new JButton("로그아웃");
      logOutBtn.setForeground(Color.white);
      logOutBtn.setBackground(new Color(36, 107, 220));
      logOutBtn.setBounds(250,70,110,40);
      logOutBtn.setFont(new Font("고딕", Font.BOLD, 17));
      this.add(logOutBtn);
      
      JButton changePassBtn = new JButton("비밀번호변경");
      changePassBtn.setForeground(Color.white);
      changePassBtn.setBackground(new Color(36, 107, 220));
      changePassBtn.setBounds(200,120,160,40);
      changePassBtn.setFont(new Font("고딕", Font.BOLD, 17));
      
      this.add(changePassBtn);
      
      Dialog changePassDlog = new Dialog(mf, "비밀번호 변경 다이얼로그");
      changePassDlog.setLayout(null);
      changePassDlog.setBounds(400,500,350,350);
      changePassDlog.setBackground(new Color(123, 185, 237));
      
      changePassBtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            changePassDlog.setVisible(true);
         }
      });
      
      JLabel changePassLab = new JLabel("비밀번호 변경");
      changePassLab.setBounds(110, 60, 300, 30);
      changePassLab.setFont(new Font("고딕", Font.BOLD, 20));
      changePassLab.setForeground(Color.white);
      changePassDlog.add(changePassLab);
      
      JLabel changePassLab2 = new JLabel("현재 비밀번호 : ");
      changePassLab2.setBounds(25, 120, 300, 30);
      changePassLab2.setFont(new Font("고딕", Font.BOLD, 14));
      changePassLab2.setForeground(Color.black);
      changePassDlog.add(changePassLab2);
      
      JLabel changePassLab3 = new JLabel("변경할 비밀번호 : ");
      changePassLab3.setBounds(25, 170, 300, 30);
      changePassLab3.setFont(new Font("고딕", Font.BOLD, 14));
      changePassLab3.setForeground(Color.black);
      changePassDlog.add(changePassLab3);
      
      //현재비밀번호 텍스트필드
      JPasswordField changePassTxF = new JPasswordField();
      changePassTxF.setSize(150, 40);
      changePassTxF.setLocation(160, 115);
      changePassDlog.add(changePassTxF);
      
      //변경할비밀번호 텍스트필드
      JPasswordField newPassTxF = new JPasswordField();
      newPassTxF.setSize(150, 40);
      newPassTxF.setLocation(160, 170);
      changePassDlog.add(newPassTxF);
      
      JButton ChangePYesBtn = new JButton("변경");
      ChangePYesBtn.setBounds(75, 240, 90, 30);
      ChangePYesBtn.setFont(new Font("고딕", Font.BOLD, 17));
      ChangePYesBtn.setForeground(Color.white);
      ChangePYesBtn.setBackground(new Color(36, 107, 220));
      changePassDlog.add(ChangePYesBtn);
      ChangePYesBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
        	 boolean check = true;
        	 String msg = " ";
        	 MemberDao md = new MemberDao();
        	 char[] nowPass = new char[md.loginMember.getPassword().length];
        	 //현재비밀번호 == TXF비밀번호
        	 //새로변경하는 비밀번호 == 비밀번호 규칙
        	 
        	 //현재 비밀번호 정보 담기
        	 for(int i = 0; i < nowPass.length; i++) {
        		 nowPass[i] = md.loginMember.getPassword()[i];
        	 }
        	 
        	 //비밀번호 8자리이상
        	 //새로운 Pass필드는 8자리이상입력
        	 
        	 if(newPassTxF.getPassword().length <= 8) {
        		 check = false;
        		 msg = "비밀번호는 8자리 이상이어야합니다.";
        		 JOptionPane.showMessageDialog(null, msg);
        		 return;
        	 }
        	 
        	 //담아줄 변수 선언 1
        	 //현재 패스워드 검증
        	 
        	 char[] chaPass = new char[changePassTxF.getPassword().length];
        		 
        	 for(int i = 0; i < chaPass.length; i++) {
        		 chaPass[i] = changePassTxF.getPassword()[i];
        	 }

        	 if(chaPass.length != nowPass.length) {
        		 check = false;
        		 msg = "현재 비밀번호가 일치하지 않습니다.";
        		 JOptionPane.showMessageDialog(null, msg);
        	 }
        	 
        	 for(int i = 0; i < chaPass.length; i++) {
        		 if(chaPass[i] != nowPass[i]) {
        			 check = false;
        			 msg = "비밀번호값이 일치하지 않습니다.";
        			 JOptionPane.showMessageDialog(null, msg);
        			 return;
        		 }
        	 }
        	 
        	 char[] newPassArr = new char[newPassTxF.getPassword().length];
        	 for(int i = 0; i < newPassArr.length; i++) {
        		 newPassArr[i] = newPassTxF.getPassword()[i];
        	 }
        	 
        	 if(check == true) {
        		 md.loginMember.setPassword(newPassArr);
        		 JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다.");
        		 changePassDlog.dispose();
        	 }else {
        		 JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요");
        	 }
            
         }
      });

      JButton ChangePNoBtn = new JButton("뒤로");
      ChangePNoBtn.setBounds(185, 240, 90, 30);
      ChangePNoBtn.setFont(new Font("고딕", Font.BOLD, 17));
      ChangePNoBtn.setForeground(Color.white);
      ChangePNoBtn.setBackground(new Color(36, 107, 220));
      changePassDlog.add(ChangePNoBtn);
      ChangePNoBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            changePassDlog.dispose();
         }
      });
      
//      ------------------------------------------------------ 작업해야함
      
      //로그아웃 다이얼로그
      Dialog logOutDlog = new Dialog(mf,"로그아웃 다이얼로그");
      logOutDlog.setLayout(null);
      logOutDlog.setBounds(300,500,300,300);
      logOutDlog.setBackground(new Color(123, 185, 237));
      
      //버튼클릭시 다이얼로그 노출
      logOutBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            logOutDlog.setVisible(true);
         }
      });
      
      JLabel logOutMLab = new JLabel("로그아웃 하시겠습니까?");
      logOutMLab.setBounds(50, 100, 300, 30);
      logOutMLab.setFont(new Font("고딕", Font.BOLD, 17));
      logOutMLab.setForeground(Color.white);
      logOutDlog.add(logOutMLab);
      
      JButton logOutYesBtn = new JButton("네");
      logOutYesBtn.setBounds(55, 200, 90, 30);
      logOutYesBtn.setFont(new Font("고딕", Font.BOLD, 17));
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

      JButton logOutNoBtn = new JButton("아니오");
      logOutNoBtn.setBounds(165, 200, 90, 30);
      logOutNoBtn.setFont(new Font("고딕", Font.BOLD, 17));
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
      
      //아이디라벨
      JLabel ID = new JLabel("아이디 :");
      ID.setFont(new Font("고딕",Font.PLAIN,19));
      ID.setBackground(new Color(2, 234, 23));
      ID.setBounds(120, 165, 115, 40);
      this.add(ID);

      //입력받은아이디
      JLabel userID = new JLabel(MemberDao.loginMember.getId());
      userID.setBackground(new Color(123,185,237));
      userID.setBounds(205, 165, 115, 40);
      userID.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(userID);

      //닉네임라벨
      JLabel nickName = new JLabel("닉네임 :");
      nickName.setBounds(120, 207, 115, 40);
      nickName.setBackground(new Color(123, 185, 237));
      nickName.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(nickName);

      //입력받은 닉네임
      JLabel userNickName = new JLabel(MemberDao.loginMember.getNickname());
      userNickName.setBackground(new Color(123,185,237));
      userNickName.setBounds(205, 207, 115, 40);
      userNickName.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(userNickName);

      //나의레벨 : 
      JLabel myLevel = new JLabel("나의 레벨 :");
      myLevel.setBackground(new Color(123, 185, 237));
      myLevel.setSize(115, 40);
      myLevel.setLocation(100,255);
      myLevel.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(myLevel);

      //유저레벨
      JLabel userMyLevel = new JLabel(String.valueOf(MemberDao.loginMember.getLevel()));
      userMyLevel.setBackground(new Color(123,185,237));
      userMyLevel.setSize(110, 40);
      userMyLevel.setLocation(230,255);
      userMyLevel.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(userMyLevel);

      //////////////////////////

      //단어레벨 : 
      JLabel wLevel = new JLabel("단어 레벨 :");
      wLevel.setBackground(new Color(123, 185, 237));
      wLevel.setSize(115, 40);
      wLevel.setLocation(100,305);
      wLevel.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(wLevel);

      //초/중/고급
      JLabel userWdLevel = new JLabel(MemberDao.loginMember.getWordLevel());
      userWdLevel.setBackground(new Color(123,185,237));
      userWdLevel.setSize(120, 40);
      userWdLevel.setLocation(220,305);
      userWdLevel.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(userWdLevel);

      //////////////////////////

      
      
      //보유텐텐
      JLabel ttCount = new JLabel("보유 텐텐 :");
      ttCount.setBackground(new Color(123, 185, 237));
      ttCount.setSize(115, 40);
      ttCount.setLocation(100,355);
      ttCount.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(ttCount);

      //현재 텐텐개수
      JLabel myttNow = new JLabel(String.valueOf(MemberDao.loginMember.getHaveTen()));
      myttNow.setBackground(new Color(123,185,237));
      myttNow.setSize(110, 40);
      myttNow.setLocation(230,355);
      myttNow.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(myttNow);

      //////////////////////////

      /*//학습시작일 : 
      JLabel ddCount = new JLabel("학습시작일 :") ;
      ddCount.setSize(115, 40);
      ddCount.setLocation(90,405);
      ddCount.setBackground(new Color(123, 185, 237));
      ddCount.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(ddCount);

      //시작한 Date
      JLabel myddNow = new JLabel("yy.mm.dd");
      myddNow.setBackground(new Color(123,185,237));
      myddNow.setSize(110, 40);
      myddNow.setLocation(205,405);
      myddNow.setFont(new Font("고딕",Font.PLAIN,19));
      this.add(myddNow);*/

      //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      //닉네임변경버튼
      
      JButton ncbButton = new JButton("변경") ;
      ncbButton.setSize(60, 40);
      ncbButton.setLocation(290,207);
      ncbButton.setBackground(new Color(36, 107, 220));
      ncbButton.setForeground(Color.WHITE);
      ncbButton.setFont(new Font("고딕",Font.PLAIN,12));
      this.add(ncbButton);


      //@@@@@@@@@@@@@@@@@@@@@ 변경버튼 누를시 팝업창  @@@@@@@@@@@@@@@@@@@@@@@
      //패널
      //다이어로그
      Dialog changeNickDlog = new Dialog(mf,"닉네임 변경");
      changeNickDlog.setLayout(null);
      changeNickDlog.setBounds(300,500,400,400);
      changeNickDlog.setBackground(new Color(123, 185, 237));
//      changeNickDlog.setResizable(false);
      
      //닉네임변경버튼 누를시 팝업창뜨는 이벤트
      ncbButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            changeNickDlog.setVisible(true);
         }
      });
      //닉네임변경 버튼모양 패널 add
      JPanel titlePan = new JPanel();
      titlePan.setBounds(140,70,130,40);
      titlePan.setBackground(new Color(36, 107, 220));
      titlePan.setLayout(null);
      changeNickDlog.add(titlePan);
      
      JLabel titleLab = new JLabel("닉네임변경");
      titleLab.setForeground(Color.white);
      titleLab.setBounds(20,5,100,30);
      titleLab.setFont(new Font("고딕", Font.BOLD, 17));
      titlePan.add(titleLab);

      JLabel oldLab = new JLabel("기존 닉네임 : ");
      oldLab.setSize(100, 30);
      oldLab.setLocation(50, 150);
      oldLab.setFont(new Font("고딕",Font.BOLD, 15));
      changeNickDlog.add(oldLab);
      
      JLabel oldLab2 = new JLabel(MemberDao.loginMember.getNickname());
      oldLab2.setSize(150, 30);
      oldLab2.setLocation(160, 150);
      oldLab2.setFont(new Font("고딕",Font.BOLD, 15));
      changeNickDlog.add(oldLab2);
      
      JLabel newLab = new JLabel("변경할 닉네임 : ");
      newLab.setSize(130, 30);
      newLab.setLocation(30, 200);
      newLab.setFont(new Font("고딕",Font.BOLD, 15));
      changeNickDlog.add(newLab);

      JTextField newTxF = new JTextField();
      newTxF.setSize(150, 30);
      newTxF.setLocation(155, 200);
      changeNickDlog.add(newTxF);
      
      //변경완료버튼
      JButton finishBtn = new JButton("변경완료");
      finishBtn.setSize(100,50);
      finishBtn.setLocation(40,280);
      finishBtn.setForeground(Color.WHITE);
      finishBtn.setBackground(new Color(36, 107, 220));
      changeNickDlog.add(finishBtn);
      
      finishBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
        	
        	if(newTxF.getText().length() <= 0) {
        		JOptionPane.showMessageDialog(null, "닉네임은 한글자 이상이어야 합니다.");
        		newTxF.requestFocus();
        	}else {
        		if(newTxF.getText().equals(MemberDao.loginMember.getNickname())) {
        			JOptionPane.showMessageDialog(null, "현재와 동일한 닉네임입니다.");
        		}else {
        			MemberDao.loginMember.setNickname(newTxF.getText());
        			JOptionPane.showMessageDialog(null, "변경이완료되었습니다.");
        			changeNickDlog.dispose();
        			ChangePanel.changePanel(mf, MyPage, new MyPage(mf));
        		}
        	}
         }
      });
      
      JButton backBtn = new JButton("뒤로");
      backBtn.setSize(100,50);
      backBtn.setLocation(170,280);
      backBtn.setForeground(Color.WHITE);
      backBtn.setBackground(new Color(36, 107, 220));
      changeNickDlog.add(backBtn);
      
      finishBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            changeNickDlog.dispose();
         }
      });


      //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

      //회원탈퇴버튼
      JButton mdlButton = new JButton("회원탈퇴") ;
      mdlButton.setBackground(new Color(123, 185, 237));
      mdlButton.setSize(115, 50);
      mdlButton.setLocation(175,450);
      mdlButton.setBackground(new Color(36, 107, 220));
      mdlButton.setForeground(Color.WHITE);
      mdlButton.setFont(new Font("고딕",Font.PLAIN,18));
      this.add(mdlButton);


      //탈퇴창 다이어로그


      //회원탈퇴 다이얼로그
      Dialog deleteMemDlog = new Dialog(mf,"회원탈퇴");
      deleteMemDlog.setLayout(null);
      deleteMemDlog.setBounds(300,500,300,300);
      deleteMemDlog.setBackground(new Color(123, 185, 237));

      mdlButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            deleteMemDlog.setVisible(true);
         }
      });

      JLabel deleteMsgLab = new JLabel("현재 비밀번호 입력 : ");
      deleteMsgLab.setBounds(35, 100, 300, 30);
      deleteMsgLab.setFont(new Font("고딕", Font.BOLD, 17));
      deleteMsgLab.setForeground(Color.white);
      deleteMemDlog.add(deleteMsgLab);
      
      JPasswordField delPassTxF = new JPasswordField();
      delPassTxF.setSize(150, 40);
      delPassTxF.setLocation(80, 140);
      deleteMemDlog.add(delPassTxF);

      JButton deleteMYesBtn = new JButton("네");
      deleteMYesBtn.setBounds(55, 200, 90, 30);
      deleteMYesBtn.setFont(new Font("고딕", Font.BOLD, 17));
      deleteMYesBtn.setForeground(Color.white);
      deleteMYesBtn.setBackground(new Color(36, 107, 220));
      
      deleteMYesBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        	char[] pass = new char[MemberDao.loginMember.getPassword().length];
        	boolean check = true;
        	
        	if(delPassTxF.getPassword().length <= 0) {
        		JOptionPane.showMessageDialog(null, "비밀번호가 공란입니다.");
        		return;
        	}else {
        		char[] chPass = new char[delPassTxF.getPassword().length];
        		if(pass.length != chPass.length) {
        			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
        			return;
        		}else {
        			for(int i = 0; i < pass.length; i++) {
        				pass[i] = MemberDao.loginMember.getPassword()[i];
        			}
        			
        			for(int i = 0; i < chPass.length; i++) {
        				chPass[i] = delPassTxF.getPassword()[i];
        			}
        			
        			for(int i = 0; i < pass.length; i++) {
        				if(chPass[i] != pass[i]) {
        					check = false;
        				}
        			}
        		}
        	}
        	
        	if(check) {
        		JOptionPane.showMessageDialog(null, "회원탈퇴가 완료되었습니다.");
        		mc.deleteMember(MemberDao.loginMember);
        		deleteMemDlog.dispose();
        		ChangePanel.changePanel(mf, MyPage, new Login_MainPage(mf));
        	}else {
        		JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요.");
        	}
        	
        	
         }
      });

      JButton deleteMNoBtn = new JButton("아니오");
      deleteMNoBtn.setBounds(165, 200, 90, 30);
      deleteMNoBtn.setFont(new Font("고딕", Font.BOLD, 17));
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

      //카피라이트
      JLabel naming = new JLabel("Copyrights ⓒ    비!뇨내과 All Rights reserved.");
      naming.setBounds(90, 600, 400, 50);
      naming.setFont(new Font("고딕", Font.BOLD, 13));
      this.setLayout(null);
      this.add(naming);



      //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      


      //좌측 패널
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












