package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {

    @Given("^open portal$")
    public void openPortal() {
        System.out.println("Hi\n");
    }

    @Given("^I have opened the portal$")
    public void iHaveOpenedThePortal() throws Throwable {
        System.out.println("Hi\n");

        System.setProperty("webdriver.chrome.driver", "X:\\Vishnu\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mocktrading.com/");
    }
}

