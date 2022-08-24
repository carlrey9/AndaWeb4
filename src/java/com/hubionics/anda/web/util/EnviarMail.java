/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.util;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author hubio
 */
public class EnviarMail {

    public EnviarMail() {
    }

    public void sendwithMessage(String asunto, String mensaje, String mail) {
        final String[] username = { "info@humansbionics.co.uk", "info@hubionics.com" };
        final String[] nombreAddress = { asunto };
        final String[] password = { "1204!4nD4$$3rV3r!2018", "albatroZ_500" };

        final String[] server = { "smtp.gmail.com", "smtp.emailsrvr.com", "secure.mailsrvr.com",
                "mail.humansbionics.co.uk" };
        final String[] port = { "587", "25", "465", "8025" };

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", server[1]);
        props.put("mail.smtp.ssl.trust", server[1]);
        props.put("mail.smtp.port", port[0]);

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username[1], password[1]);
            }
        });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username[1], nombreAddress[0]));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mail));
            message.setSubject(asunto);
            message.setContent(mensaje, "text/html; charset=utf-8");

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EnviarMail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}