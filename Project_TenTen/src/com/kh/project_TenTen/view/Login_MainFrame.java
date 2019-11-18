package com.kh.project_TenTen.view;


import javax.swing.JFrame;

public class Login_MainFrame extends JFrame {
	public Login_MainFrame() {
		this.setBounds(500, 100, 400, 700);

		new Login_MainPage(this);
		//new Login_TestTitle(this);
		//new Login_OXQuiz1(this);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
