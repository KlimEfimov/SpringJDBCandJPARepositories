package com.ex1.intellektaspringwebex1;

import jakarta.transaction.Transactional;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;

@SpringBootApplication
public class IntellektaSpringWebEx1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

}
