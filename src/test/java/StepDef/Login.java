package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpages;



public class Login {
WebDriver driver=null;
Loginpages login;

@Given ("^User on login page$")
public void User_on_login_page()
{
System.setProperty("webdriver.gecko.driver", "D://Testing//Softwares//geckodriver-v0.33.0-win32//geckodriver.exe");	
driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
@When ("^User enter (.*) and (.*)$")
public void User_enter_username_and_password(String username,String password)
{
	login=new Loginpages(driver);
	login.enterusername(username);
	login.enterpassword(password);
	
	}

@And ("^user click on login button$")
public void user_click_on_login_button()	
{
	login.clickonloginbutton();

}

}
