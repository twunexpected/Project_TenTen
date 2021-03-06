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

import com.kh.project_TenTen.model.dao.MemberDao;
 
public class AddWord extends JPanel{
	private Login_MainFrame mf;
	private JPanel addWord;

	public AddWord(Login_MainFrame mf) {
		this.mf = mf;
		addWord = this;
		//프레임
		/*	
			this.setBounds(650, 100, 400, 700);
			this.setLayout(null);*/
		//배경 패널

		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));

		//단어 추가 라벨
		JLabel lb3 = new JLabel("단어추가 ");
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setForeground(Color.white);
		lb3.setLocation(110, 5);
		lb3.setSize(230, 50);
		lb3.setFont(new Font("고딕",Font.BOLD,20));
		lb3.setOpaque(true);
		lb3.setBackground(new Color(36, 107, 220));
		this.add(lb3);
		//체크리스트
		JLabel lb4 = new JLabel("주제  ");
		lb4.setLocation(110, 150);
		lb4.setSize(120, 50);
		lb4.setFont(new Font("고딕",Font.BOLD,18));
		this.add(lb4);
		String[] list = {" 여행", " 스포츠", " 요리"," 회사 "," 예술"," 경제"};
		JComboBox mainList = new JComboBox(list);
		mainList.setSelectedIndex(0);
		mainList.setLocation(160, 150);
		mainList.setSize(170, 50);
		mainList.setFont(new Font("배달의민족 주아",Font.BOLD,15));
		this.add(mainList);
		//품사
		JLabel lb5 = new JLabel("품사  ");
		lb5.setLocation(110, 230);
		lb5.setSize(120, 50);
		lb5.setFont(new Font("고딕",Font.BOLD,18));
		this.add(lb5);
		String[] list1 = {" 명사", " 대명사", " 동사"," 형용사"," 부사"," 전치사"," 접속사"," 감탄사"};
		JComboBox subList = new JComboBox(list1);
		subList.setSelectedIndex(0);
		subList.setLocation(160, 230);
		subList.setSize(170, 50);
		subList.setFont(new Font("고딕",Font.BOLD,15));
		this.add(subList);
		//단어
		JLabel lb1 = new JLabel("단어  ");
		lb1.setLocation(110, 310);
		lb1.setSize(120, 50);
		lb1.setFont(new Font("고딕",Font.BOLD,18));
		this.add(lb1);
		JTextField tf = new JTextField();
		tf.setLocation(160, 310);
		tf.setSize(170, 50);
		this.add(tf);
		//뜻
		JLabel lb2 = new JLabel("뜻  ");
		lb2.setLocation(120, 390);
		lb2.setSize(120, 50);
		lb2.setFont(new Font("고딕",Font.BOLD,18));
		this.add(lb2);
		JTextField tf1 = new JTextField();
		tf1.setLocation(160, 390);
		tf1.setSize(170, 50);
		this.add(tf1);
		//등록버튼
		JButton b1 = new JButton("등록");
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setForeground(Color.white);
		b1.setFont(new Font("고딕",Font.BOLD,17));
		b1.setBackground(new Color(36, 107, 220));
		b1.setBounds(200, 500, 70, 50);
		this.add(b1);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BufferedWriter bo = null;
				try{
					bo = new BufferedWriter(new FileWriter(MemberDao.loginMember.getId()+"단어추가.txt", true));
					bo.write((String) mainList.getSelectedItem()+"/");
					bo.write((String) subList.getSelectedItem()+"/");
					bo.write(tf.getText()+"/");
					bo.write(tf1.getText()+"/");

					
					
					bo.close();
			    } catch (Exception ex) { 
			  
			 } 
				tf.setText("");
				tf1.setText("");
					 JOptionPane.showMessageDialog(null, "입력하신 단어가 저장되었습니다."); 
			}
		});
		//좌측 고정
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
		this.add(btnLeft1);
		btnLeft1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, addWord, new MainPage(mf));
			}

		});
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);
		btnLeft2.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            try {
	               ChangePanel.changePanel(mf, addWord, new MyWord1(mf));            
	            } catch (NullPointerException e1) {
	               JOptionPane.showMessageDialog(null, "단어를 먼저 학습하세요~♥");
	            }
	         }

	      });

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft4);
		btnLeft4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, addWord, new Test_Main(mf));
			}

		});
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft5);	      
		btnLeft5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Test_OxTest.index>=10) {
					ChangePanel.changePanel(mf, addWord, new Test_TestPopup(mf));
				}else {
					ChangePanel.changePanel(mf, addWord, new Test_Main(mf));
				}
			}

		});


		//카피라이터
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);		
		naming.setFont(new Font("고", Font.BOLD, 13));
		//this.setLayout(null);
		this.add(naming);
		mf.add(this);   


	}




}
