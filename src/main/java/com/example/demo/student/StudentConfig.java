package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam=new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1996,2,12)
            );

            Student inno= new Student(
                    "Inno",
                    "inno@gmail.com",
                    LocalDate.of(1991,10,4)
            );

            repository.saveAll(
                    List.of(mariam, inno)
            );

        };
    }
}
