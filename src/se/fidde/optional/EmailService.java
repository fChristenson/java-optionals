package se.fidde.optional;

import java.util.Optional;
import se.fidde.optional.EmailRequest;

public class EmailService {

	public static Optional<EmailRequest> sendEmail(EmailAddress emailAddress) {
		if(emailAddress == null) return Optional.empty();

		EmailRequest request = new EmailRequest(emailAddress);
		
		try {
			// try to send email
			
			if(Math.random() > 0.5) {
				// our request failed
				request.setRequestWasSentToRecipient(false);
				throw new Exception("Connection failed");
			} else {
				// even if the request works we can get errors
				request.setRequestWasSentToRecipient(true);
				if(Math.random() > 0.5) {
					throw new Exception("Unexpected response");
				}
			}
			
			return Optional.of(request);
		
		} catch (Exception e) {
			request.setError(e);
			return Optional.of(request);
		}
	}

}
