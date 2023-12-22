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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://creativeboard.optoma.com/signin')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('login page/By continue'), 'By continuing, you agree to Optoma Creative Board\'s Terms of Service and Privacy policy and Cookies Policy')

WebUI.verifyElementText(findTestObject('login page/Dont have an account'), 'Don\'t have an account? Sign up')

WebUI.verifyElementText(findTestObject('forgot password/a_Forgot password'), 'Forgot password')

WebUI.click(findTestObject('login page/home btn'))

WebUI.verifyElementText(findTestObject('login page/home page title'), 'Remote collaboration from anywhere!')

WebUI.click(findTestObject('Object Repository/login page/a_Login'))

WebUI.verifyElementText(findTestObject('login page/login page'), 'Sign in')

WebUI.closeBrowser()

