package com.klu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppXML {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Student student = (Student) context.getBean("student");
            student.display();
        }
    }
}
