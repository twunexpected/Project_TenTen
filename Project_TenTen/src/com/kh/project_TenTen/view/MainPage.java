package com.kh.project_TenTen.view;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class MainPage extends JPanel {

	WordDao wd = new WordDao();


	String[] wordStr = null;
	String[] meanStr = null;
	String[] kindStr = null;

	public static Word[] word = null;
	
	static String subjectWord = null;

	static int MainIndex = 0; 
	static int SubStop = 0;  

	private Login_MainFrame mf;
	private JPanel MainPage;
	int count = 0;
	boolean check = true;


	public int returnSubject(String returnSubject) {
		int num = 0;

		switch(returnSubject) {
		case "요리" : break;
		case "스포츠" : num = 1; break;
		case "여행" : num = 2; break;
		case "회사" : num = 3; break;
		case "경제" : num = 4; break;
		case "예술" : num = 5; break;
		}

		return num;
	}


	public Word[] objectTest(int num) {
		//WordDao클래스 안, 풀어놓은 주제별 배열이 있는 readWord 라는 메소드를 호출하여
		//wordList 라는 ArrayList에 담아줌. (주제당 10개)
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



	public MainPage(Login_MainFrame mf) {
		this.mf = mf;
		MainPage = this;

		JLabel ChSub = new JLabel("주제를 선택하세요");
		ChSub.setSize(250, 90);
		ChSub.setLocation(105, 250);
		ChSub.setBackground(new Color(123, 185, 237));
		ChSub.setFont(new Font("고딕",Font.BOLD,26));
		ChSub.setHorizontalAlignment(JTextField.CENTER);
		this.add(ChSub);
		ChSub.setVisible(true);
		
		
		//단어 텍스
		JLabel wordText = new JLabel(" ");
		wordText.setSize(250, 90);
		wordText.setLocation(105, 180);
		wordText.setBackground(new Color(123, 185, 237));
		wordText.setFont(new Font("고딕",Font.BOLD,28));
		wordText.setHorizontalAlignment(JTextField.CENTER);

		
		
		//뜻 텍스
		JLabel meanText = new JLabel(" ");
		meanText.setSize(250, 90);
		meanText.setLocation(105, 280);
		meanText.setBackground(new Color(123, 185, 237));
		meanText.setFont(new Font("고딕",Font.BOLD,25));
		meanText.setHorizontalAlignment(JTextField.CENTER);
		this.add(meanText);

		//품사텍스
		JLabel kindText = new JLabel(" ");
		kindText.setSize(60, 40);
		kindText.setLocation(195, 375);
		kindText.setBackground(new Color(123, 185, 237));
		kindText.setFont(new Font("고딕",Font.BOLD,15));
		kindText.setHorizontalAlignment(JTextField.CENTER);
		this.add(kindText);


		//카운 텍스
		JLabel countnum = new JLabel("");
		countnum.setBackground(new Color(123, 185, 237));
		countnum.setSize(60, 50);
		countnum.setLocation(165, 480);
		countnum.setFont(new Font("고딕",Font.PLAIN,19));
		countnum.setHorizontalAlignment(JTextField.CENTER);
		countnum.setPreferredSize(new Dimension(60, 50));

		// " /10 "
		JLabel countMax = new JLabel("/ 10");
		countMax.setBackground(new Color(123, 185, 237));
		countMax.setSize(50, 40);
		countMax.setLocation(225, 485);
		countMax.setFont(new Font("고딕",Font.PLAIN,20));


		///////////////////////////////////////////////////////////////////////
		//요리 버튼
		JButton cook = new JButton("요리");
		cook.setSize(80, 40);
		cook.setLocation(100,70);
		cook.setForeground(Color.WHITE);
		cook.setBackground(new Color(36, 107, 220));
		this.add(cook);

		////////@@@@@  요리주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog CookjujaeD = new Dialog(mf,"요리 주제선택 재확인");
		CookjujaeD.setLayout(null);
		CookjujaeD.setBounds(700,300,400,200);
		CookjujaeD.setBackground(new Color(123,185,237));

		JLabel CooksbQ = new JLabel("요리 주제를 선택하시겠습니까?");
		CooksbQ.setBounds(70, 90, 300, 30);
		CooksbQ.setFont(new Font("고딕", Font.BOLD, 17));
		CooksbQ.setForeground(Color.white);
		CookjujaeD.add(CooksbQ);

		JButton CookaswY = new JButton("네");
		CookaswY.setBounds(90, 130, 90, 30);
		CookaswY.setFont(new Font("고딕", Font.BOLD, 17));
		CookaswY.setForeground(Color.white);
		CookaswY.setBackground(new Color(36, 107, 220));
		CookjujaeD.add(CookaswY);

		JButton CookaswN = new JButton("아니오");
		CookaswN.setBounds(205, 130, 90, 30);
		CookaswN.setFont(new Font("고딕", Font.BOLD, 17));
		CookaswN.setForeground(Color.white);
		CookaswN.setBackground(new Color(36, 107, 220));
		CookjujaeD.add(CookaswN);



		//네 주제 선택확고합니다.
		CookaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false); //가운데 "주제를선택하세요" 라벨 사라지게
				CookjujaeD.dispose(); //해당주제를 선택하시겠습니까? 질문 팝업창 종료
				if(count == 0 ) { 	  // count 라는 int 변수를 0초기화시켜놓고, 0일때만 학습단어가 불러오게끔.

					wordStr = new String[10];   // 10개의 영단어, 뜻, 품사를 각각의 배열에 10개의 공간을 생성해서 담음 
					meanStr = new String[10];
					kindStr = new String[10];
					
					// Word[] 클래스 자료형의 배열에 word 변수를 null로 초기화 시킨 뒤,
					// 
					word = objectTest(returnSubject("요리")); 
					subjectWord = "요리";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(SubStop > 1) {
					JOptionPane.showMessageDialog(null, "이미 학습하셨습니다.");
				}
			
				
			}

		});
		// 노 누를시 창 꺼짐
		CookaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CookjujaeD.dispose();
			}

		});

		//요리버튼 이벤트. 주제선택 재확인 팝업창 실행
		if(SubStop == 0) {
		if(count == 0) {
		cook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(count > 0) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}else {
					CookjujaeD.setVisible(true);
				}
			}
		});
		}
		}

		////////////////////////////////////////////////////////////////////////

		//스포츠 버튼
		JButton sports = new JButton("스포츠");
		sports.setSize(80, 40);
		sports.setLocation(190,70);
		sports.setForeground(Color.WHITE);
		sports.setBackground(new Color(36, 107, 220));
		this.add(sports);


		////////@@@@@  스포츠 주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog sportsjujaeD = new Dialog(mf,"스포츠 주제선택 재확인");
		sportsjujaeD.setLayout(null);
		sportsjujaeD.setBounds(700,300,400,200);
		sportsjujaeD.setBackground(new Color(123,185,237));

		JLabel sportssbQ = new JLabel("스포츠 주제를 선택하시겠습니까?");
		sportssbQ.setBounds(70, 90, 300, 30);
		sportssbQ.setFont(new Font("고딕", Font.BOLD, 17));
		sportssbQ.setForeground(Color.white);
		sportsjujaeD.add(sportssbQ);

		JButton sportsaswY = new JButton("네");
		sportsaswY.setBounds(90, 130, 90, 30);
		sportsaswY.setFont(new Font("고딕", Font.BOLD, 17));
		sportsaswY.setForeground(Color.white);
		sportsaswY.setBackground(new Color(36, 107, 220));
		sportsjujaeD.add(sportsaswY);

		JButton sportsaswN = new JButton("아니오");
		sportsaswN.setBounds(205, 130, 90, 30);
		sportsaswN.setFont(new Font("고딕", Font.BOLD, 17));
		sportsaswN.setForeground(Color.white);
		sportsaswN.setBackground(new Color(36, 107, 220));
		sportsjujaeD.add(sportsaswN);



		//네 주제 선택확고합니다.
		sportsaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false);
				sportsjujaeD.dispose();
				if(count == 0 ) {

					wordStr = new String[10];
					meanStr = new String[10];
					kindStr = new String[10];
					word = objectTest(returnSubject("스포츠"));
					subjectWord = "스포츠";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(count > 1) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}				
			}

		});
		// no 눌렀을시 창 꺼짐
		sportsaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sportsjujaeD.dispose();
			}

		});

		
		//스포츠버튼 이벤트. 주제선택 재확인 팝업창 실행
		
		if(SubStop == 0) {		
		if(count == 0) {
					sports.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						if(count > 0) {
							JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
						}else {
							sportsjujaeD.setVisible(true);
						}
					} 
				});
				} subjectWord = "스포츠";
		}
		
		
		
		////////////////////////////////////////////////////
		//여행 버튼
		JButton trip= new JButton("여행");
		trip.setSize(80, 40);
		trip.setLocation(280,70);
		trip.setForeground(Color.WHITE);
		trip.setBackground(new Color(36, 107, 220));
		this.add(trip);

