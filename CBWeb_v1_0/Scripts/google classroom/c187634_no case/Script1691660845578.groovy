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

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'classroom')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Classroom/classroom'))

WebUI.click(findTestObject('Inner session/Classroom/classroom connect'))

WebUI.click(findTestObject('Accounts/Account settings Cloud integration/Google/google account_email input'))

WebUI.setText(findTestObject('Accounts/Account settings Cloud integration/Google/google account_email input'), 'creativeboard.at@gmail.com')

WebUI.sendKeys(findTestObject('Accounts/Account settings Cloud integration/Google/google account_email input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Accounts/Account settings Cloud integration/Google/google account_password input'), 'creativeboard.at01')

WebUI.sendKeys(findTestObject('Accounts/Account settings Cloud integration/Google/google account_password input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Accounts/Account settings Cloud integration/Google classroom check all'))

WebUI.scrollToElement(findTestObject('Accounts/Account settings Cloud integration/Google/google account_verified btn'), 
    200)

WebUI.click(findTestObject('Accounts/Account settings Cloud integration/Google/google account_verified btn'))

WebUI.verifyElementText(findTestObject('Accounts/Account settings Cloud integration/Google/google classroom pair success text'), 
    'Paired Google Classroom successfully.')

WebUI.click(findTestObject('Accounts/Account settings Cloud integration/Google/google pair success ok btn'))

WebUI.verifyElementText(findTestObject('Accounts/Account settings Cloud integration/Google classroom Email'), 'creativeboard.at@gmail.com')

WebUI.click(findTestObject('Inner session/Classroom/Back to session btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Classroom/classroom'))

WebUI.verifyElementPresent(findTestObject('Inner session/Classroom/classroom bind'), 2000)

WebUI.closeBrowser()

