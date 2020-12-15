package com.ensaf.config;

import com.ensaf.exercices.EX1.EtudiantService;
import com.ensaf.exercices.EX2.PIService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfig {

    //deployer JersyServlet
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersyServlet = new ResourceConfig();

        jersyServlet.register(PIService.class);
        jersyServlet.register(EtudiantService.class);
        return jersyServlet;
    }
}
