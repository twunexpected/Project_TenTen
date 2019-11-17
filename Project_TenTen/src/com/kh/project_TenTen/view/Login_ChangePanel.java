package com.kh.project_TenTen.view;


import javax.swing.JPanel;

public class Login_ChangePanel {
	public static void changePanel(Login_MainFrame mf, JPanel op, JPanel np) {
	
		//메인프레임의 이전패널을 지움
		mf.remove(op);
		//메인프레임의 다음패널을 추가
		mf.add(np);
		mf.repaint();
	
	}
}
