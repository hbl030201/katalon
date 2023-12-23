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

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at03@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Invite EG')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Attendee_Invite'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom - name'), 
    'Invite with Google Classroom')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 1'), 
    'test 3')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 2'), 
    'test 2')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 3'), 
    'test 1')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 3'))

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_Cancel btn'))

WebUI.closeBrowser()

