package com.example.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml loaded");
        Student student = context.getBean("stu",Student.class);
        student.cheating();

        AnotherStudent anotherStudent = context.getBean("anotherStu", AnotherStudent.class);
        anotherStudent.startCheating();
    }

}
