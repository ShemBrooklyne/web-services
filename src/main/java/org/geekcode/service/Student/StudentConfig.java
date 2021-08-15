package org.geekcode.service.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/*
Created by Shem Mwangi 15/Aug/2021
*/
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student("Miriam", "Miriam@mail.com", LocalDate.of(2000, Month.APRIL, 5));
            Student alex = new Student("Alex", "Alex@mail.com", LocalDate.of(2002, Month.JANUARY, 9));

            repository.saveAll(List.of(miriam, alex));
        };
    }

}
