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

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

'先檢查第一個group name是否為"Non grouped"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_non_group'), 'Non-grouped (5)', FailureHandling.STOP_ON_FAILURE)

'點擊"Create group"btn'
WebUI.click(findTestObject('Inner session/Attendee/Group/Group_add btn'))

'輸入特殊字元的名字'
WebUI.setText(findTestObject('Inner session/Attendee/Group/Group_add_group name input'), '123/.;')

'檢查是否出現 error message\r\n'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_edit_name_error message'), 'Should not contain special symbols.')

'輸入group名稱'
WebUI.setText(findTestObject('Inner session/Attendee/Group/Group_add_group name input'), 'rename group')

WebUI.click(findTestObject('Inner session/Attendee/Group/Last_uncheck_member'))

WebUI.click(findTestObject('Object Repository/Inner session/Attendee/Group/Group_add_Create btn'))

'檢查group name是否改為"first group"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_created_group_name'), 'rename group (1)')

'檢查 group list 第一位是否為 "AT03"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group list first member name'), 'AT03')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at03@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Member_group_name'), 'rename group (1)')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit btn'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_group_edit_Rename'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit_cancel btn'))

WebUI.verifyElementNotPresent(findTestObject('Inner session/Attendee/Group/Attendee_group_edit_first checked member'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit btn'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_group_edit_Rename'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/Attendee_group_edit_Rename_input'), 3000)

'將 group 名稱改成 "new name"'
WebUI.setText(findTestObject('Object Repository/Inner session/Attendee/Group/Attendee_group_edit_Rename_input'), 'new name')

WebUI.click(findTestObject('Object Repository/Inner session/Attendee/Group/Attendee_group_edit_Rename_save btn'))

'檢查 group name 是否改為 "new name (2)"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_created_group_name'), 'new name (1)', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at03@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Member_group_name'), 'new name (1)')

WebUI.closeBrowser()

WebUI.openBrowser('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign in and out/Sign in page_email input'), 'creativeboard.at@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign in and out/Sign in page_PW input'), 'gMOrSXrdjKGRQzi/ZJkP2Q==')

WebUI.click(findTestObject('Sign in and out/Sign in btn'))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_search input'), 3000)

'在搜尋框輸入"aaa",找到唯一一個叫"aaa"的session'
WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'Group')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.waitForElementNotPresent(findTestObject('Session List/sessionlist_second_session_name(over one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.click(findTestObject('Inner session/Attendee/Attendees'))

WebUI.click(findTestObject('Inner session/Attendee/Group/Attendee_Group'))

'先確認 group "new name (1)" 存在'
WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/Group_first_created_group_name'), 3000)

'先檢查第一個 group 的名稱是 "new name (1)"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_created_group_name'), 'new name (1)')

WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit btn'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/Group_edit_Delete'), 3000)

'刪除group'
WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit_Delete'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Group/Group_edit_delete_Delete btn'), 3000)

WebUI.click(findTestObject('Inner session/Attendee/Group/Group_edit_delete_Delete btn'))

'檢查group name是否改為"Non group"'
WebUI.verifyElementText(findTestObject('Inner session/Attendee/Group/Group_first_non_group'), 'Non-grouped (5)', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

