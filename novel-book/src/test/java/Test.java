import org.springframework.context.annotation.Configuration;
import sn.com.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("sn.*")
@Configuration
public class Test
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Test.class);
        System.out.println(context.getBean(Student.class));
    }
}
