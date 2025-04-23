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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url_web)

WebUI.click(findTestObject('Page_ParaBank  Welcome  Online Banking/input_Username_login'))

WebUI.setText(findTestObject('Page_ParaBank  Welcome  Online Banking/input_Username_login'), GlobalVariable.username)

WebUI.click(findTestObject('Page_ParaBank  Welcome  Online Banking/input_Password_login'))

WebUI.setText(findTestObject('Page_ParaBank  Welcome  Online Banking/input_Password_login'), GlobalVariable.password)

WebUI.click(findTestObject('Page_ParaBank  Welcome  Online Banking/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_ParaBank  Accounts Overview/a_Open New Account'))

WebUI.click(findTestObject('Page_ParaBank  Open Account/dropdown_type account'))

WebUI.selectOptionByValue(findTestObject('Page_ParaBank  Open Account/dropdown_type account'), '1', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_ParaBank  Open Account/dropdown_account'))

WebUI.selectOptionByValue(findTestObject('Page_ParaBank  Open Account/dropdown_account'), '15231', false)

WebUI.click(findTestObject('Page_ParaBank  Open Account/button_open new account'))

WebUI.verifyTextPresent('Congratulations, your account is now open.', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_ParaBank  Accounts Overview/a_Log Out'))

WebUI.delay(3)

WebUI.closeBrowser()

