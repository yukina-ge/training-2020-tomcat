package model.student;

public class Grade{
    
    private Integer value;

    Grade( Integer value ){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }

    public void setValue(Integer value){
        this.value = value;
    }

    @Override
    public String toString(){
        String format = "Grade[ value = %s ]";
        return String.format(format, value);
    }
}