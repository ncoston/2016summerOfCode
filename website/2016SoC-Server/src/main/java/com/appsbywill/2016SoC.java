package com.appsbywill;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Saphira implements CommandLineRunner {

    @RequestMapping("/error")
    @ResponseBody
    public String fallbackMethod() {
        return "fallback method, not sure how we got here. Bummer.";
    }

    /**
     * The entry point for the Spring Application
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Saphira.class, args).registerShutdownHook();
    }

    @Override
    public void run(String... strings) throws Exception {
        DispatcherServlet dispatcherServlet = (DispatcherServlet) context.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        
    }


}
