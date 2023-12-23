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

WebUI.setText(findTestObject('Session List/sessionlist_search input'), 'classroom')

WebUI.sendKeys(findTestObject('Session List/sessionlist_search input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'), 3000)

WebUI.click(findTestObject('Session List/sessionlist_first_session_owner(Only one session)'))

WebUI.waitForElementPresent(findTestObject('Inner session/Attendee/Attendees'), 8000)

WebUI.click(findTestObject('Inner session/Classroom/classroom'))

WebUI.click(findTestObject('Inner session/Classroom/classroom_dropdown'))

WebUI.click(findTestObject('Inner session/Classroom/classroom_dropdown_name 3'))

WebUI.click(findTestObject('Inner session/Classroom/classroom bind'))

WebUI.verifyElementText(findTestObject('Inner session/Classroom/class name'), 'test 1')

WebUI.click(findTestObject('Inner session/Classroom/change class'))

WebUI.verifyElementText(findTestObject('Inner session/Classroom/change classroom title'), 'Change to another class?')

WebUI.verifyElementText(findTestObject('Inner session/Classroom/change classroom text'), 'Once you change binding class, the link with class (classwork&post) will be disappear.')

WebUI.click(findTestObject('Inner session/Classroom/change class change btn'))

WebUI.click(findTestObject('Inner session/Classroom/classroom_dropdown'))

WebUI.click(findTestObject('Inner session/Classroom/classroom_dropdown_name 2'))

WebUI.click(findTestObject('Inner session/Classroom/classroom bind'))

WebUI.verifyElementText(findTestObject('Inner session/Classroom/class name'), 'test 2')

WebUI.closeBrowser()

