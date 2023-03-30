package com.nology.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BackendApplication {

//	@Autowired
//	public EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail(){
//		senderService.sendEmail("mbajserowicz@gmail.com","testEmail","testEmailBody");
//	}

}
