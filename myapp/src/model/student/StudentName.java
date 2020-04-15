package model.student;

public class StudentName{
    
    private String firstName;
    private String lastName;

    StudentName( String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName(){
        return lastName + " " + firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        String format = "StudentName[ firstName=%s, lastName=%s ]";
        return String.format(format, firstName, lastName);
    }
}