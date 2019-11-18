package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project_TenTen.controller.UZ_Manager;

public class MainPage extends JPanel {

	private Login_MainFrame mf;
	private JPanel MainPage;

	public MainPage(Login_MainFrame mf) {
		this.mf = mf;
		MainPage = this;

		UZ_Manager um = new UZ_Manager();
		// ������ 
		//		super("���� ���� ������");
		//		this.setBounds(650, 100, 400, 700);
		//		this.setLayout(null);



		//���������� ��ư
		JButton btn = new JButton("����������");
		btn.setSize(120, 45);
		btn.setLocation(260, 20);
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(36, 107, 220));
		btn.setFont(new Font("���",Font.PLAIN,12));
		btn.setPreferredSize(new Dimension(120, 45));

		/////�������� �ܾ� 10�� ���ִ°� �ӽ� ��ư///////
		//�丮���ù�ư
//		JPanel subjectTest = new JPanel();
//		subjectTest.setSize(100, 30);
//		subjectTest.setLocation(140,50);
//		subjectTest.setBackground(new Color(123, 185, 237));
//		JButton subjectTestLab = new JButton("   ��������");
//		subjectTest.add(subjectTestLab);
//		this.add(subjectTest);
		
		//�����޺��ڽ�
		String[] Subject = {"��������","�丮","������","����","�����Ͻ�","����","����"};
		JComboBox subList = new JComboBox(Subject);
		subList.setLocation(185,120);
		subList.setSize(80,50);
		subList.setSelectedIndex(0);
		JLabel sLabel = new JLabel();
		sLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(subList);


		//���� �� �ؽ�
//		JTextField sectionText = new JTextField("  ����");
//		sectionText.setSize(80, 50);
//		sectionText.setLocation(185, 120);
//		sectionText.setBackground(new Color(123, 185, 237));
//		sectionText.setFont(new Font("���",Font.PLAIN,20));
//		sectionText.setPreferredSize(new Dimension(80, 50));

	

		

		//�ܾ� �ؽ�
		JTextField wordText = new JTextField(" �� ��");
		wordText.setSize(240, 90);
		wordText.setLocation(105, 180);
		wordText.setBackground(new Color(123, 185, 237));
		wordText.setFont(new Font("���",Font.BOLD,80));
		wordText.setPreferredSize(new Dimension(240, 90));

		
	
		subList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				//Object value = subList.getSelectedItem();
				JComboBox cb = (JComboBox)e.getSource();
				if(cb.getSelectedItem().equals("�丮")) {
				//	UZ_Manager um = new UZ_Manager();
					wordText.setText(um.CookWord()[0]);
				}else if(cb.getSelectedItem().equals("������")) {
				//	UZ_Manager um = new UZ_Manager();
					wordText.setText(um.sportsWord());
				}
			}
		}); 
		//�ϱ� ��ư
		JButton arm = new JButton("�ϱ�");
		arm.setSize(105, 60);
		arm.setLocation(105,390);
		arm.setForeground(Color.WHITE);
		arm.setPreferredSize(new Dimension(105, 60));
		arm.setBackground(new Color(36, 107, 220));

		
		arm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(subList.getSelectedItem().equals("�丮")) {
				
					wordText.setText(um.CookWord()[0]);
			}
			}
		});
		

		//��ϱ��ư
		JButton beearm = new JButton("��ϱ�");
		beearm.setSize(105, 60);
		beearm.setLocation(240, 390);
		beearm.setForeground(Color.WHITE);
		beearm.setPreferredSize(new Dimension(105, 60));
		beearm.setBackground(new Color(36, 107, 220));



		//ī�� �ؽ�
		JTextField countnum = new JTextField("�Է°�");
		countnum.setBackground(new Color(123, 185, 237));
		countnum.setSize(60, 50);
		countnum.setLocation(165, 460);
		countnum.setFont(new Font("���",Font.PLAIN,15));
		countnum.setPreferredSize(new Dimension(60, 50));


		// " /10 "
		JLabel countMax = new JLabel("/ 10");
		countMax.setBackground(new Color(123, 185, 237));
		countMax.setSize(50, 40);
		countMax.setLocation(225, 465);
		countMax.setFont(new Font("���",Font.PLAIN,20));
		//	���� ����� ���� �Ƚᵵ �гο� �ڵ� ����.



		this.add(countMax);
		this.add(btn);
		this.add(arm);
		this.add(beearm);
		//this.add(sectionText);
		this.add(wordText);
		this.add(countnum);


		//ī�Ƕ���
		JLabel naming = new JLabel("Copyrights ��  ��!������ All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("��", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//���
		//		JPanel jp = new JPanel();
		//		jp.setSize(400, 700);
		//		jp.setLayout(null);
		//		jp.setBackground(new Color(123, 185, 237));
		//		mf.add(this);   
		//		this.setBounds(600, 100, 400, 700);

		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);   

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//���� �޴�
		final JButton btnLeft1 = new JButton("<html>����<br/>ȭ��</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("���",Font.BOLD,20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>����<br/>�ܾ�</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("���",Font.BOLD,20));
		this.add(btnLeft2);
		btnLeft2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new MyWord1(mf));
			}

		});
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);


		final JButton btnLeft3 = new JButton("<html>�ܾ�<br/>�߰�</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("���",Font.BOLD,20));
		this.add(btnLeft3);
		btnLeft3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new AddWord(mf));
			}

		});
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>�ܾ�<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("���",Font.BOLD,20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);



		final JButton btnLeft5 = new JButton("<html>����<br/>����</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("���",Font.BOLD,20));
		this.add(btnLeft5);




		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new  MyPage(mf));				
			}

		});


		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new SeoungJang(mf));
			}

		});



		//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//		this.setVisible(true);

	}



}









