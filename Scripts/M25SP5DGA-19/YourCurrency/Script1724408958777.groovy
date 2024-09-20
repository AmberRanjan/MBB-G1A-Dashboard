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

'Verify the screen when user is on the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/01_VerifyElementText - Quick Actions'), 'Quick Actions')

'Take screenshot when the user is on Homepage'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5436459369021106018.png')

Mobile.takeScreenshot()

'Tap on Accounts from the footer'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/02_UserTapOn_Accounts'), 0)

'Verify Screen once the user navigates to the accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/03_VerifyElementText - ACCOUNTS'), 'ACCOUNTS')

'Take screenshot of the accounts list screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8264118008466313680.png')

Mobile.takeScreenshot()

'Tap on G1A tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/04_UaerTapsOn- Global Access Account-i'), 0)

'Verify screen once user navigates to G1A'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/05_VerifyElementText- Accounts'), 'Accounts')

'Take screenshot once the user is inside G1A'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')

Mobile.takeScreenshot()

'Verify the first tile as Home Currency'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/01_VerifyElementText - Home currency'), 'Home currency')

'Verify the Home Currency tile'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/03_VerifyElementText - Add currency'), 'Add currency')

'User Taps on Add Currency'
Mobile.tap(findTestObject('M25SP5DGA-19/03_VerifyElementText - Add currency'), 0)

'Take screenshot once the user is inside Add Currency list'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')

Mobile.takeScreenshot()

'User taps on Next country currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/04_UserTapOnNextCountryCurrency'), 0)

'Take screenshot once user selects another country'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')

Mobile.takeScreenshot()

'User scrolls the screen'
Mobile.scrollToText('Details')

'Take screenshot once the screen scrolled'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Uesr taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/07_UserTapsOn - MANAGE'), 0)

'Take screenshot once the remove currency section appears in manage tab'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Uesr taps on Remove Currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/08_UserTapsOn - Remove Currency'), 0)

'Screenshot for the remove currency pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot845349476757770396.png')

Mobile.takeScreenshot()

'User taps on Confirm'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/09_UserTapsOnConfirm'), 0)

'Take screenshot once the currency is removed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Verify once the Add currency is visible'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/10_VerifyElementText - Add currency'), 'Add currency')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()

'Tap on Add Currency Tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-48/02_UserTapsOnAddCurrencyTile'), 0)

'UserNavigated to Add currency'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-48/03_UserNavigatedTo- Add Currency'), 'Add Currency')

'Screenshot for the currency list'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8677993882523699656.png')
Mobile.takeScreenshot()

'Tap on Smart search field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-48/04_UserHighlightsSearchFiels'), 0)

'Screenshot after clicking search field'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6727553336817614034.png')
Mobile.takeScreenshot()

'Search for Japanese currency'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-48/05_UserSetTextToJapaneseYen'), 'JPY', 0)

'screenshot once the japanese currency gets listed on top'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3964265221552662920.png')
Mobile.takeScreenshot()

'Hide Kayboard'
Mobile.hideKeyboard()

'Delay of 2 seconds'
Mobile.delay(2)

'User taps on Japanese country currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/04_UserTapOnNextCountryCurrency'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/04_UserTapOnNextCountryCurrency'), 0)

'Verify once the JYP tile is displayed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-48/07VerifyJPYValue - JPY 0'), 'JPY 0')

'Screenshot for the JYP tile'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8214051783706898315.png')
Mobile.takeScreenshot()

'Scroll the screen'
Mobile.scrollToText('DETAILS')

'Uesr taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/07_UserTapsOn - MANAGE'), 0)

'Take screenshot once the remove currency section appears in manage tab'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Uesr taps on Remove Currency'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/08_UserTapsOn - Remove Currency'), 0)

'Screenshot for the remove currency pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot845349476757770396.png')

Mobile.takeScreenshot()

'User taps on Confirm'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-19/09_UserTapsOnConfirm'), 0)

'Take screenshot once the currency is removed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399998494506442294.png')

Mobile.takeScreenshot()

'Verify once the Add currency is visible'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/10_VerifyElementText - Add currency'), 'Add currency')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8342626835702728874.png')
Mobile.takeScreenshot()
