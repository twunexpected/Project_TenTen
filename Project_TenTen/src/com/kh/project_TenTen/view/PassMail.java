package com.kh.project_TenTen.view;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class PassMail {
		public static String emailAddress;
		public static int[] temporaryPass = new int[4];
		
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
		
		int[] arr1 = new int[4];
		arr1[0] = (int)(Math.random() * 10);
		arr1[1] = (int)(Math.random() * 10);
		arr1[2] = (int)(Math.random() * 10);
		arr1[3] = (int)(Math.random() * 10);
		for(int i = 0; i < arr1.length; i++) {
			temporaryPass[i] = arr1[i];
			System.out.print(temporaryPass[i]);
		}
		
		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject
			message.setSubject("[<����> ��й�ȣ ã�� ��� �Դϴ�.]");
			
			// Text
			message.setText("�ӽú�й�ȣ�� �߱޵Ǿ����ϴ�. " + "\n�ӽ� ��й�ȣ��" + temporaryPass[0] + temporaryPass[1] + temporaryPass[2]
					+ temporaryPass[3] + "�Դϴ�.");
			

			
			// send the message
			Transport.send(message);
			System.out.println("�޼����� ���������� ���۵Ǿ����ϴ�.");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
}