package factory.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.UUID;

@Slf4j
public class BasePage {

    protected static AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
    }

    public void verifyAll(SoftAssertions softAssertions){
        softAssertions.assertAll();
    }

    @Step("Attaches screen to allure report")
    public void attachScreen(String issue){
        try (InputStream attachment = Files.newInputStream(Paths.get(screenShot().getAbsolutePath()))) {
            Allure.addAttachment(issue, attachment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step("Returns a file with screenshot")
    private File screenShot(){
        File screenshot = new File(System.getProperty("user.dir") + "/screenshots/" + UUID.randomUUID().toString() + ".jpg");
        try {
            FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshot;
    }
}
