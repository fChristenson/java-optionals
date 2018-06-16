package se.fidde.optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		EmailAddress emailAddress = new EmailAddress("foo@bar.se");
		Optional<EmailRequest> maybeRequest = EmailService.sendEmail(emailAddress);
		
		if(maybeRequest.isPresent() == false) {
			System.out.println("Request failed");
			System.exit(1);
		}
		
		EmailRequest request = maybeRequest.get();
		
		if(request.requestWasSentToRecipient() && request.getError() != null) {
			System.out.println(String.format("Email to %s was sent successfully with error: %s", request.getEmailAddress().toString(), request.getError().getMessage()));
		} else if(request.requestWasSentToRecipient()) {
			System.out.println(String.format("Email to %s was sent successfully", request.getEmailAddress().toString()));
		} else if(request.requestWasSentToRecipient() == false) {
			System.out.println(String.format("Email to %s was not sent due to: %s", request.getEmailAddress().toString(), request.getError().getMessage()));
		}
	}

}
