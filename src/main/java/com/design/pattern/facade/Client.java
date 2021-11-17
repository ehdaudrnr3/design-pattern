package com.design.pattern.facade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("user@daum.net");
        emailMessage.setTo("kim@naver.com");
        emailMessage.setSubject("squid game");
        emailMessage.setText("all die");
        emailSender.send(emailMessage);
    }
}
