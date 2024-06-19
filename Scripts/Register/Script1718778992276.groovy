import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

WebUI.callTestCase(findTestCase('OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('page_home/my_account_dropdown'), 0)

WebUI.mouseOver(findTestObject('page_home/my_account_dropdown'))

WebUI.verifyElementPresent(findTestObject('page_home/register_dropdown'), 0)

WebUI.click(findTestObject('page_home/register_dropdown'))

WebUI.verifyElementPresent(findTestObject('page_register/title_page_register'), 0)

textRegisterAccount = WebUI.getText(findTestObject('page_register/title_page_register'))

WebUI.verifyEqual(textRegisterAccount, 'Register Account')

WebUI.verifyElementPresent(findTestObject('page_register/field_firstname'), 0)

WebUI.setText(findTestObject('page_register/field_firstname'), GenerateRandom.generateName(10))

WebUI.verifyElementPresent(findTestObject('page_register/field_lastname'), 0)

WebUI.setText(findTestObject('page_register/field_lastname'), GenerateRandom.generateName(5))

WebUI.verifyElementPresent(findTestObject('page_register/field_email'), 0)

email = (GenerateRandom.generateEmail(10) + '@yopmail.com')

GlobalVariable.email = email

println(GlobalVariable.email)

WebUI.setText(findTestObject('page_register/field_email'), email)

WebUI.verifyElementPresent(findTestObject('page_register/field_telephone'), 0)

WebUI.setText(findTestObject('page_register/field_telephone'), GenerateRandom.generatePhoneNumber(12))

WebUI.verifyElementPresent(findTestObject('page_register/field_password'), 0)

WebUI.setText(findTestObject('page_register/field_password'), GlobalVariable.password)

WebUI.verifyElementPresent(findTestObject('page_register/field_confirm_password'), 0)

WebUI.setText(findTestObject('page_register/field_confirm_password'), GlobalVariable.password)

WebUI.verifyElementPresent(findTestObject('page_register/radio_button_yes'), 0)

WebUI.click(findTestObject('page_register/radio_button_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('page_register/input_agree'), 0)

WebUI.click(findTestObject('page_register/input_agree'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('page_register/button_continue'), 0)

WebUI.click(findTestObject('page_register/button_continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('page_success_register/title_success_register'), 0)

textSuccessRegister = WebUI.getText(findTestObject('page_success_register/title_success_register'))

WebUI.verifyEqual(textSuccessRegister, 'Your Account Has Been Created!')

WebUI.click(findTestObject('page_success_register/button_continue'))

