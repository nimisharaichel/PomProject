package PagePackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage1.UtilityClass1;

public class TablePage {
WebDriver driver;
UtilityClass1 utilityclass1;
@FindBy(xpath="//a[@href='table-pagination.php']")
WebElement TableLink;
@FindBy(xpath="//tbody//tr[1]//td[1]")
WebElement TableFirstname;

public TablePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void clickTablePage() {
	TableLink.click();
}

public String getTextTableFirstPerson() {
	utilityclass1=new  UtilityClass1(driver);
	return utilityclass1.getTextTableFirstPersonName(TableFirstname);
}

public List<String> getListOfNamesTable(){
	List<String> nameList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	nameList=utilityclass1.getTextElementOfTable("//tbody//tr//td[1]");
	return nameList;
}
public List<String> getListOfPositionsTable(){
	List<String> positionList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	positionList=utilityclass1.getTextElementOfTable("//tbody//tr//td[2]");
	return positionList;
}

public List<String> getOfficeListtable(){
	List<String> officeList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	officeList=utilityclass1.getTextElementOfTable("//tbody//tr//td[3]");
	return officeList;
}

public List<String> getAgeListtable(){
	List<String> ageList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	ageList=utilityclass1.getTextElementOfTable("//tbody//tr//td[4]");
	return ageList;
}

public List<String> getDateListtable(){
	List<String> dateList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	dateList=utilityclass1.getTextElementOfTable("//tbody//tr//td[5]");
	return dateList;
}

public List<String> getSalaryListtable(){
	List<String> salaryList=new ArrayList<String>();
	utilityclass1=new  UtilityClass1(driver);
	salaryList=utilityclass1.getTextElementOfTable("//tbody//tr//td[6]");
	return salaryList;
}


}