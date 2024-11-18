package programmieren2.StudentUniversity;

public class Main {

    public static void main(String[] args){
        University uniMannheim = new University("Uni Mannheim", new Location("Coblitzallee", 68723, "Mannheim", 60), 1970);
        University uniHeidelberg = new University("Uni Heidelberg", new Location("Coblitzallee", 68723, "Mannheim", 60), 1805);
    

        Student student1 = new Student("Baumeister", "Eduard", 1, 3, 20);
        Student student2 = new Student("Roth", "Mia", 2, 1, 19);
        Student student3 = new Student("Konz", "Julian", 3, 3, 19);
        Student student4 = new Student("Homola", "Luisa", 4, 1, 20);

        Lecture programming = new Lecture("Programmieren", new Instructor("Jonathan"));
        Lecture bwl = new Lecture("BWL", new Instructor("Koslowski"));

        student1.attendLecture(programming);
        student1.attendLecture(bwl);


        uniMannheim.addStudent(student1);
        uniMannheim.addStudent(student2);

        uniHeidelberg.addStudent(student3);
        uniHeidelberg.addStudent(student4);

        for (Student student : uniMannheim.getStudents()) {
            student.printInfo();
            System.out.println(student.getUniversity());
        };

        for (Student student : uniHeidelberg.getStudents()) {
            student.printInfo();
            System.out.println(student.getUniversity());
        };

        for (Lecture lecture : student1.getLectures()) {
            System.out.println(lecture);
        };

    }
    
    

}
