
package final_project;
public class Manager extends Employee{
    double bonus;

    public Manager() {
    }

public Manager(String name, String id, String address, String email, double liveExpensive, double basicSalary, String phoneNumber, String password,double bonus) {
        super(name,id,address, email, liveExpensive, basicSalary, phoneNumber, password);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+", bonus is: "+bonus+"\n"; 
    }
    
    
    
    public double getSalary(){
        double salary= basicSalary+(basicSalary*bonus/100)+liveExpensive;
        return salary;
    }
    
}
