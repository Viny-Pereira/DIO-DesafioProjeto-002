import java.time.LocalDate;

import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Java description");
        course1.setCourseLoad(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript");
        course2.setDescription("JavaScript description");
        course2.setCourseLoad(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring Java");
        mentoring.setDescription("Description Mentoring Java");
        mentoring.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);

    }
}
