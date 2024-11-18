package Task7.Problem1;

import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Student> stud=new ArrayList<>();
        stud.add(new Student("john",'C'));
        stud.add(new Student("Marc",'D'));
        stud.add(new Student("leo",'B'));
        stud.add(new Student("Michel",'A'));

        Collections.sort(stud);
        for(Student st:stud){
            System.out.println(st.getName() + " "+st.getGrades() + " ");
        }
    }
}
