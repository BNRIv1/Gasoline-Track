package com.example.gasolinetrackproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class GasolineTrackProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GasolineTrackProjectApplication.class, args);
    }

}
