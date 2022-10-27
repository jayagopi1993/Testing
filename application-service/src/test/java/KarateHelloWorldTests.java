import com.intuit.karate.junit5.Karate;
import com.karate.demoservice.ApplicationServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = {ApplicationServiceApplication.class})
public class KarateHelloWorldTests {

    @Karate.Test
    Karate hello1Test() {
        return Karate.run("classpath:helloworld.feature");
    }

}
