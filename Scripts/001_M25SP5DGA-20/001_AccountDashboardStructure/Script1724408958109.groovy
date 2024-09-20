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

WebUI.callTestCase(findTestCase('Generic/NavigationToAccountDetail'), [:], FailureHandling.STOP_ON_FAILURE)

'User taps on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-20/01_UserTapsOnBackButton'), 0)

'Verify the Accounts details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-20/02_AccountListingPage - ACCOUNTS'), 'ACCOUNTS')

'Verify the presence of G1A tile'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-20/03_ValidateElementText - Global Access Account-i'), 
    'Global Access Account-i')

'Take Screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot471068723610502609.png')
Mobile.takeScreenshot()