////////@@@@@  여행 주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog tripjujaeD = new Dialog(mf,"여행 주제선택 재확인");
		tripjujaeD.setLayout(null);
		tripjujaeD.setBounds(700,300,400,200);
		tripjujaeD.setBackground(new Color(123,185,237));

		JLabel tripsbQ = new JLabel("여행 주제를 선택하시겠습니까?");
		tripsbQ.setBounds(70, 90, 300, 30);
		tripsbQ.setFont(new Font("고딕", Font.BOLD, 17));
		tripsbQ.setForeground(Color.white);
		tripjujaeD.add(tripsbQ);

		JButton tripaswY = new JButton("네");
		tripaswY.setBounds(90, 130, 90, 30);
		tripaswY.setFont(new Font("고딕", Font.BOLD, 17));
		tripaswY.setForeground(Color.white);
		tripaswY.setBackground(new Color(36, 107, 220));
		tripjujaeD.add(tripaswY);

		JButton tripaswN = new JButton("아니오");
		tripaswN.setBounds(205, 130, 90, 30);
		tripaswN.setFont(new Font("고딕", Font.BOLD, 17));
		tripaswN.setForeground(Color.white);
		tripaswN.setBackground(new Color(36, 107, 220));
		tripjujaeD.add(tripaswN);



		//네 주제 선택확고합니다.
		tripaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false);
				tripjujaeD.dispose();
				if(count == 0 ) {

					wordStr = new String[10];
					meanStr = new String[10];
					kindStr = new String[10];
					word = objectTest(returnSubject("여행"));
					subjectWord = "여행";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(count > 1) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}				
			}

		});
		// no 눌렀을시 창 꺼짐
		tripaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tripjujaeD.dispose();
			}

		});
		if(SubStop == 0) {
		//여행버튼 이벤트. 주제선택 재확인 팝업창 실행
		if(count == 0) {
		trip.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(count > 0) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}else {
				tripjujaeD.setVisible(true);
				}
			}
		});
		
		}
		}
		
		
		
