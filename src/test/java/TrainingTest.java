import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public  class TrainingTest {
    WebDriver driver =  new EdgeDriver();
    private final Color RGB_COLOUR = Color.fromString("rgb(86, 61, 124)");



    @Test
    public void textPain() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String expectedCity = "Ввод города";
        WebElement input = driver.findElement(By.id("my-text-id"));
        input.sendKeys(expectedCity);
        String actualText = input.getAttribute("value");
        Assert.assertEquals(expectedCity,actualText);
    }

    @Test
    public void password() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String expectedPassword = "qwerty";
        WebElement input  =driver.findElement(By.name("my-password"));
        input.sendKeys(expectedPassword);
        String actualPassword = input.getAttribute("value");
        Assert.assertEquals(expectedPassword,actualPassword);
    }

    @Test
    public void textarea() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String expectedCity = "Держинский";
        WebElement input = driver.findElement(By.name("my-textarea"));
        input.sendKeys(expectedCity);
        String actualText = input.getAttribute("value");
        Assert.assertEquals(expectedCity,actualText);
    }

    @Test
    public void clickOutstandingListOne() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.name("my-select"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public void clickOutstandingListTwo() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.name("my-datalist"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public void clickRadio1() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.id("my-radio-1"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public void clickRadio2() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.id("my-radio-2"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public void clickDefault() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.id("my-check-2"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public void clickChecked() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement buuton = driver.findElement(By.id("my-check-1"));
        boolean isDis = buuton.isEnabled();
        Assert.assertTrue(isDis);
    }

    @Test
    public  void dataPicker() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String expectedCity = "01/02/1990";
        WebElement input = driver.findElement(By.name("my-date"));
        input.sendKeys(expectedCity);
        String actualText = input.getAttribute("value");
        Assert.assertEquals(expectedCity,actualText);
    }

//    С кликом данное кнопки пока у меня не получилось!!!
//    @Test
//    public void clickSubmit() {
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        WebElement buuton = driver.findElement(By.className("btn btn-outline-primary mt-3"));
//        boolean isDis = buuton.isEnabled();
//        Assert.assertTrue(isDis);
//    }

    @Test
    public void clickColor() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement colorPicker =driver.findElement(By.name("my-colors"));
        boolean isDis = colorPicker.isEnabled();
        Assert.assertTrue(isDis);
    }


//Дополнительные два  теста на смещение слайдера
//    @Test
//    public  void  exampleRangeRight() {
//        WebDriver driver =  new EdgeDriver();
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        driver.findElement(By.name("my-range")).sendKeys(Keys.ARROW_RIGHT);
//    }
//
////    @Test
////    public  void  exampleRangeLeft() {
////        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
////        driver.findElement(By.name("my-range")).sendKeys(Keys.ARROW_LEFT);
////    }

    @Test
    public  void  minExampleRange() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement slider = driver.findElement(By.name("my-range"));
        String expectedSliderPosition = "0";
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", slider, expectedSliderPosition);
        String actualSliderPosition = slider.getAttribute("value");
        Assert.assertEquals(expectedSliderPosition,actualSliderPosition);
    }

    @Test
    public  void  maxExampleRange() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement slider = driver.findElement(By.name("my-range"));
        String expectedSliderPosition = "10";
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", slider, expectedSliderPosition);
        String actualSliderPosition = slider.getAttribute("value");
        Assert.assertEquals(expectedSliderPosition,actualSliderPosition);
    }
}




