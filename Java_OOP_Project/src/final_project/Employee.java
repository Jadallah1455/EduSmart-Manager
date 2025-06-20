
package final_project;
public abstract class Employee {
    String name;
     String id;
     String address;
     String email;
     double liveExpensive;
     double basicSalary;
     String phoneNumber;
     String password;

    public Employee() {
    }
public Employee(String name, String id, String address, String email, double liveExpensive, double basicSalary, String phoneNumber, String password) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.email = email;
        this.liveExpensive = liveExpensive;
        this.basicSalary = basicSalary;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLiveExpensive() {
        return liveExpensive;
    }

    public void setLiveExpensive(double liveExpensive) {
        this.liveExpensive = liveExpensive;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String paeeword) {
        this.password = paeeword;
    }

    @Override
    public String toString() {
        return "name is: "+name+", id is: "+id+", address is: "+address+", email is: "+email+", live_expensive is: "+liveExpensive+", basic_salary is: "+basicSalary+", phone_NO is: "+phoneNumber+", password is: "+password;
    }
     
    public abstract double getSalary();
     
        }
