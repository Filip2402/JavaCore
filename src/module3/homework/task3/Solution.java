package module3.homework.task3;

/**
 * Created by PC on 08.12.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Course course = new Course(null,"Phil");
        Course course1 = new Course(null,"Anna");
        Course course2 = new Course(30,"Kolia","Pasha");
        Course course3 = new Course(23,"Petia","Andrei");
        Course course4 = new Course(33,"Vasia","Oleg");
        Course[] courses = new Course[0];
        Student student = new Student("Philip","Protsenko",9);
        Student student1 =new Student("Protsenko",courses);
        CollegeStudent collegeStudent = new CollegeStudent("Anna","Samorodova",7);
        CollegeStudent collegeStudent1 = new CollegeStudent("Samorodova",courses);
        CollegeStudent collegeStudent2 = new CollegeStudent("NTYY KPI",12, (long) 0000);
        SpecialStudent specialStudent = new SpecialStudent("Dima","Timoshenko",2);
        SpecialStudent specialStudent1 = new SpecialStudent("Timoshenko",courses);
        SpecialStudent specialStudent2 = new SpecialStudent(12345678);
    }
}
