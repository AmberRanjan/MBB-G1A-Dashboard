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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Generic/Dashboard/Dashboard_QuickActionsText'), 'Quick Actions')

Mobile.takeScreenshot('Screenshots/M25SP5DGA-3/01_UserOnDashboard')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Generic/Dashboard/Dashboard_Login_Button'), 0)

Mobile.verifyElementText(findTestObject('Generic/6_Digit_Pin/TextStating - Enter your 6-digit PIN'), 'Enter your 6-digit PIN')

Mobile.takeScreenshot('Screenshots/M25SP5DGA-3/02_UserOn_Pin_Screen')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.tap(findTestObject('Generic/6_Digit_Pin/Button_1_From_Keypad'), 0)

Mobile.verifyElementText(findTestObject('Generic/Dashboard/Dashboard_QuickActionsText'), 'Quick Actions')

Mobile.takeScreenshot('Screenshots/M25SP5DGA-3/03_Dashboard_After_Login')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Generic/Dashboard/Dashboard_Eye_Icon'), 0)
Mobile.verifyElementText(findTestObject('Generic/Dashboard/DashboardAccName - Maybank2u.Premier'), 'Maybank2u.Premier')
Mobile.takeScreenshot('Screenshots/M25SP5DGA-3/04_AccountDetails_View')

Mobile.takeScreenshot()
