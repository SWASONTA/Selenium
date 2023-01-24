package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pgFactory.LoginPgFac;

public class LoginSD {
	WebDriver driver = new ChromeDriver();
	LoginPgFac lpf=new LoginPgFac(driver);
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		lpf.mainPage();
		
	}

	@When ("User enters {string}")
	public void user_enters_and(String mno) {
	    lpf.enter_mob_no(mno);
	  
	    
	    //lpf.enter_pass(password);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		  lpf.otp();
	    //lpf.clickLogin();    
	}

	@Then("Login button is not Displayed")
	public void my_account_dropdown_is_displayed() throws InterruptedException {
	    lpf.result();
	}

//	@When("User enters only Mobile number as{string}")
//	public void user_enters_mobNo(String mobno) {
//		lpf.enter_mob_no(mobno);
//	}
//
//	@Then("Message is Displayed")
//	public void message_is_displayed() throws InterruptedException {
//		lpf.result();
//	}
//
//	@When("User enters only Password as{string}")
//	public void user_enters_pass(String pass) {
//	   //lpf.enter_pass(pass);
//	}
}
