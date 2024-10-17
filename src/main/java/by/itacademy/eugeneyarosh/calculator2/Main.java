package by.itacademy.eugeneyarosh.calculator2;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://svyatoslav.biz/testlab/wt/index.php");

        String xpathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";

        By by1 = By.xpath(xpathName);
        WebElement webName = webDriver.findElement(by1);
        webName.sendKeys("Hello");

        String xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";

        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();


    }
}