////////////////////////////////////////////////////
		//회사 버튼
		JButton business= new JButton("회사");
		business.setSize(80, 40);
		business.setLocation(100,120);
		business.setForeground(Color.WHITE);
		business.setBackground(new Color(36, 107, 220));
		this.add(business);

////////@@@@@  회사 주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog BSjujaeD = new Dialog(mf,"회사 주제선택 재확인");
		BSjujaeD.setLayout(null);
		BSjujaeD.setBounds(700,300,400,200);
		BSjujaeD.setBackground(new Color(123,185,237));

		JLabel BSsbQ = new JLabel("회사 주제를 선택하시겠습니까?");
		BSsbQ.setBounds(70, 90, 300, 30);
		BSsbQ.setFont(new Font("고딕", Font.BOLD, 17));
		BSsbQ.setForeground(Color.white);
		BSjujaeD.add(BSsbQ);

		JButton BSaswY = new JButton("네");
		BSaswY.setBounds(90, 130, 90, 30);
		BSaswY.setFont(new Font("고딕", Font.BOLD, 17));
		BSaswY.setForeground(Color.white);
		BSaswY.setBackground(new Color(36, 107, 220));
		BSjujaeD.add(BSaswY);

		JButton BSaswN = new JButton("아니오");
		BSaswN.setBounds(205, 130, 90, 30);
		BSaswN.setFont(new Font("고딕", Font.BOLD, 17));
		BSaswN.setForeground(Color.white);
		BSaswN.setBackground(new Color(36, 107, 220));
		BSjujaeD.add(BSaswN);



		//네 주제 선택확고합니다.
		BSaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false);
				BSjujaeD.dispose();
				if(count == 0 ) {

					wordStr = new String[10];
					meanStr = new String[10];
					kindStr = new String[10];
					word = objectTest(returnSubject("회사"));
					subjectWord = "회사";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(count > 1) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}				
			}

		});
		// no 눌렀을시 창 꺼짐
		BSaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BSjujaeD.dispose();
			}

		});
		if(SubStop == 0) {
		//회사버튼 이벤트. 주제선택 재확인 팝업창 실행
		if(count == 0) {
		business.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(count > 0) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}else {
				BSjujaeD.setVisible(true);
				}
			}
		});
		}
		
		}
		
		
		
