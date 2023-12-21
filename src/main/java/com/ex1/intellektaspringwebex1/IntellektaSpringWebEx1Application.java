package com.ex1.intellektaspringwebex1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IntellektaSpringWebEx1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SalesRepository salesRepository = context.getBean(SalesRepository.class);
        System.out.println("JDBC demo");
        System.out.println("JDBC count: " + salesRepository.count());
        System.out.println("JDBC find by ID: " + salesRepository.findDistinctSale(4));
        SalesJPARepositoryImplementation jpaRepositoryImplementation = context.getBean(SalesJPARepositoryImplementation.class);
        System.out.println("JPA demo");
        System.out.println("JPA count: " + jpaRepositoryImplementation.count());
        System.out.println("JPA find by ID: " + jpaRepositoryImplementation.findById(3));

    }

}
