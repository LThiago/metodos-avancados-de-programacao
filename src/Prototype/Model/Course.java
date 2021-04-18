package Prototype.Model;

public class Course implements Cloneable {
    public String courseName;
    public String commonDiscipline1, commonDiscipline2, commonDiscipline3;
    public String specificDiscipline;
    public Integer courseLoad;
    
    public Course(String courseName, String commonDiscipline1, String commonDiscipline2, String commonDiscipline3,
            String specificDiscipline, Integer courseLoad) {
        this.courseName = courseName;
        this.commonDiscipline1 = commonDiscipline1;
        this.commonDiscipline2 = commonDiscipline2;
        this.commonDiscipline3 = commonDiscipline3;
        this.specificDiscipline = specificDiscipline;
        this.courseLoad = courseLoad;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCommonDiscipline1() {
        return commonDiscipline1;
    }

    public void setCommonDiscipline1(String commonDiscipline1) {
        this.commonDiscipline1 = commonDiscipline1;
    }

    public String getCommonDiscipline2() {
        return commonDiscipline2;
    }

    public void setCommonDiscipline2(String commonDiscipline2) {
        this.commonDiscipline2 = commonDiscipline2;
    }

    public String getCommonDiscipline3() {
        return commonDiscipline3;
    }

    public void setCommonDiscipline3(String commonDiscipline3) {
        this.commonDiscipline3 = commonDiscipline3;
    }

    public String getSpecificDiscipline() {
        return specificDiscipline;
    }

    public void setSpecificDiscipline(String specificDiscipline) {
        this.specificDiscipline = specificDiscipline;
    }

    public Integer getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(Integer courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return courseName + " - Course load: " + courseLoad + "h\n" +
            "Common disciplines: " + commonDiscipline1 + ", " + commonDiscipline2 + ", " + commonDiscipline3 + "\n" +
            "Specific Discipline: " + specificDiscipline;
    }

    public Course clone() throws CloneNotSupportedException{
        Course course = (Course) super.clone();
        return course;
    }
}
