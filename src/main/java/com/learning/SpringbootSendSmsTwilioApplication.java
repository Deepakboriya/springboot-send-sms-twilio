package com.learning;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSendSmsTwilioApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSendSmsTwilioApplication.class, args);
	}

	private static final String ACCOUNT_SID = "<Account SID>";
	private static final String AUTH_ID = "<Auth Token>";

	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		Message.creator(new PhoneNumber("+91 <personal number>"), new PhoneNumber("<My Twilio phone number>"),
				"Message from Spring Boot Application").create();
	}

}
