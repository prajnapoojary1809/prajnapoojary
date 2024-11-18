package Task6.Problem3;

public class Student {
    private int id;
    private String name;
    private int[] grades;
    public int avgsum=0;
    public Student(int id, String name, int ...grades) {
        this.id = id;
        this.name = name;
        this.grades =grades;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }
    public int calculate(){//method to calculate average
        int sum=0;
        for(int i=0;i<grades.length;i++){
            sum+=grades[i];
        }
        avgsum=sum/grades.length;
        return avgsum;
    }
    public char calculateGrade() {
        if (avgsum >= 90)
            return 'A';
        else if (avgsum >= 80)
            return 'B';
        else
            return 'C';
    }

}

