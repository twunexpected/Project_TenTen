package com.kh.project_TenTen.view;

import javax.swing.JPanel;

public class ChangePanel {
	
	public static void changePanel(Login_MainFrame mf, JPanel op, JPanel np) {
		
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		
		
	}
}
