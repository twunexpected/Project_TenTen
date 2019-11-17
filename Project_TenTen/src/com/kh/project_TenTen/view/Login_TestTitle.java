package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login_TestTitle extends JPanel{
	private Login_MainFrame mf;
	private JPanel Login_TestTitle;
	public Login_TestTitle(Login_MainFrame mf) {
		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);

		//본문
		JLabel mesege1 = new JLabel("<html> 가입이 완료되었습니다..<br/> 레벨 테스트 주제를 선택하세요. <html/>");
		mesege1.setBounds(80, 20, 250, 100);
		mesege1.setFont(new Font("고딕", Font.BOLD, 15));

		//copyRights
		JLabel copyRights = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		copyRights.setBounds(60, 600, 400, 50);
		copyRights.setFont(new Font("고딕", Font.BOLD, 13));

		//Circle
		Image Circle1 = new ImageIcon("Imeges/테스트주제(여행).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id1 = new JButton(new ImageIcon(Circle1));
		Id1.setBackground(new Color(1,123,1));
		Id1.setBounds(40, 100, 150, 150);
		Id1.setContentAreaFilled(false);

		Image Circle2 = new ImageIcon("Imeges/테스트주제(스포츠).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id2 = new JButton(new ImageIcon(Circle2));
		Id2.setBounds(190, 100, 150, 150);
		Id2.setContentAreaFilled(false);

		Image Circle3 = new ImageIcon("Imeges/테스트주제(요리).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id3 = new JButton(new ImageIcon(Circle3));
		Id3.setBounds(40, 270, 150, 150);
		Id3.setContentAreaFilled(false);

		Image Circle4 = new ImageIcon("Imeges/테스트주제(비즈니스).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id4 = new JButton(new ImageIcon(Circle4));
		Id4.setBounds(190, 270, 150, 150);
		Id4.setContentAreaFilled(false);

		Image Circle5 = new ImageIcon("Imeges/테스트주제(예술).PNG").getImage().getScaledInstance(150, 150, 0);
		JButton Id5 = new JButton(new ImageIcon(Circle5));
		Id5.setBounds(40, 440, 150, 150);
		Id5.setContentAreaFilled(false);

		Image Circle6 = new ImageIcon("Imeges/테스트주제(경제).PNG").getImage().getScaledInstance(150, 150, 0);
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
	}
}