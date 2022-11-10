package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ELearningClass {

WebDriver driver;
	
	@Given("Learning1 url is launched")
	public void facebook_url_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\software\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get("http://elearningm1.upskills.in/");
	    driver.manage().window().maximize();
	   
	}

	@When("Homepage1 is visible")
	public void username_and_password_text_box_are_visible() {
	    driver.findElement(By.xpath("//li[@id=\"current\"]")).isDisplayed();
	    
	}

	@When("Click1 on sign up")
	public void user_enter_username_and_password() {
		 driver.findElement(By.xpath("//ul[@class=\"nav nav-pills nav-stacked\"]//li")).click();
	}
		 
		 //registration page


			@When("Registration1 page is visible")
			public void registration() {
			    driver.findElement(By.xpath("//div[@class=\"page-header\"]")).isDisplayed();
			    
			}

			@Then("Enter1 all mandatory details")
			public void mandatory_details() {
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"firstname\"]")).sendKeys("Jyoti");
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"lastname\"]")).sendKeys("Joshi");
				 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"email\"]")).sendKeys("Jyoti@gmail.com");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"username\"]")).sendKeys("WXYZ");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"pass1\"]")).sendKeys("Jyoti@123");
                 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//input[@name=\"pass2\"]")).sendKeys("Jyoti@123");

	    
	}
	
	
	@Then("Click1 on register")
	public void Register() {
		 driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//button[@name=\"submit\"]")).click();
}

	@When("Registration1 is successfull")
	public void registration_Successfull() {
	    driver.findElement(By.xpath("//button[@name=\"next\"]")).isDisplayed();
	    
	}

	@Then("Click1 on Next")
	public void Next() {
		 driver.findElement(By.xpath("//button[@name=\"next\"]")).click();
}


	@When("name1 is visible")
	public void Name() {
	    driver.findElement(By.xpath("//li//span[@class=\"caret\"]")).isDisplayed();
	    
	}
	@Then("click1 on name")
	public void dropdown1() {
		 driver.findElement(By.xpath("//li//span[@class=\"caret\"]")).click();
}
	
	@Then("open1 select profile from dropdown")
	public void profile1() {
		 driver.findElement(By.xpath("//ul[@class=\"dropdown-menu\"]//li//a")).click();
}
	@Then("click on edit profile")
	public void dropdown() {
		 driver.findElement(By.xpath("//li[@class=\"item\"]//a[@class]")).click();
}
	
	@Then("clear name")
	public void profile() {
		 driver.findElement(By.xpath("//input[@name=\"firstname\"]")).clear();
}
	@Then("change name")
	public void name() {
		 driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Jeevika");
}
	
	@Then("clear Lastname")
	public void Lastname() {
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).click();
}
	@Then("change Lastname")
	public void edit_Lastname() {
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("JJ");
}
	@Then("submit details")
	public void submit_details() {
		driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//button[@type=\"submit\"]")).click();
	}
	@Then("close1 the browser")
	public void closebrowser() {
		 driver.close();
}

}





