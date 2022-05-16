/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author DAFA N.F
 */
class Course{
    private String courseName;

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    @Override
    public String toString(){
        return "Course(" + "courseName" + courseName +")";
    }
}
class Instructor{
    private Course[] courses = new Course[3];
    private int numberOfCourses = 0;

    /**
     * @return the courses
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(Course courses) {
        this.courses[numberOfCourses] = courses;
        numberOfCourses++;
    }
    
    @Override
    public String toString(){
        return "Instructor(" + "courses" + courses +")";
    }
    
    public void printCourses(){
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }
}
public class Dependence {
    public static void main(String[] args){
        Instructor instructor = new Instructor();
        Course java = new Course();
        java.setCourseName("Introduction To Java");
        Course c = new Course();
        c.setCourseName("Programmming C");
        instructor.setCourses(java);
        instructor.setCourses(c);
        
        instructor.printCourses();
    }
}
