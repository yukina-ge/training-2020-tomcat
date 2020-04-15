package model.student;

import java.util.Map;
import java.util.HashMap;

public class StudentFactory {

    private static Map<StudentId, Student> students;

    static {
        students = new HashMap<StudentId, Student>();
        createStudent1(students);
        createStudent2(students);
        createStudent3(students);
        System.out.println(students);
    }

    public static boolean notExistsStudent( StudentId studentId ){
        return ! students.containsKey(studentId);
    }

    public static Student findBy( StudentId studentId ){
        return students.get(studentId);
    }

    private static void createStudent1(Map<StudentId, Student> students){
        StudentId id = new StudentId(100);
        StudentName name = new StudentName("はなこ", "せいと");
        Gender gender = Gender.FEMALE;
        Grade grade = new Grade(3);
        ClassName className = new ClassName("星");
        ClassRoom classRoom = new ClassRoom(grade, className);
        Student student = new Student(id, name, gender, classRoom);
        students.put(id, student);
    }

    private static void createStudent2(Map<StudentId, Student> students){
        StudentId id = new StudentId(101);
        StudentName name = new StudentName("たろう", "がくせい");
        Gender gender = Gender.MALE;
        Grade grade = new Grade(5);
        ClassName className = new ClassName("雪");
        ClassRoom classRoom = new ClassRoom(grade, className);
        Student student = new Student(id, name, gender, classRoom);
        students.put(id, student);
    }

    public static void createStudent3(Map<StudentId, Student> students){
        StudentId id = new StudentId(102);
        StudentName name = new StudentName("じろう", "めんばー");
        Gender gender = Gender.MALE;
        Grade grade = new Grade(2);
        ClassName className = new ClassName("花");
        ClassRoom classRoom = new ClassRoom(grade, className);
        Student student = new Student(id, name, gender, classRoom);
        students.put(id, student);
    }
}