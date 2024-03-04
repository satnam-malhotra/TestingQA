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

WebUI.navigateToUrl('https://www.grayscale.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Grayscale  The Worlds Largest Crypto A_26054c/svg'))

WebUI.click(findTestObject('Object Repository/Page_Grayscale  The Worlds Largest Crypto A_26054c/button_Allow all'))

WebUI.click(findTestObject('Object Repository/Page_Grayscale  The Worlds Largest Crypto A_26054c/span_Investment Solutions'))

WebUI.click(findTestObject('Object Repository/Page_Grayscale  The Worlds Largest Crypto A_26054c/a_Crypto Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Grayscale  Crypto Investment Products/h1_Grayscale Products'), 
    'Grayscale Products')

WebUI.closeBrowser()

