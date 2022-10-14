package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage1 {
 public WebDriver driver;
By homePage=By.xpath("//a[text()='Home']");
By logoImg=By.xpath("//div[@class='top-logo']//img[@src='images/logo.png']");

public void select_homePageButton() {
	WebElement homePageElement1=driver.findElement(homePage);
	homePageElement1.click();
	
}
public void verify_gethomePageButtonText() {
	WebElement homePageElement2=driver.findElement(homePage);
	String expectedText="HOME";
	String actualText=homePageElement2.getText();
	System.out.println("The text of homepage button:"+actualText);
	if(expectedText.equals(actualText)) {
		System.out.println("The Text is matching");
	}
	else {
		System.out.println("The Text is not matching");
	}
}

public void verify_logoSymbol() {
	WebElement homePageElement3=driver.findElement(logoImg);
	homePageElement3.isDisplayed();
	if(homePageElement3.isDisplayed()) {
		System.out.println("The logo is present");
	}
	else
	{
		System.out.println("The logo is not present");
	}
}

public HomePage1(WebDriver driver) {
	this.driver=driver;
}
}
