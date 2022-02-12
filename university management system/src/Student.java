import java.util.ArrayList;

public class Student extends Person implements Process {
    private int studentId;
    private int level;
    ArrayList<Student>studentsList=new ArrayList<>();
    public Student() {
    }

    public Student(String name, int age, int ssn,int studentId, int level) {
        super(name,age,ssn);
        this.studentId = studentId;
        this.level = level;

    }

    public Student(String name, int age, int ssn,int studentId, int level,ArrayList<Student>studentsList) {
        super(name,age,ssn);
        this.studentId = studentId;
        this.level = level;
        this.studentsList=studentsList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void addItem(Object item) {
        this.studentsList.add((Student) item);
    }

    @Override
    public void deleteItem(Object s) {
        this.studentsList.remove(s);
    }



    @Override
    public void display() {
        System.out.println("name : "+this.getName());
        System.out.println("age : "+this.getAge());
        System.out.println("ssn : "+this.getSsn());
        System.out.println("id : "+this.getStudentId());
        System.out.println("level : "+this.getLevel());
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
