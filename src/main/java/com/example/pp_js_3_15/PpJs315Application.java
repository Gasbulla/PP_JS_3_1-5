package com.example.pp_js_3_15;

import com.example.pp_js_3_15.Connection.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PpJs315Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PpJs315Application.class, args);

        Connection connection = context.getBean("connection", Connection.class);
        System.out.println("Answer: " + connection.getAnswer());
    }
}
