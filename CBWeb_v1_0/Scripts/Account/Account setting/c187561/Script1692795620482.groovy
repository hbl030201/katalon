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

WebUI.click(findTestObject('Sign in and out/myAccount'))

WebUI.click(findTestObject('Sign in and out/Account_Account settings'))

WebUI.click(findTestObject('Accounts/Account settings PW/Account settings_PW_change btn'))

'輸入舊密碼'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Current PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

'輸入新密碼'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_New PW input'), 'gMOrSXrdjKEU5H46GtiWSA==')

'輸入確認新密碼'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Confirm new PW input'), 'gMOrSXrdjKEU5H46GtiWSA==')

WebUI.click(findTestObject('Object Repository/Accounts/Account settings PW/Account settings_PW change_Reset btn'))

WebUI.click(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Reset_OK btn'))

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at02@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKEU5H46GtiWSA==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Sign in and out/myAccount'), 3000)

WebUI.click(findTestObject('Sign in and out/myAccount'))

WebUI.click(findTestObject('Sign in and out/Account_Account settings'))

WebUI.click(findTestObject('Accounts/Account settings PW/Account settings_PW_change btn'))

'輸入舊密碼(新)'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Current PW input'), 'gMOrSXrdjKEU5H46GtiWSA==')

'輸入新密碼(舊)'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_New PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

'輸入確認新密碼(舊)'
WebUI.setEncryptedText(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Confirm new PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Object Repository/Accounts/Account settings PW/Account settings_PW change_Reset btn'))

WebUI.click(findTestObject('Accounts/Account settings PW/Account settings_PW_change_Reset_OK btn'))

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at02@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Sign in and out/myAccount'), 5000)

WebUI.closeBrowser()

