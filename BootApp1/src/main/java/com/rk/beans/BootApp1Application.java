package com.rk.beans;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=null;
		WaiterBot waiterBot=null;
		String itemName=null;
		Scanner scn=null;
		
		//instantiation of scanner object to wards console stream.
		scn=new Scanner(System.in);
		
		context=SpringApplication.run(BootApp1Application.class, args);
		
		
		System.out.println("ConfigurableApplicationContext object reference ::"+context);
		
		
		//getting waiter boy bean object.
		waiterBot=context.getBean("waiterBot",WaiterBot.class);

		System.out.println("Hello sir/madam ,What do you want on our Breakfast ?");
		itemName=scn.nextLine();
		//calling waiter bot 
		System.out.println(waiterBot.getMenuDeails(itemName));
		

		//closing the IOC container.
		context.close();
	}
}
