package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpages {

	WebDriver driver;
	
	By text_username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By text_password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By btn_login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	public Loginpages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterusername(String username)
	{
		
		driver.findElement(text_username).sendKeys(username);
		}
	public void enterpassword(String password)
	{
		driver.findElement(text_password).sendKeys(password);
	}
	
public void clickonloginbutton()
{
	driver.findElement(btn_login).click();
}
}
