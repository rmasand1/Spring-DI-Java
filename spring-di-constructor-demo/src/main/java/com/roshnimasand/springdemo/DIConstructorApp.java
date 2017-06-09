package com.roshnimasand.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roshnimasand.springdemo.domain.HumanResourceDept;
import com.roshnimasand.springdemo.domain.Organization;

public class DIConstructorApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoking the bean method
		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		//print organization details
		/*System.out.println(org);
		
		System.out.println(org.corporateService());
*/		
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
		}

}
