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
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

Mobile.startExistingApplication('com.maybank2u.life.uat')

'User is on Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/01_VerifyElementText - Quick Actions'), 'Quick Actions')

'Takes Screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2764630535604141228.png')
Mobile.takeScreenshot()

'User taps on View All Accounts'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/02_UserTapsOn - View All Accounts'), 0)

'User navigates to Accounts list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/03_VerifyElementText - ACCOUNTS'), 'ACCOUNTS')

'Take Screenshot after navigating to accounts list screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6293676926243446263.png')
Mobile.takeScreenshot()

'Tap on Global 1 Account tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/04_NavigateInsideG1A- Global Access Account-i'), 0)

'User Navigates to G1A account manage screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/05_VerifyElementText - MANAGE'), 'MANAGE')

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)

'Take the screenshot of the screen after scrolling down'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4795958477907753060.png')
Mobile.takeScreenshot()

'User taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/06_UserTapsOn - MANAGE'), 0)

'Verify Auto Sweep is present inside Manage'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/07_VerifyElementText - Auto Sweep'), 'Auto Sweep')

'Verify the statement present below Auto Sweep'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/08_VerifyElementText - Automatically convert home currency ifforeign currency balance is insufficient forcard transaction'), 
    'Automatically convert home currency if\nforeign currency balance is insufficient for\ncard transaction')

'Take Screenshot of the Manage section'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5839498068958624739.png')
Mobile.takeScreenshot()

'User taps on the toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

'Verify the text in the Confirmation Pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/10_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Verify warning/Confirmation message in the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/11_VerifyElementText - Are you sure you want todeactivate Auto Sweep'), 
    'Are you sure you want to\ndeactivate Auto Sweep?')

'Take Screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7738406051414577426.png')
Mobile.takeScreenshot()

Mobile.delay(2)

'Tap on the close button present in the pop-up'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/12_UserTapsOnCloseIcon'), 0)

'Account detail screen appears upon closing the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/13_VerifyElementText_UserNavigatesBackToAccountDetailScreen'), 
    'Your Currencies')

'Take screenshot after closing the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot672359741204102328.png')
Mobile.takeScreenshot()

'User taps on the toggle button again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/14_UserTapsOnToggleButtonAgain'), 0)

'A confirmation pop-up appears'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/15_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot435698299856662271.png')
Mobile.takeScreenshot()

'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/16_UserTapsOnCancel'), 0)

'Account details screen is visible agin after closing the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/17_VerifyElementText_UserNavigatesBackTo - Your Currencies'), 
    'Your Currencies')

'Take screenshot of the Account details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1264254330194872412.png')
Mobile.takeScreenshot()

'User taps on the toggle button again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/18_UserTapsOnToggleAgain'), 0)

'Verify text in the pop-up text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/19_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')
Mobile.takeScreenshot()

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/20_UserTapsOnDeactivateButton'), 0)

'Verify the header text in Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/21_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify Deactivate Auto Sweep text in the Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/22_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Verify if the date and time is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/23_VerifyElementText - Date  time'), 'Date & time')

'Delay the action for 50 seconds to get the secure 2 u session expired'
Mobile.delay(50)

'Verify the status of the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/24_VerifyElementTextExpiry - Authorisation failed'), 
    'Authorisation failed')

'Verify the text stating the reason for the authorization failing'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/25_VerifyElementTextExpiry - Your Secure Verification authorisation has expired. Please perform the transaction again'), 
    'Your Secure Verification authorisation has expired. Please perform the transaction again.')

'Validate if reference ID is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/26_VerifyElementTextExpiry - Reference ID'), 'Reference ID')

'Verify if the date and time is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/27_VerifyElementTextExpiry - Date  time'), 'Date & time')

'Verify the transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/28_VerifyElementTextExpiry- Transaction type'), 'Transaction type')

//Mobile.getText(findTestObject('Object Repository/M25SP5DGA-5/29_RefID - 192786381M'), 0)
//Mobile.getText(findTestObject('Object Repository/M25SP5DGA-5/30_DateTime - 27 Nov 2023, 1234 PM'), 0)
'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/31_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8280981999474609341.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/32_UserTapsOnDone'), 0)

'User navigates back to the Account details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/33_VerifyElementText - Your Currencies'), 'Your Currencies')

'Take screenshot for the Account details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888117852548430227.png')
Mobile.takeScreenshot()

'User taps on toggle again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/18_UserTapsOnToggleAgain'), 0)

'Verify the confirmation pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/19_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')
Mobile.takeScreenshot()

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/20_UserTapsOnDeactivateButton'), 0)

'Verify the header text in Secure 2 u authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/21_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the text present in Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/22_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/23_VerifyElementText - Date  time'), 'Date & time')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')
Mobile.takeScreenshot()

'User taps on Reject button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/49_UserTapsOnReject'), 0)

'Verify the status of the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/24_VerifyElementTextExpiry - Authorisation failed'), 
    'Authorisation failed')

'Verify the text stating the reason for the authorization failing'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/50_ Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Validate if reference ID is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/26_VerifyElementTextExpiry - Reference ID'), 'Reference ID')

'Verify if the date and time is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/27_VerifyElementTextExpiry - Date  time'), 'Date & time')

'Verify the transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/28_VerifyElementTextExpiry- Transaction type'), 'Transaction type')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/31_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8280981999474609341.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/32_UserTapsOnDone'), 0)

'User navigates back to the Account details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/33_VerifyElementText - Your Currencies'), 'Your Currencies')

