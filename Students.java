public class Students {

    private String StudentNumber ;
    private String Name ;
    private String Gender ;
    private String Grade ;


    public Students(String StudentNumber ,String Name ,String Gender ,String Grade ){
        this.StudentNumber = StudentNumber ; 
        this.Name = Name;
        this.Gender = Gender;
        this.Grade = Grade ;

    }

    public String toString (){
        return StudentNumber + " "+  Name + " " +  Gender+" " +  Grade ; 
    }
    public String getStudentNumber() {
        return StudentNumber;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getGrade() {
        return Grade;
    }



}