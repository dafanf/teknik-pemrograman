package praktikum6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DAFA N.F
 */
class Student{
    String name;
    int id;
    String dept;
    Student(String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

class Departement{
    String name;
    private List<Student> students;
    Departement(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }
    public List<Student> getStudents(){
        return students;
    }
}

class Institute{
    String instituteName;
    private List<Departement> departements;
    Institute(String instituteName, List<Departement> departements){
        this.instituteName = instituteName;
        this.departements = departements;
    }
    public int getTotalStudentInstitute(){
        int noOfStudents = 0;
        List<Student> students;
        for(Departement dept : departements){
            students = dept.getStudents();
            for(Student s : students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
public class Aggregation {
    public static void main(String[] args){
        Student s1 = new Student("Ardhian", 1, "CSE");
        Student s2 = new Student("Wendi", 1, "CSE");
        Student s3 = new Student("Zulkifli", 1, "EE");
        Student s4 = new Student("Rahul", 1, "EE");
        
        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        
        Departement CSE = new Departement("CSE", cse_students);
        Departement EE = new Departement("EE", ee_students);
        
        List<Departement> departements = new ArrayList<Departement>();
        departements.add(CSE);
        departements.add(EE);
        
        Institute institute = new Institute("BITS", departements);
        System.out.println("Total student in institute : "+institute.getTotalStudentInstitute());
    }
}
