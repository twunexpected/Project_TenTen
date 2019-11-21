package com.kh.project_TenTen.view;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class IdMail {
		public static String emailAddress;
		public static String[] returnNum = new String[4];
		public static String userId = null;
		
	public void getEmailAddress(String email,String id) {
		String[] args1 = {" "};
		emailAddress = email;
		userId = id;
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
			message.setSubject("[<텐텐> 아이디찾기 결과 입니다.]");
			
			// Text
			message.setText("요청하신 ID는 " + userId + " 입니다.");
			
			// send the message
			Transport.send(message);
			System.out.println("메세지가 성공적으로 전송되었습니다.");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
}