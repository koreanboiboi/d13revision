package vttp.revision.d13revision;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;



@SpringBootApplication
public class D13revisionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D13revisionApplication.class, args);

		SpringApplication app = new SpringApplication(D13revisionApplication.class);
		
		String port= "8085";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if(cliOpts.containsOption("port")){
			port=cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

	}

	@Bean //COMMON LOGGING
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}

}
