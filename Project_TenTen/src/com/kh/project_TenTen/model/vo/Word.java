package com.kh.project_TenTen.model.vo;

import java.io.Serializable;

public class Word implements Serializable {
	private String spelling;
	private String subject;
	private String mean;
	private String kind;
	
	public Word() {}
	
	public Word(String spelling, String subject, String mean, String kind) {
		super();
		this.spelling = spelling;
		this.subject = subject;
		this.mean = mean;
		this.kind = kind;
	}
	
	public String getSpelling() {
		return spelling;
	}
	
	public void setSpelling() {
		this.spelling = spelling;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Word [subject=" + subject + ", mean=" + mean + ", kind=" + kind + "]";
	}
	
	
}
