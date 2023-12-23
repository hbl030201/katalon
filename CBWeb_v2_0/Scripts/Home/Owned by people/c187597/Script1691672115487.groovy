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

'\r\n'
WebUI.click(findTestObject('Session List/sessionlist_Last modified'))

'切換為 Alphabetical\r\n'
WebUI.click(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'))

'先確認目前的顯示是"Alphabetically"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_Last modified'), 'Alphabetically')

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'), 3000)

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'AAA')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT')

'先確認 session list 目前第二個 session name 變成 "BBB"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 'AAA')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_owner(over one session)'), 'Owned by AT02')

WebUI.click(findTestObject('Session List/Owned by whom'))

WebUI.click(findTestObject('Session List/Owned by whom_Owned by me item'))

'先確認目前的顯示是"Owned by me"'
WebUI.verifyElementText(findTestObject('Session List/Owned by whom'), 'Owned by me')

'在搜尋框輸入"AAA"'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'aaa')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'), 3000)

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'AAA')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT02')

'先確認 session list 目前第二個 session name 變成 "BBB"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 'aaa')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT02')

'在搜尋框輸入"aaa"'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'BBB')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_Last modified_Alphabetically_item'), 3000)

'先確認 session list 目前第一個 session name 變成 "BBB"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'BBB')

'先確認 session list 目前第一個 session name 變成 "AAA"'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 'Owned by AT02')

WebUI.closeBrowser()

