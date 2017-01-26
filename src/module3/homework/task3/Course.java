package module3.homework.task3;

import javax.xml.crypto.Data;

/**
 * Created by PC on 08.12.2016.
 */
public class Course {
    private Data startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Data startDate,String name){

    }

    Course(int hoursDuration,String name, String teacherName){

    }

    public Data getStartDate() {
        return startDate;
    }

    public void setStartDate(Data startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
