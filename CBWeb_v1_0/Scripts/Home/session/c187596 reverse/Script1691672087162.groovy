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

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Copy of copy')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

'先確認搜尋出的結果不會顯示第2個session'
WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.verifyElementText(findTestObject('Session List/sessionlist_first session name(only one session)'), 'Copy of copy')

WebUI.click(findTestObject('Session List/sessionlist_session_settings'))

WebUI.click(findTestObject('Session List/sessionlist_session_delete'))

WebUI.click(findTestObject('Session List/sessionlist_session_delete_delete'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Copy of copy')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

'確認搜尋後沒有出現session'
WebUI.waitForElementPresent(findTestObject('Session List/session list no white board'), 5000)

WebUI.closeBrowser()

