import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



// Define TestObjects
TestObject object1 = findTestObject('Object Repository/Object untuk Test No. 1/Test No. 1/Film John Wick 4')

TestObject object2 = findTestObject('Object Repository/Object untuk Test No. 1/Test No. 1/Film Kartu Pos Wini')

TestObject object3 = findTestObject('Object Repository/Object untuk Test No. 1/Test No. 1/Film Pope')

TestObject object4 = findTestObject('Object Repository/Object untuk Test No. 1/Test No. 1/Film Ride On')

// Generate random number between 1 and 4
int randomNumber = new Random().nextInt(4) + 1

// Use switch case to select object based on random number
switch (randomNumber) {
    case 1:
        WebUI.click(object1)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('John Wick 4')

        break
    case 2:
        WebUI.click(object2)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Kartu Pos Wini')

        break
    case 3:
        WebUI.click(object3)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Pope the Exorcist')

        break
    case 4:
        WebUI.click(object4)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Ride On')

        break
    default:
        WebUI.comment('Invalid random number')}

