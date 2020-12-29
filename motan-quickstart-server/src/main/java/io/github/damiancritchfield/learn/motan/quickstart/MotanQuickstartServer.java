package io.github.damiancritchfield.learn.motan.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotanQuickstartServer {

//    public static void main(String[] args) {
//        SpringApplication.run(LscodeLearnMotanQuickstartApplication.class, args);
//    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_server.xml");
        System.out.println("server start...");
    }

}
