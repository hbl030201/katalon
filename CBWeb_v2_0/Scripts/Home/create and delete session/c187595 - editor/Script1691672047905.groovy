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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'delete session')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first session name(only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first session name(only one session)'))

'如果session上方的name沒出現,系統會判定沒進到session裡,排序就不會變動,所以要等到session上方的name出現才行'
WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/session_header session name'), 8000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code btn'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh_OK btn'))

WebUI.click(findTestObject('Inner session/Attendee/session code/Attendee_refresh code_Refresh btn'))

WebUI.waitForElementNotPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 3000)

'擷取session code,並存在"code"變數裡'
code = WebUI.getText(findTestObject('Inner session/Attendee/session code/Attendee_session code'))

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at02@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

WebUI.click(findTestObject('Session List/session list join with code btn'))

WebUI.waitForElementPresent(findTestObject('Session List/session list join with code-code'), 3000)

'輸入session code'
WebUI.setText(findTestObject('Session List/session list join with code-code'), code)

WebUI.click(findTestObject('Session List/session list join with code join btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/session_header session name'), 5000)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/session_header session name'), 'delete session')

WebUI.verifyElementNotPresent(findTestObject('Inner session/floating board'), 3000)

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'delete session')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first session name(only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first session name(only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.verifyElementPresent(findTestObject('Inner session/Attendee/Member/Attendee_first member name'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_first member identity'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inner session/Attendee/Member/Attendee_first member identity - editor'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Member/Attendee_first member identity'), 'Editor')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at02@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'delete session')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first session name(only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first session name(only one session)'))

WebUI.verifyElementPresent(findTestObject('Inner session/floating board'), 3000)

WebUI.click(findTestObject('Session List/CB_main page button'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first session name(only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_session_settings'))

WebUI.click(findTestObject('Session List/sessionlist_session_remove'))

WebUI.verifyElementText(findTestObject('Session List/sessionlist_session_remove title'), 'Remove delete session from my list')

WebUI.verifyElementText(findTestObject('Session List/sessionlist_session_remove text'), 'Once removed, session cannot be accessed again.')

WebUI.click(findTestObject('Session List/sessionlist_session_remove_remove'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'delete session')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

'確認搜尋後沒有出現session'
WebUI.waitForElementPresent(findTestObject('Session List/session list no white board'), 5000)

WebUI.closeBrowser()

