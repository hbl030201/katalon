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

WebUI.openBrowser('https://creativeboard-stg.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

'先檢查第一個group name是否為"Non grouped"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_non_group'), 'Non-grouped (4)', FailureHandling.STOP_ON_FAILURE)

'點擊"Create group"btn'
WebUI.click(findTestObject('Inner session/Attendee/Group/Group_add btn'))

'輸入group名稱'
WebUI.setText(findTestObject('Inner session/Attendee/Group/Group_add_group name input'), 'first group')

WebUI.click(findTestObject('Inner session/Attendee/Group/first uncheck member'))

WebUI.click(findTestObject('Inner session/Attendee/Group/second_uncheck_member'))

WebUI.click(findTestObject('Object Repository/Inner session/Attendee/Group/Group_add_Create btn'))

'檢查 group name 是否改為 "edit group"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_created_group_name'), 'first group (2)')

'檢查 group list 第一位是否為 "user 1"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group list first member name'), 'user 1')

'檢查 group list 第二位是否為 "user 2"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group list second member name'), 'user 2')

WebUI.click(findTestObject('Sign in and out/myAccount'))

WebUI.click(findTestObject('Sign in and out/Account_Log out (owner)'))

WebUI.click(findTestObject('Sign in and out/Account_Log out_log out btn'))

WebUI.closeBrowser()

