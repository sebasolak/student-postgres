package com.example.studentpostgres.repository;

import com.example.studentpostgres.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("repo")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s FROM Student s WHERE s.email LIKE ?1")
    Optional<Student> findStudentByEmail(String email);
}
