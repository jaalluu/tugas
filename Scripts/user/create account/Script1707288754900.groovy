import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/user/create account (1)/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/user/create account/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input__usernameRegisterPage'), username)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input__emailRegisterPage'), email)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input__passwordRegisterPage'), password)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input__confirm_passwordRegisterPage'), confirm_password)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_PERSONAL DETAILS_first_nameRegisterPage'), firstname)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_- Use maximum 30 character_last_nameR_6ef033'), lastname)

WebUI.setText(findTestObject('Object Repository/user/create account/Page_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    phone)

WebUI.selectOptionByValue(findTestObject('Object Repository/user/create account (1)/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:250', true)

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_concat(id(, , select2-billing_country_d3312d'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_Country_cityRegisterPage'), city)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_- Use maximum 25 character_addressReg_9e23b3'), address)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_- Use maximum 50 character_state__pro_272a54'), state)

WebUI.setText(findTestObject('Object Repository/user/create account (1)/input_- Use maximum 10 character_postal_cod_639c2f'), postal)

WebUI.click(findTestObject('Object Repository/user/create account (1)/input_Receive exclusive offers and promotio_5c7450'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/user/create account (1)/button_REGISTER'))

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/')

