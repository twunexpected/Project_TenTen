package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login_TestTitle extends JPanel{
	private Login_MainFrame mf;
	private JPanel login_TestTitle;
	public Login_TestTitle(Login_MainFrame mf) {
		
		login_TestTitle = this;
		
		//�� ȭ��
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//����
		JLabel mesege1 = new JLabel("<html> ������ �Ϸ�Ǿ����ϴ�..<br/> ���� �׽�Ʈ ������ �����ϼ���. <html/>");
		mesege1.setBounds(80, 20, 250, 100);
		mesege1.setFont(new Font("���", Font.BOLD, 15));

		//copyRights
		JLabel copyRights = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		copyRights.setBounds(60, 600, 400, 50);
		copyRights.setFont(new Font("���", Font.BOLD, 13));

		//Circle
		Image Circle1 = new ImageIcon("Images/�׽�Ʈ����(����).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id1 = new JButton(new ImageIcon(Circle1));
		Id1.setBounds(40, 100, 150, 150);
		Id1.setContentAreaFilled(false);

		Image Circle2 = new ImageIcon("Images/�׽�Ʈ����(������).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id2 = new JButton(new ImageIcon(Circle2));
		Id2.setBounds(190, 100, 150, 150);
		Id2.setContentAreaFilled(false);

		Image Circle3 = new ImageIcon("Images/�׽�Ʈ����(�丮).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id3 = new JButton(new ImageIcon(Circle3));
		Id3.setBounds(40, 270, 150, 150);
		Id3.setContentAreaFilled(false);

		Image Circle4 = new ImageIcon("Images/�׽�Ʈ����(����Ͻ�).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id4 = new JButton(new ImageIcon(Circle4));
		Id4.setBounds(190, 270, 150, 150);
		Id4.setContentAreaFilled(false);

		Image Circle5 = new ImageIcon("Images/�׽�Ʈ����(����).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id5 = new JButton(new ImageIcon(Circle5));
		Id5.setBounds(40, 440, 150, 150);
		Id5.setContentAreaFilled(false);

		Image Circle6 = new ImageIcon("Images/�׽�Ʈ����(����).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id6 = new JButton(new ImageIcon(Circle6));
		Id6.setBounds(190, 440, 150, 150);
		Id6.setContentAreaFilled(false);

		this.add(Id1);
		this.add(Id2);
		this.add(Id3);
		this.add(Id4);
		this.add(Id5);
		this.add(Id6);
		this.add(mesege1);
		this.add(copyRights);
		mf.add(this);
		
		Id1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
		
		Id6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
			}

		});
	}
}