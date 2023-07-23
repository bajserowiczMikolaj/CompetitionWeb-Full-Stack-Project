package Competition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication()
public class BackendApplication {
@Autowired
//private EmailService emailService;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail(){
//		emailService.sendEmail(
//				"mbajserowicz@gmail.com",
//				"App Start",
//				"topic");
//	}
}



