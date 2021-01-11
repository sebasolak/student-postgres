package com.example.studentpostgres.config;

import com.example.studentpostgres.model.Student;
import com.example.studentpostgres.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.ValidationException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(@Qualifier("repo") StudentRepository repository) {
        return args -> {
            Student mariam = new Student(1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 5)
            );

            repository.saveAll(
                    Arrays.asList(mariam, alex)
            );
        };


    }
}

