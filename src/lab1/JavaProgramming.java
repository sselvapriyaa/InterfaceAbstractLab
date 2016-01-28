/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Gladwin
 */
public abstract class JavaProgramming {
    String courseName;
    String courseNumber;
    double credits;
    
    String prerequisites;

 public abstract void setCourseNumber(String courseNumber);
 public abstract void setCredits(double credits);
 public abstract void setCourseName(String courseName);
}