

package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project_TenTen.controller.MemberController;
 
public class Login_FindPW extends JPanel {
	private Login_MainFrame mf;
	private JPanel login_FindPW;

	public Login_FindPW(Login_MainFrame mf) {
		this.mf = mf;
		login_FindPW = this;
		MemberController mc = new MemberController();
		
		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
	
		//비밀번호 찾기
		Image icon1 = new ImageIcon("Images/비밀번호 찾기.PNG").getImage().getScaledInstance(110, 50, 0);
		JLabel PW1 = new JLabel(new ImageIcon(icon1));
		PW1.setLocation(140, 50);
		PW1.setSize(100,100);
		
		//copyRights
		JLabel copyRights = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		copyRights.setBounds(50, 600, 400, 50);
		copyRights.setFont(new Font("고딕", Font.BOLD, 13));

		//본문
		JLabel mesege1 = new JLabel("아이디 : ");
		mesege1.setBounds(30, 150, 250, 200);
		mesege1.setFont(new Font("고딕", Font.BOLD, 15));

		//아이디 텍스트창
		JTextField IDText = new JTextField();
		IDText.setBounds(100, 230, 170, 40);
		IDText.setFont(new Font("고딕", Font.BOLD, 15));
		IDText.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mesege2 = new JLabel("<html> 아이디와 이메일 주소를 입력하세요.<br/> 이메일로 비밀번호가 전송됩니다. <html/>");
		mesege2.setBounds(70, 80, 260, 200);
		mesege2.setFont(new Font("고딕", Font.BOLD, 15));
		
		JLabel mesege3 = new JLabel("이메일 : ");
		mesege3.setBounds(30, 200, 250, 200);
		mesege3.setFont(new Font("고딕", Font.BOLD, 15));

		
		JTextField EmailText = new JTextField();
		EmailText.setBounds(100, 280, 170, 40);
		EmailText.setFont(new Font("고딕", Font.BOLD, 15));
		EmailText.setHorizontalAlignment(JTextField.LEFT);

		//ID발송 버튼
		JButton btnSend = new JButton("발송");
		btnSend.setBounds(280, 280, 85, 40);
		btnSend.setForeground(new Color(255, 255, 225));
		btnSend.setBackground(new Color(36, 107, 220));
		btnSend.setFont(new Font("고딕", Font.BOLD, 15));
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PassMail mm = new PassMail();
				boolean check = mc.correctEmail(IDText.getText(), EmailText.getText());
				
				if(check == false) {
					JOptionPane.showMessageDialog(null, "아이디와 이메일주소가 일치하지 않습니다.");
				}else {
					String[]args1 = {" "};
					JOptionPane.showMessageDialog(null, "임시 비밀번호가 발송되었습니다.");
					mm.getEmailAddress(EmailText.getText());
					mm.main(args1);
					mc.setUserPass(IDText.getText());
				}
				
				
			}
		});

		//돌아가기 버튼
		JButton btnBack = new JButton("돌아가기");
		btnBack.setBounds(130, 360, 110, 50);
		btnBack.setForeground(new Color(255, 255, 225));
		btnBack.setBackground(new Color(36, 107, 220));
		btnBack.setFont(new Font("고딕", Font.BOLD, 15));
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_FindPW, new Login_MainPage(mf));
			}
		});

		//여러가지
		this.add(mesege1);
		this.add(mesege2);
		this.add(mesege3);
		this.add(btnBack);
		this.add(btnSend);
		this.add(IDText);
		this.add(EmailText);
		this.add(PW1);
		this.add(copyRights);
		mf.add(this);
		
	}
}
