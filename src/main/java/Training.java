import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Training {


    public static void main(String[] args) {
       WebDriver driver =  new EdgeDriver();
       driver.get("https://www.selenium.dev/selenium/web/web-form.html");
       driver.findElement(By.name("my-password")).sendKeys("sdsdsd23");



    }
}
