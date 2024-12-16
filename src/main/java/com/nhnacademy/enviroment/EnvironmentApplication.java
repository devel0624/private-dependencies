package com.nhnacademy.enviroment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EnvironmentApplication {

    public static void main(String[] args) {
        log.error("Starting Environment Application");
        SpringApplication.run(EnvironmentApplication.class, args);
    }

}
