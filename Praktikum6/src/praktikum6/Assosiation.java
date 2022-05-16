package praktikum6;

/**
 * @author DAFA N.F
 */
class Murid{
    private Course[] courses = new Course[6];
    private int numberOfCourses = 0;
    private String nameMurid = "";

    /**
     * @return the nameMurid
     */
    public String getNameMurid() {
        return nameMurid;
    }

    /**
     * @param nameMurid the nameMurid to set
     */
    public void setNameMurid(String nameMurid) {
        this.nameMurid = nameMurid;
    }

    /**
     * @return the courses
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(Course course) {
        this.courses[getNumberOfCourses()] = course;
        setNumberOfCourses(getNumberOfCourses() + 1);
    }

    /**
     * @return the numberOfCourses
     */
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    /**
     * @param numberOfCourses the numberOfCourses to set
     */
    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}

public class Assosiation {
    public static void main(String[] args){
        Murid Ilham = new Murid();
        Ilham.setNameMurid("Ilham");
        Course java = new Course();
        Course c = new Course();
        java.setCourseName("Introduction To Java");
        c.setCourseName("Programming C");
        Ilham.setCourses(java);
        Ilham.setCourses(c);
        System.out.println("Student Name : " + Ilham.getNameMurid());
        System.out.println("Number Of Course Taken : " + Ilham.getNumberOfCourses());
        Course[] courses = Ilham.getCourses();
        for (int i = 0; i < Ilham.getNumberOfCourses();i++) {
            System.out.println(courses[i].getCourseName());
        }
    }
}
