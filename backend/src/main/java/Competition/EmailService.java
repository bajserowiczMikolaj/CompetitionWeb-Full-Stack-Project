//package Competition;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
////write exception if not network avalible
//
//
//@Service
//public class EmailService {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendEmail(String to,
//                          String subject,
//                          String body) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("pleasworkislate@gmail.com");
//        message.setTo(to);
//        message.setSubject(body);
//        message.setText(subject);
//
//        mailSender.send(message);
//    }
//}

