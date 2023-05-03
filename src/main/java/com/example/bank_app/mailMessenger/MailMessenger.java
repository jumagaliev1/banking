package com.example.bank_app.mailMessenger;

import com.example.bank_app.config.MailConfig;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;

public class MailMessenger {

    public static void htmlEmailMessenger(String from, String toMail, String subject, String body) throws MessagingException, javax.mail.MessagingException {

        JavaMailSender sender = MailConfig.getMailConfig();
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper htmlMessage = new MimeMessageHelper(message, true);

        htmlMessage.setTo(toMail);
        htmlMessage.setFrom(from);
        htmlMessage.setSubject(subject);
        htmlMessage.setText(body, true);
        sender.send(message);
    }
}
