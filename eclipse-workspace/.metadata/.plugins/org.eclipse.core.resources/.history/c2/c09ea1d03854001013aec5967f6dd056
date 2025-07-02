package com.shristi.players;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class InsMain {

	public static void main(String[] args) {
		//create the IOCContainer
		ApplicationContext context = new  AnnotationConfigApplicationContext("com.shristi.players");
		
		Performer performer = (Performer) context.getBean("performer",Performer.class);
		performer.playSong("v", "HBD");;
	}

}
