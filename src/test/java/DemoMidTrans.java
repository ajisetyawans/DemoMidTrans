import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class DemoMidTrans {

    @Test
    public void registTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.midtrans.com");

        WebElement buyBtn = driver.findElement(By.xpath("//a[@class='btn buy']"));
        WebElement user = driver.findElement(By.xpath("//input[@value=\"Budi\"]"));
        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        WebElement phone = driver.findElement(By.xpath("//input[@value=\"081808466410\"]"));

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rdm = new Random();

        int length = 10;
        for (int i = 0; i < length; i++) {
            int all = rdm.nextInt(chars.length());
            char acak = chars.charAt(all);
            sb.append(acak);

        }

        String num = "1234567890";
        StringBuilder numb = new StringBuilder();
        Random numRand = new Random();

        int panjang = 2;
        for (int i = 0; i < 2; i++) {
            int angka = numRand.nextInt(num.length());
            char acak2 = num.charAt(angka);
            numb.append(acak2);

        }

        buyBtn.click();

        user.clear();
        user.sendKeys("benkjr");
        Thread.sleep(3000);

        email.clear();
        String randomStr = sb.toString();
        String randomStr2 = numb.toString();
        email.sendKeys(randomStr + randomStr2 + "@gmail.com");
        Thread.sleep(3000);

        phone.clear();
        phone.sendKeys("14045");
        Thread.sleep(3000);

        driver.quit();

    }
}
