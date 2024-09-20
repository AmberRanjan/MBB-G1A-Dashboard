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

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)

'Tap on G1A tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-15/04_UaerTapsOn- Global Access Account-i'), 0)

'Verify screen once user navigates to G1A'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-15/05_VerifyElementText- Accounts'), 'Accounts')

'Take screenshot once the user is inside G1A'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6583792486307551610.png')

Mobile.takeScreenshot()

'Verify the first tile as Home Currency'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-19/01_VerifyElementText - Home currency'), 'Home currency')

'User taps on FYC having amount'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/01_UserTapsOnUSDTileHavingAmount'), 0)

'Scroll screen'
Mobile.scrollToText('DETAILS')

'Acreenshot upon scroll'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3374045178228792665.png')

Mobile.takeScreenshot()

'User Taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/02_UserTapsOnManage - MANAGE'), 0)

'Screenshot once Manage Content is visible'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot653782284011369283.png')

Mobile.takeScreenshot()

'User taps on Remove'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/03_UserTapsOn - Remove Currency'), 0)

'Verify text Account still in use'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-120/04_Pop_up - Account still in use'), 'Account still in use')

'Verify text in the body'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-120/05_PopUP_Body- You still have USD 567,031,231,213.99. To remove this currency from your list, you will need to first clear the remaining balance'), 
    'You still have USD 567,031,231,213.99. To remove this currency from your list, you will need to first clear the remaining balance.')

'Take screenshot of pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3440408601964000194.png')

Mobile.takeScreenshot()

'User taps on Got It'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/06_UserTapsOnGotIt'), 0)

'Screenshot once user pop up closed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5228029257672822071.png')

Mobile.takeScreenshot()

'User taps on Remove currency again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/03_UserTapsOn - Remove Currency'), 0)

'Screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5228029257672822071.png')

Mobile.takeScreenshot()

'User taps on close icon in the corner'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-120/07_UserTapsOnCloseButton'), 0)

'Screenshot once pop- up closed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5228029257672822071.png')

Mobile.takeScreenshot()

