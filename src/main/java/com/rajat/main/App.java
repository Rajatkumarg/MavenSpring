package com.rajat.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans.Employee;
import com.rajat.beans.Student;

public class App {
	
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf.xml");
        Student stu = context.getBean("stdObj",Student.class);
        System.out.println(stu);
        
        context = new AnnotationConfigApplicationContext(com.rajat.beans.Employee.class);//OR we can create AppConfig and provide @Configuration and @ComponentScan
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
    }
}
