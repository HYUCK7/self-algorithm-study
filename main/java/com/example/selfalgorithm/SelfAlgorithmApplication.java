package com.example.selfalgorithm;

import com.example.selfalgorithm.selfService.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SelfAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfAlgorithmApplication.class, args);

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        controller.execute(scanner);
    }
}
