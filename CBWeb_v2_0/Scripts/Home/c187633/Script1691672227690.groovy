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

WebUI.waitForElementPresent(findTestObject('Session List/Owned by whom'), 3000)

'先確認目前的顯示是"Owned by anyone"'
WebUI.verifyElementText(findTestObject('Session List/Owned by whom'), 'Owned by anyone')

'開啟新 session'
WebUI.click(findTestObject('Session List/session list white session'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Inner session/floating board'), 3000)

'回到 home page\r\n'
WebUI.click(findTestObject('Session List/CB_main page button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(over one session)'), 3000)

'確認session list的第1個是剛開啟的 session'
WebUI.verifyElementText(findTestObject('Session List/sessionlist_first_session_name(over one session)'), 'Untitled session')

WebUI.click(findTestObject('Session List/sessionlist_session_settings'))

WebUI.click(findTestObject('Session List/sessionlist_session_delete'))

WebUI.click(findTestObject('Session List/sessionlist_session_delete_delete'))

WebUI.closeBrowser()

