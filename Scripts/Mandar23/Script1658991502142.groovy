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

WebUI.navigateToUrl('https://www.aptsoftsolutions.com/')

WebUI.click(findTestObject('Object Repository/Aptsoft Website/Page_Software Services provider vastly expe_656305/p_Why Choose Us'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Aptsoft Website/Page_Why Choose Us  Aptsoftsolutions/span_01. Proven'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Aptsoft Website/Page_Why Choose Us  Aptsoftsolutions/div_Why Choose Aptsoft Solutions__3KzuS _3SQN-'))

WebUI.click(findTestObject('Object Repository/Aptsoft Website/Page_Why Choose Us  Aptsoftsolutions/p_Our Services'))

WebUI.verifyElementText(findTestObject('Object Repository/Aptsoft Website/Page_Software Services provider vastly expe_656305/h5_Web Applications'), 
    'Web Applications')

WebUI.verifyElementVisible(findTestObject('Object Repository/Aptsoft Website/Page_Software Services provider vastly expe_656305/img'))

WebUI.click(findTestObject('Object Repository/Aptsoft Website/Page_Software Services provider vastly expe_656305/p_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/Aptsoft Website/Page_Software Services provider vastly expe_656305/span_Address. K63, Yash Building, Erandwane_9da82e'), 
    'Address. K6/3, Yash Building, Erandwane, Pune 411004, India')

WebUI.closeBrowser()

