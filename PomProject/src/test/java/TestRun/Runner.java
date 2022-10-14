package TestRun;

import org.testng.annotations.Test;

import BasicTest.BasicTestEx;
import PagePackage.HomePage1;
import PagePackage.InputFormPage1;
import PagePackage.TablePage;

public class Runner extends BasicTestEx {
	 HomePage1 homepage1;
	 InputFormPage1 inputformpage1;
	 TablePage tablepage;
@Test
	public  void verify_homePage() {
		
	//home Page test Run
	homepage1=new HomePage1(driver);
	homepage1.select_homePageButton();
	homepage1.verify_logoSymbol();
	homepage1.verify_gethomePageButtonText();
}
	@Test
	//InputForm Page test Run
	public void verify_inputPage() {
		inputformpage1=new InputFormPage1(driver);
		inputformpage1.click_inputFormPage();
		inputformpage1.send_enterMsgFeild("Hello Nimisha");
		inputformpage1.click_showMsgButton();
		inputformpage1.gettext_showMsgButtonText();	
		inputformpage1.clickCheckBoxDemo();
		boolean checkBox=inputformpage1.isselectedCheckBoxDemo();
		if(checkBox==true)
		{
			System.out.println("The checkbox is selected");
		}
		else {
			System.out.println("The checkbox is not selected");
		}
		
		inputformpage1.multipleCheckBox1();
		inputformpage1.multipleCheckBox2();
		inputformpage1.multipleCheckBox3();
		inputformpage1.multipleCheckBox4();
	
	}
	@Test
	//Table page
	public void verify_tablePage()
	{
		tablepage=new TablePage(driver);
		tablepage.clickTablePage();
		System.out.println(tablepage.getTextTableFirstPerson());
		System.out.println("The list of names in the table:"+tablepage.getListOfNamesTable());
		System.out.println("The list of positions in the table:"+tablepage.getListOfPositionsTable());
		System.out.println("The list of offices in the table:"+tablepage.getOfficeListtable());
		System.out.println("The list of ages in the table:"+tablepage.getAgeListtable());
		System.out.println("The list of date in the table:"+tablepage.getDateListtable());
		System.out.println("The list of salary in the table:"+tablepage.getSalaryListtable());
	}
	
	
	
	

}
