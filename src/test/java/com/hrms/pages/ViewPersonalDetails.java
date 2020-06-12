package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewPersonalDetails {
	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement empFirstName;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement empLastName;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement empID;

	@FindBy(xpath = "//div[@id='profile-pic']//h1")
	public WebElement profilePic;// including first and lastname

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(id = "personal_txtEmpMiddleName")
	public WebElement MiddleName;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement driverseLC;

	@FindBy(id = "btnSave")
	public WebElement btnEditSave; // same foe edit and save

	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']//following-sibling::img")
	public WebElement LCExpiryDateImg;
	
	@FindBy(id = "personal_txtLicExpDate")
	public WebElement LicExpDate;
	
	@FindBy(id = "personal_DOB")
	public WebElement DOB; 
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement monthDD;// inside LC expire Date calendar, use Select methods

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement yearDD;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr")
	public List<WebElement> LCExpiryTable;

	@FindBy(id = "personal_optGender_2")
	public WebElement femaleRDBtn;

	@FindBy(id = "personal_optGender_1")
	public WebElement maleRDBtm;

	@FindBy(id = "personal_txtNICNo")
	public WebElement SSN;

	@FindBy(id = "personal_txtSINNo")
	public WebElement SIN;

	@FindBy(xpath = "//input[@id='personal_DOB']//following-sibling::img")
	public WebElement DOBimg;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement birthMonthDD;// use select class

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement birthYearDD;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr")
	public List<WebElement> DOBTableRows;

	@FindBy(id = "personal_cmbMarital")
	public WebElement MaritalST;
	
	@FindBy(id = "personal_txtEmpNickName")
	public WebElement nickname;
	
	@FindBy(id = "personal_chkSmokeFlag")
	public WebElement smoker;
	@FindBy(id = "personal_txtMilitarySer")
	public WebElement militaryServce;

	public ViewPersonalDetails() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void clickEmplName(String empName, List<WebElement> tableData) {
		boolean flag = false;
		while (!flag) {

			for (int i = 1; i < tableData.size(); i++) {
				String cellData = tableData.get(i - 1).getText();
				if (cellData.equals(empName)) {
					flag = true;
					BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]/a")).click();
					break;
				}
			}
		}
	}
}
