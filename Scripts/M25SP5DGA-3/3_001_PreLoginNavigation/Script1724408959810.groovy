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

'Application Launched'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify elemnt when user is on the Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/01_VerifyDashboardText - Quick Actions'), 'Quick Actions')

'Dashboard Screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()

'View All Accounts is present on the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/02_VerifyElementText - View All Accounts'), 'View All Accounts')

'User taps on View All Accounts'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-03/03_TapOn - View All Accounts'), 0)

'Verify header text stating 6-digit pin'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/04_VerifyHeaderText- 6-digit PIN'), '6-digit PIN')

'Verify text stating Enter your 6-digit PIN'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/05_VerifyText - Enter your 6-digit PIN'), 'Enter your 6-digit PIN')

'Take screenshot for the Enter PIN screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()

'User Enters 6 digit PIN'
for (int i = 0; i < 6; i++) {
	//Tap on Number 6 times
	Mobile.tap(findTestObject('Object Repository/M25SP5DGA-03/06_UserTapsOnNumber1'), 0)
}

'Verify element when user navigates to Accounts after entring PIN'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/07_VerifyText - ACCOUNTS'), 'ACCOUNTS')

'Verify if G1A tile is present '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/08_VerifyText - Global Access Account-i'), 'Global Access Account-i')

'Screenshot of the Accounts list screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()

'User taps on Home icon '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-03/09_UserTapOnHome'), 0)

'Verify element once user reaches Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/01_VerifyDashboardText - Quick Actions'), 'Quick Actions')

'Dashboard Screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()