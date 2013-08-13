package org.vijaykbt.sis.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vijaykbt.sis.model.Student;
import org.vijaykbt.sis.service.StudentServiceImp;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("spring-application-context.xml");
 
    	StudentServiceImp stdService = (StudentServiceImp)appContext.getBean("studentService");
 
    	/** insert **/
    	Student std = new Student();
    	std.setStdName("James");
    	stdService.save(std);
 
    	System.out.println("Done");
    }
}