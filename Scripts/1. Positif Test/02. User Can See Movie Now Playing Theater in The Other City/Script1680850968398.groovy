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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

TestObject object1 = findTestObject('Object Repository/Object Untuk Test No. 2/li_AMBARRUKMO  XXI')

TestObject object2 = findTestObject('Object Repository/Object Untuk Test No. 2/li_EMPIRE XXI')

TestObject object3 = findTestObject('Object Repository/Object Untuk Test No. 2/li_JOGJA CITY XXI')

TestObject object4 = findTestObject('Object Repository/Object Untuk Test No. 2/li_SLEMAN CITY HALL XXI')

// Generate random number between 1 and 4
int randomNumber = new Random().nextInt(4) + 1

// Use switch case to select object based on random number
switch (randomNumber) {
    case 1:
        WebUI.mouseOver(object1)
		WebUI.takeFullPageScreenshot()
        WebUI.click(findTestObject('Object Repository/Object Untuk Test No. 2/div_AMBARRUKMO  XXI'))
		WebUI.takeFullPageScreenshot()
        WebUI.comment('AMBARRUKMO XXI')

        break
    case 2:
        WebUI.mouseOver(object2)
		WebUI.takeFullPageScreenshot()
        WebUI.click(findTestObject('Object Repository/Object Untuk Test No. 2/div_EMPIRE XXI'))
		WebUI.takeFullPageScreenshot()
        WebUI.comment('EMPIRE XXI')

        break
    case 3:
        WebUI.mouseOver(object3)
		WebUI.takeFullPageScreenshot()
        WebUI.click(findTestObject('Object Repository/Object Untuk Test No. 2/li_JOGJA CITY XXI'))
		WebUI.takeFullPageScreenshot()
        WebUI.comment('JOGJA CITY XXI')

        break
    case 4:
        WebUI.mouseOver(object4)
		WebUI.takeFullPageScreenshot()
        WebUI.click(findTestObject('Object Repository/Object Untuk Test No. 2/li_SLEMAN CITY HALL XXI'))
		WebUI.takeFullPageScreenshot()
        WebUI.comment('SLEMAN CITY HALL XXI')

        break
    default:
        WebUI.comment('Invalid random number')}

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

