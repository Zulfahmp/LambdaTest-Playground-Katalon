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

WebUI.callTestCase(findTestCase('Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('page_home/my_account_dropdown'))

WebUI.verifyElementPresent(findTestObject('page_my_account/logout_dropdown'), 0)

WebUI.click(findTestObject('page_my_account/logout_dropdown'))

WebUI.waitForElementPresent(findTestObject('page_logout/title_account_logout'), 0)

texttitleLogout = WebUI.getText(findTestObject('page_logout/title_account_logout'))

WebUI.verifyEqual(texttitleLogout, 'Account Logout')

WebUI.verifyElementPresent(findTestObject('page_logout/button_continue'), 0)

WebUI.click(findTestObject('page_logout/button_continue'))

