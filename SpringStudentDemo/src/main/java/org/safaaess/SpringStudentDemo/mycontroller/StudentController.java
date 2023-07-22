package org.safaaess.SpringStudentDemo.mycontroller;
import java.util.List;
import java.util.Optional;

import org.safaaess.SpringStudentDemo.model.Student;
import org.safaaess.SpringStudentDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @Autowired
   private StudentRepository studentRepository;
// Read all Student Data
   @GetMapping("/students")
   public List<Student> getAllStudents() {
       return (List<Student>) studentRepository.findAll();
   }
   //Read or creating Student by Account number
   @GetMapping("/students/{accountNo}" )
   public Student findstudentbyaccont(@PathVariable Long accountNo) {
       return studentRepository.findByAccountNo(accountNo);
   }
  //add student detail in the database
   @PostMapping("/AddStudent")
   public long saveBook(@RequestBody Student st)
   {
       studentRepository.save(st);
       return st.getId();
   }
   @DeleteMapping("/deletebyid/{id}")
   public void deleteStudentbyId(@PathVariable("id") long id) {
       studentRepository.deleteById(id);
   }
   @DeleteMapping("/deleteAll")
   public void deleteAllStudent() {
       studentRepository.deleteAll();
   }
   @PutMapping("/updateStudentById/{id}")
   private void  updateStudent(@PathVariable("id") long stuid, @RequestBody Student stuObj) {
      Optional<Student> stuData = studentRepository.findById(stuid);
       if (stuData.isPresent()) {
           Student s = stuData.get();
           s.setName(stuObj.getName());
           s.setAccountNo(stuObj.getAccountNo());
           
           s.setMarks(stuObj.getMarks());
           studentRepository.save(s);
       }
   }
}
