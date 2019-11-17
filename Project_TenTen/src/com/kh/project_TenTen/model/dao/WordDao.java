package com.kh.project_TenTen.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.kh.project_TenTen.model.vo.Word;

public class WordDao {
	
	public void insertWord() {
		
		//요리 단어 입력
		
		Word word1 = new Word("apple", "요리", "사과", "명사");
		Word word2 = new Word("pear", "요리", "배", "명사");
		Word word3 = new Word("peach", "요리", "복숭아", "명사");
		Word word4 = new Word("waterMelon", "요리", "수박", "명사");
		Word word5 = new Word("pistachio", "요리", "피스타치오", "명사");
		Word word6 = new Word("peanut", "요리", "땅콩", "명사");
		Word word7 = new Word("melon", "요리", "메론", "명사");
		Word word8 = new Word("strawberry", "요리", "딸기", "명사");
		Word word9 = new Word("tomato", "요리", "토마토", "명사");
		Word word10 = new Word("blueberry", "요리", "블루베리", "명사");
		
		ArrayList cookWord = new ArrayList();
		
		cookWord.add(word1);
		cookWord.add(word2);
		cookWord.add(word3);
		cookWord.add(word4);
		cookWord.add(word5);
		cookWord.add(word6);
		cookWord.add(word7);
		cookWord.add(word8);
		cookWord.add(word9);
		cookWord.add(word10);
		
		Word word11 = new Word("beatout", "스포츠", "내야안타", "명사");
		Word word12 = new Word("gopher ball", "스포츠", "홈런 볼", "명사");
		Word word13 = new Word("pitcher", "스포츠", "투수", "명사");
		Word word14 = new Word("net", "스포츠", "그물", "명사");
		Word word15 = new Word("libero", "스포츠", "최종수비수", "명사");
		Word word16 = new Word("offside trap", "스포츠", "오프사이드트랩", "명사");
		Word word17 = new Word("bicycle kick", "스포츠", "바이시클 킥", "명사");
		Word word18 = new Word("sidefoot", "스포츠", "발의 측면으로 차다", "명사");
		Word word19 = new Word("approach shot", "스포츠", "어프로치 샷", "명사");
		Word word20 = new Word("moonball", "스포츠", "높게 둥근 원을 그리는 샷", "명사");
		
		ArrayList sportsWord = new ArrayList();

		sportsWord.add(word11);
		sportsWord.add(word12);
		sportsWord.add(word13);
		sportsWord.add(word14);
		sportsWord.add(word15);
		sportsWord.add(word16);
		sportsWord.add(word17);
		sportsWord.add(word18);
		sportsWord.add(word19);
		sportsWord.add(word20);
		
		
		Word word21 = new Word("bus", "여행", "버스", "명사");
		Word word22 = new Word("airport", "여행", "공항", "명사");
		Word word23 = new Word("taxi", "여행", "택시", "명사");
		Word word24 = new Word("tradition", "여행", "전통", "명사");
		Word word25 = new Word("station", "여행", "역", "명사");
		Word word26 = new Word("luggage", "여행", "수하물", "명사");
		Word word27 = new Word("self-camera", "여행", "셀카", "명사");
		Word word28 = new Word("bag", "여행", "가방", "명사");
		Word word29 = new Word("passport", "여행", "여권", "명사");
		Word word30 = new Word("landscape", "여행", "풍경", "명사");
		
		ArrayList tripWord = new ArrayList();
		
		tripWord.add(word21);
		tripWord.add(word22);
		tripWord.add(word23);
		tripWord.add(word24);
		tripWord.add(word25);
		tripWord.add(word26);
		tripWord.add(word27);
		tripWord.add(word28);
		tripWord.add(word29);
		tripWord.add(word30);
		
		Word word31 = new Word("Sale", "비지니스", "판매", "명사");
		Word word32 = new Word("Contract", "비지니스", "계약", "명사");
		Word word33 = new Word("Expense", "비지니스", "비용", "명사");
		Word word34 = new Word("Product", "비지니스", "상품", "명사");
		Word word35 = new Word("Industry", "비지니스", "산업", "명사");
		Word word36 = new Word("Income", "비지니스", "수입", "명사");
		Word word37 = new Word("Revenue", "비지니스", "수익", "명사");
		Word word38 = new Word("Market", "비지니스", "시장", "명사");
		Word word39 = new Word("Task", "비지니스", "임무", "명사");
		Word word40 = new Word("Consensus", "비지니스", "합의", "명사");
		
		ArrayList businessWord = new ArrayList();
		
		businessWord.add(word31);
		businessWord.add(word32);
		businessWord.add(word33);
		businessWord.add(word34);
		businessWord.add(word35);
		businessWord.add(word36);
		businessWord.add(word37);
		businessWord.add(word38);
		businessWord.add(word39);
		businessWord.add(word40);
		
		Word word41 = new Word("receipt", "경제", "영수증", "명사");
		Word word42 = new Word("visible balance", "경제", "무역 수지", "명사");
		Word word43 = new Word("net income", "경제", "순이익", "명사");
		Word word44 = new Word("depreciatiion", "경제", "가치 하락", "명사");
		Word word45 = new Word("working asset", "경제", "운용 자산", "명사");
		Word word46 = new Word("sales forecast", "경제", "판매 예측", "명사");
		Word word47 = new Word("sales analysis", "경제", "판매 분석", "명사");
		Word word48 = new Word("product mix", "경제", "제품 믹스", "명사");
		Word word49 = new Word("economy of scale", "경제", "규모의 경제", "명사");
		Word word50 = new Word("benchmarking", "경제", "벤치마킹", "명사");
		
		ArrayList economyWord = new ArrayList();
		
		economyWord.add(word41);
		economyWord.add(word42);
		economyWord.add(word43);
		economyWord.add(word44);
		economyWord.add(word45);
		economyWord.add(word46);
		economyWord.add(word47);
		economyWord.add(word48);
		economyWord.add(word49);
		economyWord.add(word50);
		
		Word word51 = new Word("emotionalism", "예술", "감정의 흐름", "명사");
		Word word52 = new Word("illusionism", "예술", "환각법", "명사");
		Word word53 = new Word("piano", "예술", "피아노", "명사");
		Word word54 = new Word("plane", "예술", "평면", "명사");
		Word word55 = new Word("composition", "예술", "작곡", "명사");
		Word word56 = new Word("bride", "예술", "다리", "명사");
		Word word57 = new Word("angle", "예술", "각도", "명사");
		Word word58 = new Word("regisseur", "예술", "연출가", "명사");
		Word word59 = new Word("toeshoe", "예술", "댄스용 신", "명사");
		Word word60 = new Word("sempre", "예술", "끊임없이", "명사");
		
		ArrayList artWord = new ArrayList();
		
		HashMap wordList = new HashMap();
		wordList.put(0, cookWord);
		wordList.put(1, sportsWord);
		wordList.put(2, tripWord);
		wordList.put(3, businessWord);
		wordList.put(4, economyWord);
		wordList.put(5, artWord);
		
		ObjectOutputStream ob1 = null;
		
		try {
			ob1 = new ObjectOutputStream(new FileOutputStream("단어명단.txt"));
			ob1.writeObject(wordList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ob1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public ArrayList readWord(int subjectNum) {
		
		ObjectInputStream ob = null;
		ArrayList list = null;
		
		try {
			ob = new ObjectInputStream(new FileInputStream("단어명단.txt"));
			
			HashMap hlist = (HashMap) ob.readObject();
			
			//주제 읽어오기
			list = (ArrayList) hlist.get(subjectNum);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ob.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		WordDao wd = new WordDao();
		wd.insertWord();
		ArrayList cook = wd.readWord(0);
		System.out.println("요리단어출력");
		System.out.println(cook);
		
	}
	
}
