package com.coviam.YoStore.Mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.coviam.YoStore.Mail.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class MailController {
    @Autowired
    private JavaMailSender sender;

    @RequestMapping(method = RequestMethod.POST, value = "/sendMail")
    public String sendMail(@RequestBody Orders order, @RequestParam("emailId") String emailId) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(emailId);
            helper.setText("                                Greetings : Thanks for shopping with us !!!" +"\n"+
                    "                                =======================================================" +
                    "\n" + "                                " + order + "\n" +
                    "                                =======================================================");
            helper.setSubject("Mail From YoStore");
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        return "Mail Sent Success!";
    }
}
