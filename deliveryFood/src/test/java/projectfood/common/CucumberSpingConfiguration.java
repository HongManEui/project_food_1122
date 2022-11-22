package projectfood.common;


import projectfood.DeliveryFoodApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryFoodApplication.class })
public class CucumberSpingConfiguration {
    
}
