package hello.dropwizard;

import hello.dropwizard.phonebook.PhonebookConfiguration;
import hello.dropwizard.phonebook.resources.ContactResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends Application<PhonebookConfiguration> {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	@Override
	public void initialize(Bootstrap<PhonebookConfiguration> b) {
		
	}

	@Override
	public void run(PhonebookConfiguration c, Environment env) throws Exception {

		logger.info("Method App#run called");
		
		for (int i = 0; i < c.getMessageRepetitions(); i++) {
			System.out.println(c.getMessage());
		}
		
		env.jersey().register(ContactResource.class);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new App().run(args);
		
	}

}
