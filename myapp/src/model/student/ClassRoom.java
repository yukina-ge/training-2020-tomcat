package model.student;

public class ClassRoom {

    private Grade grade;
    private ClassName className;

    ClassRoom( Grade grade, ClassName className ){
        this.grade = grade;
        this.className = className;
    }

    public Grade getGrade(){
        return grade;
    }
    
    public ClassName getClassName(){
        return className;
    }
    
    public void setGrade( Grade grade ){
        this.grade = grade;
    }

    public void setClassName( ClassName className ){
        this.className = className;
    }
    
    @Override
    public String toString(){
        String format = "ClassRoom[ grade = %s, className=%s ]";
        return String.format(format, grade, className);
    }
}