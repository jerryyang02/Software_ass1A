import java.util.List;
import java.util.ArrayList;
public class Student{
    private String studentName;
    private int studentAge;
    private String DOB;
    private int ID;
    private String userName;
    private Course course;
    private List<Module> modules;
    private List <Course> courses;

    public Student(String studentName, int studentAge, String DOB, int ID ){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.DOB = DOB;
        this.ID = ID;
        this.modules = new ArrayList<Module>();
    }
    //Create Getter and Setter Methods
    public String getSName(){

        return studentName;
    }
    public void setSName(String sName){

        this.studentName = sName;
    }
    public int getSAge(){

        return studentAge;
    }
    public void setSAge(int sAge){

        this.studentAge = sAge;
    }
    public String getDOB(){

        return DOB;
    }
    public void setDOB(String DOB){

        this.DOB = DOB;
    }
    public int getSID(){
        return ID;
    }
    public void setID(int ID){

        this.ID = ID;
    }
    //Create concatenating classes for the username
    public String getUserName(){
        String uName = studentName + ID;
        return uName;
    }
    public void setUserName(String userName){

        this.userName = userName;
    }

    public Course getCourse(){
        return course;
    }

    public void setCourses(Course course){
        this.course = course;
    }

    public List getModules(){
        return modules;
    }
    public void setModules(List<Module> modules){
        this.modules = modules;
    }
    public List getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses){
        this.courses = courses;}
    public void addModules(Module module_1)
    {
        modules.add(module_1);
    }




}

