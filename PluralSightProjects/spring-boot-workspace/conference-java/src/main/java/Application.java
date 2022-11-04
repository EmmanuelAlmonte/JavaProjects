import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[]) {

        // This loads our application config. The appConfig file is being passed into
        // AnnotationConfigApplicationContext. This loads spring and application config
        // file into ApplicationContext. This creates a basic registry with two beans in
        // it the speakerService and speakerRepository bean.

        ApplicationContext appContext = new AnnotationConfigApplicationContext(appConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();

        // Here we our returning the Bean instance that was created in our appConfig
        // file.
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}