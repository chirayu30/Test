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
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Tests/Log In Tests/TC001_Log in_valid_user'), [:])

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Restaurant Page/menu_3_dot_rest2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/btn_delete_res_3_dot_menu'))

WebUI.verifyElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/delete_res_confirmation_dialog'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/Btn_yes_delete_res'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Delete Restaurant/msg_delete_restaurant_success'), 5)

WebUI.verifyElementNotPresent(findTestObject('Pages/Restaurant Page/test1_restaurant_cell'), 0)

WebUI.closeBrowser()

