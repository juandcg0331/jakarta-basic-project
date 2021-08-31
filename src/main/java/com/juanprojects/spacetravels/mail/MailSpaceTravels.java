package com.juanprojects.spacetravels.mail;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSpaceTravels {

    public void sendMail(String emailTo){
        String from = "juandcg0331@gmail.com";
        String userName = "juandcg0331@gmail.com";
        String password = "Ju97033118787";

        String host = "smtp.gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });

        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
            message.setSubject("Welcome to SpaceTravels");
            message.setText("Welcome to SpaceTravels confirm your email... \n\nPD:This Email gonna send from user back student practice SpaceTravels : Juan Diego Cagua.");
            Transport.send(message);
            System.out.println("Correo mail enviado de forma exitosa a :" + emailTo);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}
