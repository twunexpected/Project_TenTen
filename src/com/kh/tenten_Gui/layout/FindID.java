package com.kh.tenten_Gui.layout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindID extends JFrame{
	public FindID() {
		super("NULL");

		
		
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);

		//�� ȭ��
		JPanel panelBack = new JPanel();
		panelBack.setSize(400, 700);
		panelBack.setBackground(new Color(123, 185, 237));
		panelBack.setLayout(null);

		//���̵� ã��
		Image icon1 = new ImageIcon("Imege/���̵� ã��.PNG").getImage().getScaledInstance(150, 60, 0);
		JLabel Id1 = new JLabel(new ImageIcon(icon1));
		Id1.setBounds(100, 100, 170, 100);

		//copyRights
				JLabel copyRights = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
				copyRights.setBounds(60, 600, 400, 50);
				copyRights.setFont(new Font("���", Font.BOLD, 13));
				this.setLayout(null);
				
				
				
		//����
		
		JLabel mesege1 = new JLabel("�̸��� : ");
		mesege1.setBounds(30, 270, 250, 200);
		mesege1.setFont(new Font("���", Font.BOLD, 15));
		this.setLayout(null);
		
		JLabel mesege2 = new JLabel("<html> �̸��� �ּҸ� �Է��ϼ���.<br/> �̸��Ϸ� ID�� ���۵˴ϴ�. <html/>");
		mesege2.setBounds(90, 150, 250, 200);
		mesege2.setFont(new Font("���", Font.BOLD, 15));
		this.setLayout(null);

		//�̸��� �ؽ�Ʈâ
		JTextField EmailText = new JTextField();
		EmailText.setBounds(100, 350, 170, 40);
		EmailText.setFont(new Font("���", Font.BOLD, 15));
		EmailText.setHorizontalAlignment(JTextField.LEFT);
		this.setLayout(null);
		
		//ID�߼� ��ư
		JButton btnSend = new JButton("ID�߼�");
		btnSend.setBounds(280, 350, 85, 40);
		btnSend.setForeground(new Color(255, 255, 225));
		btnSend.setBackground(new Color(36, 107, 220));
		btnSend.setFont(new Font("���", Font.BOLD, 15));
		this.setLayout(null);

		//���ư��� ��ư
		JButton btnBack = new JButton("���ư���");
		btnBack.setBounds(130, 470, 110, 50);
		btnBack.setForeground(new Color(255, 255, 225));
		btnBack.setBackground(new Color(36, 107, 220));
		btnBack.setFont(new Font("���", Font.BOLD, 15));
		this.setLayout(null);

		//��������

		this.add(mesege1);
		this.add(mesege2);
		this.add(btnBack);
		this.add(btnSend);
		this.add(EmailText);
		panelBack.add(Id1);
		this.add(copyRights);
		this.add(panelBack);
		
		btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                  BufferedWriter bo = new BufferedWriter(new FileWriter("�ܾ��߰�.dat"));
                  
                  bo.close();
                 } catch (Exception ex) { 
               
              } 

                   JOptionPane.showMessageDialog(null, "���̵� ���۵Ǿ����ϴ�."); 
            }
         });

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}