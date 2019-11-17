package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project_TenTen.view.MainFrame;
 
public class Login_TestTitle extends JPanel{
	private MainFrame mf;
	private JPanel Login_TestTitle;
	public Login_TestTitle(MainFrame mf) {
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
		Image Circle1 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id1 = new JLabel(new ImageIcon(Circle1));
		Id1.setBackground(new Color(1,123,1));
		Id1.setBounds(23, 115, 170, 170);
		//Id1.setContentAreaFilled(false);
		//Id1.setFocusPainted(false);

		Image Circle2 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id2 = new JLabel(new ImageIcon(Circle1));
		Id2.setBounds(10, 270, 200, 200);

		Image Circle3 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id3 = new JLabel(new ImageIcon(Circle1));
		Id3.setBounds(10, 440, 200, 200);

		Image Circle4 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id4 = new JLabel(new ImageIcon(Circle1));
		Id4.setBounds(170, 100, 200, 200);

		Image Circle5 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id5 = new JLabel(new ImageIcon(Circle1));
		Id5.setBounds(170, 270, 200, 200);

		Image Circle6 = new ImageIcon("Imege/테스트주제.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel Id6 = new JLabel(new ImageIcon(Circle1));
		Id6.setBounds(170, 440, 200, 200);

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