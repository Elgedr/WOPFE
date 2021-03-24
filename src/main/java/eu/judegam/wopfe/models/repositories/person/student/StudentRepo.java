package eu.judegam.wopfe.models.repositories.person.student;


import eu.judegam.wopfe.models.user.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepo extends PagingAndSortingRepository<Student, Long> {
}
