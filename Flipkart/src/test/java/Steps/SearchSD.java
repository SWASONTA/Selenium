package Steps;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pgFactory.LoginPgFac;

public class SearchSD {
	WebDriver driver = new ChromeDriver();
	LoginPgFac lpf=new LoginPgFac(driver);
	
	public WebDriver retDriver() {
		return driver;
	}
	/****Searching****/
	@Given("User is Logged In")
	public void user_is_logged_in() throws InterruptedException {
	    lpf.mainPage();
	    driver.manage().window().maximize();
	    lpf.enter_mob_no("7889098263 ");
	   // lpf.enter_pass("juhi9422@");
	    lpf.otp();
	    lpf.clickLogin();
	}

	@When("User hovers on dropdown")
	public void user_hovers_on_dropdown() throws InterruptedException {
		Thread.sleep(3000);
		lpf.DrpHover();
	}

	@When("Clicks on a product type")
	public void clicks_on_a_product_type() throws InterruptedException {
		lpf.selProdType();
	}

	@Then("User is navigated to product list page with title as {string}")
	public void user_is_navigated_to_product_list_page(String pgTitle) throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Page Title "+title);
		title=title.toLowerCase();
		assertTrue(title.contains(pgTitle.toLowerCase()));
	}

	@When("User types in a {string} in search bar")
	public void user_types_in_a_in_search_bar(String proName) throws InterruptedException {
		Thread.sleep(3000);
	    lpf.srchBar_Pro(proName);
	}

	@And("Clicks on search")
	public void clicks_on_search() throws InterruptedException {
	    lpf.Srchclick();
	}
	/****Filtering ****/
	@When("User searches a product")
	public void user_searches_a_product() throws InterruptedException {
		Thread.sleep(3000);
		lpf.DrpHover();
		lpf.selProdType();
	}

	@When("applies filters")
	public void applies_filters() throws InterruptedException {
		Thread.sleep(3000);
	    lpf.setMin();
	    Thread.sleep(1000);
	    lpf.setMax();
	    Thread.sleep(1000);
	    lpf.scroll();
	    Thread.sleep(1000);
	    lpf.selColor();
	    Thread.sleep(1000);
	}
	
	@Then("Products are filtered accordingly")
	public void products_are_filtered_accordingly() {
	    lpf.TagVisibility();
	}
}
