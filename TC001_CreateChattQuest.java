package com.leaftaps.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;
import com.leaftaps.pages.PreChattPage;

public class TC001_CreateChattQuest extends ProjectSpecificMethods{
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void setChattValues() {
		
		testcaseName = "createChattQuest";
        testDescription ="Verify create Question";
        authors="Karthik";
        category ="Smoke";
        excelFileName = "Chatter";        
	}
	
	@Test(dataProvider = "fetchData")
    public void createChatterQuesion(String username, String password, String Question, String Details) {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickToggMenu()
		.clickViewAll()
		.enterContent()
		.selectContent()
		.clickChatter()
		.verifyChatterTitle()
		.clickQuest()
		.enterQuestion(Question)
		.enterQuestDetails(Details)
		.clickAsk()
		.verifyQuest(Question);
	}
	

}