package com.kh.project_TenTen.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.*;

public class Test_Select4 extends JPanel{


	WordDao wd = new WordDao();
	String[] wordStr1 = null;//단어 스펠링
	String[] wordStr2 = null;//뜻
	String[] spellStr = null;	//단어 스펠링
	String[] meanStr = null;	//뜻
	
	static int index =0 ; //클릭값
	int answer = 0; //정답받는 값
	
	public static Word[] word = null; //단어 객체 받는값
	
/*	String[] strArr1 =null;
	String[] strArr2 =null;*/
	

	private Login_MainFrame mf;
	private JPanel Test_Select4;
	

	
	int change =100; // TextArea값비교값

	
	public Word[] objectTest(int num) {
		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];
		
		//읽어온 단어 객체에 넣기
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}
		
		ArrayList shuffleList = new ArrayList(Arrays.asList(word));
		Collections.shuffle(shuffleList);
		
		for (int i = 0; i < word.length; i++) {
			word[i] = (Word) shuffleList.get(i);
		}
		
		return word;
	}
	
	
	public int returnSubject(String returnsubject) {
		int num = 0;

		switch(returnsubject) {
		case "요리" : break;
		case "스포츠" : num = 1; break;
		case "여행" : num = 2; break;
		case "비지니스" : num = 3; break;
		case "경제" : num = 4; break;
		case "예술" : num = 5; break;
		}

		return num;
	}


	

	
	
	
	
	
