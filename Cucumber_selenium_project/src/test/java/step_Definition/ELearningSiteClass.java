package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ELearningSiteClass {

WebDriver driver;
	
	@Given("Learning url is launched")
	public void facebook_url_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\software\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get("http://elearningm1.upskills.in/");
	    driver.manage().window().maximize();
	   
	}

	@When("Homepage is visible")
	public void username_and_password_text_box_are_visible() {
	    driver.findElement(By.xpath("//li[@id=\"current\"]")).isDisplayed();
	    
	}

	@When("Click on sign up")
	public void user_enter_username_and_password() {
		 driver.findElement(By.xpath("//ul[@class=\"nav nav-pills nav-stacked\"]//li")).click();
	}
		 
		 //registration page


			@When("Registration page is visible")
			public void registration() {
			    driver.findElement(By.xpath("//div[@class=\"page-header\"]")).isDisplayed();
			    
			}

			@Then("Enter all mandatory details")
			public void mandatory_details() {
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"firstname\"]")).sendKeys("Jyoti");
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"lastname\"]")).sendKeys("Joshi");
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"email\"]")).sendKeys("Jyoti@gmail.com");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"username\"]")).sendKeys("ABCD");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"pass1\"]")).sendKeys("Jyoti@123");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"pass2\"]")).sendKeys("Jyoti@123");

	    
	}
	
	
	@Then("Click on register")
	public void Register() {
		 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//button[@name=\"submit\"]")).click();
}

	@When("Registration is successfull")
	public void registration_Successfull() {
	    driver.findElement(By.xpath("//button[@name=\"next\"]")).isDisplayed();
	    
	}

	@Then("Click on Next")
	public void Next() {
		 driver.findElement(By.xpath("//button[@name=\"next\"]")).click();
}


	@When("name is visible")
	public void Name() {
	    driver.findElement(By.xpath("//li//span[@class=\"caret\"]")).isDisplayed();
	    
	}
	@Then("click on name")
	public void dropdown() {
		 driver.findElement(By.xpath("//li//span[@class=\"caret\"]")).click();
}
	
	@Then("open select profile from dropdown")
	public void profile() {
		 driver.findElement(By.xpath("//ul[@class=\"dropdown-menu\"]//li//a")).click();
}
	
	
	@When("message box is open")
	public void message() {
	    driver.findElement(By.xpath("//li[@class=\"messages-icon \"]//a")).isDisplayed();
	    
	}
	
	@Then("message box is clicked")
	public void compose() {
	    driver.findElement(By.xpath("//li[@class=\"messages-icon \"]//a")).click();
	    
	}
	@Then("compose a message")
	public void write() {
		driver.findElement(By.xpath("//div[@class=\"col-md-6\"]//a")).click();
		 //driver.findElement(By.xpath("//li[@class=\"select2-search select2-search--inline\"]")).click();
		// driver.findElement(By.xpath("//li[@class=\"select2-search select2-search--inline\"]")).sendKeys("Jyo");
        // driver.findElement(By.xpath("(//span[@class=\"select2-results\"]//ul//li)[1]")).click();
		 driver.findElement(By.xpath("(//div[@class=\"col-sm-8\"]//input[@class=\"form-control\"])[1]")).sendKeys("compose");
		// driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"title\"]")).sendKeys("compose");
}
	@Then("click on send")
	public void Send() {
		 driver.findElement(By.xpath("//button[@class=\" btn btn-primary \"]")).click();
}
	@Then("close the browser")
	public void closebrowser() {
		 driver.close();
}

}




