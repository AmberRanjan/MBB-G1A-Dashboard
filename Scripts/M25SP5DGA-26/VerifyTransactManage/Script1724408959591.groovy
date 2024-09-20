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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

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

'Screenshot once the user Navigates inside G1A'
Mobile.takeScreenshot()

'Swipe the screen'
Mobile.swipe(0, 500, 0, 0)

'Validate the current balance from excel'
CurrentBalance()

'Validate One Day float from excel'
OneDayFloat()

'Validate Late Clearing value from excel'
LateClearing()

def CurrentBalance() {
    'Validate data in Country Dropdown is as per test data in excel sheet'
    Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('Data Files/AccountsSheet.xlsx', 'Current Balance', true)

    String CurrBal = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-26/01 Current balance value'), 0)

    for (int row = 1; row <= excelData.getRowNumbers(); row++) {
        Mobile.delay(2)

        println(excelData.getRowNumbers())

        Mobile.verifyElementText(findTestObject('Generic/verifyTextVisible', [('text') : CurrBal]), excelData.getValue('Current Balance', 
                row), FailureHandling.OPTIONAL)

        Mobile.takeScreenshot()
    }
}

def OneDayFloat() {
    'Validate data in Country Dropdown is as per test data in excel sheet'
    Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('Data Files/AccountsSheet.xlsx', 'One Day Float', true)

    String OneDayFloat = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-26/02- One-day float'), 0)

    for (int row = 1; row <= excelData.getRowNumbers(); row++) {
        Mobile.delay(2)

        println(excelData.getRowNumbers())

        Mobile.verifyElementText(findTestObject('Generic/verifyTextVisible', [('text') : OneDayFloat]), excelData.getValue(
                'One Day Float', row), FailureHandling.OPTIONAL)

        Mobile.takeScreenshot()
    }
}

def LateClearing() {
    'Validate data in Country Dropdown is as per test data in excel sheet'
    Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('Data Files/AccountsSheet.xlsx', 'Late Clearing', true)

    String LateClearing = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-26/03- Late clearingOutstation chequefloat'), 
        0)

    for (int row = 1; row <= excelData.getRowNumbers(); row++) {
        Mobile.delay(2)

        println(excelData.getRowNumbers())

        Mobile.verifyElementText(findTestObject('Generic/verifyTextVisible', [('text') : LateClearing]), excelData.getValue(
                'Late Clearing', row), FailureHandling.OPTIONAL)

        Mobile.takeScreenshot()
    }
}

