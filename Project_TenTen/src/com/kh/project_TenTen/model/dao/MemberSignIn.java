package com.kh.project_TenTen.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.project_TenTen.model.vo.Member;

public class MemberSignIn {
	
	private String id;
	private char[] pass;
	private String nickName;
	private String email;
	private int exp;
	public int memNum = 0;
	
	public ArrayList<Member> memberSignIn(String id, char[] pass, String nickName, String email, int exp) {
		memNum++;
		Member m = new Member(id, pass, nickName, email, exp);
		
		ArrayList<Member> mlist = new ArrayList();
		
		mlist.add(m);
		
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("회원명단.txt"));
			objOut.writeObject(mlist);
			
			objOut.flush();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				objOut.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		return mlist;
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Member> findMember() {
		MemberSignIn ms = new MemberSignIn();
		
		ObjectInputStream objIn = null;
		ArrayList<Member> mlist = new ArrayList();
		memNum = mlist.size();
		
		try {
			objIn = new ObjectInputStream(new FileInputStream("회원명단.txt"));
			mlist = (ArrayList<Member>) objIn.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mlist ;
	}
	
	
}


