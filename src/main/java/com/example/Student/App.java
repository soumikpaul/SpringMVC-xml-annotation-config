package com.example.Student;

import java.util.ArrayList;
import java.util.List;

//import com.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ClassRoom clr=(ClassRoom)context.getBean("ClassBean");
		clr.display();
	}
}
