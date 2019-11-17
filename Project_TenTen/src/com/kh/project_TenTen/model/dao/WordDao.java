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
		
		//�丮 �ܾ� �Է�
		
		Word word1 = new Word("apple", "�丮", "���", "���");
		Word word2 = new Word("pear", "�丮", "��", "���");
		Word word3 = new Word("peach", "�丮", "������", "���");
		Word word4 = new Word("waterMelon", "�丮", "����", "���");
		Word word5 = new Word("pistachio", "�丮", "�ǽ�Ÿġ��", "���");
		Word word6 = new Word("peanut", "�丮", "����", "���");
		Word word7 = new Word("melon", "�丮", "�޷�", "���");
		Word word8 = new Word("strawberry", "�丮", "����", "���");
		Word word9 = new Word("tomato", "�丮", "�丶��", "���");
		Word word10 = new Word("blueberry", "�丮", "��纣��", "���");
		
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
		
		Word word11 = new Word("beatout", "������", "���߾�Ÿ", "���");
		Word word12 = new Word("gopher ball", "������", "Ȩ�� ��", "���");
		Word word13 = new Word("pitcher", "������", "����", "���");
		Word word14 = new Word("net", "������", "�׹�", "���");
		Word word15 = new Word("libero", "������", "���������", "���");
		Word word16 = new Word("offside trap", "������", "�������̵�Ʈ��", "���");
		Word word17 = new Word("bicycle kick", "������", "���̽�Ŭ ű", "���");
		Word word18 = new Word("sidefoot", "������", "���� �������� ����", "���");
		Word word19 = new Word("approach shot", "������", "������ġ ��", "���");
		Word word20 = new Word("moonball", "������", "���� �ձ� ���� �׸��� ��", "���");
		
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
		
		
		Word word21 = new Word("bus", "����", "����", "���");
		Word word22 = new Word("airport", "����", "����", "���");
		Word word23 = new Word("taxi", "����", "�ý�", "���");
		Word word24 = new Word("tradition", "����", "����", "���");
		Word word25 = new Word("station", "����", "��", "���");
		Word word26 = new Word("luggage", "����", "���Ϲ�", "���");
		Word word27 = new Word("self-camera", "����", "��ī", "���");
		Word word28 = new Word("bag", "����", "����", "���");
		Word word29 = new Word("passport", "����", "����", "���");
		Word word30 = new Word("landscape", "����", "ǳ��", "���");
		
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
		
		Word word31 = new Word("Sale", "�����Ͻ�", "�Ǹ�", "���");
		Word word32 = new Word("Contract", "�����Ͻ�", "���", "���");
		Word word33 = new Word("Expense", "�����Ͻ�", "���", "���");
		Word word34 = new Word("Product", "�����Ͻ�", "��ǰ", "���");
		Word word35 = new Word("Industry", "�����Ͻ�", "���", "���");
		Word word36 = new Word("Income", "�����Ͻ�", "����", "���");
		Word word37 = new Word("Revenue", "�����Ͻ�", "����", "���");
		Word word38 = new Word("Market", "�����Ͻ�", "����", "���");
		Word word39 = new Word("Task", "�����Ͻ�", "�ӹ�", "���");
		Word word40 = new Word("Consensus", "�����Ͻ�", "����", "���");
		
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
		
		Word word41 = new Word("receipt", "����", "������", "���");
		Word word42 = new Word("visible balance", "����", "���� ����", "���");
		Word word43 = new Word("net income", "����", "������", "���");
		Word word44 = new Word("depreciatiion", "����", "��ġ �϶�", "���");
		Word word45 = new Word("working asset", "����", "��� �ڻ�", "���");
		Word word46 = new Word("sales forecast", "����", "�Ǹ� ����", "���");
		Word word47 = new Word("sales analysis", "����", "�Ǹ� �м�", "���");
		Word word48 = new Word("product mix", "����", "��ǰ �ͽ�", "���");
		Word word49 = new Word("economy of scale", "����", "�Ը��� ����", "���");
		Word word50 = new Word("benchmarking", "����", "��ġ��ŷ", "���");
		
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
		
		Word word51 = new Word("emotionalism", "����", "������ �帧", "���");
		Word word52 = new Word("illusionism", "����", "ȯ����", "���");
		Word word53 = new Word("piano", "����", "�ǾƳ�", "���");
		Word word54 = new Word("plane", "����", "���", "���");
		Word word55 = new Word("composition", "����", "�۰�", "���");
		Word word56 = new Word("bride", "����", "�ٸ�", "���");
		Word word57 = new Word("angle", "����", "����", "���");
		Word word58 = new Word("regisseur", "����", "���Ⱑ", "���");
		Word word59 = new Word("toeshoe", "����", "���� ��", "���");
		Word word60 = new Word("sempre", "����", "���Ӿ���", "���");
		
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
			ob1 = new ObjectOutputStream(new FileOutputStream("�ܾ���.txt"));
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
			ob = new ObjectInputStream(new FileInputStream("�ܾ���.txt"));
			
			HashMap hlist = (HashMap) ob.readObject();
			
			//���� �о����
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
		System.out.println("�丮�ܾ����");
		System.out.println(cook);
		
	}
	
}
