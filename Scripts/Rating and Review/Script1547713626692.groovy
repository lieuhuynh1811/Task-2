import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://store-staging.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Extensions For Katalon Studio/div_Recently Added_mask rgba-w'))

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/a_Rating  Review'))

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/a_Sign in to write a review'))

WebUI.setText(findTestObject('Page_Extensions For Katalon Studio /input_Welcome back_email'), 'lieuhuynh@kms-technology.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Extensions For Katalon Studio/input_Welcome back_password'), 
    'jUwzFzaUqNtXnzUmgYSOLg==')

WebUI.click(findTestObject('Object Repository/Page_Extensions For Katalon Studio/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/a_Rating  Review'))

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/button_Write a Review'))

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/a_Support_account-dropdown'))

WebUI.setText(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/textarea_Write a Review_commen'), 'best')

WebUI.click(findTestObject('Object Repository/Page_test 123 - Katalon Studio Mark/button_Submit'))

WebUI.closeBrowser()

