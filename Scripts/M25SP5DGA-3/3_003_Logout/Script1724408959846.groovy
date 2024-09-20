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

'User taps on Logout button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-03/10_UserTapOnLogoutButton - Logout'), 0)

'Verify text once the user logged out'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/11_VerifyElementText - Youve successfully logged out. Come back soon'),
	'You’ve successfully logged out. Come back soon!')

'screenshot for the logged out screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()

'User taps on Back To Dashboard button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-03/12_UserTapOnBackToDashboard'), 0)

'Verify screen when user navigates to the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-03/01_VerifyDashboardText - Quick Actions'), 'Quick Actions')

'Take screenshot when the user is navigated to Dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4273555855694925823.png')
Mobile.takeScreenshot()