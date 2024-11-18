package programmieren2.StudentUniversity;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private int semester;
    private int age;
    private University university;
    private ArrayList<Lecture> lectures;

    public Student(String lastName, String firstName, int studentId, int semester, int age){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.studentId = studentId;
        lectures = new ArrayList<>();
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public void printInfo(){
        System.out.println("Name: " + this.getFullName() + "\n" +
        "Semester: " + this.semester + "\n" +
        "Studenten Id: " +  this.studentId + "\n" +
        "Alter: " + this.age);
    }

    public void setUniversity(University university){
        this.university = university;
    }

    public University getUniversity(){
        return this.university;
    }

    public void removeUniversity(){
        this.university = null;
    }

    public void attendLecture(Lecture lecture){
        lecture.addStudent(this);
        lectures.add(lecture);
    }

    public ArrayList<Lecture> getLectures(){
        return this.lectures;
    }

}
