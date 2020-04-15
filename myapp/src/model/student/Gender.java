package model.student;

public enum Gender{

    MALE("男性"),
    FEMALE("女性");

    private String label;
    
    Gender( String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}