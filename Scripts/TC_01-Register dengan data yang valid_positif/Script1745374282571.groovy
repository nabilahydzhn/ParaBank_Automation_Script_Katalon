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

WebUI.waitForElementPresent(findTestObject('Page_ParaBank  Welcome  Online Banking/a_Register'), 20)

WebUI.waitForElementVisible(findTestObject('Page_ParaBank  Welcome  Online Banking/a_Register'), 20)

WebUI.waitForElementClickable(findTestObject('Page_ParaBank  Welcome  Online Banking/a_Register'), 20)

WebUI.click(findTestObject('Page_ParaBank  Welcome  Online Banking/a_Register'))

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_First Name'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_First Name'), 'Nabilah')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Last Name'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Last Name'), 'Yadzhan')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Address'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Address'), 'Kembangan Utara')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_City'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_City'), 'Jakarta Barat')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_State'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_State'), 'DKI Jakarta')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Zip Code'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Zip Code'), '11610')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Phone'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Phone'), '0895333612389')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_SSN'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_SSN'), '123456')

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Username'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Username'), GlobalVariable.username)

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Password'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Confirm'))

WebUI.setText(findTestObject('Page_ParaBank  Register for Free Online Account Access/input_Confirm'), GlobalVariable.password)

WebUI.click(findTestObject('Page_ParaBank  Register for Free Online Account Access/button_Register'))

WebUI.waitForPageLoad(30)

WebUI.delay(5)

WebUI.verifyTextPresent('Your account was created successfully. You are now logged in.', false)

WebUI.delay(5)

WebUI.closeBrowser()

