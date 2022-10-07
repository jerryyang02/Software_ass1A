import org.joda.time.DateTime;
import java.util.*;


public class Course {
    private DateTime startDate, endDate;
    private String courseName;
    private List<Student> students;
    private List<Module> modules;



    public Course(String courseName, String startDate, String endDate){
        this.courseName = courseName;
        this.startDate = DateTime.parse(startDate);
        this.endDate = DateTime.parse(endDate);
        this.students = new ArrayList<Student>();
        this.modules = new ArrayList<Module>();
    }

    //Create getters and setters methods
    public String getCourse(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    //create method to store the list of student
    public List<Student> getListStudents(){
        return students;
    }
    public void setListStudent(List<Student> students){
        this.students = students;
    }

    public List<Module> getModules(){
        return modules;
    }
    public void setListModules(List<Module> modules){this.modules = modules;}

    public void add(Student student){
        students.add(student);
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void setModules(Module module_1, Module module_2){
        modules.add(module_1);
        modules.add(module_2);
    }
    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return courseName;
    }


}

