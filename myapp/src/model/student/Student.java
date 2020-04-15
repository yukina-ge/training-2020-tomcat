package model.student;

public class Student{

    private StudentId id;
    private StudentName name;
    private Gender gender;
    private ClassRoom classRoom;
    
    public Student(StudentId id, StudentName name, Gender gender, ClassRoom classRoom ){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classRoom = classRoom;
    }

    public StudentId getId(){
        return id;
    }
    
    public StudentName getName(){
        return name;
    }

    public Gender getGender(){
        return gender;
    }

    public ClassRoom getClassRoom(){
        return classRoom;
    }

    public void setId(StudentId id){
        this.id = id;
    }
    
    public void setName(){
        this.name = name;
    }

    public void setGender(){
        this.gender = gender;
    }

    public void setClassRoom(){
        this.classRoom = classRoom;
    }

    public String toString(){
        String format = "Student[id=%s, name=%s, gender=%s, classRoom=%s]";
        return String.format(format, id, name, gender, classRoom);
    }
}