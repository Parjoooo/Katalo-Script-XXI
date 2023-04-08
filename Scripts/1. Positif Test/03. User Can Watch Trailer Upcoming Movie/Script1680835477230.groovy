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

WebUI.takeFullPageScreenshot()

// Define TestObjects
TestObject object1 = findTestObject('Object Repository/Object Untuk Test No. 3/Film asterix')

TestObject object2 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Buya Hamka')

TestObject object3 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Covenant')

TestObject object4 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Dedemit')

TestObject object5 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Guardian of Galaxy')

TestObject object6 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Guradian of falaxy IMAX')

TestObject object7 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Jin dan Jun')

TestObject object8 = findTestObject('Object Repository/Object Untuk Test No. 3/Film Yokaipedia')

TestObject object9 = findTestObject('Object Repository/Object Untuk Test No. 3/film65')

//TestObject object10 = findTestObject('')
// Generate random number between 1 and 4
int randomNumber = new Random().nextInt(9) + 1

// Use switch case to select object based on random number
switch (randomNumber) {
    case 1:
        WebUI.click(object1)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Asterix and Obelisk')

        break
    case 2:
        WebUI.click(object2)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Buya Hamka')

        break
    case 3:
        WebUI.click(object3)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('The Covenant')

        break
    case 4:
        WebUI.click(object4)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Dedemit')

        break
    case 5:
        WebUI.click(object5)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Guardian of Galaxy')

        break
    case 6:
        WebUI.click(object6)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Guardian of Galaxy IMAX')

        break
    case 7:
        WebUI.click(object7)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('Jin dan Jun')

        break
    case 8:
        WebUI.click(object8)

        WebUI.comment('Yokaipedia')

        break
    case 9:
        WebUI.click(object9)
		WebUI.takeFullPageScreenshot()
        WebUI.comment('film 65')

        break
    default:
        WebUI.comment('Invalid random number')}

