

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
		
		//�� ȭ��
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
	
		//��й�ȣ ã��
		Image icon1 = new ImageIcon("Images/��й�ȣ ã��.PNG").getImage().getScaledInstance(110, 50, 0);
		JLabel PW1 = new JLabel(new ImageIcon(icon1));
		PW1.setLocation(140, 50);
		PW1.setSize(100,100);
		
		//copyRights
		JLabel copyRights = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		copyRights.setBounds(50, 600, 400, 50);
		copyRights.setFont(new Font("���", Font.BOLD, 13));

		//����
		JLabel mesege1 = new JLabel("���̵� : ");
		mesege1.setBounds(30, 150, 250, 200);
		mesege1.setFont(new Font("���", Font.BOLD, 15));

		//���̵� �ؽ�Ʈâ
		JTextField IDText = new JTextField();
		IDText.setBounds(100, 230, 170, 40);
		IDText.setFont(new Font("���", Font.BOLD, 15));
		IDText.setHorizontalAlignment(JTextField.LEFT);
		
		JLabel mesege2 = new JLabel("<html> ���̵�� �̸��� �ּҸ� �Է��ϼ���.<br/> �̸��Ϸ� ��й�ȣ�� ���۵˴ϴ�. <html/>");
		mesege2.setBounds(70, 80, 260, 200);
		mesege2.setFont(new Font("���", Font.BOLD, 15));
		
		JLabel mesege3 = new JLabel("�̸��� : ");
		mesege3.setBounds(30, 200, 250, 200);
		mesege3.setFont(new Font("���", Font.BOLD, 15));

		
		JTextField EmailText = new JTextField();
		EmailText.setBounds(100, 280, 170, 40);
		EmailText.setFont(new Font("���", Font.BOLD, 15));
		EmailText.setHorizontalAlignment(JTextField.LEFT);

		//ID�߼� ��ư
		JButton btnSend = new JButton("�߼�");
		btnSend.setBounds(280, 280, 85, 40);
		btnSend.setForeground(new Color(255, 255, 225));
		btnSend.setBackground(new Color(36, 107, 220));
		btnSend.setFont(new Font("���", Font.BOLD, 15));
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PassMail mm = new PassMail();
				boolean check = mc.correctEmail(IDText.getText(), EmailText.getText());
				
				if(check == false) {
					JOptionPane.showMessageDialog(null, "���̵�� �̸����ּҰ� ��ġ���� �ʽ��ϴ�.");
				}else {
					String[]args1 = {" "};
					JOptionPane.showMessageDialog(null, "�ӽ� ��й�ȣ�� �߼۵Ǿ����ϴ�.");
					mm.getEmailAddress(EmailText.getText());
					mm.main(args1);
					mc.setUserPass(IDText.getText());
				}
				
				
			}
		});

		//���ư��� ��ư
		JButton btnBack = new JButton("���ư���");
		btnBack.setBounds(130, 360, 110, 50);
		btnBack.setForeground(new Color(255, 255, 225));
		btnBack.setBackground(new Color(36, 107, 220));
		btnBack.setFont(new Font("���", Font.BOLD, 15));
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, login_FindPW, new Login_MainPage(mf));
			}
		});

		//��������
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
