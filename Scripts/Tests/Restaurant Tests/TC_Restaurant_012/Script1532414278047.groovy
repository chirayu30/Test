import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import internal.GlobalVariable as GlobalVariable

WebDriver driver = DriverFactory.openWebDriver()

driver.get(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Pages/Log In Page/input_username'), findTestData('log_in_credentials').getValue(1, 1))

WebUI.setText(findTestObject('Pages/Log In Page/input_password'), findTestData('log_in_credentials').getValue(2, 1))

WebUI.click(findTestObject('Pages/Log In Page/button_Login'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Log In Page/button_Login'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Pages/TV Channels Page/heading_TV Channel'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementHasAttribute(findTestObject('Pages/Restaurant Page/res_count'), 'Text', 10, FailureHandling.STOP_ON_FAILURE)

def countText = WebUI.getText(findTestObject('Pages/Restaurant Page/res_count'))

def splitText = countText.split()

def resCount = splitText[2]

List<WebElement> allRes = driver.findElements(By.xpath('//div[@id=\'sortable-category\']/div[@class=\'col-lg-3 col-sm-6 col-md-5thumb single-category-box\']'))

int allResCount = allRes.size()

WebUI.verifyEqual(allResCount, resCount, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Restaurant Page/menu_3_dot_rest1'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/btn_delete_res1_3_dot_menu'))

WebUI.verifyElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/delete_res_confirmation_dialog'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/Btn_yes_delete_res'))

WebUI.waitForElementPresent(findTestObject('Pages/Restaurant Page/Delete Restaurant/msg_delete_restaurant_success'), 15)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementHasAttribute(findTestObject('Pages/Restaurant Page/res_count'), 'Text', 10, FailureHandling.STOP_ON_FAILURE)

def countText2 = WebUI.getText(findTestObject('Pages/Restaurant Page/res_count'))

def splitText2 = countText2.split()

def resCount2 = splitText2[2]

List<WebElement> allRes2 = driver.findElements(By.xpath('//div[@id=\'sortable-category\']/div[@class=\'col-lg-3 col-sm-6 col-md-5thumb single-category-box\']'))

int allResCount2 = allRes2.size()

WebUI.verifyEqual(allResCount2, resCount2, FailureHandling.STOP_ON_FAILURE)

driver.close()

