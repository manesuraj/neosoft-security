package com.neosoft.SecurityDemo.repo;

import com.neosoft.SecurityDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
