package eu.judegam.wopfe.models.school;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class of a student where he/she is studying(
 */
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String school;
    private String students;
    private String timetable;
    // private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    // public void setActive(boolean active) {
        // isActive = active;
    // }

    // public boolean isActive() {
        // return isActive;
    // }

    public Class(String name, String school, String students, String timetable) {
        this.name = name;
        this.school = school;
        this.students = students;
        this.timetable = timetable;
        // this.isActive = true;
    }

    public Class() {
    }

}
