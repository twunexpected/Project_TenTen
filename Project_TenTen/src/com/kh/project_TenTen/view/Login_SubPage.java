package com.kh.project_TenTen.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.project_TenTen.controller.MemberController;
import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;

public class Login_SubPage extends JPanel {
	public JTextField emailTxF;
	JPanel login_SubPage;
	boolean idCheck = false;
	boolean passCheck = false;
	boolean emailCheck = false;
	boolean emailACheck = false;
	
	public Login_SubPage() {}
	
	public Login_SubPage(Login_MainFrame mf) {
		
		this.setLayout(null);
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		login_SubPage = this;
		
		JButton signInbtn1 = new JButton("ȸ������");
		signInbtn1.setSize(100,40);
		signInbtn1.setLocation(140,50);
		signInbtn1.setForeground(Color.white);
		signInbtn1.setBackground(new Color(36, 107, 220));
		
		JLabel footer = new JLabel("Copyrights�� ��!������ All Rights Reserved.");
		footer.setBounds(70, 500, 400, 100);
		
		JLabel idLab = new JLabel("���̵� : ");
		idLab.setSize(100,40);
		idLab.setLocation(60,150);
		
		JTextField idTxF = new JTextField();
		idTxF.setLocation(120,155);
		idTxF.setSize(140, 30);
	
		JLabel passLab = new JLabel("��й�ȣ : ");
		passLab.setSize(100,40);
		passLab.setLocation(45,190);

		JPasswordField passTxF = new JPasswordField();
		passTxF.setLocation(120,200);
		passTxF.setSize(140, 30);
		
		JButton idCheckBtn = new JButton("�ߺ�Ȯ��");
		idCheckBtn.setSize(80,40);
		idCheckBtn.setFont(new Font("���",Font.BOLD,10));
		idCheckBtn.setForeground(Color.WHITE);
		idCheckBtn.setBackground(new Color(36, 107, 220));
		idCheckBtn.setLocation(270,150);
		
		idCheckBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDao md = new MemberDao();
				ArrayList<Member> list = new ArrayList<Member>();
				list = md.findMember();
				Member m [] = new Member[list.size()];
				
				for(int i = 0; i < m.length; i++) {
					m[i] = (Member) list.get(i);
				}
				
				boolean idCheck = true;
				
				for(int i = 0; i < m.length; i++) {
					if(m[i].getId().equals(idTxF.getText())) {
						idCheck = false;
						break;
					}
				}
				
				if(idCheck) {
					JOptionPane.showMessageDialog(null, "��밡���� ���̵��Դϴ�.");
					Login_SubPage.this.idCheck = true;
					idTxF.setEditable(false);
				}else {
					JOptionPane.showMessageDialog(null, "�ߺ��� ���̵� �Դϴ�.");
					 idTxF.setText("");
					 idTxF.requestFocus();
				}
				
			}
		});
		
		JLabel passChLab = new JLabel("��й�ȣ Ȯ�� : ");
		passChLab.setSize(150,40);
		passChLab.setLocation(15,230);
		
		JPasswordField passChTxF = new JPasswordField();
		passChTxF.setLocation(120,240);
		passChTxF.setSize(140, 30);
		
		JLabel passWarnLab = new JLabel("�غ�й�ȣ�� 8�ڸ� �̻��̾���մϴ�.");
		passWarnLab.setFont(new Font("���",Font.BOLD,10));
		passWarnLab.setForeground(Color.RED);
		passWarnLab.setSize(400, 100);
		passWarnLab.setLocation(120,240);
		
		JButton passChBtn = new JButton("��й�ȣȮ��");
		passChBtn.setSize(100,40);
		passChBtn.setLocation(270,235);
		passChBtn.setFont(new Font("���",Font.BOLD,8));
		passChBtn.setForeground(Color.WHITE);
		passChBtn.setBackground(new Color(36, 107, 220));
		
		passChBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean check = true;
				char[] pass1 = new char[passTxF.getPassword().length];
				char[] pass2 = new char[passChTxF.getPassword().length];
				
				if(pass1.length <= 0) {
					JOptionPane.showMessageDialog(null, "��й�ȣ ĭ�� �����Դϴ�.");
					return;
				}else if(pass2.length <= 0) {
					JOptionPane.showMessageDialog(null, "��й�ȣ Ȯ�� ĭ�� �����Դϴ�.");
					return;
				}
				
				
				//��й�ȣ Ȯ��
				//pass1 �� pass2�� ��ġ�ؾ���
				//8�ڸ��̻� �ۼ��Ǿ����
				
				if(pass1.length != pass2.length) {
					check = false;
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٽ� Ȯ�����ּ���");
					return;
				}
				
				if(pass1.length < 8 && pass2.length < 8) {
					check = false;
				}

				for(int i = 0; i < passTxF.getPassword().length; i++) {
					pass1[i] = passTxF.getPassword()[i];
					pass2[i] = passChTxF.getPassword()[i];
				}
				
				for(int i = 0; i < pass1.length; i++) {
					if(pass1[i] != pass2[i]) {
						check = false;
						break;
					}
				}
				
				if(check) {
					JOptionPane.showMessageDialog(null, "��й�ȣ ������ �����Ͽ����ϴ�.");
					passCheck = true;
					passTxF.setEditable(false);
					passChTxF.setEditable(false);
				}else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٽ� Ȯ�����ּ���.");
					passTxF.setText("");
					passTxF.requestFocus();
					passChTxF.setText("");
				}
				
				
			}
		});

		JLabel nickLab = new JLabel("�г��� : ");
		nickLab.setSize(100, 40);
		nickLab.setLocation(60,300);
		
		JTextField nickTxF = new JTextField();
		nickTxF.setLocation(120,305);
		nickTxF.setSize(140, 30);
		
		JLabel emailLab = new JLabel("�̸��� : ");
		emailLab.setSize(100, 40);
		emailLab.setLocation(60,350);
		
		JTextField emailTxF = new JTextField();
		emailTxF.setLocation(120,355);
		emailTxF.setSize(140, 30);
		
		JButton emailBtn = new JButton("�̸��� Ȯ��");
		emailBtn.setSize(100,40);
		emailBtn.setLocation(270,350);
		emailBtn.setForeground(Color.WHITE);
		emailBtn.setFont(new Font("���",Font.BOLD,10));
		emailBtn.setBackground(new Color(36, 107, 220));
		
		emailBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				MemberDao md = new MemberDao();
				
				if(emailTxF.getText().length() > 0) {
					ArrayList<Member> list = new ArrayList<Member>();
					list = md.findMember();
					Member m [] = new Member[list.size()];
					
					for(int i = 0; i < m.length; i++) {
						m[i] = (Member) list.get(i);
					}
					
					boolean emailCheck = true;
					
					for(int i = 0; i < m.length; i++) {
						if(m[i].getEmail().equals(emailTxF.getText())) {
							emailCheck = false;
							break;
						}
					}
					
					if(emailCheck) {
						JOptionPane.showMessageDialog(null, "��밡���� �̸����Դϴ�. ������ȣ�� �����մϴ�.");
						Login_SubPage.this.emailCheck = true;
						Mail mm = new Mail();
						String[] args1 = {" "};
						mm.getEmailAddress(emailTxF.getText());
						mm.main(args1);
					}else {
						JOptionPane.showMessageDialog(null, "�ߺ��� �̸��� �Դϴ�.");
						 emailTxF.setText("");
						 emailTxF.requestFocus();
					}
				}else {
					JOptionPane.showMessageDialog(null, "�̸����� �Է����ּ���.");
				}
			}
		});
		
		JLabel emailChLab = new JLabel("�̸��� ���� : ");
		emailChLab.setSize(100, 40);
		emailChLab.setLocation(30,390);
		
		JTextField emailChTxF = new JTextField();
		emailChTxF.setLocation(120,400);
		emailChTxF.setSize(140, 30);
		
		JButton emailChBtn = new JButton("���� Ȯ��");
		emailChBtn.setSize(100,40);
		emailChBtn.setLocation(270,395);
		emailChBtn.setForeground(Color.WHITE);
		emailChBtn.setFont(new Font("���",Font.BOLD,10));
		emailChBtn.setBackground(new Color(36, 107, 220));
		
		emailChBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = "";
				Mail mm = new Mail();
				for(int i = 0; i < mm.returnNum.length; i++) {
					a += mm.returnNum[i];
				}
				
				if(a.equals(emailChTxF.getText())) {
					JOptionPane.showMessageDialog(null, "������ȣ�� ��ġ�մϴ�.");
					emailTxF.setEditable(false);
					emailChTxF.setEditable(false);
					emailACheck = true;
				}else {
					JOptionPane.showMessageDialog(null, "������ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
		});
		
		JButton SignInBtn = new JButton("�����ϱ�");
		SignInBtn.setSize(100,50);
		SignInBtn.setLocation(80,460);
		SignInBtn.setFont(new Font("���",Font.BOLD,15));
		SignInBtn.setForeground(Color.white);
		SignInBtn.setBackground(new Color(36, 107, 220));
		
		SignInBtn.addActionListener(new ActionListener() {
			//ȸ������ ������ ����
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idTxF.getText();
				char[] pass = passChTxF.getPassword();
				String nickName = nickTxF.getText();
				String email = emailTxF.getText();
				int exp = 0;
				
				if(idCheck && passCheck && emailCheck && emailACheck == true) {

					if(id.length() > 0 && pass.length > 0 && nickName.length() > 0 &&
							email.length() > 0 && emailChTxF.getText().length() > 0 &&
							passChTxF.getPassword().length > 0) {
						MemberController mc = new MemberController();
						ArrayList<Member> list = new ArrayList<Member>();
						mc.memberSignIn(id, pass, nickName, email, exp);
						Login_TestTitle.id = idTxF.getText();
						JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����Ͽ����ϴ�. LV �׽�Ʈ�� �����մϴ�.");
						ChangePanel.changePanel(mf, login_SubPage, new Login_TestTitle(mf));
					}else {
						JOptionPane.showMessageDialog(null, "�� ĭ�� ä���ּ���.");
					}
				}else {
					if(idCheck == false) {
						JOptionPane.showMessageDialog(null, "id���� Ȯ�����ּ���");
					}else if(passCheck == false) {
						JOptionPane.showMessageDialog(null, "��й�ȣ ��ġ���θ� Ȯ�����ּ���.");
					}else if(emailCheck == false) {
						JOptionPane.showMessageDialog(null, "email �ߺ����θ� Ȯ�����ּ���");
					}else {
						JOptionPane.showMessageDialog(null, "email ������ �������ּ���.");
					}
				}
			}
			
		});
		
		JButton backBtn = new JButton("�ڷ�");
		backBtn.setSize(100,50);
		backBtn.setLocation(200,460);
		backBtn.setFont(new Font("���",Font.BOLD,15));
		backBtn.setForeground(Color.white);
		backBtn.setBackground(new Color(36, 107, 220));
		backBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_SubPage, new Login_MainPage(mf));
				
			}
		});
		
		this.add(backBtn);
		this.add(SignInBtn);
		this.add(emailChBtn);
		this.add(emailChTxF);
		this.add(emailChLab);
		this.add(emailBtn);
		this.add(emailTxF);
		this.add(emailLab);
		this.add(nickTxF);
		this.add(nickLab);
		this.add(passChBtn);
		this.add(passWarnLab);
		this.add(passChTxF);
		this.add(passChLab);
		this.add(idCheckBtn);
		this.add(passTxF);
		this.add(passLab);
		this.add(idTxF);
		this.add(idLab);
		this.add(footer);
		this.add(signInbtn1);
	}
}
