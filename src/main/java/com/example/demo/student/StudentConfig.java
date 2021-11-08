package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args ->{
            Student Soufiane = new Student(
                    "Soufiane",
                    "soufiane.mar9@gmail.com",
                    LocalDate.of(1999, Month.MAY, 9)
            );
            Student Elharem = new Student(
                    "Elharem",
                    "selharem@gmail.com",
                    LocalDate.of(1999, Month.MAY, 9)
            );
            repository.saveAll(List.of(Soufiane, Elharem));
        };
    }
}
