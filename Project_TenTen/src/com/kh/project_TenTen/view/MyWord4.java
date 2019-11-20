package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MyWord4 extends JPanel {
	private Login_MainFrame mf;	
	private JPanel MyWord4;
	private String[][] data;
	public MyWord4(Login_MainFrame mf) {
		this.mf = mf;
		MyWord4 = this;
		
		//기본패널
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		//표
		String[] headings = new String[] {"품사","단어","뜻"};
		String s; 
		String[] arr = null; 
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader("즐겨찾기 단어.txt"));
		} catch (FileNotFoundException e1) {

		} 
		try {
			while ((s = br.readLine()) != null) { 
				arr = s.split("/");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int ar = arr.length/3;
		int a =0;

		data = new String[ar][3];

		for(int i=0; i<ar; i++) {
			for(int j =0; j<3;j++) {
				data[i][j]=arr[a];
				a++;
				if(a==	arr.length) {
					break ;
				}
			}
		}
		DefaultTableModel model = new DefaultTableModel(data,headings);
		JTable table = new JTable(model);
		table.setFillsViewportHeight(true);
		table.setRowHeight(25);
		table.getColumn("품사").setPreferredWidth(15);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds( 105, 105, 250, 490); // x, y, width, height
		this.add(scroll);
		//암기 비암기 버튼
		JButton b1 = new JButton("암기");
		b1.setHorizontalAlignment(JLabel.CENTER);
		b1.setForeground(Color.white);
		b1.setFont(new Font("고딕",Font.BOLD,17));
		b1.setBackground(new Color(36, 107, 220));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new MyWord1(mf));
			}
		});
		JButton b2 = new JButton("비암기");
		b2.setHorizontalAlignment(JLabel.CENTER);
		b2.setForeground(Color.white);
		b2.setFont(new Font("고딕",Font.BOLD,15));
		b2.setBackground(new Color(36, 107, 220));
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new MyWord2(mf));
			}
		});
		JButton b3 = new JButton("나의단어");
		b3.setHorizontalAlignment(JLabel.CENTER);
		b3.setForeground(Color.white);
		b3.setFont(new Font("고딕",Font.BOLD,15));
		b3.setBackground(new Color(36, 107, 220));	
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new MyWord3(mf));
			}
		});
		JButton b4 = new JButton("즐겨찾기");
		b4.setHorizontalAlignment(JLabel.CENTER);
		b4.setForeground(Color.white);
		b4.setFont(new Font("고딕",Font.BOLD,15));
		b4.setBackground(new Color(225, 91, 91));
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new MyWord4(mf));
			}
		});
		JButton b5 = new JButton("X");
		b5.setHorizontalAlignment(JLabel.CENTER);
		b5.setForeground(Color.yellow);
		b5.setFont(new Font("고딕",Font.BOLD,30));
		b5.setBackground(new Color(123, 185, 237));
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				//int row=table.getSelectedRow();//사용자가 선택한 행
				model.removeRow(table.getSelectedRow());
				JOptionPane.showMessageDialog(null, "선택하신 단어가 삭제되었습니다.");
				
						BufferedWriter bo = null;
						//BufferedWriter bo1 = null;
						try{
							bo = new BufferedWriter(new FileWriter("즐겨찾기 단어.txt"));
							bo.write("");
							//int row=table.getSelectedRow();//사용자가 선택한 행
							//int col = table.getSelectedColumn();
							//Object value = table.getValueAt(row, 0)+"/"+table.getValueAt(row, 1)+"/"+table.getValueAt(row, 2)+"/"+table.getValueAt(row, 3)+"/";
							bo = new BufferedWriter(new FileWriter("즐겨찾기 단어.txt",true));
							int row =table.getRowCount();
							int col = table.getColumnCount();
							System.out.println(row);
							System.out.println(col);
							System.out.println(table.getValueAt(0,1));
							for(int i=0;i<row;i++) {
								for(int j=0; j<col;j++) {
							bo.write((String) table.getValueAt(i, j)+"/");
									;
								}
							}
							bo.close();
					    } catch (Exception ex) { 
					  
					 } 
						//바뀐건지 읽어서 확인해보기
						/*String s;
						BufferedReader br= null;
						try {
							br = new BufferedReader(new FileReader("즐겨찾기 단어.txt"));
						} catch (FileNotFoundException e1) {

						} 
						try {
							while ((s = br.readLine()) != null) { 
								System.out.println(s);
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}*/

			}
				});
			
				//File f = new File("즐겨찾기.txt");
				//f.delete();
			
			/*	try {
					bo= new BufferedWriter(new FileWriter("즐겨찾기 단어.txt"));
					bo.close();
				} catch (IOException e1) {
			
					e1.printStackTrace();
				}*/
				/*String dummy = "";
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("즐겨찾기 단어.txt")));
					//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
					
					//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
					String line;
					for(int i=0; i<position; i++) {
					    line = br.readLine(); //읽으며 이동
					    dummy += (line); 
					}
					
					//2. 삭제하고자 하는 데이터는 건너뛰기
					String delData = br.readLine();
					Log.d("mstag","삭제되는 데이터 = "+delData);
					
					//3. 삭제하고자 하는 position 이후부터 dummy에 저장
					while((line = br.readLine())!=null) {
						dummy += (line + "\r\n" ); 
					}
					
					//4. FileWriter를 이용해서 덮어쓰기
					FileWriter fw = new FileWriter("즐겨찾기 단어.txt");
					fw.write(dummy);			
					
					//bw.close();
					fw.close();
					br.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
*/

				
	
		b1.setBounds(100, 20, 100, 35);
		b2.setBounds(210, 20, 100, 35);
		b3.setBounds(100, 65, 100, 35);	
		b4.setBounds(210, 65, 100, 35);	
		b5.setBounds(310, 20, 70, 80);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		//좌측 고정
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.add(panelLeft1);
		btnLeft1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new MainPage(mf));
			}
		});

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
		btnLeft3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new AddWord(mf));
			}
		});

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);
		btnLeft4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new Test_Main(mf));
			}
		});

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		this.add(btnLeft5);
		btnLeft5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MyWord4, new SeoungJang(mf));
			}
		});
		//카피라이터
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(100, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고딕", Font.BOLD, 12));
		this.add(naming);
		mf.add(this);

	}
}





