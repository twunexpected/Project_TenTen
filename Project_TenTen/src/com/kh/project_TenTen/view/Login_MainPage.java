package com.kh.project_TenTen.view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login_MainPage extends JPanel{
	private Login_MainFrame mf;
	private JPanel mainPage;
	
	public Login_MainPage(Login_MainFrame mf) {
		this.mf = mf;
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		mainPage = this;
		
		JPanel footPan = new JPanel();
		footPan.setSize(400,200);
		footPan.setLocation(0, 600);
		footPan.setBackground(new Color(123,185,237));
		
		JLabel footer = new JLabel("Copyrights�� ��!������ All Rights Reserved.");
		footer.setBounds(75, 500, 300, 100);
		
		JPanel logoWordsPan = new JPanel();
		logoWordsPan.setBounds(95, 5, 200, 150);
		logoWordsPan.setBackground(new Color(123, 185, 237));
		Image tenWords = new ImageIcon("images/tentenwords.PNG").getImage().getScaledInstance(130, 130, 0);
		JLabel logoWordsLab = new JLabel(new ImageIcon(tenWords));
		
		JPanel logoPan = new JPanel();
		logoPan.setBounds(70, 135, 250, 250);
		logoPan.setBackground(new Color(123, 185, 237));
		Image tenLogo = new ImageIcon("images/tenten.PNG").getImage().getScaledInstance(130, 130, 0);
		JLabel logoLab = new JLabel(new ImageIcon(tenLogo));
		
		JPanel idPan = new JPanel();
		idPan.setSize(80, 25);
		idPan.setLocation(13, 300);
		idPan.setBackground(new Color(123, 185, 237));
		JLabel id = new JLabel("���̵� : ");

		
		JPanel idTfPan = new JPanel();
		idTfPan.setSize(200, 30);
		idTfPan.setLocation(80, 300);
		idTfPan.setBackground(new Color(123, 185, 237));
		JTextField idTf = new JTextField(15);
		
		JPanel passPan = new JPanel();
		passPan.setSize(80, 25);
		passPan.setLocation(13, 340);
		passPan.setBackground(new Color(123, 185, 237));
		JLabel passLab = new JLabel("��й�ȣ : ");
		
		JPanel passTfPan = new JPanel();
		passTfPan.setSize(200, 30);
		passTfPan.setLocation(80, 337);
		passTfPan.setBackground(new Color(123, 185, 237));
		JTextField passTf = new JTextField(15);
		
		JPanel logPan = new JPanel();
		logPan.setSize(75, 75);
		logPan.setLocation(280, 295);
		logPan.setBackground(new Color(123, 185, 237));
		
		JButton logBtn = new JButton("�α���"); //�α��� ��ư
		logBtn.setPreferredSize(new Dimension(75, 70));
		logBtn.setBackground(new Color(36, 107, 220));
		
		JPanel signInPan = new JPanel();
		signInPan.setSize(100, 30);
		signInPan.setLocation(70,370);
		signInPan.setBackground(new Color(123, 185, 237));
		JLabel signInlab = new JLabel("ȸ������      |");
		
		JPanel findIdPan = new JPanel();
		findIdPan.setSize(100, 30);
		findIdPan.setLocation(160,370);
		findIdPan.setBackground(new Color(123, 185, 237));
		JLabel findIdLab = new JLabel("   ���̵� ã��");

		JPanel findPassPan = new JPanel();
		findPassPan.setSize(100, 30);
		findPassPan.setLocation(160,390);
		findPassPan.setBackground(new Color(123, 185, 237));
		JLabel findPassLab = new JLabel("   ��й�ȣ ã��");
		
		
		findPassPan.add(findPassLab);
		findIdPan.add(findIdLab);
		signInPan.add(signInlab);
		logPan.add(logBtn);
		passTfPan.add(passTf);
		passPan.add(passLab);
		idTfPan.add(idTf);
		idPan.add(id);
		logoPan.add(logoLab);
		logoWordsPan.add(logoWordsLab);
		footPan.add(footer);
		
		
		this.add(findPassPan);
		this.add(findIdPan);
		this.add(signInPan);
		this.add(logPan);
		this.add(passTfPan);
		this.add(passPan);
		this.add(idTfPan);
		this.add(idPan);
		this.add(logoPan);
		this.add(logoWordsPan);
		this.add(footPan);
		mf.add(this);

		signInlab.addMouseListener(new MyMouseAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			Login_ChangePanel.changePanel(mf, mainPage , new Login_SubPage(mf));
		}
	}
	
	
}
