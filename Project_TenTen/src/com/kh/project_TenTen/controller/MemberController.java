package com.kh.project_TenTen.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.project_TenTen.model.dao.MemberDao;
import com.kh.project_TenTen.model.vo.Member;

public class MemberController {
		
	MemberDao md = new MemberDao();
		
	public void memberSignIn(String id, char[] pass, String nickName, String email, int exp) {
		Member m = new Member(id, pass, nickName, email, exp);
		
		ArrayList al = md.findMember();
		al.add(m);
		
		md.writeMember(al);
	}
}
