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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Null username and password/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Null username and password/Page_CURA Healthcare Service/a_Login'))

WebUI.click(findTestObject('Object Repository/Null username and password/Page_CURA Healthcare Service/button_Login'))

WebUI.switchToWindowTitle('trans;ate - Tìm với Google')

WebUI.setText(findTestObject('Page_transate - Tm vi Google/textarea_Nhp vn bn_tw-source-text-ta'), 'nu')

WebUI.click(findTestObject('Page_transate - Tm vi Google/i_translate'))

WebUI.click(findTestObject('Page_transate - Tm vi Google/div_n(y)oo_gt-src-is'))

WebUI.setText(findTestObject('Page_transate - Tm vi Google/textarea_Nhp vn bn_tw-source-text-ta'), 'null')

WebUI.click(findTestObject('Page_transate - Tm vi Google/pre_n(y)oo'))

WebUI.setText(findTestObject('Page_transate - Tm vi Google/textarea_Nhp vn bn_tw-source-text-ta'), 'null username and pas')

