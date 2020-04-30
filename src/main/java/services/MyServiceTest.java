package services;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = "pretty",
        features = "my-service.feature"
)
public class MyServiceTest {

    @Test
    public void doSomething(){
        MyService service = new MyService();
        boolean success = service.doSomething();
        Assert.assertTrue("Houston, we have a problem !", success);
    }
}