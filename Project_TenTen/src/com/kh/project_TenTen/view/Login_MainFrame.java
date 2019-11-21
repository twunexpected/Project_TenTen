package com.kh.project_TenTen.view;


import javax.swing.JFrame;

import com.kh.project_TenTen.model.vo.Member;

public class Login_MainFrame extends JFrame {
	
	public static Member loginM;
	
	public Login_MainFrame() {
		this.setBounds(500, 100, 400, 700);

		//new Login_MainPage(this);
		new Login_TestTitle(this);
		//new Login_OXQuiz1(this);
		//new Login_OXQuiz2(this);
		//new Login_OXQuiz3(this);
		//new Login_OXQuiz4(this);
		//new Login_OXQuiz5(this);
		//new Login_OXQuiz6(this);


		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
