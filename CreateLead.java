package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("testleaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("deepika");
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(dropdown1);
		drop.selectByVisibleText("Other");
		WebElement title1 = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title1.sendKeys("java");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is description of test lead");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));//class name
		Select drop2=new Select(marketing);
		drop2.selectByIndex(4);
		WebElement last = driver.findElement(By.id("createLeadForm_lastName"));
		last.sendKeys("deepika");
		WebElement first = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		first.sendKeys("AP");
		WebElement saluation = driver.findElement(By.id("createLeadForm_personalTitle"));
		saluation.sendKeys("Greeting");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("automation testing");
		WebElement employees = driver.findElement(By.id("createLeadForm_numberEmployees"));
		employees.sendKeys("three");
		
		
		
		
		
		
		
		
	}

}
