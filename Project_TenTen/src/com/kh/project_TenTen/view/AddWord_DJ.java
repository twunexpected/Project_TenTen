package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddWord_DJ extends JPanel{
	private MainFrame mf;
	

	public AddWord_DJ(MainFrame mf) {
		this.mf = mf;
	//������
	/*	
			this.setBounds(650, 100, 400, 700);
			this.setLayout(null);*/
			//��� �г�
			JPanel jp = new JPanel();
			jp.setSize(400, 700);
			jp.setLayout(null);
			jp.setBackground(new Color(123, 185, 237));
				
			//�ܾ� �߰� ��
			JLabel lb3 = new JLabel("�ܾ��߰� ");
			lb3.setHorizontalAlignment(JLabel.CENTER);
			lb3.setForeground(Color.white);
			lb3.setLocation(105, 0);
			lb3.setSize(230, 50);
			lb3.setFont(new Font("����",Font.BOLD,20));
			lb3.setOpaque(true);
			lb3.setBackground(new Color(36, 107, 220));
			jp.add(lb3);
			//üũ����Ʈ
			JLabel lb4 = new JLabel("����  ");
			lb4.setLocation(110, 150);
			lb4.setSize(120, 50);
			lb4.setFont(new Font("����",Font.BOLD,18));
			jp.add(lb4);
			String[] list = {"     ����", "     ������", "     �丮","     ����Ͻ�","     ����","     ����"};
			JComboBox mainList = new JComboBox(list);
			mainList.setSelectedIndex(0);
			mainList.setLocation(160, 150);
			mainList.setSize(170, 50);
			mainList.setFont(new Font("����",Font.BOLD,15));
			jp.add(mainList);
			//ǰ��
			JLabel lb5 = new JLabel("ǰ��  ");
			lb5.setLocation(110, 230);
			lb5.setSize(120, 50);
			lb5.setFont(new Font("����",Font.BOLD,18));
			jp.add(lb5);
			String[] list1 = {"      ����", "      �����", "      ����","      �����","      �λ�","      ��ġ��","      ���ӻ�","      ��ź��"};
			JComboBox subList = new JComboBox(list1);
			subList.setSelectedIndex(0);
			subList.setLocation(160, 230);
			subList.setSize(170, 50);
			subList.setFont(new Font("����",Font.BOLD,15));
			jp.add(subList);
			//�ܾ�
			JLabel lb1 = new JLabel("�ܾ�  ");
			lb1.setLocation(110, 310);
			lb1.setSize(120, 50);
			lb1.setFont(new Font("����",Font.BOLD,18));
			jp.add(lb1);
			JTextField tf = new JTextField();
			tf.setLocation(160, 310);
			tf.setSize(170, 50);
			jp.add(tf);
			//��
			JLabel lb2 = new JLabel("��  ");
			lb2.setLocation(120, 390);
			lb2.setSize(120, 50);
			lb2.setFont(new Font("����",Font.BOLD,18));
			jp.add(lb2);
			JTextField tf1 = new JTextField();
			tf1.setLocation(160, 390);
			tf1.setSize(170, 50);
			jp.add(tf1);
			//��Ϲ�ư
			JButton b1 = new JButton("���");
			b1.setHorizontalAlignment(JLabel.CENTER);
			b1.setForeground(Color.white);
			b1.setFont(new Font("����",Font.BOLD,17));
			b1.setBackground(new Color(36, 107, 220));
			b1.setBounds(200, 500, 70, 50);
			jp.add(b1);
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try{
						BufferedWriter bo = new BufferedWriter(new FileWriter("�ܾ��߰�.dat"));
						
						bo.write(tf.getText()+"/");
						bo.write(tf1.getText()+"/\n");
						
						bo.close();
			        } catch (Exception ex) { 
			      
			     } 

						 JOptionPane.showMessageDialog(null, "�Է��Ͻ� �ܾ ����Ǿ����ϴ�."); 
				}
			});
			//���� ����
			  final JButton btnLeft1 = new JButton("<html>����<br/>ȭ��</html>");
		      btnLeft1.setBounds(0, 0, 80, 120);
		      btnLeft1.setForeground(new Color(255, 255, 225));
		      btnLeft1.setBackground(new Color(36, 107, 220));
		      btnLeft1.setFont(new Font("����", Font.BOLD, 20));
		      jp.add(btnLeft1);
			  JPanel panelLeft1 = new JPanel();
		      panelLeft1.setBounds(0,120, 80, 10);
		      panelLeft1.setBackground(new Color(255, 255, 255));
		   	  jp.add(panelLeft1);
		      
		      final JButton btnLeft2 = new JButton("<html>����<br/>�ܾ�</html>");
		      btnLeft2.setBounds(0, 130, 80, 120);
		      btnLeft2.setForeground(new Color(255, 255, 225));
		      btnLeft2.setBackground(new Color(36, 107, 220));
		      btnLeft2.setFont(new Font("����", Font.BOLD, 20));
		      jp.add(btnLeft2);
		      JPanel panelLeft2= new JPanel();
		      panelLeft2.setBounds(0, 250, 80, 10);
		      panelLeft2.setBackground(new Color(255, 255, 255));
		      jp.add(panelLeft2);
		      btnLeft2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.changePanel(mf, jp, new MyWord1_DJ(mf));
				}

			});

		      
		      final JButton btnLeft3 = new JButton("<html>�ܾ�<br/>�߰�</html>");
		      btnLeft3.setBounds(0, 260, 80, 120);
		      btnLeft3.setForeground(new Color(255, 255, 225));
		      btnLeft3.setBackground(new Color(36, 107, 220));
		      btnLeft3.setFont(new Font("����", Font.BOLD, 20));
		      jp.add(btnLeft3);
		      JPanel panelLeft3 = new JPanel();
		      panelLeft3.setBounds(0, 380, 80, 10);
		      panelLeft3.setBackground(new Color(255, 255, 255));
		      jp.add(panelLeft3);
		      
		      final JButton btnLeft4 = new JButton("<html>�ܾ�<br/>TEST</html>");
		      btnLeft4.setBounds(0, 390, 80, 120);
		      btnLeft4.setForeground(new Color(255, 255, 225));
		      btnLeft4.setBackground(new Color(36, 107, 220));
		      btnLeft4.setFont(new Font("����", Font.BOLD, 20));
		      jp.add(btnLeft4);
		      JPanel panelLeft4  = new JPanel();
		      panelLeft4.setBounds(0, 510, 80, 10);
		      panelLeft4.setBackground(new Color(255, 255, 255));
		      jp.add(panelLeft4);
		      
		      final JButton btnLeft5 = new JButton("<html>����<br/>����</html>");
		      btnLeft5.setBounds(0, 520, 80, 135);
		      btnLeft5.setForeground(new Color(255, 255, 225));
		      btnLeft5.setBackground(new Color(36, 107, 220));
		      btnLeft5.setFont(new Font("����", Font.BOLD, 20));
		      jp.add(btnLeft5);


			//ī�Ƕ�����
			 JLabel naming = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		     naming.setBounds(100, 600, 400, 50);
		     //naming.setForeground(new Color(255, 255, 225));
		     naming.setFont(new Font("����", Font.BOLD, 12));
		     jp.add(naming);
			//������
			//this.setVisible(true);
			mf.add(jp);	
			/*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/


		}



	
}