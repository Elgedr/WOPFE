package eu.judegam.wopfe.controllers.person;

import eu.judegam.wopfe.models.repositories.person.student.StudentService;
import eu.judegam.wopfe.models.timetable.Event;
import eu.judegam.wopfe.models.timetable.Timetable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping("/main/student")
    public String studentHome(Model model) {
        return "mains/student_main";
    }

    @GetMapping("/main/student/class")
    public String studentClass(Model model) {
        return "mains/student_main";
    }

    @GetMapping("/main/student/grades")
    public String studentGrades(Model model) {
        return "mains/student_main";
    }

    @GetMapping("/main/student/tasks")
    public String studentTasks(Model model) {
        return "/mains/student_main";
    }

    @GetMapping("/main/student/timetable")
    public String studentTimetable(Model model) {
        Timetable tt = service.getStudentTtById(1L);
        model.addAttribute("timetable", tt);
        model.addAttribute("event", new Event());
        return "/person/student/student_timetable";
    }

}
