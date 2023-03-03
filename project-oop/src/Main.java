import java.time.LocalDate;

import br.com.dio.challenge.domain.BootCamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
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

        // System.out.println(course1);
        // System.out.println(course2);
        // System.out.println(mentoring);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("BootCamp Java Developer");
        bootCamp.setDescription("Desciption BootCamp Java Developer");
        bootCamp.getContents().add(course1);
        bootCamp.getContents().add(course2);
        bootCamp.getContents().add(mentoring);

        Dev devViny = new Dev();
        devViny.setName("Viny");
        System.out.println("Subscritions: " + devViny.getSubscriptionsContent());

        Dev devMaria = new Dev();
        devMaria.setName("Maria");
        System.out.println("Subscritions: " + devMaria.getSubscriptionsContent());

        devViny.subscribeBootCamp(bootCamp);
        System.out.println("Subscritions: " + devViny.getSubscriptionsContent());
        System.out.println("XP: " + devViny.calculeTotalXP());

        devMaria.subscribeBootCamp(bootCamp);
        System.out.println("Subscritions: " + devMaria.getSubscriptionsContent());
        System.out.println("XP: " + devMaria.calculeTotalXP());

        System.out.println("Concluded: " + devViny.getConcluedContent());
        devViny.progress();
        devViny.progress();
        System.out.println("Concluded: " + devViny.getConcluedContent());
        System.out.println("Subscritions: " + devViny.getSubscriptionsContent());
        System.out.println("XP: " + devViny.calculeTotalXP());

        System.out.println("Concluded: " + devMaria.getConcluedContent());
        devMaria.progress();
        devMaria.progress();
        devMaria.progress();
        System.out.println("Concluded: " + devMaria.getConcluedContent());
        System.out.println("Subscritions: " + devMaria.getSubscriptionsContent());
        System.out.println("XP: " + devMaria.calculeTotalXP());

    }
}
