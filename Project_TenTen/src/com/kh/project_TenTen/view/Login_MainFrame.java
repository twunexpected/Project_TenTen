package com.kh.project_TenTen.view;


import javax.swing.JFrame;

import com.kh.project_TenTen.model.vo.Member;

public class Login_MainFrame extends JFrame {
	
	public static Member loginM;
	
	public Login_MainFrame() {
		this.setBounds(500, 100, 400, 700);
		
		new Login_MainPage(this);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
