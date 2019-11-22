package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login_TestTitle extends JPanel{
	private Login_MainFrame mf;
	private JPanel login_TestTitle;
	public static String id;
	public Login_TestTitle(Login_MainFrame mf) {
		login_TestTitle = this;
		 
		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//본문
		JLabel mesege1 = new JLabel("<html> 가입이 완료되었습니다..<br/> 레벨 테스트 주제를 선택하세요. <html/>");
		mesege1.setBounds(87, 20, 250, 100);
		mesege1.setFont(new Font("고딕", Font.BOLD, 15));
		
		//copyRights
		JLabel copyRights = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		copyRights.setBounds(60, 600, 400, 50);
		copyRights.setFont(new Font("고딕", Font.BOLD, 13));
		
		//Circle
		Image Circle1 = new ImageIcon("Images/테스트주제(요리).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id1 = new JButton(new ImageIcon(Circle1));
		Id1.setBounds(50, 110, 130, 130);
		Id1.setContentAreaFilled(false);

		Image Circle2 = new ImageIcon("Images/테스트주제(스포츠).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id2 = new JButton(new ImageIcon(Circle2));
		Id2.setBounds(200, 110, 130, 130);
		Id2.setContentAreaFilled(false);

		Image Circle3 = new ImageIcon("Images/테스트주제(여행).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id3 = new JButton(new ImageIcon(Circle3));
		Id3.setBounds(50, 280, 130, 130);
		Id3.setContentAreaFilled(false);

		Image Circle4 = new ImageIcon("Images/테스트주제(비즈니스).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id4 = new JButton(new ImageIcon(Circle4));
		Id4.setBounds(200, 280, 130, 130);
		Id4.setContentAreaFilled(false);

		Image Circle5 = new ImageIcon("Images/테스트주제(경제).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id5 = new JButton(new ImageIcon(Circle5));
		Id5.setBounds(50, 450, 130, 130);
		Id5.setContentAreaFilled(false);

		Image Circle6 = new ImageIcon("Images/테스트주제(예술).PNG").getImage().getScaledInstance(130, 130, 0);
		JButton Id6 = new JButton(new ImageIcon(Circle6));
		Id6.setBounds(200, 450, 130, 130);
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
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz1(mf));
				}
				System.out.println(result);
			}
		});
		
		Id2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz2(mf));
				}
				System.out.println(result);
			}
		});
		Id3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz3(mf));
				}
				System.out.println(result);
			}
		});
		Id4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz4(mf));
				}
				System.out.println(result);
			}
		});
		Id5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz5(mf));
				}
				System.out.println(result);
			}
		});
		Id6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"<html> 확인을 누르시면<br/> 주제를 변경 할 수 없습니다. <html/>", null, 
						JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					ChangePanel.changePanel(mf, login_TestTitle, new Login_OXQuiz6(mf));
				}
				System.out.println(result);
			}
		});
	}
}