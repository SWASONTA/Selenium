package Steps;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pgFactory.LoginPgFac;

public class AddSD {
	SearchSD ssd = new SearchSD();
	WebDriver driver = ssd.retDriver();
	LoginPgFac lpf = new LoginPgFac(driver);

	  @Given("User has searched a product type") 
	  public void user_is_logged_in() throws InterruptedException {
		  lpf.mainPage(); 
		  driver.manage().window().maximize();
		  lpf.enter_mob_no("7889098263"); 
		  //lpf.enter_pass("juhi9422@");
		  //lpf.clickLogin(); 
		  lpf.otp();
		  Thread.sleep(3000);
		  lpf.DrpHover();
		  lpf.selProdType();
	  }
	@When("User clicks on a specific product")
	public void clicks_on_a_specific_product() throws InterruptedException {
		Thread.sleep(3000);
		lpf.scroll();
		Thread.sleep(3000);
		lpf.selProd();
	}
	@Then("User is navigated to product detail page")
	public void user_is_navigated_ta_product_detail_page() throws InterruptedException {
		String proTit = lpf.retTitle();
		lpf.PgRedirect();
		Thread.sleep(3000);
		String pgTitle = driver.getTitle();
		System.out.println(proTit);
		System.out.println(pgTitle);
		assertTrue(pgTitle.contains(proTit));
	}
	@And("Is on product detail page")
	public void is_on_product_detail_page() throws InterruptedException {
		Thread.sleep(3000);
		lpf.scroll();
		Thread.sleep(3000);
		lpf.selProd();
		lpf.PgRedirect();
		Thread.sleep(3000);
	}

	@When("User selects size and adds product to cart")
	public void user_selects_size_and_adds_product_to_cart() throws InterruptedException {
	    lpf.selSize();
	    Thread.sleep(3000);
	    lpf.scrollToCart();
	    Thread.sleep(3000);
	    lpf.addToCart();
	}

	@Then("User is navigated to shopping cart page")
	public void user_is_navigated_to_shopping_cart_page() throws InterruptedException {
	    lpf.PgRedirect();
	    Thread.sleep(5000);
	    String pgTitle = driver.getTitle();
	    System.out.println(pgTitle);
	    assertTrue(pgTitle.equals("Shopping Cart | Flipkart.com"));
	}
}
