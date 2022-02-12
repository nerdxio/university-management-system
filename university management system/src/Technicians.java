import java.util.ArrayList;

public class Technicians extends Person implements Process{
    private int workHours;
    private int salary;
    ArrayList<Technicians>echniciansList;
    public Technicians() {
    }

    public Technicians(String name, int age, int ssn,int workHours, int salary) {
        super(name,age,ssn);
        this.workHours = workHours;
        this.salary = salary;
    }
    public Technicians(String name, int age, int ssn,int workHours, int salary,ArrayList<Technicians>echniciansList) {
        super(name,age,ssn);
        this.workHours = workHours;
        this.salary = salary;
        this.echniciansList=echniciansList;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void addItem(Object a) {
        this.echniciansList.add((Technicians) a);
    }

    @Override
    public void deleteItem(Object a) {
        this.echniciansList.remove(a);
    }

    @Override
    public void display() {
        System.out.println("name : "+this.getName());
        System.out.println("age : "+this.getAge());
        System.out.println("ssn : "+this.getSsn());
        System.out.println("work hours : "+this.getWorkHours());
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
