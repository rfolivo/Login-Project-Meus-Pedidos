import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Login-4 {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://69.164.203.63:8080/login/");
        wd.findElement(By.linkText("Esqueci minha senha")).click();
        wd.findElement(By.id("id_email")).click();
        wd.findElement(By.id("id_email")).clear();
        wd.findElement(By.id("id_email")).sendKeys("tester@meuspedidos.com.br");
        wd.findElement(By.xpath("//form[@class='form-login']//button[.='ENVIAR SENHA']")).click();
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
