/**
 * 
 */
package com.full.config;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Johnson Abraham
 * @since 03-Apr-2017, 7:22:36 AM MovieTicketBooking
 */
public class InstanceCreator {

	private static ApplicationContext applicationContext;
	private static Scanner scanner;

	public static ApplicationContext getApplicationContext() {

		if (applicationContext == null) {
			applicationContext = new ClassPathXmlApplicationContext("spring-bean-config.xml");
		}

		return applicationContext;
	}

	public static Scanner getScanner() {

		if (scanner == null) {
			scanner = new Scanner(System.in);
		}

		return scanner;
	}
}
