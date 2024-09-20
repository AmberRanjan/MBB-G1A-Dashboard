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

'Verify Screen once the user is on Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/01_Dashboard-VerifyElementText - Quick Actions'), 
    'Quick Actions')

'Take dashboard screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')
Mobile.takeScreenshot()

'Verify that the user is logged in'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/02_Dashboard_UserIsLoggedIn - Logout'), 
    'Logout')

'User taps on Accounts from footer '
Mobile.tap(findTestObject('Object Repository/Generic/NavigationToAccountDetail/03_UserTapsOnAccounts'), 0)

'Verify screen once the user is navigated to Accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/04_VerifyElementText - ACCOUNTS'), 
    'ACCOUNTS')

'Verify the presence of G1A tile'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/05_VerifyElementText - Global Access Account-i'), 
    'Global Access Account-i')

Mobile.takeScreenshot()

'User taps on G1A tile'
Mobile.tap(findTestObject('Object Repository/Generic/NavigationToAccountDetail/06_UserTapsOn - Global Access Account-i'), 
    0)

'Verify once the user navigated inside G1A'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/07_UserIsNavigatedToAccountDetailScreen - Your Currencies'), 
    'Your Currencies')

Mobile.takeScreenshot()

'Swipe the screen below'
Mobile.swipe(0, 300, 0, 0)

'Verify the tab element TRANSACT'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/08_AccountDetail_ActionItem - TRANSACT'), 
    'TRANSACT')

'Verify the Tab element MANAGE'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/09_AccountDetail_ActionItem - MANAGE'), 
    'MANAGE')

'Verify the Details section'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/10_AccountDetail_Action_Item - DETAILS'), 
    'DETAILS')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1982765483378984765.png')

'Scroll up\r\n'
Mobile.scrollToText('Global Access Account-i')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7595609319434880112.png')
Mobile.takeScreenshot()
