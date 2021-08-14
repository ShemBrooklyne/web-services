package org.geekcode.service.Student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,"Miriam", "Miriam@mail.com", LocalDate.of(2000, Month.APRIL, 5), 16 )
        );
    }

}