//////////////////////////////////////////////////////////////////////////
		//경제 버튼
		JButton economy = new JButton("경제");
		economy.setSize(80, 40);
		economy.setLocation(190,120);
		economy.setForeground(Color.WHITE);
		economy.setBackground(new Color(36, 107, 220));
		this.add(economy);

////////@@@@@  경제 주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog ECjujaeD = new Dialog(mf,"경제 주제선택 재확인");
		ECjujaeD.setLayout(null);
		ECjujaeD.setBounds(700,300,400,200);
		ECjujaeD.setBackground(new Color(123,185,237));

		JLabel ECsbQ = new JLabel("경제 주제를 선택하시겠습니까?");
		ECsbQ.setBounds(70, 90, 300, 30);
		ECsbQ.setFont(new Font("고딕", Font.BOLD, 17));
		ECsbQ.setForeground(Color.white);
		ECjujaeD.add(ECsbQ);

		JButton ECaswY = new JButton("네");
		ECaswY.setBounds(90, 130, 90, 30);
		ECaswY.setFont(new Font("고딕", Font.BOLD, 17));
		ECaswY.setForeground(Color.white);
		ECaswY.setBackground(new Color(36, 107, 220));
		ECjujaeD.add(ECaswY);

		JButton ECaswN = new JButton("아니오");
		ECaswN.setBounds(205, 130, 90, 30);
		ECaswN.setFont(new Font("고딕", Font.BOLD, 17));
		ECaswN.setForeground(Color.white);
		ECaswN.setBackground(new Color(36, 107, 220));
		ECjujaeD.add(ECaswN);



		//네 주제 선택확고합니다.
		ECaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false);
				ECjujaeD.dispose();
				if(count == 0 ) {

					wordStr = new String[10];
					meanStr = new String[10];
					kindStr = new String[10];
					word = objectTest(returnSubject("경제"));
					subjectWord = "경제";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(count > 1) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}				
			}

		});
		// no 눌렀을시 창 꺼짐
		ECaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ECjujaeD.dispose();
			}

		});

		//경제버튼 이벤트. 주제선택 재확인 팝업창 실행
		if(SubStop == 0) {
		if(count == 0) {
		economy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(count == 0) {
					ECjujaeD.setVisible(true);
				}else if (count >= 1){
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}

			}
		});
		}
		}
	////////////////////////////////////////////////////////////////	
		//예술 버튼
		JButton art = new JButton("예술");
		art.setSize(80, 40);
		art.setLocation(280,120);
		art.setForeground(Color.WHITE);
		art.setBackground(new Color(36, 107, 220));
		this.add(art);

