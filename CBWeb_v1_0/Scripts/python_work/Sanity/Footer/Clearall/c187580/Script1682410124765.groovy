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
import java.io.IOException as IOException
import java.io.InputStream as InputStream
import java.io.PrintStream as PrintStream
import java.io.UnsupportedEncodingException as UnsupportedEncodingException
import java.net.SocketException as SocketException
import org.apache.commons.net.telnet.TelnetClient as TelnetClient
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

String command = 'D:\\CB_Web\\Footer\\Clearall\\c187580.bat'

//exec command
p = Runtime.getRuntime().exec(command)

BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))

String line = null

while ((line = br.readLine()) != null) {
    System.out.println(line)

    if (line == 'PASS') {
        break
    }
    
    if (line == 'FAIL') {
        KeywordUtil.markFailed('Return code error !!!')
		break
    }
}

