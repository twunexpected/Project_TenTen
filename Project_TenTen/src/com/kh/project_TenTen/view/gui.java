package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class gui extends JFrame {
	public gui() {
	 super("NULL");
	 
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);
		//백 화면
	      JPanel panelBack = new JPanel();
	      panelBack.setSize(400, 700);
	      panelBack.setBackground(new Color(123, 185, 237));
	  	  this.setLayout(null);
	  	  
	      //상단 패널
	  	JPanel panelTitle = new JPanel();
		panelTitle.setBounds(130, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);
		//상단 박스
		JLabel lableTitle = new JLabel("단어 Test");
		lableTitle.setBounds(180, 0, 100, 50);
		lableTitle.setForeground(new Color(255, 255, 225));
		lableTitle.setFont(new Font("Serif", Font.BOLD, 24));
		this.setLayout(null);
		
	  	//본문
			JLabel labelCenter = new JLabel("Test 조건을 충족하였습니다.");
			labelCenter.setLocation(120, 220);
			labelCenter.setSize(220, 100);
			labelCenter.setFont(new Font("Serif", Font.BOLD, 16));
			this.setLayout(null);
			
	
			JButton btnCenter = new JButton("TEST 시작");
			btnCenter.setBounds(150, 300, 150, 50);
			btnCenter.setForeground(new Color(255, 255, 225));
			btnCenter.setBackground(new Color(36, 107, 220));
			btnCenter.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
		
	//좌측 
			
			JPanel panelLeft1 = new JPanel();
			panelLeft1.setBounds(0,120, 80, 10);
			panelLeft1.setBackground(new Color(255, 255, 255));
			this.setLayout(null);
			
			JPanel panelLeft2= new JPanel();
			panelLeft2.setBounds(0, 250, 80, 10);
			panelLeft2.setBackground(new Color(255, 255, 255));
			this.setLayout(null);
			
			JPanel panelLeft3 = new JPanel();
			panelLeft3.setBounds(0, 380, 80, 10);
			panelLeft3.setBackground(new Color(255, 255, 255));
			this.setLayout(null);
			
			JPanel panelLeft4  = new JPanel();
			panelLeft4.setBounds(0, 510, 80, 10);
			panelLeft4.setBackground(new Color(255, 255, 255));
			this.setLayout(null);
		
			//좌측  텍스트 박스
			final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
			btnLeft1.setBounds(0, 0, 80, 120);
			btnLeft1.setForeground(new Color(255, 255, 225));
			btnLeft1.setBackground(new Color(36, 107, 220));
			btnLeft1.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
			
			final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
			btnLeft2.setBounds(0, 130, 80, 120);
			btnLeft2.setForeground(new Color(255, 255, 225));
			btnLeft2.setBackground(new Color(36, 107, 220));
			btnLeft2.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
			
			final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
			btnLeft3.setBounds(0, 260, 80, 120);
			btnLeft3.setForeground(new Color(255, 255, 225));
			btnLeft3.setBackground(new Color(36, 107, 220));
			btnLeft3.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
			
			final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
			btnLeft4.setBounds(0, 390, 80, 120);
			btnLeft4.setForeground(new Color(255, 255, 225));
			btnLeft4.setBackground(new Color(36, 107, 220));
			btnLeft4.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
			
			final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
			btnLeft5.setBounds(0, 520, 80, 135);
			btnLeft5.setForeground(new Color(255, 255, 225));
			btnLeft5.setBackground(new Color(36, 107, 220));
			btnLeft5.setFont(new Font("Serif", Font.BOLD, 20));
			this.setLayout(null);
			
			btnCenter.addActionListener(new ActionListener() {//익명
				@Override
				public void actionPerformed(ActionEvent e) {
					Page1 f2 = new Page1();
				}
			});
			
			this.add(btnLeft1);
			this.add(btnLeft2);
			this.add(btnLeft3);
			this.add(btnLeft4);
			this.add(btnLeft5);
			
			this.add(panelLeft1);
			this.add(panelLeft2);
			this.add(panelLeft3);
			this.add(panelLeft4); 
			
		  this.add(labelCenter);
		  this.add(btnCenter);
	      this.add(lableTitle);
		  this.add(panelTitle);
	      this.add(panelBack);
	      
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
		
		


//좌측 패널
/*   JPanel panelLeft1 = new JPanel();
		         panelLeft1.setBounds(0, 0, 60, 120);
		         panelLeft1.setBackground(new Color(36, 107, 220));
		         this.setLayout(null);
		         
		         JPanel panelLeft2= new JPanel();
		         panelLeft2.setBounds(0, 130, 60, 120);
		         panelLeft2.setBackground(new Color(36, 107, 220));
		         this.setLayout(null);
		         
		         JPanel panelLeft3 = new JPanel();
		         panelLeft3.setBounds(0, 260, 60, 120);
		         panelLeft3.setBackground(new Color(36, 107, 220));
		         this.setLayout(null);
		         
		         JPanel panelLeft4 = new JPanel();
		         panelLeft4.setBounds(0, 390, 60, 120);
		         panelLeft4.setBackground(new Color(36, 107, 220));
		         this.setLayout(null);
		         
		         JPanel panelLeft5 = new JPanel();
		         panelLeft5.setBounds(0, 520, 60, 135);
		         panelLeft5.setBackground(new Color(36, 107, 220));
		         this.setLayout(null);*/ //삭제예정

/*   this.add(panelLeft1);
	         this.add(panelLeft2);
	         this.add(panelLeft3);
	         this.add(panelLeft4);
	         this.add(panelLeft5);*/