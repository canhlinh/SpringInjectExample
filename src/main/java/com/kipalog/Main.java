package com.kipalog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Spring-AutoScan.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	}

}
