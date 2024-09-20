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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify the Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/01_VerifyElementText - Accounts'), 'Accounts')

'Take screenshot for the Accounts details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5761579756656676189.png')
Mobile.takeScreenshot()

'User taps on 3 dots'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/02_UserTapsOn_3_dots'), 0)

'User Validates the text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/03_VerifyElementText - Copy Account Number'), 'Copy Account Number')

'Screenshot of the dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

'User taps on Grey area'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/04_UserTapsOnGreyArea'), 0)

'Verify screen once the dropdown goes away'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/05_TheTopBarCloses - Your Currencies'), 'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

'User taps on 3 dots'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/02_UserTapsOn_3_dots'), 0)

'Verify the text inside the dropdown'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/03_VerifyElementText - Copy Account Number'), 'Copy Account Number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

'User taps on Close icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/06_UserTapsOnCloseIcon'), 0)

'Verify once the dropdown gets closed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/05_TheTopBarCloses - Your Currencies'), 'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

'User taps on 3 dots again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/02_UserTapsOn_3_dots'), 0)

'Verify the text present in the dropdown'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-22/03_VerifyElementText - Copy Account Number'), 'Copy Account Number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

'User taps on the Copy Account Number Text'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-22/07_UserTapsOn - Copy Account Number'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5672646484362673332.png')
Mobile.takeScreenshot()

