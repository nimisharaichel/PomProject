package UtilityPackage1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass1 {
	WebDriver driver;
	
public String getTextTableFirstPersonName(WebElement element) {
	return element.getText();
}
public boolean checkBoxDemoIsSelected(WebElement element) {
	return element.isSelected();
}
public UtilityClass1(WebDriver driver) {
	this.driver=driver;
	
}

public List<String> getTextElementOfTable(String xpath){
	List<WebElement> elements=driver.findElements(By.xpath(xpath));
	List<String> elementlist1=new ArrayList<String>();
	for(WebElement list:elements) {
		elementlist1.add(list.getText());
	}
	return elementlist1;
	
}




}
