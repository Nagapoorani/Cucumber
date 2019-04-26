package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoCucumber {
	WebDriver driver;

    @Given("^I want to launch demotours application$")
    public void i_want_to_write_a_step_with_precondition() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagapoorani\\Downloads\\Jar Files\\chromedriver73_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
    }


    @And("^verify page title$")
    public void verify_page_title() throws Throwable {
        //throw new PendingException();
    	System.out.println(driver.getTitle());
    	Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
    }

    @Then("^Close Application$")
    public void Close_Application()
    {
    	driver.quit();
    }
    @And("^some other precondition$")
    public void some_other_precondition() throws Throwable {
        //throw new PendingException();
    	System.out.println("some other precondition");
    }
    
    @When("^I complete action$")
    public void i_complete_action() throws Throwable {
        //throw new PendingException();
    	System.out.println("I complete action");
    }
    

    @Given("^I want to write step with (.+)$")
    public void i_want_to_write_a_step_with(String name) throws Throwable {
    	System.out.println("Name --"+name); 
}


    @And("^Login to demotours by using (.+) and (.+)$")
    public void login_to_demotours_by_using_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
    }
     
    @Then("^Logout from Application$")
    public void Logout_from_Application()
    {
    	driver.findElement(By.linkText("SIGN-OFF")).click();    	
    }
    
    @When("^I check for the (.+) in step$")
    public void i_check_for_the_in_step(String value) throws Throwable {
    	System.out.println("Value --"+value);
    }

    @Then("^I verify the (.+) in step$")
    public void i_verify_the_in_step(String status) throws Throwable {
    	System.out.println("status --"+status);
    }

}
