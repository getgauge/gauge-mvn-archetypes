package com.test.pkg;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {
    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {
        WebElement getStartedButton = Driver.webDriver.findElement(By.xpath("//a[@href='https://docs.gauge.org/getting_started/installing-gauge.html']"));
        getStartedButton.click();

        Gauge.writeMessage("Page title is %s", Driver.webDriver.getTitle());
    }

    @Step("Ensure installation instructions are available")
    public void ensureInstallationInstructionsAreAvailable() throws InterruptedException {
        WebElement instructions = Driver.webDriver.findElement(By.xpath("//a[@href='/writing-specifications.html']"));
        assertThat(instructions).isNotNull();
    }

    @Step("Open the Gauge homepage")
    public void implementation1() {
        String app_url = System.getenv("APP_URL");
        Driver.webDriver.get(app_url + "/");
        assertThat(Driver.webDriver.getTitle()).contains("Gauge");
    }
}
