package com.kh.project_TenTen.controller;

import java.util.ArrayList;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;
import com.kh.project_TenTen.view.Login_MainFrame;

public class MemberController {
		
	MemberDao md = new MemberDao();
		
	public void memberSignIn(String id, char[] pass, String nickName, String email, int exp) {
		Member m = new Member(id, pass, nickName, email, exp, 0, "초급", 0);
		
		ArrayList al = md.findMember();
		
		al.add(m);
		
		md.writeMember(al);
	}
	
	//아이디 체크
	public boolean idCheck(String id) {
		ArrayList al = md.findMember();
		Member[] m = new Member[al.size()];
		
		for(int i = 0; i < m.length; i++) {
			m[i] = (Member)al.get(i);
		}
		
		boolean idCheck = false;
		
		for(int i = 0; i < al.size(); i++) {
			if(m[i].getId().equals(id)) {
				idCheck = true;
				break;
			}
		}
	
		return idCheck;
	} 
	
	public boolean passCheck(char[] pass, int passLength, String id) {
		ArrayList al = md.findMember();
		Member[] m = new Member[al.size()];
		
		for(int i = 0; i < al.size(); i++) {
			m[i] = (Member) al.get(i);
		}
		
		boolean passCheck = false;
		
		for(int i = 0; i < al.size(); i++) {
			if(m[i].getId().equals(id)) {
				if(m[i].getPassword().length == passLength) {
					for(int j = 0; j < m[i].getPassword().length; j++) {
						if(pass[j] == m[i].getPassword()[j]) {
							passCheck = true;
						}else {
							passCheck = false;
						}
							
					}
				}
			}
		}
		return passCheck;
	}
	
	public Member[] makeMemberList() {
		ArrayList list = md.findMember();
		Member[] m = new Member[list.size()];
		
		for(int i = 0; i < m.length; i++) {
			m[i] = (Member) list.get(i);
		}
		
		return m;
	}
	
	public void loginMember(String id) {
		ArrayList list = md.findMember();
		Member[] mArr = new Member[list.size()];
		
		for(int i = 0; i < mArr.length; i++) {
			mArr[i] = (Member) list.get(i);
		}
		
		for(int i = 0; i < mArr.length; i++) {
			if(id.equals(mArr[i].getId())) {
			MemberDao.loginMember = mArr[i];
			break;
			}
		}
	}//loadMemberEnd
	
	public void logoutMember() {
		Member[] m = makeMemberList();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(MemberDao.loginMember.getId())) {
				m[i] = MemberDao.loginMember;
			}
		}
		
		ArrayList list = new ArrayList();
		for(int i = 0; i < m.length; i++) {
			list.add(m[i]);
		}
		
		md.writeMember(list);
	}
	
	public void deleteMember(Member m) {
		ArrayList list = md.findMember();
		Member[] mArr = new Member[list.size()];
		for(int i = 0; i < list.size(); i++) {
			mArr[i] = (Member) list.get(i);
		}
		
		for(int i = 0; i < mArr.length; i++) {
			if(mArr[i].getId().equals(m.getId())) {
				list.remove(mArr[i]);
			}
		}
		
		md.writeMember(list);
		
	}
	
}//class end
