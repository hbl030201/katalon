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

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at02@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

'先點擊一次 BBB 的 session , 使它在 session list 順序變成第一個'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'BBB')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

'點擊 first session, 進到 session 裡'
WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(over one session)'))

'如果session上方的name沒出現,系統會判定沒進到session裡,排序就不會變動,所以要等到session上方的name出現才行'
WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/session_header session name'), 8000)

WebUI.click(findTestObject('Session List/CB_main page button'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified'), 3000)

'\r\n'
WebUI.click(findTestObject('Session List/sessionlist_Last modified'))

'切換為 Alphabetical\r\n'
WebUI.click(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'))

'先確認目前的顯示是"Alphabetically"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_Last modified'), 'Alphabetically')

'先確認目前的顯示是"Owned by anyone"'
WebUI.verifyElementText(findTestObject('Session List/Owned by whom'), 'Owned by anyone')

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 5000)

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'AAA')

'先確認 session list 目前第二個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 'AAA')

WebUI.click(findTestObject('Session List/Owned by whom'))

WebUI.click(findTestObject('Session List/Owned by whom_Owned by me item'))

'先確認目前的顯示是"Owned by me"'
WebUI.verifyElementText(findTestObject('Session List/Owned by whom'), 'Owned by me')

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'), 3000)

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'AAA')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT02')

'先確認 session list 目前第二個 session name 變成 "BBB"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 'BBB')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT02')

WebUI.click(findTestObject('Session List/Owned by whom'))

WebUI.click(findTestObject('Session List/Owned by whom_Owned by others item'))

'先確認目前的顯示是"Owned by others"'
WebUI.verifyElementText(findTestObject('Session List/Owned by whom'), 'Owned by others')

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'), 3000)

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'AAA')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT')

'先確認 session list 目前第二個 session name 變成 "BBB"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 'BBB')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT')

WebUI.closeBrowser()

