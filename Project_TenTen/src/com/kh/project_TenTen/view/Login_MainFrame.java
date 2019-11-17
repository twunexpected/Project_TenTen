package com.kh.project_TenTen.view;

import javax.swing.JFrame;

public class Login_MainFrame extends JFrame{
	
	public Login_MainFrame() {
		
		this.setSize(400,700);
		
		new Test_ChooseTest(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}