/*	public String[] spellTest(int num) {

		
		
		
		
		ArrayList wordList = wd.readWord(num);
		Word[] word = new Word[wordList.size()];
		word = objectTest(returnSubject(MainPage.subjectWord));
		String[] strArr1 = new String[10];

	

		//읽어온 단어 객체에 넣기
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}

		
		//객체에 있는 배열에 저장
		for(int i = 0; i < strArr1.length; i++) {
			strArr1[i] = word[i].getSpelling();
		}
		

		return strArr1;
	
	}

	public String[] meanTest(int num) {
		ArrayList wordList = wd.readWord(num);
		
		Word[] word = new Word[wordList.size()];
		word = objectTest(returnSubject(MainPage.subjectWord));
		
		String[] strArr2 = new String[10];

	

		//읽어온 단어 객체에 넣기
		for(int i = 0; i < wordList.size(); i++) {
			word[i] = (Word) wordList.get(i);
		}

		
		//객체에 있는 배열에 저장
		for(int i = 0; i < strArr2.length; i++) {
			strArr2[i] = word[i].getMean();
		}
		

		return strArr2;
	
	}*/
	






	public Test_Select4(Login_MainFrame mf) {
		
		int checkSum =0;
		//MainPage 에서 선택한 주제 단어 호출
		word = objectTest(returnSubject(MainPage.subjectWord));

		spellStr = new String[10];
		meanStr = new String[10];

		for (int i = 0; i < word.length; i++) {
			spellStr[i] = word[i].getSpelling();
		}
		for (int i = 0; i < word.length; i++) {
			meanStr[i] = word[i].getMean();
		}
		

		
		/*
		spellStr = new String[10];
		meanStr = new String[10];
		
		for (int i = 0; i < word.length; i++) {
			spellStr[i] = word[i].getSpelling();
		}
		for (int i = 0; i < word.length; i++) {
			meanStr[i] = word[i].getMean();
		}
		*/
		
		
		
		

		
		
	/*	System.out.println(wordStr1[index]);
		System.out.println(wordStr1[index]);
		System.out.println(wordStr2[index]);
		System.out.println(wordStr2[index]);*/
		

		this.mf = mf;
		Test_Select4 = this;

		//백 화면
		this.setSize(400, 700);
		this.setBackground(new Color(123, 185, 237));
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
		btnLeft1.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);

		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕", Font.BOLD, 20));
		this.setLayout(null);




		//상단 제목 "단어 TEST"
		JLabel panelTitle = new JLabel("단어 Test");
		panelTitle.setHorizontalAlignment(JLabel.CENTER);
		panelTitle.setForeground(Color.white);
		panelTitle.setLocation(120, 5);
		panelTitle.setSize(230, 50);
		panelTitle.setFont(new Font("고딕",Font.BOLD,20));
		panelTitle.setOpaque(true);
		panelTitle.setBackground(new Color(36, 107, 220));


		/*//상단 제목 "단어 TEST"
		JLabel lbTop = new JLabel("단어 TEST");
		lbTop.setBounds(140, 0, 200, 50);
		lbTop.setSize(400, 45);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		this.setLayout(null);*/
		//			lbTop.setFont(new Font(" ", Font.BOLD, 10));

		// TEST 남은 단어 표시 -> JtextFiled 로 변경 !!!!!
		

		JLabel tfWord = new JLabel("1");
		tfWord.setBounds(195,145, 30, 30);
		tfWord.setFont(new Font("고딕",Font.BOLD,20));
		tfWord.setBackground(new Color(123, 185, 237));
		//tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		tfWord.setText(Integer.valueOf(index+1).toString());
		this.setLayout(null);


		JLabel lbNumber = new JLabel("/ 10");
		lbNumber.setBounds(230, 130, 60, 60);
		lbNumber.setBackground(new Color(123, 185, 237));
		lbNumber.setFont(new Font("고딕",Font.BOLD,20)); // 굵은 폰트
		//lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);

		//JtextField 로 변경 !!!!! 
		
		//단어 스펠링
		JLabel tfVoca = new JLabel();
		tfVoca.setBounds(80, 220, 320, 100);
		tfVoca.setFont(new Font("고딕",Font.BOLD,30)); // 굵은 폰트
		//tfVoca.setFont(tfVoca.getFont().deriveFont(45.0f));
		tfVoca.setHorizontalAlignment(JTextField.CENTER);
		tfVoca.setBackground(new Color(123, 185, 237));
		tfVoca.setText(spellStr[index]);
		this.setLayout(null);
		
		//번호
		JLabel lbcenter1 = new JLabel("①");
		lbcenter1.setBounds(80, 350, 30, 30);
		lbcenter1.setForeground(Color.BLACK);
		lbcenter1.setFont(new Font("고딕",Font.BOLD,25));
		this.setLayout(null);

		JLabel lbcenter2 = new JLabel("②");
		lbcenter2.setBounds(250, 350, 30, 30);
		lbcenter2.setForeground(Color.BLACK);
		lbcenter2.setFont(new Font("고딕",Font.BOLD,25));
		this.setLayout(null);

		JLabel lbcenter3 = new JLabel("③");
		lbcenter3.setBounds(80, 400, 30, 30);
		lbcenter3.setForeground(Color.BLACK);
		lbcenter3.setFont(new Font("고딕",Font.BOLD,25));
		this.setLayout(null);

		JLabel lbcenter4 = new JLabel("④");
		lbcenter4.setBounds(250, 400, 30, 30);
		lbcenter4.setForeground(Color.BLACK);
		lbcenter4.setFont(new Font("고딕",Font.BOLD,25));
		this.setLayout(null);

		// 단어 뜻
		JLabel tfsouth1 = new JLabel("단어1");
		tfsouth1.setBounds(110, 350, 100, 30);
		tfsouth1.setForeground(Color.BLACK);
		tfsouth1.setBackground(new Color(123, 185, 237));
		tfsouth1.setFont(new Font("고딕",Font.BOLD,15));; // 굵은 폰트
		tfsouth1.setHorizontalAlignment(JTextField.CENTER);
		tfsouth1.setText(meanStr[index]);
		this.setLayout(null);

		JLabel tfsouth2 = new JLabel("단어2");
		tfsouth2.setBounds(280, 350, 100, 30);
		tfsouth2.setForeground(Color.BLACK);
		tfsouth2.setBackground(new Color(123, 185, 237));
		tfsouth2.setFont(new Font("고딕", Font.BOLD, 15)); // 굵은 폰트
		tfsouth2.setHorizontalAlignment(JTextField.CENTER);
		tfsouth2.setText(meanStr[index+2]);
		this.setLayout(null);

		JLabel tfsouth3 = new JLabel("단어3");
		tfsouth3.setBounds(110, 400, 100, 30);
		tfsouth3.setForeground(Color.BLACK);
		tfsouth3.setBackground(new Color(123, 185, 237));
		tfsouth3.setFont(new Font("고딕", Font.BOLD, 15)); // 굵은 폰트	
		tfsouth3.setHorizontalAlignment(JTextField.CENTER);
		tfsouth3.setText(meanStr[index+3]);
		this.setLayout(null);

		JLabel tfsouth4 = new JLabel("단어4");
		tfsouth4.setBounds(280, 400, 100, 30);
		tfsouth4.setForeground(Color.BLACK);
		tfsouth4.setBackground(new Color(123, 185, 237));
		tfsouth4.setFont(new Font("고딕", Font.BOLD, 15)); // 굵은 폰트		
		tfsouth4.setHorizontalAlignment(JTextField.CENTER);
		tfsouth4.setText(meanStr[index+4]);
		this.setLayout(null);

		JLabel jbProblem = new JLabel("정답 입력 : ");
		jbProblem.setBounds(80, 450, 250, 50);
		jbProblem.setFont(new Font("고딕", Font.BOLD, 20)); // 굵은 폰트		
		this.setLayout(null);
         

		JTextArea tasouth1 = new JTextArea(); 
		tasouth1.setBounds(220, 460, 120, 30);
		tasouth1.setFont(new Font("고딕", Font.BOLD, 15)); // 굵은 폰트		
		tasouth1.setBackground(new Color(255, 255, 255));
	
		this.setLayout(null);
		
		/*function CheckStrLen(maxlen,field)
		 {
		   var temp; //들어오는 문자값...
		   var msglen;
		   msglen = maxlen*2;
		   var value= field.value;
		  
		   l =  field.value.length;
		   tmpstr = "" ;

		   if (l == 0)
		   {
		    value = maxlen*2;
		   }
		   else
		   {
		    for(k=0;k<l;k++)
		    {
		     temp =value.charAt(k);

		     if (escape(temp).length > 4)
		   msglen -= 2;
		     else
		   msglen--;
		   
		     if(msglen < 0)
		     {
		   alert("총 영문 "+(maxlen*2)+"자 한글 " + maxlen + "자 까지 보내실수 있습니다.");
		    field.value= tmpstr;
		   break;
		     }
		     else
		     {
		   tmpstr += temp;
		     }
		    }
		   }
		 }*/

		JButton btsouth1  = new JButton("다음");
		btsouth1.setBounds(180, 520, 100, 50);
		btsouth1.setFont(new Font("고딕", Font.BOLD, 20));
		btsouth1.setBackground(new Color(36, 107, 220));
		btsouth1.setForeground(Color.WHITE);
		this.setLayout(null);

	/*	JButton btsouth2  = new JButton("제출");
		btsouth2.setBounds(260, 450, 80, 30);
		btsouth2.setFont(new Font("고딕", Font.BOLD, 20));
		btsouth2.setBackground(new Color(36, 107, 220));
		btsouth2.setForeground(Color.WHITE);
		this.setLayout(null);*/
		
		//카피라이트
		JLabel naming = new JLabel("Copyrights ⓒ   비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		naming.setFont(new Font("고딕", Font.BOLD, 13));
		

		this.add(panelLeft1);
		this.add(panelLeft2);
		this.add(panelLeft3);
		this.add(panelLeft4); 
		this.add(btnLeft1);
		this.add(btnLeft2);
		this.add(btnLeft3);
		this.add(btnLeft4);
		this.add(btnLeft5);
		//this.add(btsouth2);
		this.add(jbProblem);
		this.add(naming);
		this.add(jbProblem);
		this.add(tfsouth4);
		this.add(tfsouth3);
		this.add(tfsouth2);
		this.add(tfsouth1);
		this.add(tasouth1);
		this.add(btsouth1);
		this.add(lbcenter1);
		this.add(lbcenter2);
		this.add(lbcenter3);
		this.add(lbcenter4);
		this.add(tfWord);
		this.add(tfVoca);
		this.add(lbNumber);
		//this.add(lbTop);
		this.add(panelTitle);
		mf.add(this);

		//버튼







	
		
		
		
		
	

		btsouth1.addActionListener(new ActionListener() {//제출 버튼
			
			
			@Override
		    public void actionPerformed(ActionEvent e) {
		
			int num2 =0;
			int num3 =0;
			int num4 =0;	
			//if(change==1 && change==2 && change==3 && change ==4) {
	/*		label:
       for(int j= 0; 0<j;j++) {*/
		    
		        
//		        else if(tasouth1=){
//		        	tasouth1.setText("");
//					tasouth1.requestFocus();
//					
//					JOptionPane.showMessageDialog(null, "1번~4번까지 다시적어주세요");
//					ChangePanel.changePanel(mf, Test_Select4, new Test_Select4(mf));
			
			try {
				
				change = Integer.parseInt(tasouth1.getText());
			}catch(NumberFormatException e1) {
			}catch (Exception e1) {
			}
			
			//String nobel  =Integer.valueOf(index).toString();
			
		/*	if(index >=0 && index <4) {	
			    if((index+1) == change){
				answer = answer+1;
				
				tasouth1.setText("");
				tasouth1.requestFocus();
			}
			}else if(index >=4 && index <7) {
				  if((index-3) == change ){
						answer = answer+1;
						
						tasouth1.setText("");
						tasouth1.requestFocus();
						
			}else if(index >=7 && index <10) {
				  if((index-6) == change){
						answer = answer+1;
						
						tasouth1.setText("");
						tasouth1.requestFocus();
			}
			}
			}*/
	
	/*		System.out.println(change);
			System.out.println(meanStr[change]);
				 System.out.println(index);
				 System.out.println(meanStr[index]); 
				 
			 
			System.out.println(answer);*/
			//실행 마지막에 다시 포커스를 textField로 가져가면서 전체 내용 선택
			//tf.selectAll();
			
			 if (index==0) {
				 if(change==1) {
	
						answer = answer+1;
						
						tasouth1.setText("");
						tasouth1.requestFocus();
				 }
					tasouth1.setText("");
					tasouth1.requestFocus();
				 index++;
				 ChangePanel.changePanel(mf, Test_Select4, new Test_Select4(mf));
			}
			 
			else if((index + 1) >= 10) {
            	 
            	 JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.");
            	 ChangePanel.changePanel(mf, Test_Select4, new Test_TestPopup(mf));
			}else{
				
				tfVoca.setText(spellStr[index+1]);
				tfWord.setText(Integer.valueOf(index+2).toString());
			
				for(int i=0; i<11; i++) {
					int num1 =index+1;
					num2= (int)(Math.random()*9)+1;
					num3= (int)(Math.random()*9)+1;
					num4= (int)(Math.random()*9)+1;
					 
					
				if(num4 != num1 && num1!= num2 && num2!=num3 && num3!=num4 && num1 !=num3 &&num2 !=num4 ) {
						
					    if(num1>num2 && num3>num4) {
					    	
					    tfsouth1.setText(meanStr[num1]);
					    tfsouth2.setText(meanStr[num2]);
					    tfsouth3.setText(meanStr[num3]);
					    tfsouth4.setText(meanStr[num4]);
					    
					    if (change==1) {
					    answer +=1;
						tasouth1.setText("");
						tasouth1.requestFocus();
						
					    }
					    tasouth1.setText("");
						tasouth1.requestFocus();
						
					    }else if (num1<num2 && num3>num4) {
						    tfsouth1.setText(meanStr[num4]);
						    tfsouth2.setText(meanStr[num1]);
						    tfsouth3.setText(meanStr[num2]);
						    tfsouth4.setText(meanStr[num3]);
						    
						    if (change==2) {
							    answer +=1;
								tasouth1.setText("");
								tasouth1.requestFocus();
								
							    }
							    tasouth1.setText("");
								tasouth1.requestFocus();
						    
					    }else if (num1>num2 && num3<num4) {
						    tfsouth1.setText(meanStr[num3]);
						    tfsouth2.setText(meanStr[num4]);
						    tfsouth3.setText(meanStr[num1]);
						    tfsouth4.setText(meanStr[num2]);
						    
						    if (change==3) {
							    answer +=1;
								tasouth1.setText("");
								tasouth1.requestFocus();
								
							    }
							    tasouth1.setText("");
								tasouth1.requestFocus();
						 
						    
					    }else {
						    tfsouth1.setText(meanStr[num2]);
						    tfsouth2.setText(meanStr[num3]);
						    tfsouth3.setText(meanStr[num4]);
						    tfsouth4.setText(meanStr[num1]);
						    
						    if (change==4) {
							    answer +=1;
								tasouth1.setText("");
								tasouth1.requestFocus();
								
							    }
							    tasouth1.setText("");
								tasouth1.requestFocus();
						  
					    }
				
					}
				
					}
				index++;
			}
				}
		});
             
			btnLeft1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.changePanel(mf, Test_Select4, new MainPage(mf));			
				}

			});
			
			
				
			btnLeft2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						ChangePanel.changePanel(mf, Test_Select4, new MyWord1(mf));            
					} catch (NullPointerException e1) {
						JOptionPane.showMessageDialog(null, "단어를 먼저 학습하세요~♥");
					}
				}

			});

			
			btnLeft3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.changePanel(mf, Test_Select4, new AddWord(mf));
				}

			});

			btnLeft4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(index >=10) {
						
						ChangePanel.changePanel(mf, Test_Select4, new Test_TestPopup(mf));
					}else {
						ChangePanel.changePanel(mf, Test_Select4, new Test_Main(mf));
					}
				}

			});



			btnLeft5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.changePanel(mf, Test_Select4, new SeoungJang(mf));
				}

			});

		
			this.setVisible(true);
		}
}
		
			/*else if( 4 < change && change==0){
				tasouth1.setText("");
				tasouth1.requestFocus();
				JOptionPane.showMessageDialog(null,"다시 입력하세요");
				
			}*/
		//}
	
