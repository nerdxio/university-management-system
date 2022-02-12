import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Instructors>instructors=new ArrayList<>();
        Instructors n1=new Instructors("ali",19,34324,"math",232,instructors);
        n1.addItem(n1);
        n1.display();
        n1.search("hassan");
    }
}
