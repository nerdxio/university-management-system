import java.util.ArrayList;

public class Instructors extends Person implements Process{
    private String sbjectName;
    private int numberOFLectures;
    ArrayList<Instructors> instractorList;
    public Instructors() {
    }

    public Instructors(String name, int age, int ssn,String sbjectName, int numberOFLectures,ArrayList<Instructors> instractorList) {
        super(name, age, ssn);
        this.sbjectName = sbjectName;
        this.numberOFLectures = numberOFLectures;
        this.instractorList=instractorList;
    }

    public Instructors(String name, int age, int ssn,String sbjectName, int numberOFLectures) {
        super(name, age, ssn);
        this.sbjectName = sbjectName;
        this.numberOFLectures = numberOFLectures;
    }

    public String getSbjectName() {
        return sbjectName;
    }

    public void setSbjectName(String sbjectName) {
        this.sbjectName = sbjectName;
    }

    public int getNumberOFLectures() {
        return numberOFLectures;
    }

    public void setNumberOFLectures(int numberOFLectures) {
        this.numberOFLectures = numberOFLectures;
    }

    @Override
    public void addItem(Object a) {
        this.instractorList.add((Instructors) a);
    }

    @Override
    public void deleteItem(Object a) {
        this.instractorList.remove(a);
    }

    @Override
    public void display() {
        System.out.println("name : "+this.getName());
        System.out.println("age : "+this.getAge());
        System.out.println("ssn : "+this.getSsn());
        System.out.println("subject name : "+this.getSbjectName());
        System.out.println("number of lecture : "+this.getNumberOFLectures());
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
