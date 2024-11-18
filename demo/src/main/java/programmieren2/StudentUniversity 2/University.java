package programmieren2.StudentUniversity;

import java.util.ArrayList;

public class University {
    private String name;
    private Location location;
    private int foundedYear;
    private ArrayList<Student> students;


    public University(String name, Location location, int foundedYear){
        this.students =  new ArrayList<>();
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public void addStudent(Student student){
        this.students.add(student);
        student.setUniversity(this);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
        student.removeUniversity();
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public String toString(){
        return this.name + ", " + this.location + ", " + this.foundedYear;
    }



}