////////@@@@@  회사 주제 선택시 뜨는 선택 재확인 팝업창 @@@@@/////////
		Dialog ATjujaeD = new Dialog(mf,"예술 주제선택 재확인");
		ATjujaeD.setLayout(null);
		ATjujaeD.setBounds(700,300,400,200);
		ATjujaeD.setBackground(new Color(123,185,237));

		JLabel ATsbQ = new JLabel("예술 주제를 선택하시겠습니까?");
		ATsbQ.setBounds(70, 90, 300, 30);
		ATsbQ.setFont(new Font("고딕", Font.BOLD, 17));
		ATsbQ.setForeground(Color.white);
		ATjujaeD.add(ATsbQ);

		JButton ATaswY = new JButton("네");
		ATaswY.setBounds(90, 130, 90, 30);
		ATaswY.setFont(new Font("고딕", Font.BOLD, 17));
		ATaswY.setForeground(Color.white);
		ATaswY.setBackground(new Color(36, 107, 220));
		ATjujaeD.add(ATaswY);

		JButton ATaswN = new JButton("아니오");
		ATaswN.setBounds(205, 130, 90, 30);
		ATaswN.setFont(new Font("고딕", Font.BOLD, 17));
		ATaswN.setForeground(Color.white);
		ATaswN.setBackground(new Color(36, 107, 220));
		ATjujaeD.add(ATaswN);



		//네 주제 선택확고합니다.
		ATaswY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChSub.setVisible(false);
				ATjujaeD.dispose();
				
				if(count == 0 ) {

					wordStr = new String[10];
					meanStr = new String[10];
					kindStr = new String[10];
					word = objectTest(returnSubject("예술"));
					subjectWord = "예술";

					//스펠링 가져오기
					for(int i = 0; i < word.length; i++) {
						wordStr[i] = word[i].getSpelling();
						meanStr[i] = word[i].getMean();
						kindStr[i] = word[i].getKind();

						wordText.setText(wordStr[MainIndex]);
						meanText.setText(meanStr[MainIndex]);
						kindText.setText(kindStr[MainIndex]);
						countnum.setText(Integer.valueOf(MainIndex+1).toString());
					}

				}count++;
				if(count > 1) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}
				
				
				
				
			}

		});
		// no 눌렀을시 창 꺼짐
		ATaswN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ATjujaeD.dispose();
			}
 
		});
 
		//예술 버튼 이벤트. 주제선택 재확인 팝업창 실행
		if(SubStop == 0) {
		if(count == 0) {
		art.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count > 0) {
					JOptionPane.showMessageDialog(null, "이미 주제를 선택하셨습니다.");
				}else {
				ATjujaeD.setVisible(true);
				}
			}
		});
		}
		}

		//////////////////////////////////////////////////////////////////////
		//암기 버튼
		JButton arm = new JButton("암기");
		arm.setSize(105, 60);
		arm.setLocation(105,420);
		arm.setForeground(Color.WHITE);
		arm.setFont(new Font("고딕",Font.BOLD,22));
		arm.setPreferredSize(new Dimension(105, 60));
		arm.setBackground(new Color(36, 107, 220));



		arm.addActionListener(new ActionListener() {
 
			@Override 
			public void actionPerformed(ActionEvent e) {
				try { 
					++MainIndex;
					wordText.setText(wordStr[MainIndex]);
					meanText.setText(meanStr[MainIndex]);
					kindText.setText(kindStr[MainIndex]);
					countnum.setText(Integer.valueOf(MainIndex+1).toString());
					
					
					BufferedWriter bo = null;
					bo = new BufferedWriter(new FileWriter(MemberDao.loginMember.getId()+"암기 단어.txt", true));
					bo.write(kindStr[MainIndex-1]+"/");
					bo.write(wordStr[MainIndex-1]+"/");
					bo.write(meanStr[MainIndex-1]+"/");
					bo.flush();
					bo.close();

				}catch(Exception e1){
					if(MainIndex >= 10) {
						BufferedWriter bo = null;
		                  try {
		                     bo = new BufferedWriter(new FileWriter(MemberDao.loginMember.getId()+"암기 단어.txt", true));
		                     bo.write(kindStr[MainIndex-1]+"/");
		                     bo.write(wordStr[MainIndex-1]+"/");
		                     bo.write(meanStr[MainIndex-1]+"/");
		                     bo.flush();
		                     bo.close();
		                  } catch (IOException e2) {
		                     e2.printStackTrace();
		                  }
						
						JOptionPane.showMessageDialog(null, "10 개 단어 학습 완료!");
						ChSub.setVisible(false);
						wordText.setVisible(false);
						meanText.setVisible(false);
						kindText.setVisible(false);
						
					}
				}SubStop++;

			}
		});

		//비암기버튼
		JButton beearm = new JButton("비암기");
		beearm.setSize(105, 60);
		beearm.setLocation(240, 420);
		beearm.setForeground(Color.WHITE);
		beearm.setFont(new Font("고딕",Font.BOLD,22));
		beearm.setPreferredSize(new Dimension(105, 60));
		beearm.setBackground(new Color(36, 107, 220));

		beearm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					++MainIndex;
					wordText.setText(wordStr[MainIndex]);
					meanText.setText(meanStr[MainIndex]);
					kindText.setText(kindStr[MainIndex]);
					countnum.setText(Integer.valueOf(MainIndex+1).toString());

					BufferedWriter bo = null;
					bo = new BufferedWriter(new FileWriter(MemberDao.loginMember.getId()+"비암기 단어.txt", true));
					bo.write(kindStr[MainIndex-1]+"/");
					bo.write(wordStr[MainIndex-1]+"/");
					bo.write(meanStr[MainIndex-1]+"/");
					bo.flush();
					bo.close();

				}catch(Exception e1){
					if(MainIndex >= 10) {
						
						BufferedWriter bo = null;
		                  try {
		                     bo = new BufferedWriter(new FileWriter(MemberDao.loginMember.getId()+"비암기 단어.txt", true));
		                     bo.write(kindStr[MainIndex-1]+"/");
		                     bo.write(wordStr[MainIndex-1]+"/");
		                     bo.write(meanStr[MainIndex-1]+"/");
		                     bo.flush();
		                     bo.close();
		                  } catch (IOException e2) {
		                     // TODO Auto-generated catch block
		                     e2.printStackTrace();
		                  }
						
						
						JOptionPane.showMessageDialog(null, "10 개 단어 학습 완료!");
						ChSub.setVisible(false);
						wordText.setVisible(false);
						meanText.setVisible(false);
						kindText.setVisible(false);
					}
				}SubStop++;

			}
		});


		//마이페이지 버튼
		JButton btn = new JButton("마이페이지");
		btn.setSize(120, 45);
		btn.setLocation(260, 20);
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(36, 107, 220));
		btn.setFont(new Font("고딕",Font.PLAIN,12));
		btn.setPreferredSize(new Dimension(120, 45));


		this.add(countMax);
		this.add(btn);
		this.add(arm);
		this.add(beearm);
		this.add(wordText);
		this.add(countnum);


		//카피라잇
		JLabel naming = new JLabel("Copyrights ⓒ  비!뇨내과 All Rights reserved.");
		naming.setBounds(90, 600, 400, 50);
		//naming.setForeground(new Color(255, 255, 225));
		naming.setFont(new Font("고", Font.BOLD, 13));
		this.setLayout(null);
		this.add(naming);


		this.setSize(400, 700);
		this.setLayout(null);
		this.setBackground(new Color(123, 185, 237));
		mf.add(this);   


		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//좌측 메뉴
		final JButton btnLeft1 = new JButton("<html>메인<br/>화면</html>");
		btnLeft1.setBounds(0, 0, 80, 120);
		btnLeft1.setForeground(new Color(255, 255, 225));
		btnLeft1.setBackground(new Color(36, 107, 220));
		btnLeft1.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft1);
		JPanel panelLeft1 = new JPanel();
		panelLeft1.setBounds(0,120, 80, 10);
		panelLeft1.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.add(panelLeft1);

		final JButton btnLeft2 = new JButton("<html>나의<br/>단어</html>");
		btnLeft2.setBounds(0, 130, 80, 120);
		btnLeft2.setForeground(new Color(255, 255, 225));
		btnLeft2.setBackground(new Color(36, 107, 220));
		btnLeft2.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft2);
		JPanel panelLeft2= new JPanel();
		panelLeft2.setBounds(0, 250, 80, 10);
		panelLeft2.setBackground(new Color(255, 255, 255));
		this.add(panelLeft2);


		
		final JButton btnLeft3 = new JButton("<html>단어<br/>추가</html>");
		btnLeft3.setBounds(0, 260, 80, 120);
		btnLeft3.setForeground(new Color(255, 255, 225));
		btnLeft3.setBackground(new Color(36, 107, 220));
		btnLeft3.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft3);
		JPanel panelLeft3 = new JPanel();
		panelLeft3.setBounds(0, 380, 80, 10);
		panelLeft3.setBackground(new Color(255, 255, 255));
		this.add(panelLeft3);


		final JButton btnLeft4 = new JButton("<html>단어<br/>TEST</html>");
		btnLeft4.setBounds(0, 390, 80, 120);
		btnLeft4.setForeground(new Color(255, 255, 225));
		btnLeft4.setBackground(new Color(36, 107, 220));
		btnLeft4.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft4);
		JPanel panelLeft4  = new JPanel();
		panelLeft4.setBounds(0, 510, 80, 10);
		panelLeft4.setBackground(new Color(255, 255, 255));
		this.add(panelLeft4);



		final JButton btnLeft5 = new JButton("<html>성장<br/>과정</html>");
		btnLeft5.setBounds(0, 520, 80, 135);
		btnLeft5.setForeground(new Color(255, 255, 225));
		btnLeft5.setBackground(new Color(36, 107, 220));
		btnLeft5.setFont(new Font("고딕",Font.BOLD,20));
		this.add(btnLeft5);




		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new MyPage(mf));				
			}

		}); 

		btnLeft2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ChangePanel.changePanel(mf, MainPage, new MyWord1(mf));            
				} catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "단어를 먼저 학습하세요~♥");
				}
			}

		});


		btnLeft3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new AddWord(mf));
			}

		});

		btnLeft4.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Test_OxTest.index >= 10) {
					ChangePanel.changePanel(mf, MainPage, new Test_TestPopup(mf));
				}else {
				ChangePanel.changePanel(mf, MainPage, new Test_Main(mf));
				}
			}

		});



		btnLeft5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, MainPage, new SeoungJang(mf));
			}

		});
		
		

	}


}


