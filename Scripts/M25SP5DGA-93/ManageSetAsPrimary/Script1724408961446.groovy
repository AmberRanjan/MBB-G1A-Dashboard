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

'Screenshot for the Accounts List'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'User taps on G1A tile'
Mobile.tap(findTestObject('Object Repository/Generic/NavigationToAccountDetail/06_UserTapsOn - Global Access Account-i'), 
    0)

'Verify once the user navigated inside G1A'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/07_UserIsNavigatedToAccountDetailScreen - Your Currencies'), 
    'Your Currencies')

'Take screenshot once navigated inside G1A'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'Verify the Tab element MANAGE'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/09_AccountDetail_ActionItem - MANAGE'), 
    'MANAGE')
'Swipe the screen below'
Mobile.swipe(0, 300, 0, 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'Tap On Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-93/01_UserTapsOn - MANAGE'), 0)

'Verify Auto Sweep'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-93/02_VerifyAutoSweep - Auto Sweep'), 'Auto Sweep')

'Take Screenshot of the Manage Tab item'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2304992381380891347.png')

Mobile.takeScreenshot()

'User Taps on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-93/03_UserTapsOn_BackButton'), 0)

'Verify screen once the user is navigated to Accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/04_VerifyElementText - ACCOUNTS'), 
    'ACCOUNTS')

'Verify Personal Accounyt tile'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-93/04_PersonalCurrentAccount - Personal Current Account'), 
    'Personal Current Account')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'Tap on Personal Account tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-93/05_TapOn - Personal Current Account'), 0)

'Verify the Tab element MANAGE'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/09_AccountDetail_ActionItem - MANAGE'), 
    'MANAGE')

'Swipe the screen below'
Mobile.swipe(0, 300, 0, 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'User taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-93/01_UserTapsOn - MANAGE'), 0)

'Verify Set As Primary presence'
Mobile.verifyElementText(findTestObject('M25SP5DGA-93/06_VerifyElementText - Set as Primary'), 'Set as Primary')

'Verify the text associated with set as primary'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-93/07_VerifyElementText - Make this account as my primary account for transactions on the app'), 
    'Make this account as my primary account for transactions on the app')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8151592687533169279.png')

'Tap on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-93/08_TapOnBack'), 0)

'Verify screen once the user is navigated to Accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/04_VerifyElementText - ACCOUNTS'), 
    'ACCOUNTS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()