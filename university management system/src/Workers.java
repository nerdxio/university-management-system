import java.util.ArrayList;

public class Workers extends Person implements Process{
    private int salary;
    private int worksHoure;
    ArrayList<Workers>workersList;
    public Workers() {
    }

    public Workers(String name, int age, int ssn,int salary, int worksHoure) {
        super(name, age, ssn);
        this.salary = salary;
        this.worksHoure = worksHoure;
    }

    public Workers(String name, int age, int ssn,int salary, int worksHoure,ArrayList<Workers>workersList) {
        super(name, age, ssn);
        this.salary = salary;
        this.worksHoure = worksHoure;
        this.workersList=workersList;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorksHoure() {
        return worksHoure;
    }

    public void setWorksHoure(int worksHoure) {
        this.worksHoure = worksHoure;
    }

    @Override
    public void addItem(Object a) {
        this.workersList.add((Workers) a);
    }

    @Override
    public void deleteItem(Object a) {
        this.workersList.remove(a);
    }

    @Override
    public void display() {
        System.out.println("name : "+this.getName());
        System.out.println("age : "+this.getAge());
        System.out.println("ssn : "+this.getSsn());
        System.out.println("salary : "+this.getSalary());
        System.out.println("Work hours : "+this.getWorksHoure());
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