'Take screenshot for the Account details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888117852548430227.png')
Mobile.takeScreenshot()

'User taps on toggle again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/18_UserTapsOnToggleAgain'), 0)

'Verify the confirmation pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/19_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')
Mobile.takeScreenshot()

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/20_UserTapsOnDeactivateButton'), 0)

'Verify the header text in Secure 2 u authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/21_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the text present in Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/22_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/23_VerifyElementText - Date  time'), 'Date & time')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')
Mobile.takeScreenshot()

'User taps on Approve button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/34_UserTapsOnApprove'), 0)

'Validate the decision screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/35_VerifyElementText - Auto sweep successfullydeactivated'), 
    'Auto sweep successfully\ndeactivated!')

'Verify the reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/36_VerifyElementText - Reference ID'), 'Reference ID')

//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-5/37_VerifyElementExist - 192786548M'), 0)
//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-5/38_VerifyElementExits - 27 Nov 2023, 1247 PM'),0)
'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4298578957733559650.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/39_UserTapsOnDone'), 0)

'User navigates back to the Account details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/40_VerifyElementText - Your Currencies'), 'Your Currencies')

'Take screenshot when the user is on Acount management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6997556479238322125.png')
Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.swipe(0, 500, 0, 0)

'User taps on Manage'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/06_UserTapsOn - MANAGE'), 0)

'Verify the Auto Sweep section inthe Manage tab'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/07_VerifyElementText - Auto Sweep'), 'Auto Sweep')

'Verify the statement present for the Auto sweep '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/08_VerifyElementText - Automatically convert home currency ifforeign currency balance is insufficient forcard transaction'), 
    'Automatically convert home currency if\nforeign currency balance is insufficient for\ncard transaction')

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5839498068958624739.png')
Mobile.takeScreenshot()

'User taps on the Deactivate toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

'User navigates to the Secure2 u screen for authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/41_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the text stating "Activating Auto Sweep"'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/42_VerifyElementText - Activate Auto Sweep'), 'Activate Auto Sweep')

'Take screenshot when the user is on the Secure2 u screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2336019252932878175.png')
Mobile.takeScreenshot()

'Delay the activity for 50 sec to get the session expired'
Mobile.delay(50)

'Verify the status of the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/24_VerifyElementTextExpiry - Authorisation failed'), 
    'Authorisation failed')

'Verify the text stating the reason for the authorization failing'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/25_VerifyElementTextExpiry - Your Secure Verification authorisation has expired. Please perform the transaction again'), 
    'Your Secure Verification authorisation has expired. Please perform the transaction again.')

'Validate if reference ID is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/26_VerifyElementTextExpiry - Reference ID'), 'Reference ID')

'Verify if the date and time is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/27_VerifyElementTextExpiry - Date  time'), 'Date & time')

'Verify the transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/28_VerifyElementTextExpiry- Transaction type'), 'Transaction type')

'Verify transaction type text stating Activate Auto Sweep'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/51_TransactionType- Activate Auto Sweep'), 'Activate Auto Sweep')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8280981999474609341.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/32_UserTapsOnDone'), 0)

'User navigates back to the Account details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/33_VerifyElementText - Your Currencies'), 'Your Currencies')

'Take screenshot for the Account details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888117852548430227.png')
Mobile.takeScreenshot()

'User taps on the Deactivate toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

'User navigates to the Secure2 u screen for authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/41_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the text stating Activate Auto Sweep'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/42_VerifyElementText - Activate Auto Sweep'), 'Activate Auto Sweep')

'Take screenshot when the user is on the Secure2 u screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2336019252932878175.png')
Mobile.takeScreenshot()

'User taps on Reject button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/49_UserTapsOnReject'), 0)

'Verify the status of the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/24_VerifyElementTextExpiry - Authorisation failed'), 
    'Authorisation failed')

'Verify the statement stating the reason for Authorization failed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/52_Activation Rejected - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Validate if reference ID is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/26_VerifyElementTextExpiry - Reference ID'), 'Reference ID')

'Verify if the date and time is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/27_VerifyElementTextExpiry - Date  time'), 'Date & time')

'Verify the transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/28_VerifyElementTextExpiry- Transaction type'), 'Transaction type')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/51_TransactionType- Activate Auto Sweep'), 'Activate Auto Sweep')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8280981999474609341.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/32_UserTapsOnDone'), 0)

'User navigates back to the Account details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/33_VerifyElementText - Your Currencies'), 'Your Currencies')

'Take screenshot for the Account details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888117852548430227.png')
Mobile.takeScreenshot()

'User taps on the Deactivate toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

'User navigates to the Secure2 u screen for authorization'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/41_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the activity performed by the user which is Activate Auto Sweep'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/42_VerifyElementText - Activate Auto Sweep'), 'Activate Auto Sweep')

'Take screenshot when the user is on the Secure2 u screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2336019252932878175.png')
Mobile.takeScreenshot()

'User taps on Approve'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/43_TapOnApprove'), 0)

'Verify the Activation success message in the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/44_VerifyElementText - Auto sweep successfullyactivated'), 
    'Auto sweep successfully\nactivated!')

'Verify the reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/45_VerifyElementText - Reference ID'), 'Reference ID')

'Verify the date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/46_VerifyElementText - Date  time'), 'Date & time')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622894067104886910.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/47_UserTapOnDone'), 0)

'User redirected to Accounts Details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/40_VerifyElementText - Your Currencies'), 'Your Currencies')

'Screenshot for the Accounts details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6997556479238322125.png')
Mobile.takeScreenshot()
