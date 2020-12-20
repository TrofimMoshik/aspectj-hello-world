import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.moshik.tm.aspect.AspectConfig;
import ru.moshik.tm.aspect.GreetingService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;


public class AspectTest {

    ApplicationContext context ;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(AspectConfig.class);
    }

    @Test
    public void testAnnotationService() {
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println(greetingService.sayHello());
    }

}
