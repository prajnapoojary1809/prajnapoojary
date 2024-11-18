package Task7.Problem1;

class Student implements Comparable<Student> {
    private String name;
    private char grades;

    public int compareTo(Student o)//applying compareTo method
    {
        return this.grades - o.grades;
    }

    Student(String name,char grades)//Constructor
    {
        this.name=name;
        this.grades=grades;
    }

    public String getName() {
        return name;
    }

    public char getGrades() {
        return grades;
    }
}