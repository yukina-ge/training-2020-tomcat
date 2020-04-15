package model.student;

public class ClassName {

    private String value;

    ClassName( String value ){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        String format = "ClassName[ value = %s ]";
        return String.format(format, value);
    }
}