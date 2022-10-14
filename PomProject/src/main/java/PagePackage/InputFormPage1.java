package PagePackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage1.UtilityClass1;

public class InputFormPage1 {
	
public WebDriver driver;
UtilityClass1 utilityclass1;

By inputPageButton=By.xpath("//a[@href='simple-form-demo.php']");
By inputPageEnterMsg=By.xpath("//input[@id='single-input-field']");
By inputPageshowmsg=By.xpath("//button[text()='Show Message']");

@FindBy(xpath="//a[text()='Checkbox Demo']")
WebElement checkBoxLink;

@FindBy(xpath="//input[@id='gridCheck']")
WebElement checkBoxLinkSelect;

@FindBy(xpath="//input[@id='check-box-one']")
 WebElement multipleCheckbox1;

@FindBy(xpath="//input[@id='check-box-two']")
WebElement multipleCheckbox2;

@FindBy(xpath="//input[@id='check-box-three']")
WebElement multipleCheckbox3;

@FindBy(xpath="//input[@id='check-box-four']")
WebElement multipleCheckbox4;

public InputFormPage1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void click_inputFormPage() {
	WebElement clickInputFormButton=driver.findElement(inputPageButton);
	clickInputFormButton.click();
	
}
public String send_enterMsgFeild(String s) {
	WebElement enterMsgField=driver.findElement(inputPageEnterMsg);
	enterMsgField.sendKeys(s);
	return s;
}

public void click_showMsgButton() {
	WebElement showMsgButton=driver.findElement(inputPageshowmsg);
	showMsgButton.click();
}

public String gettext_showMsgButtonText() {
	WebElement showMsgButtonText=driver.findElement(inputPageshowmsg);
	return showMsgButtonText.getText();
	
}
public void clickCheckBoxDemo() {
	checkBoxLink.click();
}
public boolean isselectedCheckBoxDemo() {
	utilityclass1=new UtilityClass1(driver);
	return utilityclass1.checkBoxDemoIsSelected(checkBoxLinkSelect);
}
public void multipleCheckBox1() {
	multipleCheckbox1.click();
	
}

public void multipleCheckBox2() {
	multipleCheckbox2.click();
	
}

public void multipleCheckBox3() {
	multipleCheckbox3.click();
	
}

public void multipleCheckBox4() {
	multipleCheckbox4.click();
	
}


}
