package taskXXI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TaskXXI {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to Open Browser XXI")
	def I_want_to_Open_Browser_XXI() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to Now Playing Menu")
	def I_want_to_Now_Playing_Menu() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Now Playing'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I want to Pick Random Movie")
	def I_want_to_Pick_Random_Movie() {
		WebUI.callTestCase(findTestCase('Test Cases/1. Positif Test/01. User Can Play Trailer Random Movie'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("I want to See Trailer Movie")
	def I_want_to_See_Trailer_Movie() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Trailer'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	
	//
	@When("I want to Open Playing In Menu")
	def I_want_to_Open_PlayingIn_Menu() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Playing In'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("I want to Pick Yogyakarta City")
	def I_want_to_Pick_Yogyakarta_City() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Playing In - Choose City'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("I want to Chose the Theater")
	def I_want_to_Chose_the_Theater() {
		WebUI.callTestCase(findTestCase('Test Cases/1. Positif Test/02. User Can See Movie Now Playing Theater in The Other City'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	//
	@When("I want to Open UpComing Menu")
	def I_want_to_Open_UpComing_Menu() {
		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Up Coming'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("I want to Pick Random Movie UpComing")
	def I_want_to_Pick_Random_Movie_UpComing() {
		WebUI.callTestCase(findTestCase('Test Cases/1. Positif Test/03. User Can Watch Trailer Upcoming Movie'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
//	@Then("I want to See Trailer Movie")
//	def I_want_to_See_Trailer_Movie() {
//		WebUI.callTestCase(findTestCase('Test Cases/Menu/Menu Trailer'), [:], FailureHandling.STOP_ON_FAILURE)
//	}
	
	//
	@And("I want to Click Playing AT")
	def I_want_to_Click_Playing_AT() {
		WebUI.callTestCase(findTestCase('Test Cases/2. Negatif Test/No. 3/User Cant click Button Playing At'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	//
	@And("I want to Click Buy Ticket")
	def I_want_to_Click_Buy_Ticket() {
		WebUI.callTestCase(findTestCase('Test Cases/2. Negatif Test/No. 3/User Cant Click Button Buy Ticket'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	  
	//	
	@And("I want to See Trailer Movie_UpComing")
	def I_want_to_See_Trailer_Movie_UpComing() {
		WebUI.callTestCase(findTestCase('Test Cases/1. Positif Test/03. User Can Watch Trailer Upcoming Movie'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	 
	
	
}