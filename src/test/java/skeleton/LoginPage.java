package skeleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginPage 
{
	 WebDriver driver;
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demoaut.com/");
	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String userName, String password) throws Exception                   
	{
		driver.findElement(By.name("userName")).sendKeys(userName);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("login")).click();
	}

	@Then("^the login is successful$")
	public void the_login_is_successful() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions                           
	}

}
