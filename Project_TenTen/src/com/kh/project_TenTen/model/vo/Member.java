package com.kh.project_TenTen.model.vo;

import java.io.Serializable;

public class Member implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private char[] password;
	private String nickname;
	private String email;
	private int exp;
	private int haveTen;
	private String wordLevel;
	private int level;
	private boolean logCheck;
	
	public Member() {}
	
	public Member(String id, char[] password, String nickname, String email, int exp, int haveTen, String wordLevel, int level) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.exp = exp;
		this.haveTen = haveTen;
		this.wordLevel = wordLevel;
		this.level = level;
	}



	public int getHaveTen() {
		return haveTen;
	}

	public void setHaveTen(int haveTen) {
		this.haveTen = haveTen;
	}

	public String getWordLevel() {
		return wordLevel;
	}

	public void setWordLevel(String wordLevel) {
		this.wordLevel = wordLevel;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
