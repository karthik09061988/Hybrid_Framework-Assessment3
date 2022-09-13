package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class PreChattPage extends ProjectSpecificMethods{
	
	public PreChattPage clickToggMenu() {
	    click(locateElement (Locators.XPATH, "//div[@class='slds-icon-waffle']"));
	    reportStep("Toggle Menu is clicked", "PASS");
	    return this;
	    }
	
	   public PreChattPage clickViewAll() {
	        click(locateElement (Locators.XPATH, "//button[@class='slds-button']"));
	        reportStep("View All is Clicked", "PASS");
	        return this;
	        }
	   
	   public PreChattPage enterContent() {
		   clearAndType(locateElement (Locators.XPATH, "//input[@placeholder='Search apps or items...']"),"Content");
		   reportStep("Content is typed", "PASS");
		   return this;
       }
	   
	   public PreChattPage selectContent() {
		   click(locateElement (Locators.XPATH, "//div[@class='slds-app-launcher__tile-body slds-truncate']"));
		   reportStep("Content is Selected", "PASS");
		   return this;
		   
	   }
		   
		 public ChatterPage clickChatter() {
			   clickUsingJs(locateElement (Locators.XPATH, "//span[text()='Chatter']"));
			   reportStep("Chatter option is clicked", "PASS");
			   return new ChatterPage(); 
		   		   
       }
	   
	 
}