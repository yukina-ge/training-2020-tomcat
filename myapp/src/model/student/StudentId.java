package model.student;

public class StudentId{
    
    private Integer value;

    public StudentId( Integer value ){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }

    public void setValue(Integer value){
        this.value = value;
    }

    @Override
    public boolean equals( Object obj ){
        if (obj == null) return false;
        if (this == obj) return true;
        if ( !(obj instanceof StudentId) ) return false;

        StudentId target = (StudentId) obj;
        return value.equals(target.getValue());
    }

    @Override
    public int hashCode(){
        return value.hashCode();
    }

    @Override
    public String toString(){
        String format = "StudentId[ value = %s ]";
        return String.format(format, value);
    }
}