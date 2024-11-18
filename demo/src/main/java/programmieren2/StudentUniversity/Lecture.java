package programmieren2.StudentUniversity;

import java.util.ArrayList;

public class Lecture {
    private String name;
    private Instructor instructor;
    private ArrayList<Student> students;

    public Lecture(String name, Instructor instructor){
        this.students = new ArrayList<>();
        this.name = name;
        this.instructor = instructor;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public Instructor getInstructor(){
        return this.instructor;
    }

    public String toString(){
        return name;
    }

}
