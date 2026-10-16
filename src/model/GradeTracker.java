package model;
import java.util.ArrayList;
import java.util.List;

public class GradeTracker{
 private final List<Student>  students = new ArrayList<>();
 public void addStudent(Student student)
 {
   if(student == null)
  {
    throw new IllegalArgumentException("Student cannot be null");

   }
   else if (students.contains(student))
   {
    throw new IllegalArgumentException("Student already exists in a list");
    
   }
   students.add(student);
 }
 public List<Student> getStudent()
 {
  return new ArrayList<>(students);

 }
} 