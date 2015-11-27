## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_selenium

## Building on top of this template

### Define a Specification

- Create a new file under `specs` directory, say "hello_world.spec".
- Define your specification in this file, an example below

```
Sample Specification
====================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use
	mvn test

* Navigate to "http://getgauge.io"

Search for Gauge Documentation
------------------------------

* Go to Gauge Get Started Page

```
Read more about [Specifications](http://getgauge.io/documentation/user/current/specifications/README.html)

### Writing the implementations

This is where the java implementation of the steps would be implemented. Since this is a Selenium based project, the java implementation would invoke Selenium APIs as required.

_We recommend considering modelling your tests using the [Page Object](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) pattern, and the [Webdriver support](https://github.com/SeleniumHQ/selenium/wiki/PageFactory) for creating them._

- Create a new class called, say, `SampleTest.java`
- Add the Step implementation in the class, an example is below:
```
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SampleTest {

    @Step("Navigate to <url>")
    public void navigateTo(String url) {
        Driver.driver.get(url);
        assertTrue(Driver.driver.getTitle().contains("Gauge"));
    }

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {
        WebElement getStartedButton = Driver.driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/section/div[2]/a[1]"));
        getStartedButton.click();
        Gauge.writeMessage("Page title is ", Driver.driver.getTitle());
    }
}
```

- Note that every Gauge step implementation is annotated with a `Step` attribute that takes the Step text pattern as a parameter.
Read more about [Step implementations in Java](http://getgauge.io/documentation/user/current/test_code/java/java.html)

