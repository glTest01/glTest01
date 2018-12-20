package com.test.naver;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
		public static void main(String[] args) {
			System.out.println("@@START@@");
			
			AbstractApplicationContext cxt = 
					new GenericXmlApplicationContext("JobScheduler.xml");
			
		}
}
