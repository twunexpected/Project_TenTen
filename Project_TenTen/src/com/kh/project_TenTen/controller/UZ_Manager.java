package com.kh.project_TenTen.controller;

import java.util.ArrayList;

import com.kh.project_TenTen.model.dao.WordDao;
import com.kh.project_TenTen.model.vo.Word;

public class UZ_Manager {


	public String[] CookWord() {

		WordDao wd = new WordDao();
		wd.insertWord();
		ArrayList al = wd.readWord(0);
		//wd.readWord(0); = �丮���� ����,�ܾ�,ǰ�� ���� 10��

		Word[] wo = new Word[10];
		
		for(int i = 0; i < wo.length; i++) {
			wo[i] = (Word)al.get(i);
		}
		
		int [] arr = new int [10];
		
			for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			}
		
			
			
		String[] result = new String[wo.length];
		for(int i = 0; i<result.length; i++) {
			
		
			//String cook = wo[1].getSpelling();
			
			result[i] = wo[arr[i]].getSpelling();
		}
		return result;

	}
	/*
		int temp = 0;
		for(int i = 0; i<wo.length; i++) {
			for(int j = 1; j <wo.length; j++) {
				if(wo[j] < wo[i]) {
					temp = wo[i];
					wo[i] = wo[j];
					wo[j] =temp;
				}
			}
		}
	 */

	/*	for(int i = 0; i < wo.length; i++) {
			wo[i] = (Word) al.get(i);

		//	System.out.println(i+":"+wo[i]); -�ܼ�Ȯ�ο�
		}*/


public String sportsWord() {

	WordDao wd = new WordDao();
	wd.insertWord();
	ArrayList al = wd.readWord(1);
	//wd.readWord(0); = �丮���� ����,�ܾ�,ǰ�� ���� 10��

	Word[] wo = new Word[10];
	String[] str1 = new String[10];

	//�ζǾ��� �ߺ������ּ� �ҷ��°� �Ʒ� get(i)�� �ֱ�




	for(int i = 0; i < wo.length; i++) {
		wo[i] = (Word) al.get(i);
	}

	//Object obj = new Main_UZ(null);
	String sports = wo[2].getSpelling();

	return sports;
}



}





