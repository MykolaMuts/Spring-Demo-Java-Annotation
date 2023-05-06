package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        //System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());

        //SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        //System.out.println(service2); //it will print exact same object address
    }
}
