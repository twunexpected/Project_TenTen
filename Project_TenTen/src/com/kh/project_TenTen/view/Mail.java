package com.kh.project_TenTen.view;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
		public static String emailAddress;
		public static String[] returnNum = new String[4];
		
	public void getEmailAddress(String email) {
		String[] args1 = {" "};
		emailAddress = email;
	}
	
	public static void main(String[] args){
		Login_SubPage sl = new Login_SubPage();
		
		String host = "smtp.naver.com";
		final String user = "voila_";
		final String password = "zmflatms09!";

		String to = emailAddress;

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		
		
		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject
			message.setSubject("[이메일 인증번호 입니다.]");
			
			int[] arr1 = new int[4];
			arr1[0] = (int)(Math.random() * 10);
			arr1[1] = (int)(Math.random() * 10);
			arr1[2] = (int)(Math.random() * 10);
			arr1[3] = (int)(Math.random() * 10);
			String[] arr2 = new String[4];
			for(int i = 0; i < arr1.length; i++) {
				arr2[i] = String.valueOf(arr1[i]);
				returnNum[i] = arr2[i];
				System.out.print(returnNum[i]);
			}
			
			// Text
			message.setText("임시 비밀번호 입니다. 다음 4자리를 입력하세요. \n" + arr2[0] + arr2[1] + arr2[2] + arr2[3]);
			
			// send the message
			Transport.send(message);
			System.out.println("메세지가 성공적으로 전송되었습니다.");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
}