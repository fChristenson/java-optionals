package se.fidde.optional;

public class EmailAddress {

	private final String emailAddress;

	public EmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	@Override
	public String toString() {
		return this.emailAddress;
	}
}
