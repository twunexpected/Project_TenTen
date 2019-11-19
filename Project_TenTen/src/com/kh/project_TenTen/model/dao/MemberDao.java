package com.kh.project_TenTen.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.project_TenTen.model.vo.Member;

public class MemberDao {
	private String id;
	private char[] pass;
	private String nickName;
	private String email;
	private int exp;
	public int memNum = 0;
	public static Member loginMember;
	
	public void basicMember() {
		//기본멤버 생성
		Member m = new Member("asdf1234", new char[] {'1', '2', '3'} , "test1", "test01@naver.com", 0, 0, "초급", 0) ;
		Member m1 = new Member("asdf5678", new char[] {'1', '2', '3'} , "test2", "test01@naver.com", 0, 0, "초급", 0) ;
		Member m2 = new Member("asdf1357", new char[] {'1', '2', '3'} , "test3", "test01@naver.com", 0, 0, "초급", 0) ;
		
		MemberDao md = new MemberDao();
		ArrayList ar = new ArrayList();
		ar.add(m);
		ar.add(m1);
		ar.add(m2);
		
		md.writeMember(ar);
		
	}
	
	public void writeMember(ArrayList list) {
		
		ObjectOutputStream objOut = null;

		try {
			objOut = new ObjectOutputStream(new FileOutputStream("회원명단.txt", false));
			objOut.writeObject(list);

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
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Member> findMember() {
		
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
