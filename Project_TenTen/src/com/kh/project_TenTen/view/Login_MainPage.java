package com.kh.project_TenTen.view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.project_TenTen.controller.MemberController;
import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;


public class Login_MainPage extends JPanel{
	private Login_MainFrame mf;
	private JPanel mainPage;
	
	public Login_MainPage(Login_MainFrame mf) {
		this.mf = mf;
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		mainPage = this;
		
		JLabel footer = new JLabel("Copyrightsⓒ 비!뇨내과 All Rights Reserved.");
		footer.setBounds(75, 500, 300, 100);
		
		this.add(footer);
		
		Image tenWords = new ImageIcon("images/tentenwords.PNG").getImage().getScaledInstance(130, 130, 0);
		JLabel logoWordsLab = new JLabel(new ImageIcon(tenWords));
		logoWordsLab.setBounds(95, 5, 200, 150);
		this.add(logoWordsLab);
		
		Image tenLogo = new ImageIcon("images/tenten.PNG").getImage().getScaledInstance(130, 130, 0);
		JLabel logoLab = new JLabel(new ImageIcon(tenLogo));
		logoLab.setBounds(70, 95, 250, 250);
		this.add(logoLab);
		
		JLabel id = new JLabel("아이디 : ");
		id.setSize(80, 25);
		id.setLocation(60, 300);
		this.add(id);
		
		JTextField idTxF = new JTextField(15);
		idTxF.setSize(150, 30);
		idTxF.setLocation(120, 298);
		this.add(idTxF);
		
		JLabel passLab = new JLabel("비밀번호 : ");
		passLab.setSize(80, 25);
		passLab.setLocation(45, 340);
		this.add(passLab);
		
		JPasswordField passTxF = new JPasswordField(15);
		passTxF.setSize(150, 30);
		passTxF.setLocation(120, 338);
		this.add(passTxF);
		
		JButton logBtn = new JButton("로그인"); //로그인 버튼
		logBtn.setBackground(new Color(36, 107, 220));
		logBtn.setBounds(280, 295, 80, 80);
		this.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean idCheck = true;
				boolean passCheck = true;
				
				MemberController mm = new MemberController();
				
				String id = idTxF.getText();
				idCheck = mm.idCheck(id);
				passCheck = mm.passCheck(passTxF.getPassword(), passTxF.getPassword().length, idTxF.getText());
				
				if(idCheck && passCheck) {
					mm.loginMember(idTxF.getText());
					JOptionPane.showMessageDialog(null, "메인페이지로 이동합니다.");
					ChangePanel.changePanel(mf, mainPage, new MainPage(mf));	
				}else if(idCheck == false) {
					JOptionPane.showMessageDialog(null, "일치하는 아이디가 존재하지 않습니다.");
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
				}
			}
		});
		
		JLabel signInlab = new JLabel("회원가입      |");
		signInlab.setSize(100, 30);
		signInlab.setLocation(70,370);
		signInlab.setBackground(new Color(123, 185, 237));
		this.add(signInlab);
		
		JLabel findIdLab = new JLabel("   아이디 찾기");
		findIdLab.setSize(100, 30);
		findIdLab.setLocation(160,370);
		findIdLab.setBackground(new Color(123, 185, 237));
		this.add(findIdLab);
		
		findIdLab.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 ChangePanel.changePanel(mf, mainPage, new Login_FindID1(mf));
			 }
			
		});
		
		JLabel findPassLab = new JLabel("   비밀번호 찾기");
		findPassLab.setSize(100, 30);
		findPassLab.setLocation(160,390);
		findPassLab.setBackground(new Color(123, 185, 237));
		this.add(findPassLab);
		
		findPassLab.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, mainPage, new Login_FindPW(mf));
			 }
			
		});
		
		mf.add(this);

		signInlab.addMouseListener(new MyMouseAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			ChangePanel.changePanel(mf, mainPage , new Login_SubPage(mf));
		}

		public void mouseCliked() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
}
