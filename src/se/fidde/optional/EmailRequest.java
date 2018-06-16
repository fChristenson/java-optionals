package se.fidde.optional;

public class EmailRequest {

	private final EmailAddress emailAddress;
	private boolean requestWasSentToRecipient;
	private Exception error;
	
	public EmailRequest(EmailAddress emailAddress) {
		if(emailAddress == null) throw new IllegalArgumentException("emailAddress can not be null!");
		this.emailAddress = emailAddress;
	}

	public boolean requestWasSentToRecipient() {
		return requestWasSentToRecipient;
	}

	public void setRequestWasSentToRecipient(boolean requestWasSentToRecipient) {
		this.requestWasSentToRecipient = requestWasSentToRecipient;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public Exception getError() {
		return error;
	}

	public void setError(Exception error) {
		this.error = error;
	}

}
