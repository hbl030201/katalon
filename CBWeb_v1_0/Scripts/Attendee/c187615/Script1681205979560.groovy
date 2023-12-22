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

'在搜尋框輸入"join with code",找到唯一一個叫"join with code"的session'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'join with code')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code btn'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh btn'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh_OK btn'))

WebUI.waitForElementNotPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 3000)

'擷取session code,並存在"code"變數裡'
code = WebUI.getText(findTestObject('Inner session/Attendee/session code/Attendee_session code'))

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('join with code/login page_join with code btn'), 5000)

WebUI.click(findTestObject('join with code/login page_join with code btn'))

WebUI.waitForElementPresent(findTestObject('join with code/login page_join with code_code input'), 3000)

'輸入session code'
WebUI.setText(findTestObject('join with code/login page_join with code_code input'), code)

'輸入name'
WebUI.setText(findTestObject('join with code/login page_join with code_name input'), 'user')

WebUI.click(findTestObject('join with code/login page_join with code_submit btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/session_header session name'), 5000)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/session_header session name'), 'join with code')

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/session_unlogin_account'), 'Sign in')

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 3000)

'先確認session code下方有人'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 'user')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

'在搜尋框輸入"join with code",找到唯一一個叫"join with code"的session'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'join with code')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

'點擊"refresh",清空成員'
WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh btn'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh_OK btn'), 
    0)

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh_OK btn'))

'再次確認session code下方沒有人'
WebUI.verifyElementNotPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 0)

WebUI.closeBrowser()

