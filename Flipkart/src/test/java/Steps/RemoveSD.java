package Steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pgFactory.LoginPgFac;

public class RemoveSD {
	SearchSD ssd = new SearchSD();
	WebDriver driver = ssd.retDriver();
	LoginPgFac lpf = new LoginPgFac(driver);
	
	@Given("User has logged in")
	public void user_has_logged_in() throws InterruptedException {
		lpf.mainPage(); 
		driver.manage().window().maximize();
		lpf.enter_mob_no("7889098263"); //lpf.enter_pass("juhi9422@");
		lpf.otp();
		lpf.clickLogin(); 
	}
	
	@When("User clicks on cart icon")
	public void user_clicks_on_cart_icon() throws InterruptedException {
		Thread.sleep(3000);
	    lpf.clickCart();
	}
	
	@Then("User is navigated to cart page")
	public void user_is_navigated_to_cart_page() throws InterruptedException {
	   //lpf.PgRedirect();
	   Thread.sleep(3000);
	   String head=driver.getTitle();
	   System.out.println(head);
	   assertTrue(head.equals("Shopping Cart | Flipkart.com"));
	}
	
	@When("User clicks on remove button for a particular product")
	public void user_clicks_on_remove_button_for_a_particular_product() throws InterruptedException {
	    lpf.clickRem();
	}
	
	@Then("The name of the item is removed from the cart.")
	public void the_name_of_the_item_is_removed_from_the_cart() throws InterruptedException {
		Thread.sleep(3000);
	    lpf.check();
	}
}