/*btsouth2.addActionListener(new ActionListener() {//다음 버튼
	
	
	@Override
    public void actionPerformed(ActionEvent e) {
	
	 
     if((index + 1) >= 10) {
    	//String answer = Integer.valueOf(index+2).toString(tasouth1);
		JOptionPane.showMessageDialog(null, "<html> 정답 갯수 : " + answer + "개 <br> 텐텐 " + answer + "개를 획득하였습니다.");
		JOptionPane.showMessageDialog(null, "테스트가 안료되었습니다.");

		
	}else {
		
		JOptionPane.showMessageDialog(null, "문제를 먼저 푸세요.");
	}
	}
});*/
	
	
	
	
	
	
	

		/*1234123412  
		0123456789*/



		/*btsouth2.addActionListener(new ActionListener() {//익명
			@Override
			public void actionPerformed(ActionEvent e) {

				int show = Integer.parseInt(tasouth1.getText());



				if(show==(index%4)+1) {

					BufferedWriter answer =null;
					try {
						answer = new BufferedWriter(new FileWriter("answer.txt",true));
						answer.write("O");;
						answer.flush();
						answer.close();

					}catch(IOException e2) {
						e2.printStackTrace();
					}

				}else {
					BufferedWriter answer =null;
					try {
						answer = new BufferedWriter(new FileWriter("answer.txt",true));
						answer.write("X");;
						answer.flush();
						answer.close();

					}catch(IOException e2) {
						e2.printStackTrace();
					}

				}  

			}
		});*/






	


		/*    tfVoca.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try{
					++index;
					 tfVoca.setText(wordStr[index]);
					}catch(Exception e1) {
						if(index >= 10) {
							JOptionPane.showMessageDialog(null, "테스트를 완료하셨습니다.");
						}
					}

				}
			});*/
		
	
		
