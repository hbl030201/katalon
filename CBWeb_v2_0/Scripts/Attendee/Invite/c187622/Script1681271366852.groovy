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

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Invite EG')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Attendee_Invite'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email'))

WebUI.setText(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_Input mail'), 'snu41371@omeie.com')

WebUI.verifyElementPresent(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_non CB member'), 
    3000)

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_Invite btn'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_non CB member - title'), 
    'Share to non-Creative Board account?')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_non CB member_cancel btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email - title'), 
    8000)

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_cancel btn'))

WebUI.verifyElementNotPresent(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_non CB member - text'), 
    3000)

WebUI.click(findTestObject('Inner session/Attendee/Invite/Attendee_Invite'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email'))

WebUI.setText(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_Input mail'), 'yuki.lin.op@gmail.com')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Email/Attendee_Invite_Email_cancel btn'))

WebUI.closeBrowser()

