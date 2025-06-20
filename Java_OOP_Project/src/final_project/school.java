
package final_project;


import GUI.login;
import java.util.ArrayList;


public class school {
    public static void main(String[] args) {
       
        Teacher t1=new Teacher(3, "ahmad", "3464", "gaza", "ahmad.gmail", 34, 55, "09577832", "ahmad@@##33");
         Teacher t2=new Teacher(4, "rana", "3455624", "gaza", "rana.gmail", 344, 505, "09595832", "rana@@##33");
         Details.setTeachers(t1); Details.setTeachers(t2);
         
        Student st1=new Student("54321987", "rawand", 4);
        Student st2=new Student("578421987","rami", 3);
        Details.setStudent(st1); Details.setStudent(st2);
        
        ArrayList<Teacher> te=new ArrayList();
        te.add(t1); te.add(t2);
        
        ArrayList<Student> su=new ArrayList();
        su.add(st1); su.add(st2);
        
       Subject su1=new Subject("Arabic", te, su);
       Subject su2=new Subject("English", te, su);
       Details.setSubject(su1);  Details.setSubject(su1);
       
       Manager m1=new Manager("abdAlkareem", "4567893", "rafah", "abd@gmail.com", 50, 5000, "05789328974", "4890-ghj", 9);
       Manager m2=new Manager("abdAlrahman", "45456793", "rafah", "abd321@gmail.com", 70, 5100, "05712928974", "4986e-ghj", 8);
       Details.manager.add(m1);  Details.manager.add(m2);
       
        login l = new login();
           }
}
