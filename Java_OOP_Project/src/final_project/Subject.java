
package final_project;

import java.util.ArrayList;

public class Subject {
     private String name ;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public Subject(String name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String m="////////////////////////***********";
        return "Subject{" + "name=" + name + "\n teachers=" + teachers+"\n"+ "\n students=" + students +"\n "+m+"\n";
    }
    
    
}
