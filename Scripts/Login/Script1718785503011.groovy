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

WebUI.callTestCase(findTestCase('LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('page_home/my_account_dropdown'), 0)

WebUI.mouseOver(findTestObject('page_home/my_account_dropdown'))

WebUI.verifyElementPresent(findTestObject('page_home/login_dropdown'), 0)

WebUI.click(findTestObject('page_home/login_dropdown'))

WebUI.waitForElementPresent(findTestObject('page_login/text_returning_customer'), 0)

textReturningCustomer = WebUI.getText(findTestObject('page_login/text_returning_customer'))

WebUI.verifyEqual(textReturningCustomer, "Returning Customer")

WebUI.verifyElementPresent(findTestObject('page_login/field_email'), 0)

WebUI.setText(findTestObject('page_login/field_email'), GlobalVariable.email)

WebUI.verifyElementPresent(findTestObject('page_login/field_password'), 0)

WebUI.setText(findTestObject('page_login/field_password'), GlobalVariable.password)

WebUI.verifyElementPresent(findTestObject('page_login/button_login'), 0)

WebUI.click(findTestObject('page_login/button_login'))

