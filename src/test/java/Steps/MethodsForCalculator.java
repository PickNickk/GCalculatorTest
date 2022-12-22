package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MethodsForCalculator {
    public static void number0 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
    }
    public static void number1 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
    }
    public static void number2 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
    }
    public static void number3 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
    }
    public static void number4 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
    }
    public static void number5 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
    }
    public static void number6 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
    }
    public static void number7 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='rk7bOd']")).click();
    }
    public static void number8 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='T7PMFe']")).click();
    }
    public static void number9 (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='XoxYJ']")).click();
    }
    public static void divided (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
    }
    public static void multiplication (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
    }
    public static void minus (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
    }
    public static void plus (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
    }
    public static void squareRoot (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='oQcVc']")).click();
    }
    public static void factorial (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='SfS5gd']")).click();
    }
    public static void arithmeticEquals (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
    }
    public static void dot (WebDriver driver){
        driver.findElement(By.xpath("//div[@jsname='YrdHyf']")).click();
    }

    public static String getResult(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class='z7BZJb XSNERd']")).getText();
    }
    public static void clickInput(WebDriver driver){
        driver.findElement(By.xpath("//div[@class='z7BZJb XSNERd']")).click();
    }

}
