package org.safaaess.studentLogin.service;

import java.util.List;

import org.safaaess.studentLogin.dto.StudentDTO;
import org.safaaess.studentLogin.model.Student;

public interface StudentService {
   void saveStudent(StudentDTO studentDto);
   Student findStudentByEmail(String email);
   List<StudentDTO> findAllStudents();
}

