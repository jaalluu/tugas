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
import org.openqa.selenium.interactions.ClickAction as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/user/login/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/user/login/input_OR_username'), 'jalu1')

WebUI.setText(findTestObject('Object Repository/user/login/input_Username_password'), 'Testing1')

WebUI.click(findTestObject('Object Repository/user/login/button_SIGN IN'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (1)/a_POPULAR ITEMS'))

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (1)/label_View Details'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (1)/div_Quantity_plus'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (1)/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (1)/svg_Management Console_menuCart'))

WebUI.delay(3)

	TestObject tObj = new TestObject()

	tObj.addProperty('xpath', ConditionType.EQUALS, '/html/body/div[3]/section/article/div[1]/table/tbody/tr/td[5]/label[2]')

	String error_msg_in_page = WebUI.getText(tObj)

	assert error_msg_in_page != '2'

//	def quantity = WebUI.verifyElementVisible(findTestObject('/html/body/div[3]/section/article/div[1]/table/tbody/tr/td[5]/label[2]'))

//	assert quantity == 2


WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (3)/button_CHECKOUT (2,523.98)'))

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (3)/button_NEXT'))

WebUI.click(findTestObject('Object Repository/buy item/Page_Advantage Shopping (3)/button_PAY NOW'))

WebUI.delay(3)

WebUI.closeBrowser()