package com.kh.project_TenTen.view;


import javax.swing.JPanel;

public class Login_ChangePanel {
	public static void changePanel(Login_MainFrame mf, JPanel op, JPanel np) {
	
		//������������ �����г��� ����
		mf.remove(op);
		//������������ �����г��� �߰�
		mf.add(np);
		mf.repaint();
	
	}
}
