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

WebUI.verifyElementPresent(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 1'), 
    3000)

WebUI.verifyElementPresent(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 2'), 
    3000)

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_name 3'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_create group'), 
    'Create new group with class name')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_Invite'), 
    'Invite')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_Cancel btn'), 
    'Cancel')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_dropdown_Invite'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_invite dialog title'), 
    'Students can sign in to Creative Board with Google account')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_invite dialog text'), 
    'We have emailed an invitation to your students, they can sign in to CreativeBoard with a Google account.')

WebUI.click(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_Done btn'))

WebUI.verifyElementNotPresent(findTestObject('Inner session/Attendee/Invite/Invite_Google Classroom/Attendee_Invite_Google Classroom_invite dialog title'), 
    3000)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite member/Invite member 1 email'), 'yuki.lin.op2@gmail.com')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Invite/Invite member/Invite member 2 email'), 'yuki.lin.op@gmail.com')

WebUI.closeBrowser()

