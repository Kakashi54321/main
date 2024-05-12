package com.dilip.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Traditional Java way
    	Person obj = new Human();
    	obj.info();
    	
    	//Using ApplicationContext, xml configuration file
    	//Using bean definition in xml file as well as by adding component-scan and @component
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Person obj1 = (Person) context.getBean("human");
        obj1.info();
        
    	//Setter Injection
        Person obj2 = (Person) context.getBean("student");
        System.out.println(obj2.toString());
        
        //Constructor Injection and Autowired annotation to read human in teacher class
        Person obj3 = (Person) context.getBean("teacher");
        System.out.println(obj3.toString());
        
        //@Bean annotation in a custom Java configuration class and use of component scan
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Person obj4 = factory.getBean(Human.class);
        obj4.info();
        
        //Spring AOP
        Aop obj5 = factory.getBean(Aop.class);
        obj5.show();
 
    }
}
