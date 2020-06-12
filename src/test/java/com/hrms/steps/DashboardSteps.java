package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods{
	@Then("user see dahshboard menu is displayed")
	public void user_see_dahshboard_menu_is_displayed(io.cucumber.datatable.DataTable dashboardMenu) {
		List<String> expectedMenu=dashboardMenu.asList();
		List<String> actualMenu=new ArrayList<>();
		//actualMenu.addAll();

		
		for(WebElement el:dashboard.dashMenu) {
			actualMenu.add(el.getText()) ;
		}
		System.out.println(actualMenu);
		System.out.println(expectedMenu);
		//Assert.assertEquals(actualMenu, expectedMenu);
		Assert.assertTrue(actualMenu.equals(expectedMenu));
	}
}
