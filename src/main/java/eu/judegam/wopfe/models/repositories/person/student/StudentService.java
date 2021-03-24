package eu.judegam.wopfe.models.repositories.person.student;

import eu.judegam.wopfe.models.school.tests.Test;
import eu.judegam.wopfe.models.timetable.Event;
import eu.judegam.wopfe.models.timetable.Timetable;
import eu.judegam.wopfe.models.user.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public Timetable getStudentTtById(Long id) {
        Optional<Student> foundStud = repo.findById(id);
        if (foundStud.isPresent()) {
            return foundStud.get().getTimetable();
        }
        Timetable tt = new Timetable("testTimetable", new ArrayList<>());
        Event e1 = new Event("testEvent", "testPlace", "testTeacher", tt);
        e1.setDay("Monday");
        e1.setTime("08:00");
        tt.getEvents().add(e1);
        return tt;
    }

    public Test getStudentTasksById(Long id) {
//        Optional<Student> foundStud = repo.findById(id);
//        if (foundStud.isPresent()) {
//            return foundStud.get().getTask();
//        }
        Test test = new Test("testTimetable", "now", 123);
        return test;
    }

}
