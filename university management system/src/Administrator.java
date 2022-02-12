import java.util.ArrayList;

public class Administrator extends Person implements Process{
    private String department;
    private int salary;
    ArrayList<Technicians> AdministratorList;
    public Administrator(){

    }

    public Administrator(String name, int age, int ssn, String department, int salary,ArrayList<Technicians> AdministratorList) {
        super(name, age, ssn);
        this.department = department;
        this.salary = salary;
        this.AdministratorList=AdministratorList;
    }
    public Administrator(String name, int age, int ssn, String department, int salary) {
        super(name, age, ssn);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void addItem(Object a) {
        this.AdministratorList.add((Technicians) a);
    }

    @Override
    public void deleteItem(Object a) {
        this.AdministratorList.remove(a);
    }

    @Override
    public void display() {
        System.out.println("name : "+this.getName());
        System.out.println("age : "+this.getAge());
        System.out.println("ssn : "+this.getSsn());
        System.out.println("Department name : "+this.getDepartment());
        System.out.println("salary : "+this.getSalary());
    }

    @Override
    public void search(String n) {
        if(this.getName().equals(n)){
            System.out.println("Item is found");
        }else {
            System.out.println("Item is not found");
        }
    }
}
