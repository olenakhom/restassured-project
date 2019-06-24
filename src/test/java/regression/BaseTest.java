package regression;

import client.RestAssuredClient;
import config.MainConfig;
import listeners.TestListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
@ContextConfiguration(classes = MainConfig.class, loader = AnnotationConfigContextLoader.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected RestAssuredClient restAssuredClient;

}
