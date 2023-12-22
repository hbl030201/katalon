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

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Invite session code')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_session code - Copy'))

WebUI.click(findTestObject('Sign in and out/myAccount'))

WebUI.click(findTestObject('Sign in and out/Account_Log out (owner)'))

WebUI.click(findTestObject('Sign in and out/Account_Log out_log out btn'))

WebUI.waitForElementPresent(findTestObject('join with code/login page_join with code btn'), 5000)

WebUI.click(findTestObject('join with code/login page_join with code btn'))

WebUI.waitForElementPresent(findTestObject('join with code/login page_join with code_code input'), 3000)

WebUI.sendKeys(findTestObject('join with code/login page_join with code_code input'), Keys.chord(Keys.CONTROL, 'v'))

'輸入name'
WebUI.setText(findTestObject('join with code/login page_join with code_name input'), 'user 1')

WebUI.click(findTestObject('join with code/login page_join with code_submit btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/session_header session name'), 5000)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/session_header session name'), 'Invite session code')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Invite session code')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/session code/Attendee_session code'), 3000)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Member/Attendee_second member name'), 'user 1')

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_Member Edit btn'))

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_delete second member'))

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_delete_member cancel'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Member/Attendee_second member name'), 'user 1')

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_delete second member'))

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_delete member confirm'))

WebUI.verifyElementNotPresent(findTestObject('Inner session/Attendee/Member/Attendee_second member name'), 3000)

WebUI.verifyElementPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 3000)

WebUI.closeBrowser()

