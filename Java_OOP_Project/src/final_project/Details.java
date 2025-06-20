/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import java.util.ArrayList;

/**
 *
 * @author LAPTOP
 */
public class Details {
    
   public static ArrayList<Teacher> teachers=new ArrayList<Teacher>();
   public static  ArrayList<Student> student=new ArrayList<Student>();
   public static  ArrayList<Subject> subject=new ArrayList<Subject>();
   public static  ArrayList<Manager> manager=new ArrayList<Manager>();
  public static  ArrayList<Employee> employee=new ArrayList<Employee>();

    public static ArrayList<Employee> getEmployee() {
        employee.addAll(teachers);
        employee.addAll(manager);
        return employee;
    }

    public static ArrayList<Manager> getManager() {
        return manager;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static void setTeachers(Teacher t) {
      teachers.add(t);
    }

    public static ArrayList<Student> getStudent() {
        return student;
    }

    public static void setStudent(Student s) {
        Details.student.add(s);
    }

    public static ArrayList<Subject> getSubject() {
        return subject;
    }

    public static void setSubject(Subject s) {
        Details.subject.add(s);
    }

   
}
