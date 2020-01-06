// DO NOT EXECUTE THE PROGRAM AS IT IS IT WOULD NOT WORK, FOLLOW THE INSTRUCTIONS IN THE COMMENTS BELOW

/* Before running this program make sure to edit the email addresses and password variables as mentioned in the comments below in the code below accordingly 
and make sure you have turned on the less-secure-app setting in your gmail account  */


// Change only the values of String[] toEmails, emailsubject , emailbody, fromUser fromUserEmailPassword

// DO NOT CHANGE ANYTHING ELSE OTHERWISE THE PROGRAM WILL NOT WORK

package com.gvta.email;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
 

public class email {

	Session mailSession;
	 
    public static void main(String args[]) throws AddressException, MessagingException
    {
        email javaEmail = new email();
        javaEmail.setMailServerProperties();
        javaEmail.draftEmailMessage();
        javaEmail.sendEmail();
    }
 
    private void setMailServerProperties()
    {
        Properties emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        mailSession = Session.getDefaultInstance(emailProperties, null);
    }
 
    private MimeMessage draftEmailMessage() throws AddressException, MessagingException
  
    {
        
    	// Enter the list of (to addresses as in the array) you want to send
    	// You can enter the addresses in the form of array elements  
    	//{recipient1,recipient2, .....}
    	String[] toEmails = { "recipient-1's email address","recipient-2's e-mail address" };
    	
    	// Enter the email subject
        String emailSubject = "Test email subject";
        
        // Enter the body of the email 
        String emailBody = "This is an email sent from a Java Program\n";
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /**
         * Set the mail recipients
         * */
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /**
         * If sending HTML mail
         * */
        emailMessage.setContent(emailBody, "text/html");
        /**
         * If sending only text mail
         * */
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }
 
    private void sendEmail() throws AddressException, MessagingException
    {
        /**
         * Sender's credentials
         * */
    	// Enter your email address
        String fromUser = "Enter your email address";
        // Enter your password
        String fromUserEmailPassword = "Enter your password";
 
        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /**
         * Draft the message
         * */
        MimeMessage emailMessage = draftEmailMessage();
        /**
         * Send the mail
         * */
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
}     
	  
	
	  
	
	
	
	
