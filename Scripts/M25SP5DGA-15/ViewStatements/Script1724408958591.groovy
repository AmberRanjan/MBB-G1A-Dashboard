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

'Verify screen when user is on the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/01_VerifyElementText - Quick Actions'), 'Quick Actions')

'Take screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5436459369021106018.png')
Mobile.takeScreenshot()

'User taps on Accounts from footer icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/02_UserTapOn_Accounts'), 0)

'Verify element when the user is on Accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/03_VerifyElementText - ACCOUNTS'), 'ACCOUNTS')

'Screenshot of Accounts list'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8264118008466313680.png')
Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)

'User taps on G1A tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/04_UaerTapsOn- Global Access Account-i'), 0)

Mobile.delay(3)

'Verify element once user navigates into accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/05_VerifyElementText- Accounts'), 'Accounts')

'Screenshot of Account detail screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')
Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)

'User taps on View statement'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/06_UserTapsOn - ViewStatements'), 0)

'Verify element once navigated to Statements screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/07_VerifyElementText - Statements'), 'Statements')

'Screenshot of Statements screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4746194997046481956.png')
Mobile.takeScreenshot()

'User taps on year dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/08_UserTapsOnYearDropdown'), 0)

'Screenshot when the dropdown list appears'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4564657037671310361.png')
Mobile.takeScreenshot()

'User taps on cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/09_UserTapsOn - Cancel'), 0)

'Screenshot for the statements screen after tapping on cancel'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2232615163531853258.png')
Mobile.takeScreenshot()

'User taps on year dropdown again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/10_UserTapsOnYearDropdown'), 0)

'User taps on year 2022'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/11_UserTapsOnYear - 2022'), 0)

'Screenshot of the year dropdown after selecting 2022'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot9123766336084406557.png')
Mobile.takeScreenshot()

'User taps on done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/12_UserTapsOnDone'), 0)

'Screenshot for the Statements screen after selecting year'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7928799235471167850.png')
Mobile.takeScreenshot()

'User tap on Month dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/11_UserTapsOnMonthDropdown'), 0)

'Take screenshot once the month dropdown is visible'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7508407457964744697.png')
Mobile.takeScreenshot()

'User taps on October'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/12_UserTapsOn - Oct'), 0)

'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/13_UserTapsOn- Cancel'), 0)

'Screenshot once the Statement screen is viewed again without month'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5541369542755070490.png')
Mobile.takeScreenshot()

'User taps on month dropdown '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/14_UserTapsOnMonthDropdown'), 0)

'Screenshot for the Month dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot135933885527212790.png')
Mobile.takeScreenshot()

'Select Nov month'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/15_UserTapsOn - Nov'), 0)

'Screenshot after selecting Nov month'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1637703287649171441.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/16_UserTapsOnDone'), 0)

'Screenshot of statements screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot341920412365396288.png')
Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/17_UserTapsOnBackButton'), 0)

'Verify object once user navigates to Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/18_UserNavigatedBackTo - Accounts'), 'Accounts')

'Screenshot of statements screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot341920412365396288.png')
Mobile.takeScreenshot()
