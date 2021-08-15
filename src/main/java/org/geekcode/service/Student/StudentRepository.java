package org.geekcode.service.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
Created by Shem Mwangi 15/Aug/2021
*/
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query("SELECT s FROM Student s WHERE s.email = ?!")
    Optional<Student> findStudentByEmail(String email);
}
