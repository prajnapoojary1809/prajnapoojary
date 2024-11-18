package Task6.Problem3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", 88, 92, 95);
        Student s2 = new Student(2, "Bob", 78, 85, 82);
        Student s3 = new Student(3, "Marc", 50,35,40);
        Student s4 = new Student(4, "Joe", 60,79,82);
        Student s5 = new Student(5, "Yulia", 99,85,92);
        Student s6 = new Student(6, "Yulia", 79,75,82);

        HashMap<String,Integer> answer=new HashMap<>();
        answer.put(s1.getName(),s1.calculate());
        answer.put(s2.getName(),s2.calculate());
        answer.put(s3.getName(),s3.calculate());
        answer.put(s4.getName(),s4.calculate());
        answer.put(s5.getName(),s5.calculate());
        answer.put(s6.getName(),s6.calculate());
        System.out.println(answer);

        HashMap<String,Character> grade=new HashMap<>();
        grade.put(s1.getName(),s1.calculateGrade());
        grade.put(s2.getName(),s2.calculateGrade());
        grade.put(s3.getName(),s3.calculateGrade());
        grade.put(s4.getName(),s4.calculateGrade());
        grade.put(s5.getName(),s5.calculateGrade());
        grade.put(s6.getName(),s6.calculateGrade());
        System.out.println(grade);

        HashMap<Character, List<String>> grp=new HashMap<>();
        grade.forEach((name,g) -> {
            if(g.equals('A')){
                grp.computeIfAbsent('A', k-> new ArrayList<>()).add(name);
            } else if (g.equals('B')) {
                grp.computeIfAbsent('B', k -> new ArrayList<>()).add(name);
            } else if (g.equals('C')) {
                grp.computeIfAbsent('C', k-> new ArrayList<>()).add(name);
            }
        });
        System.out.println(grp);


    }
}
