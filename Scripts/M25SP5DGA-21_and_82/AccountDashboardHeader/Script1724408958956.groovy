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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify Screen once the user is on Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/Generic/NavigationToAccountDetail/01_Dashboard-VerifyElementText - Quick Actions'), 
    'Quick Actions')

'Take dashboard screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8172219018160064227.png')

Mobile.takeScreenshot()

'User taps on Accounts from footer '
Mobile.tap(findTestObject('Object Repository/Generic/NavigationToAccountDetail/03_UserTapsOnAccounts'), 0)

'Verify user is on Account List'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/01_VerifyText_UserOn_AccList'), 'ACCOUNTS')

'Take screenshot once the user is on Account List'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3522566280743770922.png')
Mobile.takeScreenshot()

'User taps on G1A'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-21/02_UserTapsOnG1ATile'), 0)

'Verify screen once the user navigates to Account detail screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/03_VerifyText_AccountDetailScreen'), 'Accounts')

'Take screenshot of the Account detail screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5248240256641242833.png')
Mobile.takeScreenshot()

'Validate the Product name'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/04_VerifyG1A_productName'), 'Global Access Account-i')

'Validate the length of the Account number'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/05_VerifyAccNumber_and_Length - 9000 0001 7559'), 
    '9000 0005 2641')

String numText = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-21/05_VerifyAccNumber_and_Length - 9000 0001 7559'), 
    0)

numText = numText.replace(' ', '')

def len = numText.length()

if (len == 12) {
    print('Length is 12')
} else {
    print('Length is not 12')
}

'Verify the text present above the amount'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/06_VerifyElementText - Total Currency Balance'), 
    'Total Currency Balance')

'Verify the currency and amount'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/07_VerifyAmountAndCurrency - RM 18,042.00'), 'RM 222,246.26*')

'User taps on Card'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-21/08_UserTapOnG1A_Card'), 0)

'Verify once the card details are copied'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/android.widget.TextView - Account number copied to clipboard'), 
    'Account number copied to clipboard.')

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/09_VerifyText - Based on indicative rates as at 03 Dec 2023'),'*Based on indicative rates as at 03 Dec 2023')
LocalDate currentDate = LocalDate.now()

LocalDate previousDate = currentDate.minusDays(1)

DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd MMM yyyy')

String formattedDate = previousDate.format(formatter)

/*
 * 'Verify the date mentioned is Current date minus one'
 * Mobile.verifyElementText(findTestObject('M25SP5DGA-21/09_VerifyText - Based
 * on indicative rates as at 03 Dec 2023', [('text') : '*Based on indicative
 * rates as at ' + formattedDate]), '*Based on indicative rates as at ' +
 * formattedDate)
 */
'Verify the Text View Transactions'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/10_VerifyElementText - View Transactions'), 'View Transactions')

Mobile.verifyElementText(findTestObject('Generic/verifyTextVisible', [('text') : 'View Transactions']), 'View Transactions')

Mobile.tap(findTestObject('Generic/verifyTextVisible', [('text') : 'View Transactions']), 0)

Mobile.waitForElementPresent(findTestObject('Generic/verifyTextVisible', [('text') : 'Transactions']), 20)

//Mobile.verifyElementNotVisible(findTestObject('Object Repository/M25SP5DGA-21/12_VerifyElementText - Transactions'), 0)
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3687185906437994094.png')
Mobile.takeScreenshot()

'User taps on Close button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-21/13_UserTapsOnCloseButton'), 0)

'Verify the text Your Currencies'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-21/14_VerifyElementTest - Your Currencies'), 'Your Currencies')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3957591090373233080.png')
Mobile.takeScreenshot()
