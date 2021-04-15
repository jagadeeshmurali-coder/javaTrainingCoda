package day16;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
  
public class EmailDemo  
{  
 public static void main(String [] args){  
      String to = "infojagadeesh492@gmail.com";//change accordingly  
      String from = "iamagiant@gmail.com";//change accordingly  
      String host = "localhost";//or IP address  
      final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
  
     //Get the session object  
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.port", host);  
      properties.setProperty("mail.smtp.host", "smtp.gmail.com");
      properties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
      properties.setProperty("mail.smtp.socketFactory.fallback", "false");
      properties.setProperty("mail.smtp.port", "465");
      properties.setProperty("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.debug", "true");
      properties.put("mail.store.protocol", "pop3");
      properties.put("mail.transport.protocol", "smtp");
      final String username = "infojagadeesh492@gmail.com";//
      final String password = "Gaayathri@123";
      try{
        Session session = Session.getDefaultInstance(properties, 
                            new Authenticator(){
                               protected PasswordAuthentication getPasswordAuthentication() {
                                  return new PasswordAuthentication(username, password);
                               }});  
  
     //compose the message  
      
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Ping");  
         message.setText("Hello, this is example of sending email  ");  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}  
   }  
}  
