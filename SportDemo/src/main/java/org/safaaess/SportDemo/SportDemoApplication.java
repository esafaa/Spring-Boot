package org.safaaess.SportDemo;

import org.safaaess.SportDemo.services.ISportInterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SportDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SportDemoApplication.class, args);
		
		  // get the bean from spring container
		ISportInterface  sport = context.getBean(ISportInterface .class);

	     
	     System.out.println(sport.getSportName());

	     System.out.println(sport.getSportType());

	     // close the context
	     context.close();
		
	}

}
