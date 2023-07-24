package org.safaaess.studentLogin.repository;

import org.safaaess.studentLogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
 
  Student findByEmail(String email);
}

