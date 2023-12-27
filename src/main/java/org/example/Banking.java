package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Banking{
    public WebDriver driver ;
    @BeforeClass
    public void setUp() {
        System.out.println("Launching firefox browser");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aysel\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test (priority = 1)
    public void CustomerLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement first = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")));
        first.click();
        WebElement SelectElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"userSelect\"]")));
        Select yourname = new Select(SelectElement);
        yourname.selectByValue("1");
        WebElement second = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/form/button")));
        second.click();
    }

    @Test (priority = 2)
    public void Transactions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement third = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")));
        third.click();
        WebElement fourth = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")));
        fourth.click();
    }

    @Test (priority = 3)
    public void WithDrawl() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement eight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")));
        eight.click();
        WebElement nine = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")));
        nine.sendKeys("1000");
        WebElement ten = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")));
        ten.click();
    }

    @Test (priority = 4)
    public void Logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement eleven = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/button[1]")));
        eleven.click();
    }

    @Test (priority = 5)
    public void Bank_Manager_login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement twelve = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")));
        twelve.click();
    }


    @Test (priority = 6)
    public void Customers() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement twenty = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[3]")));
        twenty.click();
        WebElement twentyOne = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button")));
        twentyOne.click();
    }
    @Test (priority = 7)
    public void Add_Customer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement thirteen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")));
        thirteen.click();
        WebElement fourteen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")));
        fourteen.sendKeys("Mike");
        WebElement fifteen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")));
        fifteen.sendKeys("Wazowski");
        WebElement sixteen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")));
        sixteen.sendKeys("1234");
        WebElement seventeen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")));
        seventeen.click();
    }
}


