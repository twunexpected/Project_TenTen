package com.kh.project_TenTen.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);
		new MyWord1_DJ(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
