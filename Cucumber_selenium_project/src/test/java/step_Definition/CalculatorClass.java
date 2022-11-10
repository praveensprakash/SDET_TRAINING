package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorClass {


WebDriver driver;
	
@Given("Calculator url is launched")
public void facebook_url_is_launched() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\002WW9744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
    driver.get("https://www.calculator.net");
    System.out.println(driver.getTitle());   
    driver.manage().window().maximize();
  //  if()
  //  else();
   
}


@When("Click on BMI Calculator")
public void BMI_Calculator() {
	 driver.findElement(By.xpath("(//ul[@id=\"hl2\"]//li//a)[1]")).click();
}

@Then("verify title of the page")
public void Title() {
	 driver.getTitle();
}



  @Given("user enter Age {string} and Height {string} and Weight {string}") 
  
  public void Enter_details(String Age, String Height, String Weight) {
  driver.findElement(By.xpath("onclick=\"clearForm(document.calform);\"")).click();
  driver.findElement(By.xpath("//input[@id=\"cage\"]")).sendKeys(Age);
  driver.findElement(By.xpath("//input[@id=\"cheightmeter\"]")).sendKeys(Height);
  driver.findElement(By.xpath("//input[@id=\"cheightmeter\"]")).sendKeys(Weight);
  
  }


//}
@When("Click on Calculator button")
public void click_Calculator() {
	System.out.println(driver.getTitle());
	
	 driver.findElement(By.xpath("//td[@colspan=\"2\"]//input")).click();
}

@When("Result is successfull")
public void result_Successfull() {
    driver.findElement(By.xpath("//div[@class=\"rightresult\"]//h2")).isDisplayed();
    
}

@Then("Capture the BMI Result value")
public void click() {
	// driver.findElement(By.xpath("//div[@class=\"bigtext\"]//b")).click();
	 System.out.println(driver.findElement(By.xpath("//div[@class=\"bigtext\"]//b")).getText());
}

@Then("close the calculator browser")
public void closebrowser() {
	 driver.close();
}


}
