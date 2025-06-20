
package final_project;

public class Teacher extends Employee{
    private int  numberOfClasses ;
    public Teacher (){
    }

    public Teacher(int numberOfClasses, String name, String id, String address, String email, double liveExpensive, double basicSalary, String phoneNumber, String password) {
        super(name, id, address, email, liveExpensive, basicSalary, phoneNumber, password);
        this.numberOfClasses = numberOfClasses;
    }
    
    public double getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
     @Override
    public String toString() {
        return super.toString()+", numberOfClasses: " +  numberOfClasses+"\n";
    }
public double getSalary() {
double  Salary =  basicSalary + (basicSalary* 10/100) +( numberOfClasses *20);
       return Salary ;
} 
}
