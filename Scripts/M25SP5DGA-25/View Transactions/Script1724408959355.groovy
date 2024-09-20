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
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/02_Dashboard_UserIsLoggedIn - Logout'), 'Logout')

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

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/01_TapOnViewTransactions - View Transactions'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.scrollToText('Transactions')

Mobile.verifyElementNotVisible(findTestObject('Object Repository/M25SP5DGA-25/04_VerifyElementNotVisble- USD Transactions'),
	5)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/05_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/06_UserTapOnCloseIcon'), 0)

'Verify once the user navigated back to G1A'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/07_UserIsNavigatedToAccountDetailScreen - Your Currencies'),
	'Your Currencies')

'Verify the Home Currency tile'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/03_VerifyElementText - Add currency'), 'Add currency')

'User Taps on Add Currency'
Mobile.tap(findTestObject('M25SP5DGA-19/03_VerifyElementText - Add currency'), 0)

'Take screenshot once the user is inside Add Currency list'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

'User taps on Next country currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/04_UserTapOnNextCountryCurrency'), 0)

Mobile.delay(2)

'Take screenshot once user selects another country'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/01_TapOnViewTransactions - View Transactions'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.scrollToText('Transactions')

Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-25/04_VerifyElementNotVisble- USD Transactions'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/05_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/06_UserTapOnCloseIcon'), 0)

'Verify once the user navigated back to G1A'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/07_UserIsNavigatedToAccountDetailScreen - Your Currencies'),
	'Your Currencies')

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)


'User Taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/02_UserTapsOnManage - MANAGE'), 0)

'Screenshot once Manage Content is visible'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot653782284011369283.png')

Mobile.takeScreenshot()

'User taps on Remove'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/03_UserTapsOn - Remove Currency'), 0)

'Screenshot for the remove currency pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot845349476757770396.png')

Mobile.takeScreenshot()

'User taps on Confirm'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/09_UserTapsOnConfirm'), 0)

Mobile.delay(3)
'Take screenshot once the currency is removed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Verify once the Add currency is visible'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/10_VerifyElementText - Add currency'), 'Add currency')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/01_TapOnViewTransactions - View Transactions'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.scrollToText('Transactions')

Mobile.verifyElementNotVisible(findTestObject('Object Repository/M25SP5DGA-25/04_VerifyElementNotVisble- USD Transactions'),
	5)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/05_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')


Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/07_TapOnFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/08_VerifyText - Filter'), 'Filter')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/09_VerifyText - Duration of the Transaction History'),
	'Duration of the Transaction History')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/10_VerifyElementText- 30 days'), '30 days')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/11_VerifyElementText- 60 days'), '60 days')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/11_VerifyElementText- 60 days'),0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/14_UserTapOnApplyFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/07_TapOnFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/08_VerifyText - Filter'), 'Filter')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/15_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.scrollToText('MYR Transactions')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/16_UserTapsOn - MYR Transactions'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5298566116911552834.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/17_UserTapsOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()


Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/07_TapOnFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/08_VerifyText - Filter'), 'Filter')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/09_VerifyText - Duration of the Transaction History'),
	'Duration of the Transaction History')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/10_VerifyElementText- 30 days'), '30 days')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/11_VerifyElementText- 60 days'), '60 days')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/11_VerifyElementText- 60 days'),0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/14_UserTapOnApplyFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/07_TapOnFilter'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/08_VerifyText - Filter'), 'Filter')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/15_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-25/02_VerifyElementText - Transactions'), 'Transactions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-25/03_TapOnTransactionDropdown'), 0)

Mobile.scrollToText('MYR Transactions')

