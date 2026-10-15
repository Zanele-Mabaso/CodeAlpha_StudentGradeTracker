package model;

public class Student
{
  //Fields for student name and score
  private String name;
  private double score;

  //Constructor calls the two setters so validation always runs
  public Student(String name, double score)
  {
    setName(name);      
    setScore(score);
  }

  //Getters to return the name and score of the student
  public String getName()
  {
    return name;
  }

  public double getScore()
  {
    return score;
  }

  //Setters with validation
  public void setName(String name)
  {
    if (name == null || name.isBlank())      
    {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    this.name = name.trim();                 
  }

  public void setScore(double score)
  {
    if (score < 0 || score > 100)
    {
      throw new IllegalArgumentException("Score must be between 0 and 100");
    }
    this.score = score;                     
  }
}