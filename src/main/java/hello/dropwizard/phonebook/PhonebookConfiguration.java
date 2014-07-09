package hello.dropwizard.phonebook;

import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhonebookConfiguration extends Configuration {
	
	@JsonProperty
	private String message;
	
	@JsonProperty
	private int messageRepetitions;

	public String getMessage() {
		return message;
	}

	public int getMessageRepetitions() {
		return messageRepetitions;
	}

}
