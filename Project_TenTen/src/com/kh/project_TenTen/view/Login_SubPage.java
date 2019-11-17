package com.kh.project_TenTen.view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_SubPage extends JPanel {
	
	public Login_SubPage(Login_MainFrame mf) {
		
		this.setLayout(null);
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));

		JButton signInbtn1 = new JButton("회원가입");
		signInbtn1.setSize(100,40);
		signInbtn1.setLocation(140,50);
		signInbtn1.setBackground(new Color(36, 107, 220));
		
		JLabel footer = new JLabel("Copyrightsⓒ 비!뇨내과 All Rights Reserved.");
		footer.setBounds(70, 500, 400, 100);
		
		JLabel idLab = new JLabel("아이디 : ");
		idLab.setSize(100,40);
		idLab.setLocation(60,150);
		
		JTextField idTxF = new JTextField();
		idTxF.setLocation(120,155);
		idTxF.setSize(140, 30);
	
		JLabel passLab = new JLabel("비밀번호 : ");
		passLab.setSize(100,40);
		passLab.setLocation(45,190);

		JPasswordField passTxF = new JPasswordField();
		passTxF.setLocation(120,200);
		passTxF.setSize(140, 30);
		
		JButton idCheckBtn = new JButton("중복확인");
		idCheckBtn.setSize(80,40);
		idCheckBtn.setFont(new Font("고딕",Font.BOLD,10));
		idCheckBtn.setBackground(new Color(36, 107, 220));
		idCheckBtn.setLocation(270,150);
		
		JLabel passChLab = new JLabel("비밀번호 확인 : ");
		passChLab.setSize(150,40);
		passChLab.setLocation(15,230);
		
		JPasswordField passChTxF = new JPasswordField();
		passChTxF.setLocation(120,240);
		passChTxF.setSize(140, 30);
		
		JLabel passWarnLab = new JLabel("※영문, 숫자, 특수문자를 혼합 8자리 이상 입력하세요.");
		passWarnLab.setFont(new Font("고딕",Font.BOLD,10));
		passWarnLab.setForeground(Color.RED);
		passWarnLab.setSize(400, 100);
		passWarnLab.setLocation(80,240);
		
		JButton passChBtn = new JButton("비밀번호확인");
		passChBtn.setSize(100,40);
		passChBtn.setLocation(270,235);
		passChBtn.setFont(new Font("고딕",Font.BOLD,8));
		passChBtn.setBackground(new Color(36, 107, 220));

		JLabel nickLab = new JLabel("닉네임 : ");
		nickLab.setSize(100, 40);
		nickLab.setLocation(60,300);
		
		JTextField nickTxF = new JTextField();
		nickTxF.setLocation(120,305);
		nickTxF.setSize(140, 30);
		
		JLabel emailLab = new JLabel("이메일 : ");
		emailLab.setSize(100, 40);
		emailLab.setLocation(60,350);
		
		JTextField emailTxF = new JTextField();
		emailTxF.setLocation(120,355);
		emailTxF.setSize(140, 30);
		
		JButton emailBtn = new JButton("이메일 확인");
		emailBtn.setSize(100,40);
		emailBtn.setLocation(270,350);
		emailBtn.setFont(new Font("고딕",Font.BOLD,10));
		emailBtn.setBackground(new Color(36, 107, 220));
		
		JLabel emailChLab = new JLabel("이메일 인증 : ");
		emailChLab.setSize(100, 40);
		emailChLab.setLocation(30,390);
		
		JTextField emailChTxF = new JTextField();
		emailChTxF.setLocation(120,400);
		emailChTxF.setSize(140, 30);
		
		JButton emailChBtn = new JButton("이메일 확인");
		emailChBtn.setSize(100,40);
		emailChBtn.setLocation(270,395);
		emailChBtn.setFont(new Font("고딕",Font.BOLD,10));
		emailChBtn.setBackground(new Color(36, 107, 220));
		
		JButton SignInBtn = new JButton("가입하기");
		SignInBtn.setSize(100,50);
		SignInBtn.setLocation(140,460);
		SignInBtn.setFont(new Font("고딕",Font.BOLD,15));
		SignInBtn.setBackground(new Color(36, 107, 220));
		
		this.add(SignInBtn);
		this.add(emailChBtn);
		this.add(emailChTxF);
		this.add(emailChLab);
		this.add(emailBtn);
		this.add(emailTxF);
		this.add(emailLab);
		this.add(nickTxF);
		this.add(nickLab);
		this.add(passChBtn);
		this.add(passWarnLab);
		this.add(passChTxF);
		this.add(passChLab);
		this.add(idCheckBtn);
		this.add(passTxF);
		this.add(passLab);
		this.add(idTxF);
		this.add(idLab);
		this.add(footer);
		this.add(signInbtn1);
		
		
	}
}
